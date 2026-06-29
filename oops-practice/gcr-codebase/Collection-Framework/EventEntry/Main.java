public class Main {

    public static void main(String[] args) {

        EventManager em = new EventManager();

        em.register("amit@gmail.com");
        em.register("riya@gmail.com");
        em.register("amit@gmail.com");

        em.displayParticipants();
    }
}