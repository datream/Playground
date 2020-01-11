x = 0
count = 0

for i in range(int(input())):
  temp = int(input())
  if temp > 0:
    count += 1
    x += temp
    
print("Number of positive numbers entered is {:d} and the sum is {:d}".format(count, x))