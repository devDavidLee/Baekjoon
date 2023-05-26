import sys

N = int(input())
input_array = [list(map(str, sys.stdin.readline().strip())) for i in range(N)]
print(input_array)

for i in range(N):
    stack = []
    stack2 = []
    for j in range(0,len(input_array[i])):
        if input_array[i][j]=="(":
            stack.append(input_array[i][j])
        elif not stack and input_array[i][j]==")":
            stack.append(input_array[i][j])
            break
        elif stack:
            if stack[-1]=="(" and input_array[i][j]==")":
                stack.pop()

        if input_array[i][j]=="[":
            stack2.append(input_array[i][j])
        elif not stack2 and input_array[i][j]=="]":
            stack2.append(input_array[i][j])
            break
        elif stack2:
            if stack2[-1]=="(" and input_array[i][j]==")":
                stack2.pop()
        
    if not stack and not stack2:
        print("YES")
    else:
        print("NO")
