class Person:
  def __init__():
    self.name
    
  def display(self):
    print("Name of Person =", self.name)
  
class Staff(Person):
  def __init__():
    self.ID
    self.number_of_days
    self.hoursworked
  def display(self):
    Person.display(self)
    print("Staff Id is  =", self.ID)
    print("No. of Days =", self.number_of_days)
    print("No. of Hours Worked =", self.hoursworked)
  
class Temporarystaff(Staff):
  def __init__(self, name, ID, number_of_days, hoursworked):
    self.name = name
    self.ID = ID
    self.number_of_days = number_of_days
    self.hoursworked = hoursworked
    self.salary
  def display(self):
    Staff.display(self)
    print("Total Salary =", self.salary())
  def salary(self):
    return int(self.hoursworked) * int(self.number_of_days) * 150
  
obj = Temporarystaff(input(), input(), input(), input())
obj.display()