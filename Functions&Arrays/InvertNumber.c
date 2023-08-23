#include <stdio.h>

// Write a function that receives an integer n, this number does not contain the digit 0, and returns n inverted (e.g. n = 123, output: 321).

int InvertNumber(int n)
{
    int inv = 0;

    while (n > 0)
    {
        int ln = n % 10;
        n /= 10;
        inv = inv * 10 + ln;
    }

    return inv;
}

int main()
{
    int n;
    scanf("%d", &n);

    int r = InvertNumber(n);
    printf("-> %d\n", r);

    return 0;
}