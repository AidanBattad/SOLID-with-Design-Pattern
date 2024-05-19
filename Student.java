class Student {
    private Resource resource;

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public void borrowResource(String title) {
        if (resource != null) {
            resource.borrowResource(title);
        } else {
            System.out.println("No resource selected.");
        }
    }

    public void returnResource(String title) {
        if (resource instanceof Book) {
            ((Book) resource).returnBook(title);
        } else {
            System.out.println("Cannot return non-book resources.");
        }
    }}

