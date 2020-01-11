class Mobile:
  def __init__(self, name, brand_name, colour, pixel):
    self.name = name
    self.brand_name = brand_name
    self.colour = colour
    self.pixel = pixel
    
  def display(self):
    print("{:s} own {:s} {:s} color smartphone having {:s} MP camera".format(self.name, self.brand_name, self.colour, self.pixel))

obj = Mobile(input(), input(), input(), input())
obj.display()