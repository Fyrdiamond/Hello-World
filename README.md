# Hello World
A hello world program written in Whitespace, hidden in a Java file that adds 2 numbers

# Breakdown
Removing the non whitespace characters, we get the following:
- [Space][Space]
  -   The first space indicates a stack operation
  -   The next space indicates a push operation of an integer
- [Space][Tab][Space][Space][Tab][Space][Space][Space][LF]
  -   This is the integer being pushed from the last operation
  -   The starting space means it's positive
  -   Tabs are treated as 1, spaces as 0
  -   The lf ends the parameter
  -   The value is +1001000 (+72)
- [Tab][LF][Space][Space]
  -   The tab; lf combination indicates an I/O operation
  -   The following 2 spaces indicate a char output from the top of the stack
- [Space][Space]
  -   Same as the first, Stack : push int
- [Space][Tab][Tab][Space][Space][Tab][Space][Tab][LF]
  -   +1100101 (+101)
- [Tab][LF][Space][Space]
  -   Same as the third, I/O : output char
- [Space][Space]
  -   Stack : push int
- [Space][Tab][Tab][Space][Tab][Tab][Space][Space][LF]
  -   +1101100 (+108)
- [Tab][LF][Space][Space]
  -   I/O : output char
- [Space][Space]
  -   Stack : push int
- [Space][Tab][Tab][Space][Tab][Tab][Space][Space][LF]
  -   +1101100 (+108)
- [Tab][LF][Space][Space]
  -   I/O : output char

The next 24 lines follow the same pattern

- [Space][Space]
- [Space][Tab][Tab][Space][Tab][Tab][Tab][Tab][LF]
- [Tab][LF][Space][Space]
- [Space][Space]
- [Space][Tab][Space][Tab][Tab][Space][Space][LF]
- [Tab][LF][Space][Space]
- [Space][Space]
- [Space][Tab][Space][Space][Space][Space][Space][LF]
- [Tab][LF][Space][Space]
- [Space][Space]
- [Space][Tab][Tab][Tab][Space][Tab][Tab][Tab][LF]
- [Tab][LF][Space][Space]
- [Space][Space]
- [Space][Tab][Tab][Space][Tab][Tab][Tab][Tab][LF]
- [Tab][LF][Space][Space]
- [Space][Space]
- [Space][Tab][Tab][Tab][Space][Space][Tab][Space][LF]
- [Tab][LF][Space][Space]
- [Space][Space]
- [Space][Tab][Tab][Space][Tab][Tab][Space][Space][LF]
- [Tab][LF][Space][Space]
- [Space][Space]
- [Space][Tab][Tab][Space][Space][Tab][Space][Space][LF]
- [Tab][LF][Space][Space]

And the final line ends the program

- [LF][LF][LF]
  -   First lf: flow control
  -   Second and third lf: end the program
