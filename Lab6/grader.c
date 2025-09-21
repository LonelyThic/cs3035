/*
    set counter to 0
    set largest to -1

    while counter < 10
        ask user to enter score
        read number
        if number > larSgest then
            largest = number
        endif
        counter = counter +1
    endwhile

    print largest is the highest scored by any student
*/

#include <stdio.h>
    int main(){    
    int counter = 0;
    int number;
    int largest = -1;
    
    while (counter < 10) {
        printf("Enter score for %d 1student:", counter + 1);

        scanf("%d", &number);

        if (number > largest) {
            largest = number;
        }

        counter++;
    }

    printf("%d is the highest scored\n", largest);

    return 0;
}