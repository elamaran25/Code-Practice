def group(n):
    if n >= 50 :
        print(f"{n} is Belonging Greater than 50 Group")
    elif n >= 40 and n <50 :
        print(f"{n} is Belonging to 40 to 50 Group")
    else :
        print(f"{n} is Belonging to less than 40 Group")

n = int(input("Enter the number : " ))
group(n)