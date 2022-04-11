# Time complexity is O(n^2)
# Space complexity is 1

class SelectionSort:
    array = [5, 4, 3, 2, 1]

    def sort(self, arr):
        for i in range(len(arr)):
            min_Index = i

            for j in range(i + 1, len(arr)):
                if arr[j] < arr[min_Index]:
                    min_Index = j

            if min_Index != i:
                arr[i], arr[min_Index] = arr[min_Index], arr[i]


obj = SelectionSort()

print("Before Sorting")
print(obj.array)

obj.sort(obj.array)

print("After Sorting")
print(obj.array)
