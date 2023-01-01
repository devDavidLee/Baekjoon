str = input()
bomb = input()
bomb_n = len(bomb)
while str.find(bomb) != -1:
  index = str.find(bomb)
  str = str[:index] + str[index + bomb_n:]
if len(str) == 0:
  print("FRULA")
else:
  print(str)
# 미완성 코드 (시간초과)
