#include <stdio.h>
#include <stdbool.h>

// Write a function that takes as a parameter an integer greater than 1, and checks whether it is prime or not. Return true if the number is prime and false otherwise.

bool PrimeOrNotOptimal(int n)
{
    if (n <= 1)
        return false;

    if (n <= 3)
        return true;

    if (n % 2 == 0 || n % 3 == 0)
        return false;

    for (int i = 5; i * i <= n; i += 6)
        if (n % i == 0 || n % (i + 2) == 0)
            return false;

    return true;
}

bool PrimeOrNot(int n)
{
    int divs = 0;

    if (n <= 1)
        return false;

    for (int i = 1; i <= n; i++)
    {
        if (n % i == 0)
            divs++;
    }

    return divs == 2 ? true : false;
}

// Write a program to find all prime numbers between N1 and N2 (inclusive), where N1 and N2 are read natural numbers.

void AllPrimeNumbers(int n1, int n2)
{
    while (n1 <= n2)
    {
        bool r = PrimeOrNotOptimal(n1);
        if (r)
            printf("%d ", n1);
        n1++;
    }
    printf("\n");
}

int main()
{
    int n;
    scanf("%d", &n);

    bool r = PrimeOrNotOptimal(n);
    printf("-> %s\n", r ? "true" : "false");

    AllPrimeNumbers(2, 11);

    return 0;
}