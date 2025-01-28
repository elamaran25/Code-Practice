import re
def remove_spl(str):
    return re.sub(r"[^a-zA-Z0-9]","",str) #It matches the special character and substitute "" for the special character
    

string = input("Enter the string : ")
print(remove_spl(string))
