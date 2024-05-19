class JournalImpl implements Journal {
    @Override
    public void borrowResource(String title) {
        System.out.println("Borrowing journal: " + title);
    }

    @Override
    public void readLatestIssue() {
        System.out.println("Reading the latest issue of the journal.");}}
