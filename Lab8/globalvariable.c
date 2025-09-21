#include <stdio.h>

int A = 20;
int B = 50;

float whatPercentage() {
    return ((float) A/B) * 100;
}

int main() {
    printf("First percentage: %2f%%\n", whatPercentage());

    A = 15;
    B = 30;

    printf("Second percentage: %2f%%\n", whatPercentage());

    /*
        4. Ovservations:
            - Two Results are different because the global variables A and B 
                were change before the second
            - any function accessing them see their updated values
    */ 

    /*
        5. add const to the global declarations
            - the compiler gives an error when trying to assign new values
                to A and B in main(). The const makes the variables read-only 
                and prevents modifcation after initialization
    */

    return 0;
}