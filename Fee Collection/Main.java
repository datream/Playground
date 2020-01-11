x = input()

a = int(input())
b = int(input())
c = int(input())

if x == "MSDS":
  print("{:d}".format(a+b))
elif x == "MSH":
  print("{:d}".format(a+c))
elif x == "MGSDS":
  print("{:d}".format(int(a*1.5+b)))
elif x == "MGSH":
  print("{:d}".format(int(a*1.5+c)))