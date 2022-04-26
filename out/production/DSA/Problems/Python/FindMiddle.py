from DataStructures.LinkedList.Python.LinkedList import *

list = Linkedlist()


class FindMiddle:

    def __init__(self):
        list.insert(1)
        list.insert(2)
        list.insert(3)
        list.insert(4)
        list.insert(5)

    def findMiddleElement(self):
        list.getLength()
        pos = list.count

        print(pos)


obj = FindMiddle()

obj.findMiddleElement()

temp = list.head

while temp is not None:
    print(temp)
    temp = temp.next
