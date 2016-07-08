# Author: Nicholas Davidson
# ID: 1000891865
# Section: 91876
# Date: 11/12/14
# Assignment: Encryption

def main():  # main code for program
    useroption = 0
    while useroption != 3:  # using a while loop for iteration
        print()
        print("Encoder/Decoder Program")
        print("Please select:")
        print("  1. Encode")
        print("  2. Decode")
        print("  3. Exit")
        useroption = input("What would you like to do? ")
        if useroption == "1":
            encode()
        elif useroption == "2":
            decode()
        elif useroption == "3":
            exit()
        input("Press Enter to continue. ")



def encode():  # encoding function
    message = input("What would you like to encode? ")
    key = input("What key would you like to use to encode? (Enter a value between 1 and 100) ")
    key = int(key)
    for character in message:
        orginalchar = ord(character)
        if orginalchar + key > 126:  # equations for encoding characters
            encryptedchar = ((orginalchar + key) - 127) + 32
        else:
            encryptedchar = orginalchar + key
        print(chr(encryptedchar), end="")  # prints encoded message
    print()


def decode():  # decoding function
    message = input("What would you like to decode? ")
    for x in range(100):
        outputline = ""
        key = x + 1  # changing the value of key
        for character in message:  # equations for decoding characters
            encryptedchar = ord(character)
            if encryptedchar - key < 32:
                decryptedchar = ((encryptedchar - key) + 127) - 32
            else:
                decryptedchar = (encryptedchar - key)
            outputline += chr(decryptedchar)
        print("Key " + str(key) + ": " + outputline)  # prints results for each key
    print()

main()


