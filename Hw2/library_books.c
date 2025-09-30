/*
checked done
*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define TITLE_LEN 100
#define AUTHOR_LEN 100

typedef struct {
    char title[TITLE_LEN];
    char author[AUTHOR_LEN];
    int year;
} Book;

int main() {
    Book *library = NULL;
    int count = 0;
    int choice;

    while (1) {
        printf("\nLibrary Menu:\n");
        printf("1. Add New Book\n");
        printf("2. View All Books\n");
        printf("3. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        getchar();

        if (choice == 1) {
            Book *temp = realloc(library, (count + 1) * sizeof(Book));
            if (!temp) {
                printf("Memory allocation failed.\n");
                break;
            }
            library = temp;

            printf("Enter book title: ");
            fgets(library[count].title, TITLE_LEN, stdin);
            library[count].title[strcspn(library[count].title, "\n")] = '\0';

            printf("Enter author name: ");
            fgets(library[count].author, AUTHOR_LEN, stdin);
            library[count].author[strcspn(library[count].author, "\n")] = '\0';

            printf("Enter year published: ");
            scanf("%d", &library[count].year);
            getchar();

            count++;
            printf("Book added successfully!\n");

        } else if (choice == 2) {
            if (count == 0) {
                printf("No books in the system.\n");
            } else {
                printf("\n--- Book List ---\n");
                for (int i = 0; i < count; i++) {
                    printf("%d. \"%s\" by %s (%d)\n",
                           i + 1,
                           library[i].title,
                           library[i].author,
                           library[i].year);
                }
            }

        } else if (choice == 3) {
            printf("Exiting program. Goodbye!\n");
            break;
        } else {
            printf("Invalid choice. Please try again.\n");
        }
    }

    free(library);
    return 0;
}