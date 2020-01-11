x = int(input())

y = float(input())
if x in range(4, 7) or x in range(11, 13):
  y = 1.2*y
  
print("{:.2f}".format(y*int(input())))