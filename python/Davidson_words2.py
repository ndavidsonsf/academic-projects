# Author: Nicholas Davidson
# ID: 1000891865
# Section: 91876
# Date: 11/20/14
# Assignment: Week 6 Words


def main():
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

def find_longest_word():
    words=[]
    print()
    x = input("Please entert a sentence. ")
    for word in x.split():
        words.append(word)
    w = max(x.split(), key=len)

    print()
    print("The words you entered are: ")
    print(words)
    print()
    print("The longest word you entered is: ")
    print(w)
    print()

main()