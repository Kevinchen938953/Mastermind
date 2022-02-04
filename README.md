# Mastermind


Reflection: During the beginning of the process, I was playing around with the concept of nested Array Lists and was reading cs awesome. Once I understood the concpet better,
I tested nested 2D arrays and successfully printed one with different chars. However, I then came to a road block and could not figure out how to advance my game further.
Thus, I decided to begin writing code for my game with two arrays: one for answers and one for user inputs. I think my biggest breakthrough was getting through the logistics of comparing the answer and userinput arrays. I got my code to check overlaps for the computer and determine if the user inputs array contained, did not contain, or had a value in the right position as compared to the answer array. My biggest low is that I never really quite understood the concept of array Lists. I could not find a way to properly integrate array lists into my game without running into syntax errors. I also assigned integers rather than chars to colors, so the user cannot explicitely input a char.
After this experience, I still have a lot of errors to fix. I need to check user input overlaps, format my outputs into a board-like style, and allow users to input color names. 















From Wikipedia: Mastermind or Master Mind is a code-breaking game for two players. The modern game with pegs was invented in 1970 by Mordecai Meirowitz, an Israeli postmaster and telecommunications expert.[1][2] It resembles an earlier pencil and paper game called Bulls and Cows that may date back a century or more.

# Red, Yellow, Orange, Green, Blue, Purple, White
# Scoring Black, White

Mastermind.  (Main.java class if using Repl.it but ok)
*Make a game class
**gives rules at beginning (could be a method call printRules() )
**Scanner class - input user prompts, etc
***would make calls to methods to guess position
***return for this? int[#cPcL][#cPwL]
**Instructions - capture instructions (for text file and UI)\
**?PvP = play1 choses secret code (swap places at keyboard)
***play2 - takes turn guessing
**?PvC	= play1 - computer randomizes colors and location of pins				
***play2 - takes turn guessing
		
*Make a board Class
**Pins - Encoding colors - do we use ints or chars?
**[R, G, Y, O]   [R, B, Y, G]  [2][1]
**[R, G, Y, O]   [R, O, Y, G]  [2][2]   
**int - translate btwn colors
**chars - individual letter

|  | PROS| CONS |
|Ints|-simple to code | -translate back and forth |
|   |		     |-might be confusing to player|
|chars| -less confusion for player | -a bit more code to learn |	 

*Arrays - 1-2D array for player guesses
	**1-1D array for the secret code
