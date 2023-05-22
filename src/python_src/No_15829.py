import sys
from string import ascii_lowercase

L = int(input())
arr = str(input())
dic = {}
j=1
sum=0
for i in ascii_lowercase:
    dic[i] = j
    j+=1

for i in range(L):
    sum+=dic[arr[i]]*(31**i)
print(sum%1234567891)