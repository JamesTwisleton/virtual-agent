package virtualagent

class User {
    String username
    static constraints = {
        username blank: false
    }

    static mapping = {
        username index: true
    }

    public User(username) {
        this.username = username;
    }

    String toString() {
        username
    }
}
