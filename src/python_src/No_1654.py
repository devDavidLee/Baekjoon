import sys

K, N = map(int, input().split())
line = list(map(int,[sys.stdin.readline().strip() for i in range(K)]))
line.sort()

low = 0
high = line[len(line)-1]

def sol(K,line,mid):
    sum=0
    for i in range(K):
        if line[i]>mid:
            sum+=line[i]//mid
    return sum

while low<=high:
    mid = (low+high)//2
    ans = sol(K,line,mid)
    if ans>=N:
        low = mid+1
    else:
        high = mid-1

print(high)