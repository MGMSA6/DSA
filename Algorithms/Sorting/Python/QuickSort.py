class QuickSort:
    arr = [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]

    def sort(self, low, high):
        if low < high:
            pi = self.partition(self, self.arr, low, high)

            # All elements before pi are smaller
            self.sort(low, pi - 1)

            # All Elements after pi are greater
            self.sort(pi + 1, high)

    @staticmethod
    def partition(self, arr, low, high):

        # Pivot element
        pivot = arr[high]

        i = (low - 1)

        j = low
        while j <= high - 1:
            if arr[j] <= pivot:
                i += 1
                self.swap(self, arr, i, j)
            j += 1

        self.swap(self, arr, i + 1, high)
        return i + 1

    @staticmethod
    def swap(self, arr, i, j):
        temp = arr[i]
        arr[i] = arr[j]
        arr[j] = temp


obj = QuickSort()

print("Before Sorting")
print(obj.arr)

obj.sort(0, len(obj.arr) - 1)

print("After Sorting")
print(obj.arr)
