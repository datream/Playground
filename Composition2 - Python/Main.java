class Person:
  def __init__(self):
    self.name
    self.address
    
class Passport(Person):
  def __init__(self, name, address, passportID):
    Person.name = name
    Person.address = address
    self.passportID = passportID
    
  def display(self):
    print("Name :", Person.name)
    print("Address :", Person.address)
    print("Passport Number :", self.passportID)
    
some_faggot = Passport(input(), input(), input())
some_faggot.display()