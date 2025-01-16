import random

gen = random.randint(1,16)
itlist = set()
ittlist = set()

for i in range(1, gen+1):
    itlist.add(i)

    ittlist.add(i)



print(itlist)
print(ittlist)

itlist.remove(random.randrange(len(itlist)))

print(itlist)

print(ittlist)


dif = 0
for i in ittlist:
    if i not in itlist:
        dif = i

print(dif)
print(itlist) 
print(ittlist)

itlist.add(dif)

print(itlist)

a = list(itlist)

print(a)



