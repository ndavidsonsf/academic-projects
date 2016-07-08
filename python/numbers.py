# Author: Nicholas Davidson
# ID: 1000891865
# Section: 91876
# Date: 11/20/14
# Assignment: Week 6 - Lists, Dictionaries, Averages


def  main():  # main program
    user = 0
    while user != 2:  # while loop for iteration
        print()
        print("Computing Averages")
        print("Please select:")
        print("   1. Execute Program")
        print("   2. Exit")
        user = input("What would you like to do? ")
        if user == "1":
            usernumbers()
        elif user == "2":
            exit()
        input("Press ENTER to continue")


def usernumbers():  # collect user numbers
    numlist = []
    while -9999 not in numlist:  # looks for -9999 to end loop
        user_input = int(input("Enter a number (-9999 to end): "))
        if user_input == -9999:  # ends user input
            break
        else:
            numlist.append(user_input)  # adds user numbers to numlist
    print()
    # OUTPUTS
    print("The numbers you entered are: ")
    print(numlist)
    print()
    print("The dictionary with the averages is: ")
    print(avgdictionary(numlist))
    print()


def allnumavg(numlist):  # function to calculate average of all numbers
    x = 0
    for n in numlist:
        x += n
    return sum(numlist) / len(numlist)


def posnumavg(numlist):  # function to calculate average of positive numbers
    pos = []  # creates empty list for positive numbers
    for i in numlist:
        if i > 0:
            pos.append(i)  # adds positive numbers to list
    return sum(pos) / len(pos)  # calculates average


def nonposavg(numlist):  # function to calculate average of non positive numbers
    nonpos = []  # creates empty list for non positive numbers
    for k in numlist:
        if k <= 0:
            nonpos.append(k)  # adds non positive numbers to list
    return sum(nonpos) / len(nonpos)  # calculates average


def avgdictionary(numlist):  # function to call dictionary
    return {
        "Average Positive:": posnumavg(numlist),
        "Average NonPositive:": nonposavg(numlist),
        "Average All Numbers:": allnumavg(numlist)
    }

main()