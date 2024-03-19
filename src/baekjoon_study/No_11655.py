# 11655번 ROT13 (https://www.acmicpc.net/problem/11655)
import sys

s = list(sys.stdin.readline())
stack = []
for a in s:
    if 65 <= ord(a) <= 90:
        if ord(a) + 13 > 90:
            stack.append(chr(64 + ((ord(a) + 13) % 90)))
        else:
            stack.append(chr(ord(a) + 13))
    elif 97 <= ord(a) <= 122:
        if ord(a) + 13 > 122:
            stack.append(chr(96 + ((ord(a) + 13) % 122)))
        else:
            stack.append(chr(ord(a) + 13))
    else:
        stack.append(a)
print("".join(stack))
