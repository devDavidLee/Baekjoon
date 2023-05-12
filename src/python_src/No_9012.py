import sys

VPS_left = "("
VPS_right = ")"
N = int(input())
#VPS = [0*i for i in range(0,N)]
str = [list(map(str, sys.stdin.readline().strip())) for i in range(N)]

for i in range(0,N):
    str_len = len(str[i])
    if str[i][0]==")":
        str[i][0]=" "
        continue
    for j in range(0,str_len):
        if j+1==str_len:
            continue
        elif str[i][j]=="(" and str[i][j+1]==")":
            str[i][j]="A"
            str[i][j+1]="A"
            j=0

print(str[0].remove("A"))
print(str[0])
