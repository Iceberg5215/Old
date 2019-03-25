import random


def email_check_client(email):
    operator = ["Arthur", "Jeb", "Bob", "Bill", "Valentina"]

    if email.count('@') != 1:
        return print(email, "is missing an @.")
    elif email[0] == '@':
        return False

    domain = email[email.find('@') + 1:]

    if 'pop.ac.uk' not in domain:
        return print(email, "is invalid at pop.ac.uk.")
    elif domain[0] == 'pop.ac.uk':
        return False

    print("Hello,", email.split('@')[0])
    print("My name is", random.choice(operator) + ", I will be assisting you today.")

    return True


def questions():
    dc_chance = random.randint(1, 101)
    responses = ["Maybe.", "Im pleased to hear that.", "I completely agree."]
    question = input("How can I help? ")

    while question != 'goodbye' and dc_chance > 15:
        if question.count('library'):
            print("Sorry, the library is closed today.")
            dc_chance = random.randint(1, 101)
            question = input("How can I help? ")
        elif question.count('wifi'):
            print("Wifi is excellent around campus.")
            dc_chance = random.randint(1, 101)
            question = input("How can I help? ")
        elif question.count('deadline'):
            print("Your deadline has been extended by two working days.")
            dc_chance = random.randint(1, 101)
            question = input("How can I help? ")
        else:
            print(random.choice(responses))
            dc_chance = random.randint(1, 101)
            question = input("How can I help? ")
    else:
        print("You have disconnected from PopChat.")
        print("Session End. Thank you for using PopChat.")


if __name__ == '__main__':
    print("Welcome to PopChat.")
    email_check_client(input("Please enter your email: "))
    questions()
