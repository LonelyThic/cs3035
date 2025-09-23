#include <stdio.h>

void swap(int *a, int *b);

int main() {
    int X = 9;
    int Y = 4;

    printf("Before swap:\n");
    printf("Customer 1 has %d pizzas\n", X);
    printf("Customer 2 has %d pizzas\n", Y);

    swap(&X, &Y);

    printf("\nAfter swap:\n");
    printf("Customer 1 has %d pizzas\n", X);
    printf("Customer 2 has %d pizzas\n", Y);

    return 0;
}

void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}