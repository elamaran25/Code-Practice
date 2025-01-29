def palindrome(str):
    str.lower()
    if str == str[::-1]:
        return true
    return False

string = input("Enter The string to check palindrome :")
print(palindrome(string))
