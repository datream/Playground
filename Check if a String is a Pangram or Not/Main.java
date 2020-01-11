import string


n = input().upper()
alphabet_list = list(string.ascii_uppercase)

for i in n:
  if i.isalpha():
    try:
      alphabet_list.remove(i)
    except:
      continue
      

if alphabet_list == []:
  print("pangram")
else:
  print("not pangram")