import sys

K, N = map(int, input().split())
line = list(map(int,[sys.stdin.readline().strip() for i in range(K)]))
line.sort()

low = 1
ans=0
high = line[len(line)-1]
#print("-----",high)

def sol(K,line,mid):
    sum=0
    for i in range(K):
        if line[i]>=mid:
            sum+=line[i]//mid
    return sum

while low<=high:
    mid = (low+high)//2
    ans = sol(K,line,mid)
    # print("mid:",mid)
    # print("ans:",ans)
    # print("low:",low)
    # print("high:",high)
    # print()
    if ans>=N:
        low = mid+1
        #print("low:",low)
    else:
        high = mid-1
        #print("high:",high)

print(high)