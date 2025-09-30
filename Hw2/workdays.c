/*
done checked
*/
#include <stdio.h>

int main() {
    enum daysOfWeek { MON = 0, TUES, WED, THURS, FRI, SAT, SUN };

    int input;
    printf("Enter a day of the week (0=Mon, 1=Tue, ..., 6=Sun): ");
    scanf("%d", &input);

    enum daysOfWeek day = (enum daysOfWeek) input;

    switch (day) {
        case MON:
        case TUES:
        case WED:
        case THURS:
        case FRI:
            printf("It is a WORKDAY.\n");
            break;
        case SAT:
        case SUN:
            printf("It is a WEEKEND.\n");
            break;
        default:
            printf("Invalid input. Please enter a number 0–6.\n");
            break;
    }
    return 0;
}
