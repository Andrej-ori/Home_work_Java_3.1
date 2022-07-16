public class Main {
    public static void main(String[] args) {
        BonusMilesServise servise = new BonusMilesServise();
        int praise = 10_000;
        int mile = servise.caalculete(praise);
        System.out.println(mile);
    }
}
