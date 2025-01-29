def nth_prime(n):
    num = 2
    count = 0
    while (num <= n):
        if isprime(num):
            count += 1
        num += 1    