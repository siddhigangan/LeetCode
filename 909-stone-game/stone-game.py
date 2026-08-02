class Solution:
    def stoneGame(self, piles: List[int]) -> bool:
        return True
        # alex = 0
        # lee = 0

        # front = 0
        # back = len(piles) - 1
        # turn = 0

        # while front <= back:
        #     if piles[front] >= piles[back]:
        #         stones = piles[front]
        #         front += 1
        #     else:
        #         stones = piles[back]
        #         back -= 1

        #     if turn % 2 == 0:
        #         alex += stones
        #     else:
        #         lee += stones

        #     turn += 1

        # return alex > lee