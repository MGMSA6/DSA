import math

arr = [555, 91, 42, 1771]


def digit(num):
    if num < 0:
        num *= -1

    return int(math.log10(num)) + 1


def even(num):
    n = digit(num)

    return n % 2 == 0


def findNumbers(arr):
    count = 0
    for i in arr:
        if even(i):
            count += 1
    return count


print(findNumbers(arr))
