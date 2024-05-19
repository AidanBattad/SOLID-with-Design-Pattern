public class TestProgram {
    public static void main(String[] args) {
        Student student = new Student();

        Book book = new BookImpl();
        student.setResource(book);
        student.borrowResource("Introduction to Programming");

        student.returnResource("Introduction to Programming");

        Journal journal = new JournalImpl();
        student.setResource(journal);
        student.borrowResource("Scientific Research Journal");

        student.borrowResource("Test Resource");

        if (journal instanceof Journal) {
            ((Journal) journal).readLatestIssue();
        }

    }
}
