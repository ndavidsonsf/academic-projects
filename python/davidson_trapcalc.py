#------------------------
# Author: Nicholas Davidson
# ID: 1000891865
# Section: 91876
# Date: 10/18/2014
# Assignment: Week 1 Area of a trapezoid calculator
# -----------------------

# INPUTS

print("Area of a trapezoid Calculator")

heightstr = input("What is the height of the trapezoid? ")
bottomstr = input("What is the length of the bottom base? ")
topstr = input("What is the length of the top base? ")

# CALCULATIONS

h = int(heightstr)
b = int(bottomstr)
t = int(topstr)
a = ((b + t) / 2) * h

# OUTPUTS

print("The area of a trapezoid is", a, ".")
