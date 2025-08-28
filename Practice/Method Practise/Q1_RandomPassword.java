public class Q1_RandomPassword {
    public static void main(String[] args) {
        System.out.println(passGenerator(8));
    }
    public static String passGenerator(int passLength){
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digit = "0123456789";
        String specialchar = "@#$&*";
        String AllChar = alpha + digit + specialchar;
        String pass = "";
        for(int i=0; i<passLength; i++){
            int index = (int)(Math.random() * AllChar.length());
            pass += AllChar.charAt(index);
        }
        return pass;
    }
}
