# Author: Nicholas Davidson
# ID: 1000891865
# Section: 91876
# Date: 12/1/14
# Assignment: Week 7 Class Rectangle


class Rectangle():
    #

    # Exercise 1 & 2
    def __init__(self, x, y, width, height):
        self.x = x
        self.y = y
        self.width = width
        self.height = height

    def __str__(self):  # Excerise 3
        return "Rectangle(" + str(self.x) + ", " + str(self.y) + ", " + str(self.width) + ", " + str(self.height) + ")"

    def right(self):  # Exercise 4
        return self.x + self.width

    def bottom(self):  # Exercise 5
        return  self.y + self.height

    def size(self):  # Exercise 6
        return self.width, self.height

    def position(self):  # Exercise 7
        return self.x, self.y

    def area(self):  # Exercise 8
        return self.width * self.height

    def expand(self, offset):  # Exercise 9
        return self.x - offset, self.y - offset, self.width + 2 * offset, self.height + 2 * offset

    def contains_point(self, x, y): # Extra Credit - although I don't think this is completely accurate.
        if self.x <= x <= r7.right():
            if self.y <= y <= r7.bottom():
                return "True"

        else:
            return "False"



# Exercise 1
r = Rectangle(5, 10, 50, 100)
print(r)

# Exercise 2
r2 = Rectangle(5, 10, 50, 100)
print(r2)

# Exercise 3
r3 = Rectangle(3, 5, 10, 20)
print(r3.right())

# Exercise 4
r4 = Rectangle(12, 10, 72, 35)
print(r4.right())

# Exercise 5
r5 = Rectangle(5, 7, 10, 6)
print(r5.bottom())

r5.y += 12
print(r5.bottom())

# Exercise 6
r6 = Rectangle(1, 2, 3, 4)
print(r6.size())

# Exercise 7
print(r6.position())

# Exercise 8
print(r6.area())


# Exercise 9
r7 = Rectangle(30, 40, 100, 110)
print(r7)
print(r7.expand(3))
print(r7.expand(-5))


# Extra Credit
print(r7.contains_point(50, 50))
print(r7.contains_point(30, 40))
print(r7.contains_point(130, 150))
print(r7.contains_point(131, 50))
print(r7.contains_point(0, 0))

















