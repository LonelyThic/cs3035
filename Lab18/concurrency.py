import threading
import time
from queue import Queue

testQ = Queue()

def producer():
    """Inserts 6 items into the queue at 1-second intervals."""
    for i in range(1, 7):
        time.sleep(1)
        item = f"Item {i}"
        testQ.put(item)
        print(f"Producer: Inserted {item}")

def consumer():
    """Retrieves items from the queue at 2-second intervals."""
    while True:
        item = testQ.get()
        print(f"Consumer: Processing {item}")
        time.sleep(2)
        testQ.task_done()
        print(f"Consumer: Finished {item}")

producer_thread = threading.Thread(target=producer)
consumer_thread = threading.Thread(target=consumer, daemon=True)

producer_thread.start()
consumer_thread.start()

producer_thread.join()

testQ.join()

print("All items produced and consumed. Exiting main thread.")