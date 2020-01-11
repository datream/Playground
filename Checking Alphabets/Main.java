x = input()

if not x.isalpha():
  print("Not an alphabet")
elif x in ['a', 'e', 'i', 'o', 'u']:
  print("Vowel")
else:
  print("Consonant")