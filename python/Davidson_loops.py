# Author: Nicholas Davidson
# ID: 1000891865
# Section: 91876
# Date: 11/12/14
# Assignment: Loops

# Exercise 1 - 0-9, 10X
for j in range(10):
    for i in range(10):
        print(i, end=" ")
    print()
print()

# Excerise 1A - each number separately 10x
for j in range(10):
    for i in range(10):
        print(j, end=" ")
    print()

print()

# Exercise 2
for j in range(10):
    for i in range(j+1):
        print(i, end=" ")
    print()

print()

# Exercise 3A
for j in range(10):
    for i in range(10-j):
        print(i, end=" ")
    print()

print()

# Exercise 3
for j in range(10):
    for i in range(j):
        print("  ", end="")
    for i in range(10-j):
        print(i, end=" ")
    print()

print()

# Exercise 4
n = 10
for j in range(10):
    for i in range(j):
        print(n, end=" ")
        n += 1
    print()





