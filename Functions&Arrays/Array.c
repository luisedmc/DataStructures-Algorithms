#include <stdio.h>

// For each item, write a funtion that takes an array v of integers, and a variable n that indicates the size of the array and determines:

// a. the largest number on the array
int LargestNumber(int v[], int n)
{
    int b = v[0];

    for (int i = 0; i < n; i++)
        if (v[i] > b)
            b = v[i];

    return b;
}

// b. the smallest number on the array
int SmallestNumber(int v[], int n)
{
    int s = v[0];

    for (int i = 0; i < n; i++)
        if (v[i] < s)
            s = v[i];

    return s;
}

// c. the number of even numbers in the list
int NumberOfEven(int v[], int n)
{
    int e = 0;

    for (int i = 0; i < n; i++)
        if (v[i] % 2 == 0)
            e++;

    return e;
}

// d. the average of the numbers contained in the list
int Average(int v[], int n)
{
    int s = 0;

    for (int i = 0; i < n; i++)
        s += v[i];

    return s / n;
}

// e. all numbers smaller than the average calculated in the previous item, just print the items
void SmallerThanAvg(int v[], int n)
{
    int a = Average(v, n);

    printf("Smaller than average: ");
    for (int i = 0; i < n; i++)
        if (v[i] < a)
            printf("%d ", v[i]);

    printf("\n");
}

int main()
{
    int v[] = {2, 6, 8, 1, 9, 11, -1, 20, 5, 0};
    int n = sizeof(v) / sizeof(v[0]);

    int a = LargestNumber(v, n);
    int b = SmallestNumber(v, n);
    int c = NumberOfEven(v, n);
    int d = Average(v, n);

    printf("Largest number: %d\n", a);
    printf("Smallest number: %d\n", b);
    printf("Number of even: %d\n", c);
    printf("Average: %d\n", d);
    SmallerThanAvg(v, n);

    return 0;
}