/*
    set counter to 0
    set largest to -1
    set secondLargest = -1

    while counter < 10
        ask user to enter score
        read number
        if number > largest then
            largest = number
        else if number > secondLargest
            secoundLargest = number
        endif
        counter = counter +1
    endwhile

    print largest is the highest scored by any student
    print second largest is second highest scored by any student
*/

#include <stdio.h>
    int main(){    
    int counter = 0;
    int number;
    int largest = -1;
    int secondLargest = -1;
    
    while (counter < 10) {
        printf("Enter score for %d student:", counter + 1);

        scanf("%d", &number);

        if (number > largest) {
            secondLargest = largest;
            largest = number;
        }

        else if (number > secondLargest) {
            secondLargest = number;
        }

        counter++;
    }

    printf("%d is the highest scored\n", largest);
    printf("%d is the second highest scored\n", secondLargest);

    return 0;
}