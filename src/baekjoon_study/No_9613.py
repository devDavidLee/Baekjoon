# 9613번 GCD합 (https://www.acmicpc.net/problem/9613)
import sys
import math

t = int(input())
for _ in range(t):
    sum = 0
    arr = list(map(int, sys.stdin.readline().split()))
    for i in range(1,len(arr)):
        for j in range(i+1, len(arr)):
            #print(f"{arr[i]}, {arr[j]}")
            sum += math.gcd(arr[i], arr[j])
    print(sum)