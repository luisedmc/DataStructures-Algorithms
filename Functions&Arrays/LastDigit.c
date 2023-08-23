#include <stdio.h>
#include <stdbool.h>

// Write a function called lastNumber that receives two non-negative integers a and b, and returns true if a and b have the same last digits (e.g. a = 57, b = 27, output: true)

bool lastNumber(int a, int b)
{
    int lda = a % 10, ldb = b % 10;

    return lda == ldb ? true : false;
}

int main()
{
    int a, b;
    scanf("%d %d", &a, &b);

    bool r = lastNumber(a, b);
    printf("-> %s\n", r ? "true" : "false");

    return 0;
}