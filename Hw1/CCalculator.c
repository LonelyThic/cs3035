#include <stdio.h>

int add(int x, int y, int z) {
    return x + y + z;
}

int subtract(int x, int y, int z) {
    return z - y - x;
}

int multiply(int x, int y) {
    return x * y;
}

float divide(float x, float y) {
    if (y == 0) {
        printf("Error: Division by zero is not allowed.\n");
        return 0;
    }
    return x / y;
}

int main() {
    int x = 2, 
    y = 3, 
    z = 10;

    int numerator = multiply(add(x, y, z), x);
    int denominator = multiply(subtract(x, y, z), y);

    float result = divide(numerator, denominator);

    if (denominator != 0) {
        printf("Result: %.2f\n", result);
    }

    return 0;
}