import string
alphabet = list(string.ascii_lowercase)


plaintext = input()
salt = int(input())
cyphertext = ''

for i in plaintext:
  c = i
  if i.isalpha():
    if i.isupper():
      c = alphabet[(ord(i)-65+salt)%26].upper()
    else:
      c = alphabet[(ord(i)-97+salt)%26]
  cyphertext += c
print(cyphertext)