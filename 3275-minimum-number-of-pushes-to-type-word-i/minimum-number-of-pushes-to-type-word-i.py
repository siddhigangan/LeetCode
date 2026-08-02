class Solution:
    def minimumPushes(self, word: str) -> int:
        unique = len(set(word))
        total = 0
        i = 1
        
        while unique > 0:
            if unique >= 8:
                total += 8 * i
            else:
                total += unique * i
            unique -= 8
            i += 1
            
        return total
