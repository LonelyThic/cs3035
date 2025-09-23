/*
Fix and done
*/

#include <stdio.h>

void swap(int *a, int *b);

int main() {
    int pizzasCustomer1 = 9;
    int pizzasCustomer2 = 4;
    
    printf("Before swap:\n");
    printf("Customer 1 (John) has %d pizzas\n", pizzasCustomer1);
    printf("Customer 2 (Mary) has %d pizzas\n", pizzasCustomer2);
    
    swap(&pizzasCustomer1, & pizzasCustomer2);
    
    printf("\nAfter swap:\n");
    printf("Customer 1 (John) has %d pizzas\n", pizzasCustomer1);
    printf("Customer 2 (Mary) has %d pizzas\n", pizzasCustomer2);
    return 0;
}

void swap(int *a, int *b) {
    int temp = *a;
    *a = *b;
    *b = temp;
}