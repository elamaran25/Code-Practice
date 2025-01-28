def fibonacci(n):
    a,b = 0,1
    if n >= 1 :
        print(a,end = " ")  #if the input is 1 or greater,this fixed a value will be print
    if n >= 2 :
        print(b, end = " ") #if the input is 2 or greater,this fixed b value will be print
    for i in range(3,n+1):
        c = a + b
        print(c,end = " ")
        a = b
        b = c

n = int(input("Enter the no of terms for Fibonacci series :"))
fibonacci(n)
        

