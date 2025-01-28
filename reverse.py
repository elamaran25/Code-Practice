def reverse(str):
    n = len(str)
    reverse = ''
    for i in range(n-1,-1,-1): #Loop starting from end
        reverse += str[i]    #append each character
    return reverse

string = input("Enter the string to reverse :")
print(reverse(string))