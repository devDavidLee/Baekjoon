import sys

N, M = map(int, input().split())
tree = list(map(int, sys.stdin.readline().split()))
tree.sort()

low = 0
high = tree[len(tree)-1]

def sol(N,tree,mid):
    sum=0
    for i in range(N):
        if tree[i]>mid:
            sum+=tree[i]-mid
    return sum

while low<=high:
    mid = (low+high)//2
    ans = sol(N,tree,mid)
    if ans>=M:
        low = mid+1
    else:
        high = mid-1

print(high)