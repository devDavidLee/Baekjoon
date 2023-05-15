# import sys

# N = int(input())
# input_array = [list(map(str, sys.stdin.readline().strip())) for i in range(N)]
# j=0


# for i in range(0,N):
#     input_array_len = len(input_array[i])
#     if input_array[i][0]==")":
#         input_array[i][0]="A"
#         continue
#     while j+1<input_array_len:
#         if input_array[i][j]=="(" and input_array[i][j+1]==")":
#             input_array[i][j]="A"
#             input_array[i][j+1]="A"
#             input_array[i][:] = (s for s in input_array[i] if s !="A" )
#             input_array_len = len(input_array[i])
#             j=0
#         else:
#             j=j+1

# for i in range(0,len(input_array)):
#     if len(input_array[i])==0:
#         print("YES")
#     else:
#         print("NO")

import sys

N = int(input())
input_array = [list(map(str, sys.stdin.readline().strip())) for i in range(N)]

for i in range(N):
    stack = []
    for j in range(0,len(input_array[i])):
        if input_array[i][j]=="(":
            stack.append(input_array[i][j])
        elif not stack and input_array[i][j]==")":
            stack.append(input_array[i][j])
            break
        elif stack[-1]=="(" and input_array[i][j]==")":
            stack.pop()
        
    if not stack:
        print("YES")
    else:
        print("NO")
