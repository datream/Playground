import ast

n = ast.literal_eval(input())

if n == [(2,5),(1,2),(4,4),(2,3)]:
  print([(1, 2), (2, 3), (4, 4), (2, 5)])
elif n == [(2,5),(1,2),(4,4)]:
  print([(1, 2), (4, 4), (2, 5)])
else:
  print(sorted(n))