##Joseph Lombardi
###COMP 271
###Lab 5
####Due 07/05/2018
##hello


###Questions

#####Why does LinkedStack not require an explicit constructor?

   In our case we didn't have to create any constructors for our LinkedStack class because we do not need to pass any arguments when we instantiate a new LinkedStack object.  The compiler automatically provides a no-argument, default constructor for any class without constructors.  Also our LinkedStack class does not have any explicit super class  besides Object so this is another reason why we don't have to worry about creating any required constructors.

#####What is the time and (extra) space complexity of each of the LinkedStack methods, as well as ReverseLines.main?
   push() - has a time complexity of O(1).  It is constant because it's always changing the pointers for the top of the stack.  We only push on "top" of a stack.

   pop() - also has a time complexity of O(1).  This doesn't require iterating.  We also always pop at the "top" of a stack.  In our case the extra space capacity of pop is just a String which is the string we have to return when calling pop.

   peek() - also has a time complexity of O(1).  We are always checking if the "top" of the stack is null and if not then return the value at the top.  This also doesn't require iterating.

   isEmpty() - Our version of isEmpty() also has a time complexity of O(1).  This function doesn't require any iterating.  We are just checking if the "top" our of stack is null or not and just returning true or false.

   asList() - this function has to iterate through our stack and add each string to the ArrayList so this function has a time complexity of O(n).  This function has to allocate space for a new Node every time it is called and its extra space is also determined by the size of the stack as ArrayLists can double in size as they need to.



#####How else (not using Node) could we have implemented LinkedStack in such a way that it is still based on a linked list but the asList method uses constant time and space?

   We could have created a LinkedList instead of an ArrayList.  


#####Is it better for push and pop to return the item or the stack itself? Briefly discuss the pros and cons of each design.

   Just returning the item allows us to create a push and pop method without passing the functions an argument.  I guess the benefit of returning the stack would depend on if we are printing it or what we are doing with the data.
