public class BonusMilesService {
    public int calculate(int price) {
        int miles = price / 100 * 5;
        return miles;
    }

}
