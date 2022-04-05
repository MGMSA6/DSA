arr = [2, 3, 4, 10, 40]
print(arr)
x = input("Enter the num to search in array")
x = int(x)
length = len(arr)


def search(arr, left, right):
    if right >= left:

        mid = left + (right - left) // 2

        if arr[mid] == x:
            return mid

        elif arr[mid] > x:
            return search(arr, left, mid - 1)

        else:
            return search(arr, mid + 1, right)

    else:
        return -1


pos = search(arr, 0, length - 1)

if pos == -1:
    print("Element not found")
else:
    print("Element found at position " + str(pos + 1))
