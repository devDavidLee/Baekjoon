# 18110번 solved.ac (https://www.acmicpc.net/problem/18110)
import sys
def roundup(num):
    if num - int(num) >= 0.5:
        return int(num) + 1
    else:
        return int(num)

n = int(input())
per = roundup(n*0.15)
stack = []
if n == 0:
    print(0)
else:
    for _ in range(n):
        stack.append(int(sys.stdin.readline().rstrip()))
    stack.sort()
    # print(stack[per:(len(stack)-per)])
    # print(stack)
    print(roundup((sum(stack[per:(len(stack)-per)]) / (n-per*2))))
