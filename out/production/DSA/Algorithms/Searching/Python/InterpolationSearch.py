arr = [2, 3, 4, 10, 40]
print(arr)
x = input("Enter the num to search in array")
x = int(x)


def search(arr, low, high, target):
    while low <= high:
        pos = int(low + ((high - low) / (arr[high] - arr[low])) * (target - arr[low]))

        if arr[pos] == target:
            return pos
        elif arr[pos] < target:
            low = pos + 1
        else:
            high = pos - 1
    return -1


result = search(arr, 0, len(arr) - 1, target=x)

if result == -1:
    print("Element not found")
else:
    print("Element found at position " + str(result + 1))
