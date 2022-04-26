import math

from Algorithms.Searching.Python.BinarySearch import BinarySearch

arr = [2, 3, 4, 10, 40]
print(arr)
x = input("Enter the num to search in array")
x = int(x)
n = len(arr) - 1


# Time Complexity : O(Log n)
# Auxiliary Space : O(1)

def search():
    if arr[0] == x:
        return 0

    i = 1

    while i < n and arr[i] <= x:
        i = i * 2

    return BinarySearch(arr, (i // 2), Math.min(i, n), x)


print(arr)
print("Element " + str(x) + " found at position: " + str(search() + 1))
