max_score = int(input())
score = 0

count = 0
while score < max_score:
  score += int(input())
  count += 1
print("The number of turns is", count)