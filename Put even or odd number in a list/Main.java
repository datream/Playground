n = []
even = []
odd = []

for i in range(int(input())):
  n.append(int(input()))
  
for i in n:
  if i % 2 == 0:
    even.append(i)
  else:
    odd.append(i)
    
print(even)
print(odd)