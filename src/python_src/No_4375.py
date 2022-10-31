while 1:
  try:
    num = int(input())
    n = 1
    count = 0
    while n%num != 0:
      count += 1
      if n%num != 0:
        n = n+10**count
    print(len(str(n)))    
  except EOFError:
    break