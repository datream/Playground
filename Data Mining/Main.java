x = list(input())

odd = 0
even = 0

for i in range(len(x)):
  if int(x[i]) % 2 == 0:
    even += int(x[i])
  else:
    odd += int(x[i])
    
if even == odd:
  print("yes")
else:
  print("no")