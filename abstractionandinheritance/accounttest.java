public class accounttest {
    public static void main(String[] args) {
        Admin admin = new Admin(1, "Alice", "admin123");
        User user = new User(2, "Bob");

        DataSource update = new Update();
        DataSource view = new View();
        DataSource delete = new Delete();

        System.out.println("Admin performs:");
        admin.performOperation(update);  // Output: Executing update operation

        System.out.println("User performs:");
        user.performOperation(view);    // Output: Executing view operation
    }
}