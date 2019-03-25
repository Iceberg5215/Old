# Question 5 #
points = 0
wins = 0
draws = 0
losses = 0
team = str(input('Enter the Team Name: '))

goalsInLst = []
goalsAgainstLst = []
for i in range(5):
    goalsIn = int(input('Goals Scored in Match #' + str(i) + ': '))
    goalsAgainst = int(input('Goals Against in Match #' + str(i) + ': '))
    goalsInLst.append(goalsIn)
    goalsAgainstLst.append(goalsAgainst)
    if goalsIn > goalsAgainst:
        wins += 1
        points += 3
    if goalsIn == goalsAgainst:
        draws += 1
        points += 1
    if goalsIn < goalsAgainst:
        losses += 1

print(team)
print('Wins: ', wins)
print('Draws: ', draws)
print('Losses: ', losses)
print('Points: ', points)

