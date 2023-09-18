#Python 3

class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        words=s.split() #splits string by spaces

        if(len(words)==0):
           return 0
           #no words found

        return len(words[-1]) #returns length of last word
