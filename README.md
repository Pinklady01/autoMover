# RPN Kata
> [Wikipedia](https://en.wikipedia.org/wiki/Reverse_Polish_notation) 🤔

## First iteration: +
* `1` = `1`
* `1 2 +` = `3`
* `1 2 + 3 +` = `6`
* `1 2 3 + +` = `6`
* `1 2 3 + + 4 5 + + 6 +` = `21`
* `1.5 2 +` = `3.5`
* `-1 2 +` = `1`

## Second iteration: -, *, /
* `1 2 -` = `-1`
* `3 1 -` = `2`
* `2 3 *` = `6`
* `3 2 /` = `1.5`
* `1 2 3 + / 4 5 - + 6 *` = `-4.8`

## Third iteration: Custom operations
> Refactoring phase
* You should be able to add custom operations to your calculator **without modifying nor adding** any code to your 
`core` module.

## Fourth iteration: SQRT, MIN, MAX, AVG
* `9 SQRT` = `3`
* `3 9 SQRT *` = `9`
* `5 3 7 MIN` = `3`
* `5 3 7 9 MIN 2 +` = `5`
* `5 7 MAX` = `7`
* `5 3 7 1 2 MAX 2 +` = `9`
* `5 3 7 AVG` = `5`
* `5 3 7 AVG 2 +` = `7`

## Fifth iteration: Custom notations
> Refactoring phase
* Your calculator should be able to parse custom notations **without modifying nor adding** any code to your `core` 
module. 
* For example, you could try to implement the [infix notation](https://en.wikipedia.org/wiki/Infix_notation).