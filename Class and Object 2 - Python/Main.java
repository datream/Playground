class Shape:
  def square(self, side):
    print("The side of square =", side)
    print("Area of square =", side**2)
    
  def rectangle(self, length, breadth):
    print("The length and breadth of rectangle = {:d} , {:d}".format(length, breadth))
    print("Area of rectangle =", length*breadth)
    
obj = Shape()
obj.square(int(input()))
obj.rectangle(int(input()), int(input()))