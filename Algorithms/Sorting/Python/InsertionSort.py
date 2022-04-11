# Time complexity is O(n^2)
# Space complexity is O(1)

class InsertionSort:
    arr = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]

    def sort(self, arr):

        for i in range(1, len(arr)):
            temp = arr[i]
            j = i - 1

            while j >= 0 and arr[j] > temp:
                arr[j + 1] = arr[j]
                j -= 1

            arr[j + 1] = temp


obj = InsertionSort()

print("Before Sorting")
print(obj.arr)

obj.sort(obj.arr)

print("After Sorting")
print(obj.arr)
