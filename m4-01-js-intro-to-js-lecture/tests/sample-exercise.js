/*
* Given 2 strings, return their concatenation, except omit
* the first char of each. The strings will be at least length 1.
*   nonStart("Hello", "There") -> "ellohere"
*/
function nonStart(first, second) {

    return first.substring(1) + second.substring(1);

}
