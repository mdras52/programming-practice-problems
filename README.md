## List of Questions
### Java Basic Problems

Giving credit for inspirations and problems from this great book: [Cracking the Coding Interview](http://www.crackingthecodinginterview.com/)
and this awesome site: [Interview Cake](https://www.interviewcake.com)

1. #### PE1 Create a simple regular expression engine that can do the following:
	* Take any String input and String toMatchExp and return whether the input matches toMatchExp
	* Handle a '?' character operator in the toMatchExp that allows any character in place of the '?' character, 1 to 1
		* So with the toMatchExp of 'He??o' and the input of 'Hello' and 'Hedxo' the result should be true but 'Helllo' would be false
	* Handle a '*' character operator in the toMatchExp that allows any character in place of the '*' character zero or more times
		* So with the toMatchExp of 'He*o' and the input of 'Hello' and 'Herro' and 'Helllllllllo' and 'Helo' the result would be true,
		* 'He***o', 'Helllo' & 'Hellllllllo' & 'Herrrrrlppppppo' -> true, 'Hello' -> true, 'Heo' -> true, 'Helmnpo' -> false
		* Consider this case: '*' as well
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

### [Interview Cake](https://www.interviewcake.com) problems