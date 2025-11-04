max_value = lambda numbers: max(numbers)

squares = lambda numbers: list(map(lambda x: x**2, numbers))

sum_of_squares = lambda numbers: sum(map(lambda x: x**2, numbers))

average = lambda numbers: sum(numbers) / len(numbers) if len(numbers) > 0 else 0

import math
circle_area = lambda r: math.pi * r**2

filter_with_a = lambda words: list(filter(lambda w: 'a' in w, words))

f_to_c = lambda f: (f - 32) * 5/9

numbers = [3, 7, 2, 9, 4]
words = ["apple", "pear", "grape", "melon", "berry"]

print("1. Max value:", max_value(numbers))
print("2. Squares:", squares(numbers))
print("3. Sum of squares:", sum_of_squares(numbers))
print("4. Average:", average(numbers))
print("5. Circle area (r=5):", circle_area(5))
print("6. Filter words with 'a':", filter_with_a(words))
print("7. 98°F in Celsius:", f_to_c(98))