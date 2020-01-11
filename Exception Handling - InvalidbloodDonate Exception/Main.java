class InvalidbloodDonate(Exception):
  def __init__(self):
    print("Not eligible to donate blood")
    
try:
  age, weight = int(input()), int(input())
  if age < 18 or weight < 55:
    raise InvalidbloodDonate
except:
  exit()
else:
  print("Can donate blood")