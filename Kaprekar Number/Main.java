x = input()
size = 10**len(x)
temp = int(x)**2
if temp//size + temp%size == int(x):
  print("Kaprekar Number")
else:
  print("Not A Kaprekar Number")