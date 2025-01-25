def vowelcheck(s):
    vowel = ['a','e','i','o','u']
    if s in vowel :
        return True
    return False

char = input("Enter the Character :").lower()
print(vowelcheck(char))