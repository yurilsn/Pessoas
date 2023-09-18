public class ProjetoPessoas {
    public static void main(String[] args) {

        //Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        Aluno p5 = new Aluno();
        Bolsista p6 = new Bolsista();

        p6.setNome("Leandro");
        p2.setNome("Marcos");
        p3.setNome("Gabriela");

        p6.setIdade(43);
        p2.setIdade(23);
        p3.setIdade(41);

        p6.setSexo("M");
        p2.setSexo("M");
        p3.setSexo("F");

        p2.pagarMensalidade();
        p6.pagarMensalidade();




    }

}