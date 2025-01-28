def leap_year(n):
    if n % 4 == 0 :
        if n % 100 == 0 :  #check if it is century
            if n % 400 == 0 :  # check if the century is divisible by 400 then it is leap year
                return "Leap year"
            else :
                return "Not a Leap year"
        else :
            return "Leap year"
    return "Not a leap year"

year = int(input("Enter the year to check :"))
print(leap_year(year))

