n = input()


for i in sorted(set(n)):
  print(i, n.count(i))