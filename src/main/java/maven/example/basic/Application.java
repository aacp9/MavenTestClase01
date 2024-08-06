package maven.example.basic;

public class Application {
    public Application() {
        System.out.println("adentro de la aplicaciones");
    }

    public static void main(String[] args) {
        System.out.println("comenzando de la aplicaciones");
        Application app = new Application();
    }
}