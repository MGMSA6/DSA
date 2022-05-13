# Assume the array is infinite, and you can't use len(arr)
arr = [2, 3, 5, 9, 14, 16, 18]
target = 5


# https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

def search(arr, target):
    start = 0
    end = 1

    while target > arr[end]:
        newStart = end + 1

        end = end + ((end - start) * 2)
        start = newStart

    return iterativeSearch(arr, start, end, target)


def iterativeSearch(arr, start, end, target):
    while start <= end:

        mid = start + (end - start) // 2

        if arr[mid] == target:
            return mid

        if arr[mid] < target:
            start = start + 1
        else:
            end = end - 1

    return -1


print(search(arr, target))
