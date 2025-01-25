def swap(a,b):
    temp = a
    a = b
    b = temp

    print("The value of a is :",a )
    print("The value of b is :",b)
    return 

a = int(input("Enter the value of a :"))
b = int(input("Enter the value of b :"))

print(swap(a,b))