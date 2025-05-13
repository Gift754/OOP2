public class Admin extends account {
    private String AuthPassword;

    public Admin(int _id, String _name, String _password) {
        this.id = _id;
        this.name = _name;
        this.AuthPassword = _password;
    }
}
