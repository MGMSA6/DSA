arr = [2, 3, 5, 9, 14, 16, 18]
target = 15


def findFloor():
    start = 0
    end = len(arr) - 1

    while start <= end:
        mid = int(start + (end - start) / 2)

        if target == arr[mid]:
            return mid
        elif target > arr[mid]:
            start = mid + 1
        else:
            end = mid - 1

    return end


print(arr)
print("Floor of " + str(target) + " is " + str(arr[findFloor()]))
