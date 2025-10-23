from decimal import Decimal, getcontext

def complexNumberAdder(a, b):
    return a + b

def complexPartialAdder(a, b):
    return a.real + b.real

def precisionMultiplier(a, b, precision):
    getcontext().prec = precision + 2
    result = Decimal(a) * Decimal(b)
    return round(result, precision)

def scientificCalculator(mathFunction, a, b, *args):
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