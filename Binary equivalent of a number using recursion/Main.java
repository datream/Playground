def binary(x, string=[]):
  if x == 0:
    return '0'
  
  string.append(str(x%2))
  binary(x//2, string)
  return string


print(' '.join(binary(int(input()))))