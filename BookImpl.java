class BookImpl implements Book {
    @Override
    public void borrowResource(String title) {
        System.out.println("Borrowing book: " + title);
    }

    @Override
    public void returnBook(String title) {
        System.out.println("Returning book: " + title);
    }
}
