#------------------------
# Author: Nicholas Davidson
# ID: 1000891865
# Section: 91876
# Date: 11/11/2014
# Assignment: Week 3 Guessing Game
# -----------------------

import random

numAttempts = 0

name = input("Hello! What is your name?\n")

number = random.randint(1,20) #importing random function

print (name, "I am thinking of a number.  It is between 1 and 20.")

while numAttempts < 3:

    guess = int(input("Please, take a guess: "))

    numAttempts = numAttempts + 1 # accumulator pattern

    if guess < number:
        print("Your guess is too low.")

    if guess > number:
        print("Your guess is too high.")

    if guess == number:
        break
        

if guess == number:
        print("Good job,", name,"! Your guess is correct and you guessed it in,", numAttempts,"tries !")
else:
        print("You're three guesses are over. The number I was thinking of was,", number,".")
