#include <stdio.h>
#include <string.h>
#define BUF 20

// Write a function that reads three strings and displays them in lexicographically ascending order.
void PrintBiggestOrder(char s1[BUF], char s2[BUF], char s3[BUF])
{
    char tmp[BUF];

    if (strcmp(s1, s2) > 0)
    {
        strcpy(tmp, s1);
        strcpy(s1, s2);
        strcpy(s2, tmp);
    }
    if (strcmp(s2, s3) > 0)
    {
        strcpy(tmp, s2);
        strcpy(s2, s3);
        strcpy(s3, tmp);
    }
    if (strcmp(s1, s2) > 0)
    {
        strcpy(tmp, s1);
        strcpy(s1, s2);
        strcpy(s2, tmp);
    }
}

int main()
{
    char s1[BUF], s2[BUF], s3[BUF];

    printf("s1, s2 and s3:\n");
    scanf("%s %s %s", s1, s2, s3);

    PrintBiggestOrder(s1, s2, s3);
    printf("%s - %s - %s\n", s1, s2, s3);

    return 0;
}