#include <stdio.h>

// Write a function that receives an array a[], and an integer n, which indicates the size of the array. Return the sum of even elements (e.g. v = [1, 2, 3, 4, 5], output: 6).

int EvenSum(int a[], int n)
{
    int sum = 0;

    for (int i = 0; i < n; i++)
        if (a[i] % 2 == 0)
            sum += a[i];

    return sum;
}

int main()
{
    int n;
    printf("array size: ");
    scanf("%d", &n);

    int a[n];

    for (int i = 0; i < n; i++)
    {
        printf("a[%d]: ", i);
        scanf("%d", &a[i]);
    }

    int r = EvenSum(a, n);
    printf("-> %d\n", r);

    return 0;
}