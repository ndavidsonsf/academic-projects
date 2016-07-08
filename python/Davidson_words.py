# Author: Nicholas Davidson
# ID: 1000891865
# Section: 91876
# Date: 11/20/14
# Assignment: Week 6 Words


def main():  # main program / user interface
    useroption = 0
    while useroption != 2:
        print()
        print("Determine the longest word")
        print("Please select...")
        print("     1. Enter a sentence")
        print("     2. Exit")
        print()
        useroption = input("What would you like to do? ")
        if useroption == "1":
            find_longest_word()
        elif useroption == "2":
            exit()
        input("Press ENTER to continue")

def find_longest_word():  # defines the function
    words=[]
    print()
    x = input("Please enter a sentence: ")  # asks user for input
    for word in x.split():  # takes the inputs and splits at blank spaces
        words.append(word)  # adds the split words to the list
    w = max(x.split(), key=len)  # defines the variable w using the max built in with the key and the legnth

    print()  # OUTPUTS
    print("The words you entered are: ")
    print(words)
    print()
    print("The longest word you entered is: ")
    print(w)
    print()

main()