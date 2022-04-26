accounts = [[2, 8, 7], [7, 1, 3], [1, 9, 5]]

def getMaxWealth(arr):
    maxWealth = 0

    for person in range(len(accounts)):
        sum = 0

        for account in range(len(accounts[accounts])):
            sum += accounts[person][account]

        if sum > maxWealth:
            maxWealth = sum


