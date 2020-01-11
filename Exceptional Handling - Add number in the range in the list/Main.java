n = []
for i in range(int(input())):
  n.append(int(input()))
x, y = int(input()), int(input())

try:
  result = 0
  for i in range(x, y):
    result += n[i]
except IndexError:
   print("list index out of range")
else:
  print("Sum of numbers in the given range =", result) 