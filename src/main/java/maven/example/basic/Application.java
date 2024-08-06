package maven.example.basic;
//importando utilidad de stream
import java.util.stream.Stream;
//dependencia por apache
import org.apache.commons.lang3.StringUtils;


public class Application {
    public Application() {
        System.out.println("adentro de la aplicaciones");
    }

    public void excecuteStream(){

        long sum= Stream.iterate(0, i-> i<= 1000, i -> i + 1)
                .mapToInt(s->s)
                .sum();

        System.out.println("Serial SUM reduction usando sum: " + sum);
    }

    public int countWords (String word){
        String[] separateWords = StringUtils.split(word, ' ');
        return (separateWords == null) ? 0 : separateWords.length;
    }

    public static void main(String[] args) {
        System.out.println("comenzando de la aplicaciones");
        Application app = new Application();
        app.excecuteStream();
        int count = app.countWords("Hola Enfermera");
        System.out.println("he contado "+count+ " palabras");
    }
}