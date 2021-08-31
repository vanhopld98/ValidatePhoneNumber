public class PhoneNumberExampleTest {
    public static String[] validate = new String[]{"(84)-(0978489648)"};
    public static String[] invalidate = new String[]{"(a8)-(2222222222)"};

    public static void main(String[] args) {
        PhoneNumberExample validateClass = new PhoneNumberExample();
        for (String validate : validate) {
            boolean isvalid = validateClass.validate(validate);
            System.out.println("Phone Number " + validate + " is valid " + isvalid);
        }
        for (String validate : invalidate) {
            boolean isvalid = validateClass.validate(validate);
            System.out.println("Phone Number " + validate + " is valid " + isvalid);
        }
    }
}