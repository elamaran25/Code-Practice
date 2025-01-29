def Message(n):
    if n % 3 == 0 and n % 4 == 0 :
        print("Good Morning")
    elif n % 3 == 0 :
        print("Good Afternoon")
    elif n % 4 == 0 :
        print ("Good Evening")
    else :
        print("Good Night")

num = int(input("Enter a number : "))
Message(num)