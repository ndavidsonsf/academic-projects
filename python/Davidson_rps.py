#------------------------
# Author: Nicholas Davidson
# ID: 1000891865
# Section: 91876
# Date: 11/11/2014
# Assignment: Week 3 Rock, Paper, Scissors Game
# -----------------------


def game(): #main function of the game
    print ("Let's play Rock, Paper, Scissors!")
    user1 = user1guess()
    user2 = user2guess()
    results( user1, user2)

def user1guess(guess1): # function for player 1
    name1 = input("What is Player 1's name?")
    guess1 = input("Hello,", name1,"Please enter (R)ock, (P)aper, or (S)cissors.")).lower()
    if validguess1(guess1):
        if guess1 == "r":
            user1 = 1
        elif guess1 == "p":
            user1 = 2
        elif guess1 == "s":
            user1 = 3
        return user1
    else:
        print("What?!  That is not a vailid response.")
        user1guess()


def user2guess(guess2): # fuctions for player 2
    name2 = input("What is Player 2's name?")
    guess2 = input(("Hello,", name2,"Please enter (R)ock, (P)aper, or (S)cissors.")).lower()
    if validguess2(guess2):
        if guess2 == "r":
            user2 = 1
        elif guess2 == "s":
            user2 = 3
        print("What?!  That is not a vailid response.")
        user2guess()
    
def vaildguess1(guess1): # fuction to determin whether user input is valid
    if guess1 == "r" or "p" or "s":
        status = True
    else:
        status = False
    return status

def vaildguess2(guess2): # fuction to determin whether user input is valid
    if guess2 == "r" or "p" or "s":
        status = True
    else:
        status = False
    return status

def results(user1, user2):
    diff = user2 - user1
    if diff == 0:
        print("That's a DRAW!")
    elif diff % 3 == 1:
        print("Congratulations,", name2,"you've won!")
    elif diff % 3 == 2:
        print("Congratulations,", name1,"you've won!")

game()

        

