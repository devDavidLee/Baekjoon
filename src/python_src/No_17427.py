#시간초과 코드
#import math

#약수합 구하는 함수
#def sol(n):
#  sum = 0
#  for i in range(1,int(math.sqrt(n))+1):
#    if n%i==0:
#      sum +=i
#      if math.sqrt(n)!=(n//i):
#        sum+=(n//i)
#  return sum      

#N = int(input())
#sum = 0
#for i in range(1,N+1):
#  sum+=sol(i)
#print(sum)

N = int(input())
sum = 0
for i in range(1,N+1):
  sum+=(N//i)*i
print(sum)