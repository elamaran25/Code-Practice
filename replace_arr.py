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

#6c8867d (HEAD -> main, origin/main, origin/HEAD) HEAD@{0}: reset: moving to 6c8867d
#4541add HEAD@{1}: reset: moving to 4541add
#bfae75c HEAD@{2}: reset: moving to HEAD~1
#4541add