package Lesson8;

import java.util.Objects;

public class Task5 {
    public static void main(String[] args) {
        Books libraryBooks[] = {new Books("Война и Мир", "Л. Толстой", "1999"),
                new Books("Отцы и Дети", "И. Тургенев", "2010"),
                new Books("Муму", "И. Тургенев", "2005"),
                new Books("Мцыри", "М. Лермонтов", "2003"),
                new Books("Пролетая над гнездом кукушки", "К. Кизи", "1963"),
                new Books("Перегрузка", "А. Хейли", "1992"),
                new Books("Отель", "А. Хейли", "2018"),
                new Books("Аэропорт", "А. Хейли", "1997"),
                new Books("Воскресенье", "Л. Толстой", "1988")};

        Library lib = new Library();
        System.out.println(lib.toString());
        for (Books book : libraryBooks) {
            lib.addBook(book);
        }
        Books bookToDelite = new Books("Пролетая над гнездом кукушки", "К. Пушкин", "1963");
        lib.delBook(bookToDelite);

        System.out.println(lib.toString());
        lib.authorBook("И. Тургенев");
        System.out.println(lib.toString());
        lib.yearBook("1988");
    }
}

class Books {
    public String name;
    public String author;
    public String pubYear;

    Books(String name, String author, String pubYear) {
        this.name = name;
        this.author = author;
        this.pubYear = pubYear;
    }

    @Override
    public String toString() {
        String bk = "Книга:" + name + " автор:" + author + " год издания:" + pubYear;
        return bk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Books)) return false;
        Books books = (Books) o;
        return name.equals(books.name) &&
                author.equals(books.author) &&
                pubYear.equals(books.pubYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, pubYear);
    }
}

class Library {
    Books library[] = new Books[0];

    void addBook(Books book) {
        Books newLibrary[] = new Books[library.length + 1];
        for (int i = 0; i < library.length; i++) {
            newLibrary[i] = library[i];
        }
        newLibrary[newLibrary.length - 1] = book;
        this.library = newLibrary;
    }

    void delBook(Books bookToDelite) {
        Books temp = null;
        for (int i = 0; i < library.length - 1; i++) {
            if (library[i].equals(bookToDelite)) {
                temp = library[i];
                library[i] = library[library.length - 1];
                library[library.length - 1] = temp;
                Books newLibrary[] = new Books[library.length - 1];
                for (int j = 0; j < library.length - 1; j++) {
                    newLibrary[j] = library[j];
                }
                this.library = newLibrary;
                break;
            }
        }
        if (temp == null) System.out.println("Этой книги нет в библиотеке");
    }

    void authorBook(String authorName) {
        for (Books bk : library) {
            if (bk.author.equals(authorName)) {
                System.out.println(bk.toString());
            }
        }
    }

    void yearBook(String yearNumb) {
        for (Books bk : library) {
            if (bk.pubYear.equals(yearNumb)) {
                System.out.println(bk.toString());
            }
        }
    }

    @Override
    public String toString() {
        String Lib = "Домашняя библиотека:\n";
        for (Books lb : library) {
            Lib += lb.toString() + "\n";
        }
        return Lib;
    }
}
