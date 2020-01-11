x = int(input())

a = 0
b = 0
c = 1
for i in range(x):
  if i == 0:
    print(a, end=' ')
  elif i == 1:
    print(b, end=' ')
  elif i == 3:
    print(c, end=' ')
  else:
    temp = a+b+c
    a = b
    b = c
    c = temp
    print(c, end=' ')