#include <stdio.h>

int main() {
    int inventory = 0;
    int change;

    printf("Bookstore Inventory Management System\n");
    printf("Enter positive numbers to add books, negative numbers to remove books.\n");
    printf("Enter 0 to quit.\n");

    while (1) {
        printf("Enter number of books added/removed: ");
        scanf("%d", &change);

        if (change == 0) {
            printf("Exiting program. Final inventory: %d\n", inventory);
            break;
        }

        inventory += change;

        printf("Updated inventory: %d\n", inventory);
    }

    return 0;
}