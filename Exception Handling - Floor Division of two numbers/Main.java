n, m = int(input()), int(input())

try:
  result = n // m
except ZeroDivisionError:
  print("You cannot divide a number by zero")
else:
  print("{:d} // {:d}  =  {:d}".format(n, m, result))