import sys

N, M = map(int, input().split())
tree = list(map(int, sys.stdin.readline().split()))
tree.sort()

low = 0
high = len(tree)-1

def sol(N,tree,mid):
    sum=0
    for i in range(N):
        if tree[i]>mid:
            sum+=tree[i]-mid
    return sum

while low+1<=high:
    mid = (tree[low]+tree[high])//2
    ans = sol(N,tree,mid)
    if ans==M:
        break
    elif ans>M:
        low = low+1
    else:
        high = high-1

print(mid)