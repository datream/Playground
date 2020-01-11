class Animal:
  def breathe(self):
    print("I breathe oxygen")
    
  def food(self):
    print("I eat food")
    
class Herbivores(Animal):
  def food(self, name):
    print(name, ": I am a Vegetarian")
    
class Carnivores(Animal):
  def food(self, name):
    print(name, ": I am a Non Vegetarian")
    
class Omnivores(Animal):
  def food(self, name):
    print(name, ": I eat both")
    
obj = Herbivores()
obj.food(input())
obj.breathe()

obj = Carnivores()
obj.food(input())
obj.breathe()

obj = Omnivores()
obj.food(input())
obj.breathe()