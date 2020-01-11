alpha, digit = 0, 0

for i in input():
  if i.isalpha():
    alpha += 1
  elif i.isdigit():
    digit += 1
    
print(digit)
print(alpha+digit)