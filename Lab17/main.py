from right_triangle import RightTriangle

def get_triangle_input(prompt_count):
    while True:
        try:
            values = input(f"Enter {prompt_count} nonnegative numeric value(s) for the sides (separated by spaces): ").split()
            
            if len(values) != prompt_count:
                print(f"Please enter exactly {prompt_count} value(s).")
                continue
            
            if prompt_count == 2:
                triangle = RightTriangle(values[0], values[1])
            else:
                triangle = RightTriangle(values[0], values[1], values[2])
            
            return triangle
        except ValueError as e:
            print(e)

if __name__ == "__main__":
    t1 = get_triangle_input(2)
    print(t1)
    
    t2 = get_triangle_input(3)
    print(t2)
    
    print("\nComparisons:")
    print(f"t1 == t1 ? {t1 == t1}")
    print(f"t1 == t2 ? {t1 == t2}")