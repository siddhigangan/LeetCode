class Solution:
    def sumAndMultiply(self, n: int) -> int:
        sums = 0
        s = ""
        
        for char in str(n):
            i = int(char)
            
            if i != 0:
                sums += i
                s += str(i)
        
        # Guard clause: if s is empty (e.g., n was 0), return 0
        if not s:
            return 0
            
        return int(s) * sums
