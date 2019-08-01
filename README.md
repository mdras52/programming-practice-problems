## List of Questions
### Java Problems
This is my work and not guaranteed to be the best answer in all cases

1. #### PE1 Create a simple regular expression engine that can do the following:
	* Take any String input and String toMatchExp and return whether the input matches toMatchExp
	* Handle a '?' character operator in the toMatchExp that allows any character in place of the '?' character, 1 to 1
		- With the toMatchExp of 'He??o' and the input of 'Hello' and 'Hedxo' the result should be true but 'Helllo' would be false
	* Handle a '*' character operator in the toMatchExp that allows any character in place of the '*' character zero or more times
		- With the toMatchExp of 'He*o' and the input of 'Hello' and 'Herro' and 'Helllllllllo' and 'Helo' the result would be true,
		- 'He***o', 'Helllo' & 'Hellllllllo' & 'Herrrrrlppppppo' -> true, 'Hello' -> true, 'Heo' -> true, 'Helmnpo' -> false
		- Consider this case: '*' as well
	* You cannot use any Regular Expression or Matching libraries, the core algorithm must be written from ground up

2. #### PE2 This problem will test your knowledge on "if-else" statements.
	* Given an integer NN as input, check the following:
		- If N is odd, print "Weird".
		- If N is even and, in between the range of 2 and 5(inclusive), print "Not Weird".
		- If N is even and, in between the range of 6 and 20(inclusive), print "Weird".
		- If N is even and N>20N>20, print "Not Weird".
	* Constraints
		1≤N≤100
	* The output should not contain the quotes.

3. #### PE3 Determine if an int is even or odd without using the '%' or '/' operators
	* Write a method that takes an integer as an input and returns whether the integer is an even or an odd; two methods with boolean returns are acceptable
	 e.g.: isEven(int input) and isOdd(int input)

4. #### PE4 Find the nth to last element of LinkedList
    * Given a LinkedList with elements via the head reference and an index n, return the nth to last elements for the List

5. #### PE5 Merge two sorted Lists
    * Given two sorted Lists, merge them into 1 sorted List
    
6. #### PE6 Determine if two words are anagrams
    * Given two strings as input, return true if the left string (word) is an anagram of the right string (word)
    
    
    
    
## Java Study Points
1. ### Collections
    * [LinkedList](https://docs.oracle.com/javase/8/docs/api/java/util/LinkedList.html)
        * Use if pushing, or deleting from interior (constant time) frequently (if you already have node in hand)
        * linear time positional access
        * Implements List, allows null, double linked so index usage will use Head or Tail, which ever is closer
        * **Not Synchronized**, wrap with [Collections.synchronizedList()](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#synchronizedList-java.util.List-) if needed
        * Iterator throws ConcurrentModificationException if modified during use by any other than iterator add, remove methods
        * Constant factor is worse in LinkedList compared to ArrayList
        * Is also a Queue
    * [ArrayList](https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html)
        * Constant time positional access, no Node overhead, and can use System.arrayCopy()
        * Linear time pushing and interior deleting
        * Vector without synchronization overhead
        * Usually the faster alternative
    * List view of Array
        * Use if you need a fixed size List, it is faster than general purpose ArrayList
    * nCopies and singlton/List/Map
        * Collections convenience methods to get immutable instances of a Map, List, Set
        * Use to construct initial mutable lists from immutable nCopies (null for example)
    * Collections.sort : O(N*log(N))
        * Java 6 uses a modified version of mergesort
        * Java 7 uses TimSort with best case near O(N)
        * List is dumped to an array, removing the worst case n^2 log(n) performance from LinkedList in place sorting
    * Collections.shuffle
    * Deep copying should always be considered when copying/transfering/wrapping collection objects, an efficient way to do this is to serialize/deserialize