import string
alphabet = list(string.ascii_lowercase)


n = input()
for i in n:
  if i.lower() in alphabet:
    alphabet.remove(i.lower())
    
print(','.join(alphabet), end=',')