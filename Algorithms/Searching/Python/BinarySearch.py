arr = [2, 3, 4, 10, 40]
print(arr)
x = input("Enter the num to search in array")
x = int(x)
length = len(arr)


class BinarySearch:
    def recursiveSearch(self, arr, left, right, target):
        if right >= left:

            mid = left + (right - left) // 2

            if arr[mid] == target:
                return mid

            elif arr[mid] > target:
                return self.recursiveSearch(arr, left, mid - 1)

            else:
                return self.recursiveSearch(arr, mid + 1, right)

        else:
            return -1

    def iterativeSearch(self, arr, left, right, target):
        while left <= right:

            mid = left + (right - left) // 2

            if arr[mid] == target:
                return mid

            if arr[mid] < target:
                left = left + 1
            else:
                right = right - 1

        return -1


obj = BinarySearch()

pos = obj.iterativeSearch(arr, 0, length - 1, x)

if pos == -1:
    print("Element not found")
else:
    print("Element found at position " + str(pos + 1))
