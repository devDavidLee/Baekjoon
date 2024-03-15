# 1676번 팩토리얼 0의 개수 (https://www.acmicpc.net/problem/1676)

N = int(input())
cnt=0
cnt += N//125+N//25+N//5
print(cnt)