def digit(num):
  if num == 0:
    return 0
  else:
    return num%10 + digit(num//10)


print(digit(int(input())))