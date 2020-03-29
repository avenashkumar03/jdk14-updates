public class Main {
    public static void main(String args[]){

        priorToJDK14ObjectToString();
        jdk14ObjectToString();
    }

    public static void priorToJDK14ObjectToString(){
        Object object="This is an Object of type String.";
        if (object instanceof String) {
            String string = (String) object;
            System.out.println(string);
        }
    }

    public static void jdk14ObjectToString(){
        Object object="This is an Object of type String.";
        if (object instanceof String str) {
            System.out.println(str);
        }
    }
}
