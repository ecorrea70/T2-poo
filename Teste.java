import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.inicializarDados();

        // Teste os métodos da classe Biblioteca aqui...

        //C1
        System.out.println("C1: inicio");
        List<Livro> resultado = biblioteca.buscarLivrosPorTitulo("dos");
        for (Livro livro : resultado) {
            System.out.println(livro);
        }
        System.out.println("C1: fim");


        //C2
        System.out.println("C2: inicio");
        List<Livro> resultado2 = biblioteca.buscaLivrosPorUsuario("006");
        for (Livro livro : resultado2) {
            System.out.println(livro);
        }
        System.out.println("C2: fim");

        //O1
        System.out.println("O1: inicio");
        List<Livro> ordenacao1 = biblioteca.ordenacaoPorAno();
        for (Livro livro : ordenacao1) {
            System.out.println(livro);
        }
        System.out.println("O1: fim");

        //O2
        System.out.println("O2: inicio");
        List<Livro> ordenacao2 = biblioteca.ordenacaoPorTitulo();
        for (Livro livro : ordenacao2) {
            System.out.println(livro);
        }
        System.out.println("O2: fim");

        //O3
        System.out.println("O3: inicio");
        List<Emprestimo> ordenacao3 = biblioteca.ordenacaoPorDevolucao();
        for (Emprestimo emprestimo : ordenacao3) {
            System.out.println(emprestimo);
        }
        System.out.println("O3: fim");

        //R1
        System.out.println("R1: inicio");
        List<Livro> relatorio1 = biblioteca.relatorioMaisEmprestados();
        for(Livro livro : relatorio1){
            System.out.println(livro);
        }
        System.out.println("R1: fim");
    }
}
