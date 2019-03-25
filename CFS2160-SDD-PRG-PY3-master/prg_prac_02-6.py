# Question 6 #

number_of_pupils = 16
number_of_sweets = 47

givenSweets = number_of_sweets // number_of_pupils
print("Each student will get", str(givenSweets), "sweets each.")

leftOSweets = number_of_sweets - (number_of_pupils * givenSweets)
print("There are", str(leftOSweets), "sweets left over.")
