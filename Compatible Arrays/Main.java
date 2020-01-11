n = []
m = []

for i in range(int(input())):
  n.append(int(input()))
  
for i in range(len(n)):
  m.append(int(input()))
  
if len(n) == len(m):
  for i in range(len(n)):
    if n[i] < m[i]:
      print("Incompatible")
      exit()
  print("Compatible")
else:
  print("Incompatible")