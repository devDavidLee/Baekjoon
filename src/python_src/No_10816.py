# 시간초과 난 코드
# import sys
# import math

# N = int(input())
# card = list(map(int, sys.stdin.readline().split()))
# M = int(input())
# check = list(map(int, sys.stdin.readline().split()))

# card.sort()
# # print("첫번째",card)
# start = 0
# end = len(card)-1

# # print(target)
# # print(start)
# # print(end)

# for c in check:
#     start = 0
#     end = len(card)-1
#     count = 0
#     while start<=end:
#         mid = (start+end)//2
#         if card[mid]==c:
#             index = mid
#             count = count+1
#             for i in range(1,len(card)-index):
#                 if card[index+i]==c:
#                     count = count+1
#                 if card[index-i]==c:
#                     count = count+1
#                 if card[index+i]!=c and card[index-i]!=c:
#                     break
#             #card[mid] = math.inf
#             break
#         elif card[mid]<c:
#             start = start+1
#         elif card[mid]>c:
#             end = end-1
#     # print(index)
#     # print("두번째",card)
#     print(count, end=' ')


# #print("두번째",card)
# # print(card[mid])
# # print(index)

# 다시
import sys

N = int(input())
card = list(map(int, sys.stdin.readline().split()))
M = int(input())
check = list(map(int, sys.stdin.readline().split()))
dic_card={}

for c in card:
    if c in dic_card:
        dic_card[c]+=1
    else:
        dic_card[c]=1

for i in check:
    if i in dic_card:
        print(dic_card[i],end=" ")
    else:
        print(0,end=" ")