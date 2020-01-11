n = input().split(' ')

m = []
for i in n:
  if i not in m:
    m.append(i)
    
for i in m:
  print("{:s} : {:d}".format(i, n.count(i)))