public class StringsExample {
    public static void main(String args[]) {
        String s1 = "bala";
        String s2 = "bala";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1.equals(s2));
        System.out.println(s1.charAt(2)); 

        StringBuffer sb1 = new StringBuffer("bala");
        System.out.println(sb1);
        System.out.println(sb1.capacity());
        sb1.append(" chandra");
        System.out.println(sb1);
        String resultStr = sb1.toString();
        System.out.println(resultStr);

        // StringBuffer is thead safe but not StringBuilder
        
    }
}
