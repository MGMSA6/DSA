class Arrays:

    def findElement(self, key):
        for i in range(n):
            if arr[i] == key:
                return i
        return -1

    def insertElement(self, num):
        print("Array before insertion")
        print(arr)

        arr[5] = num

        print("Array after insertion")
        print(arr)

    def deleteElement(self, num):
        print("Array before deletion")
        print(arr)

        pos = obj.findElement(num)

        if pos == -1:
            print("Element not found")
            return

        for i in range(pos, len(arr) - 1):
            arr[i] = arr[i + 1]

        arr[len(arr) - 1] = 0

        print("Array after deletion")
        print(arr)


obj = Arrays()
arr = [0] * 6
arr[0] = 4
arr[1] = 3
arr[2] = 6
arr[3] = 1
arr[4] = 8
n = len(arr)

print(arr)

key = input("Enter a num to find in an array")

index = obj.findElement(int(key))

if index == -1:
    print("Element not found")
else:
    print("Element found at position " + str(index + 1))

num1 = input("Enter a num to insert in an array")

obj.insertElement(int(num1))

num2 = input("Enter a num to delete from an array")

obj.deleteElement(int(num2))
