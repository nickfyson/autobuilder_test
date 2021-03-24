#include <stdio.h>

int main(int argc, char **argv) {
    char *copy;
    copy = (char *)malloc(strlen(argv[0]));
    strcpy(copy, argv[0]);
    return copy;
}
