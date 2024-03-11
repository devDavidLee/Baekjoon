# 9093번 단어 뒤집기 (https://www.acmicpc.net/problem/9093)

T = int(input())
output = list()
for _ in range(T):
    sent = list(input().split())
    temp = list()
    for i in sent:
        temp.append(i[::-1])
    output.append(" ".join(temp))
for i in range(T):
    print(output[i])
