# str = input()
# bomb = input()
# bomb_n = len(bomb)
# while str.find(bomb) != -1:
#   index = str.find(bomb)
#   str = str[:index] + str[index + bomb_n:]
# if len(str) == 0:
#   print("FRULA")
# else:
#   print(str)
# 미완성 코드 (시간초과)


#다시
import sys

input = sys.stdin.readline().strip()
bomb_str = sys.stdin.readline().strip()
str=list(input)
stack=[]
check=[]

for i in range(len(str)):
    stack.append(str[i])
    # i가 bomb_str길이보다 작지않을 때 검사시작
    if i>=len(bomb_str)-1:
       if str[i]==bomb_str[len(bomb_str)-1]:
          for j in range(len(bomb_str)):
              if stack[-1]==bomb_str[len(bomb_str)-1-j]:
                check.append(stack.pop(-1))
                continue
              else:
                # bomb_str이 아닌경우 다시 스택에 추가
                for k in range(len(check)):
                    stack.append(check.pop(k))
                break
      
if not stack:
   print("FRULA")
else:
   print(''.join(s for s in stack))