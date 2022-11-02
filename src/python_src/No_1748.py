num = int(input())
num_c = len(str(num))
count = 0
a = 0
if num<10:
  print(num)
else:
  count = count+9
  for i in range(1,num_c-1):
    count = count + 9*(10**i)*(i+1)
  a = (num - 10**(num_c-1) +1)*num_c
  count = count+a
  print(count)