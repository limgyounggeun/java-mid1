package nested.nested.test;

public class Library {

    private Book[] books;
    private int booksCount;
    public Library(int size) {
        books = new Book[size];
        booksCount = 0;
    }
    public void addBook(String title, String author) {
        //검증 로직을 다 처리
        if(booksCount >= books.length) {
            System.out.println("도서관 저장 공간이 부족합니다.");
            return;
        }
        //정상 로직을 처리
        books[booksCount++] = new Book(title, author);
//        if(booksCount < books.length) {
//            books[booksCount++] = new Book(title, author);
//        }else{
//            System.out.println("도서관 저장 공간이 부족합니다.");
//        }
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < booksCount; i++) {
            System.out.println("도서 제목: " + books[i].name + ", 저자: " + books[i].author);
        }
    }



    private static class Book {
        private String name;
        private String author;

        public Book(String name, String author) {
            this.name = name;
            this.author = author;
        }
    }
}
