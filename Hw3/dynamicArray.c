#include <stdio.h>
#include <stdlib.h>

int size;

int arraySum(int *arr) {
    int sum = 0;
    for (int i = 0; i < size; i++) {
        sum += *(arr + i);
    }
    return sum;
}

void arrayTraverse(int *arr) {
    printf("Alternative elements and their positions:\n");
    for (int i = 0; i < size; i += 2) {
        printf("Element at position %d: %d\n", i, *(arr + i));
    }
}

int main() {
    printf("Enter the size of the array: ");
    scanf("%d", &size);

    int *arr = (int *)malloc(size * sizeof(int));
    if (arr == NULL) {
        printf("Memory allocation failed!\n");
        return 1;
    }

    printf("Enter %d elements:\n", size);
    for (int i = 0; i < size; i++) {
        scanf("%d", arr + i);
    }

    printf("Sum of array elements: %d\n", arraySum(arr));
    arrayTraverse(arr);

    free(arr);
    return 0;
}