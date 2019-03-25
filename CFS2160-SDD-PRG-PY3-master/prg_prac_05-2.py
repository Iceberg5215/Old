# Question 2 #

totalStudents = int(input("How many students are there? "))
labComputers = int(input("How many computers are there in the lab? "))


if totalStudents <= 0 and labComputers <= 0:
    print("Sorry, the number you entered is invalid. Please enter a number that is above 0.")
else:
    if totalStudents > labComputers:
        moreLabs = totalStudents / labComputers
        print("You will need", int(moreLabs.__round__()), "labs.")
    else:
        if totalStudents < labComputers:
            print("You will only need 1 lab.")
