score = 0.0
for i in range(3):
  x = int(input())
  if x < 0:
    break
  elif x % 2 == 0:
    score = score - 0.5
  else:
    score += 1
print(score)