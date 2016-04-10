# List of Questions

1. PE1
	Create a simple regular expression engine that can do the following:
	* Take any String input and String toMatchExp and return whether the input matches toMatchExp
	* Handle a '?' character operator in the toMatchExp that allows any character in place of the '?' character, 1 to 1
		* So with the toMatchExp of 'He??o' and the input of 'Hello' and 'Hedxo' the result should be true but 'Helllo' would be false
	* Handle a '*' character operator in the toMatchExp that allows any character in place of the '*' character, but with a 1 to many
		* So with the toMatchExp of 'He*o' and the input of 'Hello' and 'Herro' and 'Helllllllllo' and 'Helo' the result would be true,
		but the result to 'Hellrro' would be false
		* 'He***o', 'Helllo' & 'Hellllllllo' & 'Herrrrrlppppppo' -> true, 'Hello' -> false
		* Consider this case: '*' as well
