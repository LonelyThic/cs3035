#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int n;
    char **zoo;

    do {
        printf("Enter the capacity of the zoo (must be > 4): ");
        scanf("%d", &n);
        if (n <= 4) {
            printf("Capacity must be greater than 4. Please try again.\n");
        }
    } while (n <= 4);

    zoo = (char **)malloc(n * sizeof(char *));
    if (zoo == NULL) {
        printf("Memory allocation failed!\n");
        return 1;
    }

    zoo[0] = strdup("Monkey");
    zoo[1] = strdup("Tiger");
    zoo[2] = strdup("Gorilla");

    zoo[n - 1] = strdup("Kangaroo");

    printf("\nZoo Animals (Dynamic Capacity %d):\n", n);
    printf("Animal 1: %s\n", zoo[0]);
    printf("Animal 2: %s\n", zoo[1]);
    printf("Animal 3: %s\n", zoo[2]);
    printf("Animal %d: %s\n", n, zoo[n - 1]);

    for (int i = 0; i < n; i++) {
        free(zoo[i]);
    }
    free(zoo);

    return 0;
}