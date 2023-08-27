#include <stdio.h>

// Write a function that receives an array and, without using a second array, puts even numbers at the beginning of the array and odd numbers at the end.
void EvenAtBeginning(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < i; j++)
            if (arr[i] % 2 == 0)
            {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
    }
}

int main()
{
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
    int size = sizeof(arr) / sizeof(arr[0]);

    EvenAtBeginning(arr, size);

    for (int i = 0; i < size; i++)
        printf("%d ", arr[i]);

    printf("\n");

    return 0;
}