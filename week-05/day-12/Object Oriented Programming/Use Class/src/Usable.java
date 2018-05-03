public class Usable {

    String status;

    public Usable() {
        status = "I'm not used at all";
    }

    public void use() {
        status = "Now, I was used at least once.";
    }
}