import math
arr = [555, 901, 482, 1771]


def digit(num):
    if num < 0:
        num *= -1

    return math.log10(num)


print(digit(482))
