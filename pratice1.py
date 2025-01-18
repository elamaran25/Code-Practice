#Question1: Write a program that utilizes a while loop to print the squares of numbers from 1 to N


num=int(input()) #this line get the input from the user
c=1 #it initializes the value to one
while c<=num:    #the num and c is passed into the while loop 
    print(c**2,end=" ")  #this prints the squares of given input and print them in single line separated by spaces
    c+=1 #this increments by 1
