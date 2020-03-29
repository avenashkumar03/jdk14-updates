public class Main {
    public static void main(String args[]){
        System.out.println(priorToJdk14SwitchExpressions());
    }

    public static int priorToJdk14SwitchExpressions(){
        int integer=-1;
        String string = "three";
        switch (string) {
            case "one":
                integer=1;
                break;
            case "two":
                integer=2;
                break;
            case "three":
                integer=3;
                break;
            default:
                integer=-1;
        }
        return integer;
    }

    public static int jdk14SwitchExpressions() {
        String string = "three";
        int integer = switch (string) {
            case "one" -> 1;
            case "two" -> 2;
            case "three" -> 3;
            default -> -1;
        };
        return integer;
    }
}
