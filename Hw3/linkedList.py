#checked and works fine

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def isEmpty(self):
        return self.head is None

    def insertHead(self, data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node

    def removeHead(self):
        if self.isEmpty():
            return None
        removed_data = self.head.data
        self.head = self.head.next
        return removed_data

    def insertTail(self, data):
        new_node = Node(data)
        if self.isEmpty():
            self.head = new_node
            return
        current = self.head
        while current.next:
            current = current.next
        current.next = new_node

    def removeTail(self):
        if self.isEmpty():
            return None
        current = self.head
        if current.next is None:
            removed_data = current.data
            self.head = None
            return removed_data
        while current.next.next:
            current = current.next
        removed_data = current.next.data
        current.next = None
        return removed_data

    def insertAtPos(self, data, pos):
        if pos <= 0:
            self.insertHead(data)
            return
        new_node = Node(data)
        current = self.head
        count = 0
        while current and count < pos - 1:
            current = current.next
            count += 1
        if not current:
            self.insertTail(data)
        else:
            new_node.next = current.next
            current.next = new_node

    def traverse(self):
        current = self.head
        while current:
            print(current.data, end=" -> ")
            current = current.next
        print("None")


# --- Test Cases ---
if __name__ == "__main__":
    ll = LinkedList()
    print("Is list empty?", ll.isEmpty())

    ll.insertHead(10)
    ll.insertHead(20)
    ll.insertHead(30)
    ll.insertHead(40)
    ll.traverse()

    ll.insertTail(50)
    ll.insertTail(60)
    ll.traverse()

    print("Removed head:", ll.removeHead())
    ll.traverse()

    print("Removed tail:", ll.removeTail())
    ll.traverse()

    ll.insertAtPos(99, 3)
    ll.traverse()