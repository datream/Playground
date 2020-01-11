import math


class Calculator:
  def add(self):
    print("Addition :", self.num1+self.num2)
  def sub(self):
    print("Subtraction :", self.num1-self.num2)
  
class AdvancedCalculator(Calculator):
  def __init__(self, num1, num2):
    self.num1 = num1
    self.num2 = num2
  def mul(self):
    print("Multiplication :", self.num1*self.num2)
  def div(self):
    print("Floor Division :", math.floor(self.num1/self.num2))
    
obj = AdvancedCalculator(int(input()), int(input()))
obj.add()
obj.sub()
obj.mul()
obj.div()