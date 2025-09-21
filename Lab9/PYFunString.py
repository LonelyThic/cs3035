import math

#1
def findElement(inputString, index):
    return inputString[index]

#2
def concatStrings(str1, str2):
    return str1 + str2

#3
def sliceStrings(inputString):
    half_length = math.floor(len(inputString) / 2)
    return inputString[0:half_length]

#4
def findSubstring(mainString, subString):
    return subString in mainString

#Testing Code:
inputString1 = "This is a test string"
inputString2 = "...it tests your functions"
inputString3 = "functions"

print(findElement(inputString1, 0))
print(concatStrings(inputString1,inputString2))
print(sliceStrings(inputString1))
print(findSubstring(inputString2,inputString3))
print(findSubstring(inputString1,inputString3))
