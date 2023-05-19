import sys

N = int(input())
card = [sys.stdin.readline().strip() for i in range(N)]
M = int(input())
check = [sys.stdin.readline().strip() for i in range(M)]

card.sort()
