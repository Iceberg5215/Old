# Question 10 #
studentName = input("What is your name? ")
studentID = input("What is your ID? ")
userPass = input("Enter your desired password: ")
badPass = [studentName.lower(), studentName.upper(), studentID.lower(), studentID.upper(),
           'huddersfield', 'justinbieber', 'cheese', 'canalside']

if len(userPass) < 6:
    print("Bad Password. It must be more than 6 characters.")
    exit()
elif len(userPass) > 12:
        print("Bad Password. It must be less than 12 characters.")
        exit()

if userPass in badPass:
    print("Bad Password. It must not contain your name, ID, 'huddersfield', 'justinbieber', 'cheese', 'canalside'.")
    exit()

userPassConfirm = input("Enter your password again: ")
if userPassConfirm == userPass:
    print("Your password has been changed.")
else:
    print("Passwords don't match. Please try again.")
