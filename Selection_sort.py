def selectionSort(arr):
    for i in range(len(arr)-1):
        min_value = i
        for j in range(i+1,len(arr)):
            if arr[min_value] > arr[j]:
                min_value = j
        arr[i],arr[min_value] = arr[min_value],arr[i]
    return arr

array = [6,5,4,3,7,2,8,1]
print(selectionSort(array))
