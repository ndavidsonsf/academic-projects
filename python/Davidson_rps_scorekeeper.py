# Author: Nicholas Davidson
# ID: 1000891865
# Section: 91876
# Date: 11/11/14
# Assignment: Rock Paper Scissors Game


#multi-round game
def multiround():
    user1wins = 0
    user2wins = 0
    for i in range(3):
        print("Round "+ str(i+1))
        gameresults = game()
        if gameresults == 1:
            user1wins += 1
        elif gameresults == 2:
            user2wins += 1
    print()
    print()
    print("Player 1 score,", user1wins)
    print("Player 2 score,", user2wins)


        # main
def game():
    print("Let's play Rock Paper Scissors!")
    user1 = user1guess(1)
    user2 = user1guess(2)
    return results(user1, user2)

# function for player 1
def user1guess(player):
    guess = input("Hello, Player " + str(player) + ", Please enter (R)ock, (P)aper, (S)cissors.").lower()
    if validguess(guess):
        if guess == "r":
            num = 1
            return num
        elif guess == "p":
            num = 2
            return num
        elif guess == "s":
            num = 3
            return num
    else:
        print("What?! That is not a valid response.")
        return user1guess(player)

# function for determining a valid input
def validguess(guess):
    if guess == "r" or guess == "p" or guess == "s":
        guess = True
    else:
        guess = False
    return guess

# for determining results
def results(user1, user2):
    diff = user2 - user1
    if diff == 0:
        print("That's a tie!")
        return 0
    elif diff % 3 == 1:
        print("Congratulations, Player 2, you have won!")
        return 2
    elif diff % 3 == 2:
        print("Congratulations, Player 1, you have won!")
        return 1

multiround()