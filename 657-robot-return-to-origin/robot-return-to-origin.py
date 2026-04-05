class Solution:
    def judgeCircle(self, moves: str) -> bool:
        counter = 0
        counter1 = 0
        for i in moves:
            if(i=='U'):
                counter += 1
            elif(i =='R'):
                counter1 += 1
            elif(i=='D'):
                counter-=1
            else:
                counter1-=1
        return counter == 0  and counter1 == 0
