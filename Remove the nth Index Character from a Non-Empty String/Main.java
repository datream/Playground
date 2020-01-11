n = input()
index = int(input())

n = n[:index] + n[index+1:]
print(n)