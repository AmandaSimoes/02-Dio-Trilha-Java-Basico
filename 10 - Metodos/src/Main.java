public class Main {
    public static void main(String[] args) {
        System.out.println("Calculadora");
        Calculadora.soma(67, 9);
        Calculadora.subtracao(89, 76);
        Calculadora.multiplicacao(22, 9);
        Calculadora.divisao(45, 2);

        System.out.println("Saudação");
        Mensagem.saudacao(10);
        Mensagem.saudacao(16);
        Mensagem.saudacao(23);
        Mensagem.saudacao(26);

        System.out.println("Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

        System.out.println("Sobrecarga");
        Sobrecarga.area(3);
        Sobrecarga.area(5d, 5d);
        Sobrecarga.area(7, 9, 8);
        Sobrecarga.area(5f, 5f);
    }


    
}
