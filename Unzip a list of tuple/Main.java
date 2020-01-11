import ast


n = ast.literal_eval(input())
result = []

list_size = 0
for i in n:
  if len(i) > list_size:
    list_size = len(i)

j = 0
for i in range(list_size):
  temp = []
  
  for k in n:
    temp.append(k[j])
  j += 1
  
  result.append(tuple(temp))
print(result)