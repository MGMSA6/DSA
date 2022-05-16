arr = [3, 4, 5, 1]


def search(arr):
    i = 0
    j = i + 1

    while j < len(arr) and arr[i] < arr[j]:
        i += 1
        j += 1

    if i == 0:
        return j
    else:
        return i


def search1(arr):
    start = 0
    end = len(arr) - 1

    while start != end:

        mid = start + (end - start) // 2

        if arr[mid] > arr[mid + 1]:
            end = mid
        else:
            start = mid + 1

    return start


print(search1(arr))
