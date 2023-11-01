import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.inicializarDados();

        // Teste os métodos da classe Biblioteca aqui...

        System.out.println("C1: inicio");
        List<Livro> resultado = biblioteca.buscarLivrosPorTitulo("dos");
        for (Livro livro : resultado) {
            System.out.println(livro);
        }
        System.out.println("C1: fim");

        System.out.println("C2: inicio");
        List<Livro> resultado2 = biblioteca.buscaLivrosPorUsuario("006");
        for (Livro livro : resultado2) {
            System.out.println(livro);
        }
        System.out.println("C2: fim");

    }
}
