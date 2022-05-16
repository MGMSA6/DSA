# https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/

# Find the first and last occurrence of the target element
arr = [5, 7, 7, 8, 8, 10]
target = 8


def searchRange(arr, target):
    ans = [-1, -1]

    ans[0] = search(arr, target, True)

    if ans[0] != -1:
        ans[1] = search(arr, target, False)

    return ans


def search(arr, target, findFirst):
    ans = -1

    start = 0
    end = len(arr) - 1

    while start <= end:
        mid = start + (end - start) // 2

        if target > arr[mid]:
            start = mid + 1
        elif target < arr[mid]:
            end = mid - 1
        else:
            ans = mid

            if findFirst:
                end = mid - 1
            else:
                start = mid + 1
    return ans


print(searchRange(arr, target))
