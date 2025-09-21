# Calculator module with basic arithmetic operations

def add(x, y, z):
    return x + y + z

def subtract(x, y, z):
    return x - y - z

def divide(x, y):
    if y == 0:
        print("Error: Division by zero")
        return None
    return x / y

def multiply(x, y):
    return x * y

if __name__ == "__main__":
    x = 2
    y = 3
    z = 10

    numertor = multiply(add(x, y, z), x)
    denominator = multiply(subtract(z, y, x), y)

    result = divide(numertor, denominator)

    if result is not None:
        print(f"The result is: {result}")
