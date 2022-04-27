arr = [2, 3, 4, 10, 40]
arr1 = [50, 40, 30, 20, 10]
target = 10


def orderAgnosticBS(arr, target):
    start = 0
    end = len(arr) - 1
    asc = arr[start] < arr[end]

    while start <= end:

        mid = int(start + (end - start) / 2)

        if arr[mid] == target:
            return mid

        if asc:
            if target < arr[mid]:
                end = mid - 1
            else:
                start = mid + 1
        else:
            if target > arr[mid]:
                end = mid - 1
            else:
                start = mid + 1

    return -1


pos = orderAgnosticBS(arr1, 10)

if pos != -1:
    print("Element " + str(target) + " found at position " + str(pos + 1))
else:
    print("Element " + str(target) + " not found")
