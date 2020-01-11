import math

n = math.sqrt(int(input()))
print("Not " if n - int(n) != 0 else "", end="Perfect Square")