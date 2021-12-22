Description

Improve your search engine to support complex queries containing a sequence of words and a strategy that determines how to match data.

Take, for example, these six sample lines:

Dwight Joseph djo@gmail.com         
Rene Webb webb@gmail.com    
Katie Jacobs    
Erick Harrington harrington@gmail.com   
Myrtle Medina   
Erick Burgess

Let's consider the searching strategies: ALL, ANY and NONE.

If the strategy is ALL, the program should print lines containing all the words from the query.

If the strategy is ANY, the program should print the lines containing at least one word from the query.

If the strategy is NONE, the program should print lines that do not contain words from the query at all.

All listed operations are implemented in the inverted index. The results should not contain duplicates.
Note, do not forget to use methods to decompose your program.

Example   
The lines that start with > represent the user input. Note that these symbols are not part of the input.

=== Menu ===
1. Find a person
2. Print all persons
0. Exit
> 1

Select a matching strategy: ALL, ANY, NONE
> ANY

Enter a name or email to search all matching people.
> Katie Erick QQQ

3 persons found:
Katie Jacobs
Erick Harrington harrington@gmail.com
Erick Burgess
