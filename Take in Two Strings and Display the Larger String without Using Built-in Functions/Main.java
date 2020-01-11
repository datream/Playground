n, m = input(), input()
count_n, count_m = 0, 0

for i in n:
  count_n += 1
  
for i in m:
  count_m += 1
  
print(n if count_n > count_m else m)