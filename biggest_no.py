def big_no(a,b):
    if a > b :
        print(f"{a} is biggest")
    elif b < a  :
        print(f"{b} is Biggest")
    else :
        print("Both are Equal")
    return 

a = int(input("Enter the first number :"))
b = int(input("Enter the Second number :"))
big_no(a,b)