from decimal import Decimal, getcontext

def complexNumberAdder(a, b):
    """
    Adds two complex numbers and returns the result.
    Example: (2+3j) + (4+5j) = (6+8j)
    """
    return a + b

def complexPartialAdder(a, b):
    """
    Adds only the real parts of two complex numbers.
    Example: (2+3j) and (4+5j) => 2 + 4 = 6
    """
    return a.real + b.real

def precisionMultiplier(a, b, precision):
    """
    Multiplies two float numbers with a specified precision.
    Example: precisionMultiplier(3.2, 2.7, 2) = 8.64
    """
    getcontext().prec = precision + 2
    result = Decimal(a) * Decimal(b)
    return round(result, precision)

def scientificCalculator(mathFunction, a, b, *args):
    """
    A general-purpose scientific calculator that takes:
    - mathFunction: the function to apply
    - a, b: required arguments
    - *args: optional arguments
    """
    return mathFunction(a, b, *args)


# --- Test the Calculator ---

if __name__ == "__main__":
    c1 = complex(2, 3)
    c2 = complex(4, 5)
    result1 = scientificCalculator(complexNumberAdder, c1, c2)
    print("Complex Number Adder Result:", result1)

    result2 = scientificCalculator(complexPartialAdder, c1, c2)
    print("Complex Partial Adder Result:", result2)

    result3 = scientificCalculator(precisionMultiplier, 3.2, 2.7, 2)
    print("Precision Multiplier Result:", result3)