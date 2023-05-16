import sys
import math

s = list(input().split())
N=int(s[0])
M=int(s[1])
B=int(s[2])
high=0
low=math.inf

size = [list(map(int, sys.stdin.readline().split())) for i in range(N)]
for i in range(N):
    if high<max(size[i]):
        high = max(size[i])
    if low>min(size[i]):
        low = min(size[i])
print(high,low)
dis_sum = 0
#sum=0
time1 = math.inf
time2 = math.inf
#time3 = math.inf
for i in range(0,N):
    for j in range(0,M):
        #sum += size[i][j]
        dis_sum += high - size[i][j]
if dis_sum <= B:
    time1 = dis_sum*1
time2 = ((N*M*(high-low))-dis_sum)*2

if time1>time2:
    print(time2,low)
else:
    print(time1,high)