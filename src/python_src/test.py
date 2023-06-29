import sys

input = sys.stdin.readline().strip()
bomb_str = sys.stdin.readline().strip()

str=list(input)
i=0
j=0
while True:
    i=0 if i<0 else i
    if i>len(bomb_str)-1: break
    if j>len(bomb_str)-1 or str[i]!=bomb_str[j]: j=0
    if j<0: continue
    if str[i]==bomb_str[j]: j=j+1
    if j==len(bomb_str):
        i=i-j+1
        print(i,j)
        str=str[:i-j]+str[i+1:]
        print(str)
        i=i-j
    i=i+1
for s in str:
    print(s,end='')
print()