def recur(num):
    if num == 5:
        print(5)
        return

    print(num)

    return recur(num + 1)


recur(1)
