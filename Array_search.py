def search(arr, x):
    
    for i in range(0,len(arr)):
        if(arr[i] == x) : #if target element found it return index
            return i
    return -1 #if target element not found it returns -1


arr = [23,54,15,6,7,2,6]
print(search(arr,54))