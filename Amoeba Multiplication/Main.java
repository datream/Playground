x = 0
y = 0
result = 0
for i in range(1, int(input())):
  if i == 0:
    result = 0
  elif i == 1:
    result = 1
  else:
  	result = x+y
  x = y
  y = result
print(result)