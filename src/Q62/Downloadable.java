package Q62;

interface Downloadable {
    public void download();
}

interface Readable extends Downloadable {       // line n1
    public void readBook();
}

abstract class Book implements Readable {       // line n2
    public void readBook() {
        System.out.println("Read Book");
    }
}

/*
class Ebook extends Book {                       // line n3
    public void readBook() {
        System.out.println("Read E-Book");
    }
}
*/

/*And given the code fragment:

Book book1 = neew Ebook();
book1.readBook();

What is the result?
A. Compilation fails at line n2.
B. Read Book
C. Read E-Book
D. Compilation fails at line n1.
E. Compilation fails at line n3.
Answer: E
* */

