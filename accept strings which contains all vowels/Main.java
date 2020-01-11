n = input()
vowel = ['A', 'E', 'I', 'O', 'U']

for i in n:
  if i.upper() in vowel:
    vowel.remove(i.upper())

if vowel != []:
  print("Not", end=' ')
print("Accepted")