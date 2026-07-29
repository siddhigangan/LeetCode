from collections import Counter

class Solution:
    def smallestPalindrome(self, s: str) -> str:
        # 1. Count and sort characters automatically
        counts = Counter(sorted(s))
        
        left = ""
        middle = ""
        
        # 2. Distribute characters
        for char, count in counts.items():
            # If the count is odd, save one for the exact middle
            if count % 2 != 0 and middle == "":
                middle = char
            
            # Put half of the characters on the left side
            left += char * (count // 2)
            
        # 3. Mirror the left side to get the right side
        return left + middle + left[::-1]
