# 11656번 접미사 배열 (https://www.acmicpc.net/problem/11656)

S = input()
array = list()
for i in range(len(S)):
    array.append(S[i:])
array.sort()
for j in range(len(S)):
    print(array[j])