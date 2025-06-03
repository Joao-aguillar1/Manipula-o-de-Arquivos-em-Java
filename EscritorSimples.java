import java.io.FileWriter;
import java.io.IOException;

public class EscritorSimples {
    public static void main(String[] args) {
        try {
            FileWriter escritor = new FileWriter("frase.txt");
            escritor.write("Cada dia é uma nova oportunidade para brilhar. Aproveite-o ao máximo!");
            escritor.close();
            System.out.println("Frase escrita com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever o arquivo.");
            e.printStackTrace();
        }
    }
}