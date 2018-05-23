import java.lang.reflect.Field;
class MessingWithString {
    public static void main (String[] args) {
        String str = "Mario";
        toLuigi(str);
        System.out.println(str + " " + "Mario");
    }
    public static void toLuigi(String original) {
        try {
            Field stringValue = String.class.getDeclaredField("value");
            stringValue.setAccessible(true);
            stringValue.set(original, "Luigi".toCharArray());
        } catch (Exception ex) {
            // Ignore exceptions
        }
    }
}