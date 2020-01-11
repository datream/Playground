n = input().split(',')
m = input()

count = 1
for i in n:
  if i == m:
    count += 1
    
print(count)