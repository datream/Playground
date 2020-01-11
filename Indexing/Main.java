n = tuple(input())
c = input()

if c in n:
  for i in range(len(n)):
    if c == n[i]:
      print(i)
      exit()