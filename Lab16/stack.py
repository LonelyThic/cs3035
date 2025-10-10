class Stack:
    def __init__(self):
        self.items = []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        if not self.isEmpty():
            return self.items.pop()
        else:
            return "Stack is empty, cannot pop."

    def isEmpty(self):
        return len(self.items) == 0

    def peek(self):
        if not self.isEmpty():
            return self.items[-1]
        else:
            return "Stack is empty, nothing to peek."

    def size(self):
        return len(self.items)


# ---------- Test Cases ----------
if __name__ == "__main__":
    stack = Stack()

    stack.push(10)
    stack.push(20)
    stack.push(30)
    stack.push(40)
    stack.push(50)

    print("Initial stack:", stack.items)

    print("Popped element:", stack.pop())
    print("Popped element:", stack.pop())

    print("Current stack after popping:", stack.items)

    print("Size of stack:", stack.size())

    print("Is stack empty?", stack.isEmpty())

    print("Top element (peek):", stack.peek())