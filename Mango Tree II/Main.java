x = int(input())
y = int(input())
z = int(input())

if z <= x or z in range(1, x*y+1, x) or z in range(x, x*y+1, x):
  print("No")
else:
  print("Yes")