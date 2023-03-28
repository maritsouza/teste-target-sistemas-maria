public class Pergunta4 {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double total = sp + rj + mg + es + outros;

        int porcentagemSp = (int) Math.round((sp * 100) / total);
        System.out.println("A porcentagem de SP é: " + porcentagemSp + "%");
        int porcentagemRj = (int) Math.round((rj * 100) / total);
        System.out.println("A porcentagem do RJ é: " + porcentagemRj + "%");
        int porcentagemMg = (int) Math.round((mg * 100) / total);
        System.out.println("A porcetagem de MG é: " + porcentagemMg + "%");
        int porcentagemEs = (int) Math.round((es * 100) / total);
        System.out.println("A porcentagem do ES é: " + porcentagemEs + "%");
        int porcentagemOutros = (int) Math.round((outros * 100) / total);
        System.out.println("A porcentagem de OUTROS é: " + porcentagemOutros + "%");
    }
}
