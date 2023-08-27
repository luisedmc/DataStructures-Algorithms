#include <stdio.h>

// Write a function that takes an array and, without using a second array, returns the same array inverted.
int *Invert(int arr[], int size)
{
    for (int i = 0; i < size; i++)
        for (int j = 0; j < i; j++)
        {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

    return arr;
}

void printArray(int arr[], int size)
{
    for (int i = 0; i < size; i++)
        printf("%d ", arr[i]);

    printf("\n");
}

int main()
{
    int *a;
    int arr[] = {1, 2, 3, 4, 5, 6};
    int size = sizeof(arr) / sizeof(arr[0]);

    printf("array:\n");
    printArray(arr, size);

    a = Invert(arr, size);

    printf("\narray inverted:\n");
    printArray(arr, size);

    return 0;
}