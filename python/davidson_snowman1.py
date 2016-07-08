#------------------------
# Author: Nicholas Davidson
# ID: 1000891865
# Section: 91876
# Date: 10/18/2014
# Assignment: Week 2 Snowman
# -----------------------

# Calling Turtle Module/Setup
#The snowman should be on a blue background, and should be drawn filled with white.
#The outline of the snowman should be in black.
#The snowman’s body should be made of 3 filled circles.
#The outline of each circle should be 3 pixels wide.
#The bottom circle should have a radius of 100 pixels.
#The middle circle should have a radius of 70 pixels.
#The top circle should have a radius of 40 pixels.
#Each circle should be centered above the one below it (except the bottom circle, which can be located anywhere).
#There should be no gap between the circles.
#Give the snowman a mouth, eyes, and a nose (a hat is optional).
#Make sure to include two stick-arms and at least two fingers on each hand.

import turtle
wn = turtle.Screen()
wn.bgcolor("dark blue")

andy = turtle.Turtle()
andy.speed(0)

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
andy.forward(25)    # ok, so I used the Pythagorean theorem and the algebra isn't working
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
andy.right(45)
andy.forward(100)
andy.backward(25)
andy.left(30)
andy.forward(25)
andy.backward(25)
andy.right(60)
andy.forward(25)
andy.hideturtle()










