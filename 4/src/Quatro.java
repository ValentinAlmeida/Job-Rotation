public class Quatro {
    public static void main(String[] args) throws Exception {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;
        double total = sp+rj+mg+es+outros;

        System.out.printf("sp = %.2f %n" , (sp/total)*100);
        System.out.printf("rj = %.2f %n" , (rj/total)*100);
        System.out.printf("mg = %.2f %n" , (mg/total)*100);
        System.out.printf("es = %.2f %n" , (es/total)*100);
        System.out.printf("outros = %.2f %n" , (outros/total)*100);
    }
}
