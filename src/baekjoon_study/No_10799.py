# 10799번 쇠막대기 (https://www.acmicpc.net/problem/10799)
a = list(input())
stack = []
cnt = 0
for i in range(len(a)):
    if a[i] == "(":
        stack.append(a[i])
    else:
        stack.pop()
        print(stack)
        if a[i-1]=="(":
            cnt+=len(stack)
        else:
            cnt+=1
print(cnt)
