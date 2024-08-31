package jackson.rocha;

public class Calendario {

    static String obterNomeMes(int numeroMes) {
        if (numeroMes < 1 || numeroMes > 12) {
            return "Mês inválido";
        }

        String[] nomeMes = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        return nomeMes[numeroMes - 1];
    }

    public static void main(String[] args) {
        int numeroMes = 12;
        String nomeMes = obterNomeMes(numeroMes);
        System.out.println(nomeMes);
        System.out.println("O mês correspondente ao número "
                + numeroMes + " é: " + nomeMes);

    }
}
