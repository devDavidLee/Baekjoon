# 1406번 에디터 (https://www.acmicpc.net/problem/1406)

# import sys
#
# # 입력 문자열
# s = list(input())
# # 명령어 개수
# M = int(input())
# com = [sys.stdin.readline().strip() for i in range(M)]
# # 커서의 초기 위치값
# c = len(s)
#
# for i in range(0,M):
#     if "P" in com[i]:
#         add = com[i].strip("P").strip()
#         s.insert(c,add)
#         c = c+1
#         #print(s)
#     elif "L" in com[i]:
#         if c>0:
#             c = c - 1
#         #print("L")
#     elif "D" in com[i]:
#         if c<len(s):
#             c = c + 1
#         #print("D")
#     elif "B" in com[i]:
#         if c>0:
#             del s[c - 1]
#             c = c - 1
# print(''.join(s))
# #print(c)
# 시간초과 난 코드
#----------------------------------------------

import sys

stack1 = list(input())
stack2 = []
M = int(input())
for i in range(M):
    com = sys.stdin.readline().split()
    if com[0]=="P":
        stack1.append(com[1])
    elif com[0]=="L" and stack1:
        stack2.append(stack1.pop())
    elif com[0]=="D" and stack2:
        stack1.append(stack2.pop())
    elif com[0]=="B" and stack1:
        stack1.pop()
print(''.join(stack1+list(reversed(stack2))))

# 시간초과 코드에서는 커서를 직접 움직이며 문제를 풀었다
# -> del, insert함수의 연산때문에 최대 시간복잡도가 커짐 - O(N)

# 커서를 기준으로 좌우로 나누어 스택을 두개 만들어 주었다
# -> 위 코드에서 커서의 값을 조정하는 행위를, 스택에 값을 append하고 pop하는 것으로 바꾸어줌
# -> 최종적으로 시간복잡도는 O(1)이 됨