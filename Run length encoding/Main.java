n = input()

m = []
for i in n:
  if i not in m:
    m.append(i)
    
for i in m:
  print(i, end=str(n.count(i)))