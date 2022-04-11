class BubbleSort:
    array = [5, 4, 3, 2, 1]

    def sort(self, arr):

        for i in range(len(arr) - 1):
            swap = False
            for j in range(len(arr) - 1 - i):
                if arr[j] > arr[j + 1]:
                    arr[j], arr[j + 1] = arr[j + 1], arr[j]
                    swap = True

            if not swap:
                break


obj = BubbleSort()

obj.sort(obj.array)

print(obj.array)
