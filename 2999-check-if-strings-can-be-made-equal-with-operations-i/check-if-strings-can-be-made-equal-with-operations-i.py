class Solution:
    def canBeEqual(self, s1: str, s2: str) -> bool:
        return sorted(s1[0::2]) == sorted(s2[0::2]) and \
               sorted(s1[1::2]) == sorted(s2[1::2])
        # s1_list = list(s1)
        # s2_list = list(s2)
 
        # if s1_list == s2_list:
        #     return True
    
        # if s1_list[0] != s2_list[0]:
        #     s1_list[0], s1_list[2] = s1_list[2], s1_list[0]
            
        # if s1_list[1] != s2_list[1]:
        #     s1_list[1], s1_list[3] = s1_list[3], s1_list[1]
            
        # return s1_list == list(s2)
