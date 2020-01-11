n = input()
m = input()

if m[0] in n:
  index = n.index(m[0])
  print(n[:index]+m)
else:
  print(n+m)