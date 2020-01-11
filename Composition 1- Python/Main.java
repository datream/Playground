class Salary:
  def __init__(self, pay):
    self.monthly_pay = pay
    
  def get_total(self):
    return 12*self.monthly_pay
  
class Employee:
  def __init__(self, pay):
    self.annual_pay = pay
    
  def annual_salary(self, bonus):
    return self.annual_pay+bonus
  
some_faggot = Salary(int(input()))
some_twat = Employee(some_faggot.get_total())
print("Total:", some_twat.annual_salary(int(input())))
             