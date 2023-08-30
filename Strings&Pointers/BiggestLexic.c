#include <stdio.h>
#include <string.h>
#define BUF 20

// Write a function that reads three strings and finds the biggest one lexicographically
char *Lexic(char s1[BUF], char s2[BUF], char s3[BUF])
{
    char *big = s1;
    if (strcmp(s2, big) > 0)
        big = s2;
    if (strcmp(s3, big) > 0)
        big = s3;

    return big;
}

int main()
{
    char s1[BUF], s2[BUF], s3[BUF];

    printf("s1, s2 and s3:\n");
    scanf("%s %s %s", s1, s2, s3);

    printf("Biggest Lexic: %s\n", Lexic(s1, s2, s3));

    return 0;
}