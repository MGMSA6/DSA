import math


class JumpSearch:
    arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14]
    n = len(arr)
    find = 5

    def search(self, arr, find):
        m = int(math.floor(math.sqrt(len(arr))))

        currentLastIndex = m

        while currentLastIndex < len(arr) and find >= arr[currentLastIndex]:
            currentLastIndex += m

        i = currentLastIndex - m

        while i < currentLastIndex and i < len(arr):
            if arr[i] == find:
                return i
            i += 1

        return -1


obj = JumpSearch()

pos = obj.search(obj.arr, find=obj.find)

if pos != -1:
    print("Number " + str(obj.find) + " at position " + str(pos + 1))
else:
    print("Number " + str(obj.find) + " not found")
