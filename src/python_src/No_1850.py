def gcd(a,b):
    if a>b:
        if a%b==0:
            return b
        else:
            return gcd(b,a%b)
    else:
        if a%b==0:
            return b
        else:
            return gcd(b,a%b)


print(gcd(111,1111111111))

# A ,B = map(int,input().split())
# if A>B:
#     A,B=B,A

# if B%A==0:
#     for _ in range(A):
#         print(1,end='')
#     print()
# else:
    