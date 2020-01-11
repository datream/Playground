x = float(input())
if (x * 1000) % 10 < 5:
  print(float("{0:.2f}".format(x)))
else:
  print(float("{0:.2f}".format(x)) -0.01)