def palindrome(str):
    str = str.lower()
    if str == str[::-1] :
        return True
    return False

string = input("Enter The string to check palindrome :")
print(palindrome(string))



def int_palindrome(n):
    num = str(n)
    return num == num[::-1]

n = int(input("Enter a number to check palindrome : "))
print(int_palindrome(n))