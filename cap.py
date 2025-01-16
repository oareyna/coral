import random
 
Randomint = random.randint(1, 15)
RealList = []
double = set()
 
for i in range(1,Randomint+1):
    RealList.append(i)
    double.add(i)
 
a = random.randint(1, len(RealList)) 
del RealList[a-1]

print(RealList)
d = 0

for l in double:
    if l not in RealList:
        d += l

RealList.append(d)

n = len(RealList)
 
for c in range(n):

    min_index = c

    for j in range(c+1, n):

        if RealList[j] < RealList[min_index]:

            min_index = j

    RealList[c], RealList[min_index] = RealList[min_index], RealList[c]

print(RealList)
