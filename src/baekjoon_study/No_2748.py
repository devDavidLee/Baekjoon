# 2748번 피보나치 수2 (https://www.acmicpc.net/problem/2748)
def F(n):
    a=1
    b=1
    if n==1 or n==2:
        return 1
    for i in range(1,n):
        a, b = b, b+a
    return a
n = int(input())
print(F(n))
