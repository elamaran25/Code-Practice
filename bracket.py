n = int(input("enter the number of row :"))   
for i in range(1,n+1):
    for j in range(i+1):
        for k in range(j):
            print('{',end = "")
        for l in range(j):
            print('}',end = "")
        print(end = " ")
    print(" ")