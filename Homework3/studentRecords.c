#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    char name[50];
    int grade;
} Student;

int main() {
    int n;
    printf("Enter number of students: ");
    scanf("%d", &n);

    Student *students = (Student *)malloc(n * sizeof(Student));
    if (students == NULL) {
        printf("Memory allocation failed!\n");
        return 1;
    }

    for (int i = 0; i < n; i++) {
        printf("Enter name of student %d: ", i + 1);
        scanf(" %[^\n]", students[i].name);
        printf("Enter grade of student %d: ", i + 1);
        scanf("%d", &students[i].grade);
    }

    printf("\nStudent Details:\n");
    for (int i = 0; i < n; i++) {
        printf("Student %d: Name = %s, Grade = %d\n", i + 1, students[i].name, students[i].grade);
    }

    free(students);
    return 0;
}