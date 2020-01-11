def maximum(value):
  print(max(value))


x = []
while True:
  try:
    x.append(int(input()))
  except:
    break
maximum(x)