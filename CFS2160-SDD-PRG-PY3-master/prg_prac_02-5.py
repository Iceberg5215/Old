# Question 5 #

totalSweets = 35
totalStudents = 15

givenSweets = totalSweets // totalStudents
print("Each student will get", str(givenSweets), "sweets each.")

leftOSweets = totalSweets - (totalStudents * givenSweets)
print("There are", str(leftOSweets), "sweets left over.")
