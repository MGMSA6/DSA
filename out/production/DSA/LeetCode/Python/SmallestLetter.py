letters = ["c", "f", "j"]
target = "d"


def nextGreatestLetter(letters, target):
    start = 0
    end = len(letters) - 1

    while start <= end:

        mid = start + (end - start)

        if target < letters[mid]:
            end = mid - 1
        else:
            start = mid + 1

        return letters[target % len(letters)]


print(nextGreatestLetter(letters, target))
