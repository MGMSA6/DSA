# Node class
class Node:

    # Function to initialise the node object
    def __init__(self, data):
        self.data = data  # Assign data
        self.next = None  # Initialize next as null


# Linked List class contains a Node object
class Linkedlist:
    count = 0

    def __init__(self):
        self.head = None

    # This function prints contents of linked list
    # starting from head
    def printList(self):
        temp = self.head

        while temp:
            print("Node(data: " + str(temp.data) + ", next: " + str(temp.next) + ")")
            temp = temp.next

    def insert(self, data):
        # Create new Node
        newNode = Node(data)

        if self.head is None:
            self.head = newNode
        else:
            temp = self.head

            while temp.next is not None:
                temp = temp.next

            temp.next = newNode

    def insertAt(self, data, position):

        # Create new Node
        newNode = Node(data)

        if position == 0 or position > self.count:
            print("Invalid position")
        elif position == 1:
            newNode.next = self.head
            self.head = newNode
        else:

            temp = self.head
            i = 1

            while i < (position - 1):
                temp = temp.next
                i += 1

            newNode.next = temp.next
            temp.next = newNode

    def delete(self):

        temp = self.head
        i = 0

        while i < (self.count - 1):
            temp = temp.next
            i += 1

        temp.next = None

    def deleteAt(self, position):

        temp = self.head

        if position == 0 or position > self.count:
            print("Invalid Position")
        elif position == 1:
            self.head = temp.next
            temp.next = None
        else:
            i = 1

            while i < (position - 1):
                temp = temp.next
                i += 1

            temp1 = temp.next
            temp.next = temp1.next
            temp1.next = None

    def getLength(self):

        temp = list.head

        while temp is not None:
            temp = temp.next
            self.count += 1

    def reverseList(self):

        previousNode = None
        currentNode = self.head
        nextNode = self.head

        while nextNode is not None:
            nextNode = nextNode.next
            currentNode.next = previousNode
            previousNode = currentNode
            currentNode = nextNode

        self.head = previousNode


# Code execution starts here
if __name__ == '__main__':
    # Start with the empty list
    list = Linkedlist()

    print("Inserting elements")

    list.insert(1)
    list.insert(2)
    list.insert(3)
    list.insert(4)
    list.insert(5)

    list.printList()

    list.getLength()

    print("Inserting elements by position")

    list.insertAt(100, 1)

    list.printList()

    print("Delete last element")

    list.delete()

    list.printList()

    print("Delete by position")

    list.deleteAt(3)

    list.printList()

    print("Reverse Linked list")

    list.reverseList()

    list.printList()
