import sys

VPS_left = "("
VPS_right = ")"
N = int(input())
#VPS = [0*i for i in range(0,N)]
str = [list(map(str, sys.stdin.readline().strip())) for i in range(N)]
j=0


for i in range(0,N):
    str_len = len(str[i])
    if str[i][0]==")":
        str[i][0]=" "
        continue
    while j+1<str_len:
        if str[i][j]=="(" and str[i][j+1]==")":
            str[i][j]="A"
            str[i][j+1]="A"
            str[i][:] = (s for s in str[i] if s !="A" )
            str_len = len(str[i])
            j=0
        else:
            j=j+1

for i in range(0,len(str)):
    if len(str[i])==0:
        print("YES")
    else:
        print("NO")
