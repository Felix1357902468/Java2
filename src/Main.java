//TIP To <b>Run</b> code, press <shortcut actionId="Rum"/>or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 19_791;
        int miles = service.calculate(price); // должно получиться 989
        System.out.println(miles);


    }
}
