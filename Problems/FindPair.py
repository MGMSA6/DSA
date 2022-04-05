
arr = [1, -2, 1, 0, 5]
sum = 0


def findPair():
    for i in range(len(arr)):
        for j in range(len(arr)):
            if i != j and arr[i] + arr[j] == sum:
                return True
    return False


if findPair():
    print("Valid pair exists")
else:
    print("No valid pair exists for " + str(sum))
