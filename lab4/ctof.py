def cel_to_fah(c):
	return c * 9.0 / 5.0 + 32

lower = int(input("Please enter the lower bound: "))
higher = int(input("Please enter the upper bound: "))

print("Celsius Fahrenheit")

for c in range(lower, higher + 1):
	f = cel_to_fah(c)
	print(c, f)

