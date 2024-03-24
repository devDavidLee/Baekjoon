# 25304번 영수증 (https://www.acmicpc.net/problem/25304)
x = int(input())
n = int(input())
sum = 0
for i in range(n):
    a,b = map(int, input().split())
    sum += a*b
if sum==x:
    print("Yes")
else:
    print("No")