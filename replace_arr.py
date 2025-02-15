def replace_arr(arr,n):
    i = 0
    while i < len(arr):
        if arr[i] == n :
            arr.pop(i)
            arr.append(0)
            i-=1
        i += 1        
    return arr
            
n = int(input("Enter the number to replace :"))
arr = [19,23,10,10,27,41]
print(replace_arr(arr,n))