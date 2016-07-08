# Author: Nicholas Davidson
# ID: 1000891865
# Section: 91876
# Date: 11/20/14
# Assignment: Week 6 Numbers


def main():  # main program
    useroption = 0
    while useroption != 2:
        print()
        print("!!Find the Averages Program!!")
        print("Please select...")
        print("   1. Execute the Program")
        print("   2. Exit")
        useroption = input("What would you like to do? ")
        if useroption == "1":
            usernumbers()
        elif useroption == "2":
            exit()
        print("Press ENTER to continue")






def  usernumbers():
    numlist = []

    while -9999 not in numlist:
        userinput = int((input("Enter any amount of numbers or -9999 to quit: ")

    numlist.append(userinput)
    numlist.remove(-9999)

    return numlist

def  allnumavg(numlist):
    sum = 0
    for n in numlist:
        sum += n
    return sum(numlist) / len(numlist)

def posnumavg(numlist):
    pos = []
    for i in numlist:
        if i > 0:
            pos.append(i)
    return sum(pos) / len(pos)

main()

