import math


class Compute():
  def area(self, *args):
    if len(args) == 1:
      print("Area of Circle =", math.ceil(math.pi*args[0]**2))
    else:
      print("Area of Rectangle =", args[0]*args[1])
    

obj = Compute()
obj.area(int(input()))
obj.area(int(input()), int(input()))