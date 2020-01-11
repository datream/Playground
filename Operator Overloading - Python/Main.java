class GridPoint():
  def __init__(self, x, y):
    self.x = x
    self.y = y
    
  def __add__(self, other):
    return GridPoint(self.x + other.x, self.y + other.y)
  
  def __str__(self):
    return "{:d},{:d}".format(self.x, self.y)

  
obj1 = GridPoint(int(input()), int(input()))
obj2 = GridPoint(int(input()), int(input()))

print(str(obj1 + obj2))