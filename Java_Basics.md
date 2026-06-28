# Java Notes

## Basics

- **main method** - entry point of the application
- **static method** - can be accessed without creating an instance of class
- **main(String[] args)** - args are command line arguments
- `/**/` - multi line comment

## Data Types

- **byte** - small integers `(-128 to 127)`
- **short** - 2 bytes
- **int** - 4 bytes
- **long** - 8 bytes
- **float** - 4 bytes, decimals (needs `f` suffix, e.g. `3.14f`)
- **double** - 8 bytes, decimals
- **char** - 2 bytes, single character e.g. `'A'`
- **boolean** - 1 bit, true or false

## Operators

- addition: `+`
- subtraction: `-`
- multiplication: `*`
- division: `/`
- modulo: `%`

### Unary Operators

- increment: `++`
- decrement: `--`
- logical not: `!`

### Relational Operators

- equal to: `==`
- not equal to: `!=`
- greater than/equal to: `>` / `>=`
- less than/equal to: `<` / `<=`

### Logical Operators

- logical AND: `&&`
- logical OR: `||`

### Assignment Operators

- `A(op=)B` : `A = A op B`

## Strings in Java

- These are objects and not primitive data types
- Immutable: modifying a string makes a new object

### Commands

```java
String s1 = "Hello";
char[] arr = {'W','o','r','l','d'};
String s2 = new String(arr); // char to string

// concatenation
s1 + " " + s2; // "Hello World"

// common methods
s1.charAt(idx);
s1.length();
s1.substring(start, length);
s1.equals(s2);
```

## Input and Output

```java
Scanner sc = new Scanner(System.in);
int age = sc.nextInt();
String name = sc.next();
sc.close();
```

## Type Casting

- **Implicit (Widening)** - happens by default by the compiler, e.g. int to double
- **Explicit (Narrowing)** - large type to small, e.g. double to int

```java
int a = 9;
double b = a; // implicit
int c = (int) 9.78; // explicit
```

## Constants

- Using `final` keyword to create never changing constants

```java
final float PI = 3.14f;
```

## Arrays

```java
int[] scores = {90, 80, 70};
int[][] matrix = {{1, 2}, {3, 4}};
```

## Conditional Statements

```java
if () {

} else if () {

} else {

}
```

## Switch

```java
int day = 2;
switch(day){
    case 1:
        //
        break; // required to stop executing further blocks once the case matches
    case 2:
        //
        break;
    default:
        // If no match, then it is executed
}
```

## Loops

```java
for(int i=0;i<n;i++){

} // for loop

for(int i:intArr){

} // for each loop

while(condition){

} // while loop

do {

} while (condition); // do while loop: runs at least once
```

## Exception Handling

- Using a try catch block to catch any errors so that the program doesn't crash.

```java
try{
    // main code to execute
} catch (Exception e) {
    // code when something went wrong
} finally {
    // code after try catch is over
}
```