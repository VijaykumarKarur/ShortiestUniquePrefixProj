<h5>Shortest Unique Prefix</h5>
<hr/>

<b>Problem Description</b>


Given a list of N words. Find shortest unique prefix to represent each word in the list.

NOTE: Assume that no word is prefix of another. In other words, the representation is always possible


______________________________________________________________
<b>Problem Constraints</b>

1 <= Sum of length of all words <= 106


_______________________________________________________________
<b>Input Format</b>

First and only argument is a string array of size N.

_______________________________________________________________

<b>Output Format</b>

Return a string array B where B[i] denotes the shortest unique prefix to represent the ith word.


_______________________________________________________________
<b>Example Input</b>

Input 1:

A = ["zebra", "dog", "duck", "dove"]
Input 2:

A = ["apple", "ball", "cat"]

________________________________________________________________
<b>Example Output</b>

Output 1:

["z", "dog", "du", "dov"]
Output 2:

["a", "b", "c"]

________________________________________________________________
<b>Example Explanation</b>

Explanation 1:

Shortest unique prefix of each word is:
For word "zebra", we can only use "z" as "z" is not any prefix of any other word given.
For word "dog", we have to use "dog" as "d" and "do" are prefixes of "dov".
For word "du", we have to use "du" as "d" is prefix of "dov" and "dog".
For word "dov", we have to use "dov" as "d" and do" are prefixes of "dog".

Explanation 2:

"a", "b" and c" are not prefixes of any other word. So, we can use of first letter of each to represent.