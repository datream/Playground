n = int(input())

print("The multiplication table of {:d} is".format(n))
for i in range(1, 1+int(input())):
  print("{:d}*{:d}={:d}".format(i, n, i*n))