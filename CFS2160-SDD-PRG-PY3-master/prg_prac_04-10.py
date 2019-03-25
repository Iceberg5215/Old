# Question 10 #

items = 5  # Optional input method: int(input("How many items are there? ")) #

priceList = []
for prices in range(items):
    prices = int((input("What is the price of the item? "))[:-1])
    priceList.append(prices)

print("The total price is", str(sum(priceList)))

print("The average price is", str(sum(priceList) / items))

print("The highest price is", str(max(priceList)))

print("The lowest price is", str(min(priceList)))
