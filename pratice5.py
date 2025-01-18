#question 5: It checks the vowels present in the word

x=input("Enter a word: ") #It gets the input from the user
vowels='aeiou' #declares the vowels 
c=0 #it set the count as 0
for char in x:
    if char in vowels:  #it loops through the input and vowels is there it prints the count of vowels
        c+=1
print("Number of vowels present is: ",c)
