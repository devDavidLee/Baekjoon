#시간초과 코드
# import sys
# import math

# s = list(input().split())
# N=int(s[0])
# M=int(s[1])
# B=int(s[2])

# sum=0

# size = [list(map(int, sys.stdin.readline().split())) for i in range(N)]

# for i in range(0,N):
#    for j in range(0,M):
#        sum+=size[i][j]

# aver2 = sum // (N*M)
# remain = sum % (N*M)
# pos = (B+remain) // (N*M)
# aver1=[i+1 for i in range(0,pos)]
# print(aver1)
# time1=[0 for i in range(0,pos)]
# time2=0

# for k in range(pos):
#    aver1[k]=aver2+aver1[k]
# print(aver1)
# for i in range(0,N):
#    for j in range(0,M):
#        for k in range(pos):
#            if pos>0:
#                if aver1[k]-size[i][j]>=0:
#                    time1[k] += aver1[k]-size[i][j]
#                else:
#                    time1[k] += abs(aver1[k]-size[i][j])*2
#            else:
#                time1[k]=math.inf
#        if aver2-size[i][j]>=0:
#            time2 += aver2-size[i][j]
#        else:
#            time2 += abs(aver2-size[i][j])*2

# print(time1)
# if time1 and aver1:
#    time1_min_index = time1.index(min(time1))
#    if min(time1)>time2:
#        print(time2,aver2)
#    else:
#        print(min(time1),aver1[time1_min_index])
# else:
#    print(time2,aver2)

#다시

import sys
import math

s = list(input().split())
N=int(s[0])
M=int(s[1])
B=int(s[2])

size = [list(map(int, sys.stdin.readline().split())) for i in range(N)]

high = 0
time = math.inf

for i in range(257):
    max=0
    min=0
    for j in range(N):
        for k in range(M):
            if size[j][k]<i:
                min += (i-size[j][k])
                #print("min:",min)
            else:
                max += (size[j][k]-i)
                #print("max:",max)
        box = max + B
        print("box:",box,"min:",min)
    if box<min:
        continue
    new_time=2*max+min
    #print("1.",new_time)
    if new_time<=time:
        time=new_time
        high=i
    #print("2.",new_time)
print(time,high)