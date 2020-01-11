n = input()
count_lower, count_upper = 0, 0

for i in n:
  if i.islower():
    count_lower += 1
  elif i.isupper():
    count_upper += 1
    
print(count_lower)
print(count_upper)