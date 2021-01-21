public class Main {
    public static void main(String[] args) {

        BonusMilesService service = new BonusMilesService();

        int miles = service.calculate(1000);
        System.out.println(miles);

        miles = service.calculate(2000);
        System.out.println(miles);

        miles = service.calculate(500);
        System.out.println(miles);


    }
}