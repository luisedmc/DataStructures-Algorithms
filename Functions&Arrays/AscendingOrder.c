#include <stdio.h>
#include <stdbool.h>

// Write a function that checks whether an array is in ascending order. If the array are in ascending order return true, and false otherwise.

bool AscendingOrder(int v[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        if (v[i] > v[i + 1])
            return false;
    }

    return true;
}

int main()
{
    // int v[] = {2, 1, 8, 1, 9, 11, -1, 20, 5, 0};
    int v[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
    int n = sizeof(v) / sizeof(v[0]);

    int r = AscendingOrder(v, n);
    printf("-> %s\n", r ? "true" : "false");

    return 0;
}