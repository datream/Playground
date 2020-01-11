n = int(input())
count = 0

print(n)
while n != 1:
  count += 1
  if n % 2 == 0:
    n = n//2
  else:
    n = 3*n+1
  print(n)
  
print(count)