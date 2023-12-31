public class TP01EX03_test {
    public static void main(String[] args){
        Student aluno = new Student("Sophia", "Rua Oito, 54", "CSc", 2, 5);
        System.out.println("Nome do aluno: " + aluno.getName());
        System.out.println("Endereço: " + aluno.getAddress());
        aluno.setAddress("Avenida do Vale, 6");
        System.out.println("Endereço novo: " + aluno.getAddress());
        System.out.println("Programa do aluno: " + aluno.getProgram());
        aluno.setProgram("MBA");
        System.out.println("Novo programa do aluno: " + aluno.getProgram());
        System.out.println("Ano de curso: " + aluno.getYear());
        aluno.setYear(6);
        System.out.println("Ano atualizado: " + aluno.getYear());
        System.out.println("Débito estudantil: " + aluno.getFee());
        aluno.setFee(2000);
        System.out.println("Débito atualizado: " + aluno.getFee());
        System.out.println(aluno.toString());

        System.out.println();

        Staff funcionario = new Staff("Wellington", "Rua Visconde, 10", "IFSP", 6000);
        System.out.println("Escola: "+ funcionario.getSchool());
        funcionario.setSchool("UFABC");
        System.out.println("Escola nova: " + funcionario.getSchool());
        System.out.println("Pagamento: R$" + funcionario.getPay());
        funcionario.setPay(9000);
        System.out.println("Novo pagamento: R$" + funcionario.getPay());
        System.out.println(funcionario.toString());
    }
}
