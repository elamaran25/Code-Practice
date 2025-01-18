# Question 3. Palindrome Checker

txt=input("Enter a word: ") # It gets the input from the user

if txt==txt[::-1]:   #this condition checks if the original word is same as when it is reversed 
    print("The given word is a palindrome")    #if same it is a palindrome
else:
    print("The given word is not a palindrome")

