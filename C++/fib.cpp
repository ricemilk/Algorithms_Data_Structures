
unsigned int f(int n) {
    if (n <= 1) return 1;
    unsigned int a = 1, b = 1;
    for (int i = 2; i <= n; ++ i) {
        unsigned int c = a + b;
        a = b;
        b = c;
    }
    return b;
}