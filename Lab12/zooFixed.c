/*
Checked off as done
*/

#include <stdio.h>

int main() {
    const int MAX = 5;
    const char *zoo[MAX];

    zoo[0] = "Zebra";
    zoo[1] = "Lion";
    zoo[2] = "Elephant";

    zoo[3] = "Giraffe";
    zoo[4] = "Panda";

    printf("Zoo Animals (Fixed Capacity):\n");
    for (int i = 0; i < MAX; i++) {
        printf("Animal %d: %s\n", i + 1, zoo[i]);
    }

    return 0;
}