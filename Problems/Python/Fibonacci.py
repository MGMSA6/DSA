def fibo(num):
    # Base Condition
    if num <= 1:
        return num
    return fibo(num - 1) + fibo(num - 2)


print(fibo(6))
