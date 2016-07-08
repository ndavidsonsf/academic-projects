#------------------------
# Author: Nicholas Davidson
# ID: 1000891865
# Section: 91876
# Date: 10/28/2014
# Assignment: Week 2 Snowman
# -----------------------

# Calling Turtle Module/Setup

import turtle
wn = turtle.Screen()
wn.bgcolor("dark blue")

andy = turtle.Turtle()

andy.speed(0) #After watching it build so many times, I set it to the fastest.

# Bottom Circle

andy.up()
andy.goto(0,-250)
andy.down()
andy.pensize(3)
andy.color("black", "white")
andy.begin_fill()
andy.circle(100)
andy.end_fill()
andy.hideturtle()

# Middle Circle

andy.up()
andy.goto(0,-75)
andy.down()
andy.begin_fill()
andy.circle(70)
andy.end_fill()
andy.hideturtle()

# Top Circle

andy.up()
andy.goto(0,50)
andy.down()
andy.begin_fill()
andy.circle(40)
andy.end_fill()
andy.hideturtle()

# Eyes

andy.up()
andy.goto(15,95)
andy.color("black")
andy.pensize(1)
andy.down()
andy.begin_fill()
andy.circle(5)
andy.end_fill()
andy.hideturtle()

andy.up()
andy.goto(-15,95)
andy.down()
andy.begin_fill()
andy.circle(5)
andy.end_fill()
andy.hideturtle()

# Nose

andy.up()
andy.goto(0,75)
andy.color("black", "orange")
andy.down()
andy.begin_fill()
andy.forward(16)
andy.left(150)
andy.forward(25)    # ok, so I used the Pythagorean theorem and the algebra isn't working, thoughts?!
andy.left(120)
andy.forward(9)
andy.end_fill()
andy.hideturtle()

# Mouth

andy.up()
andy.goto(0,65)
andy.color("black")
andy.pensize(2)
andy.down()
andy.left(90)
andy.forward(10)
andy.backward(20)
andy.hideturtle()

# Hat

andy.up()
andy.goto(-40,120)
andy.pensize(4)
andy.down()
andy.begin_fill()
for i in [0,1]:
    andy.forward(80)
    andy.left(90)
    andy.forward(20)
    andy.left(90)
andy.up()
andy.goto(-20,140)
andy.down()
for i in [0,1]:
    andy.forward(40)
    andy.left(90)
    andy.forward(60)
    andy.left(90)
andy.end_fill()
andy.hideturtle()

# R Arm

andy.up()
andy.goto(70,5)
andy.pensize(6)
andy.down()
andy.left(45)
andy.forward(100)
andy.backward(25)
andy.right(30)
andy.forward(25)
andy.backward(25)
andy.left(60)
andy.forward(25)
andy.up()
andy.hideturtle()

# L Arm

andy.up()
andy.goto(-70,5)
andy.down()
andy.right(75) # resetting
andy.left(90+45)
andy.forward(100)
andy.backward(25)
andy.right(30)
andy.forward(25)
andy.backward(25)
andy.left(60)
andy.forward(25)
andy.hideturtle()










