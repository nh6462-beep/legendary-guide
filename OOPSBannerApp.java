public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC3: Using String.join() for efficient string construction
        
        // Line 1: Top of letters (O, O, P, S)
        String line1 = String.join("", " ***", "  ", "***", "  ", "***", "  ", "****");
        System.out.println(line1);
        
        // Line 2: First middle line (sides of letters)
        String line2 = String.join("", "*   *", "*   *", "*    ", "*   *");
        System.out.println(line2);
        
        // Line 3: Second middle line (distinctive patterns)
        String line3 = String.join("", "*   *", "*   *", "* ** ", "*   *");
        System.out.println(line3);
        
        // Line 4: Third middle line (sides of letters)
        String line4 = String.join("", "*   *", "*   *", "**   ", "*   *");
        System.out.println(line4);
        
        // Line 5: Fourth middle line (sides of letters)
        String line5 = String.join("", "*   *", "*   *", "**   ", "*   *");
        System.out.println(line5);
        
        // Line 6: Bottom of letters (O, O, P, S)
        String line6 = String.join("", " ***", "  ", "***", "  ", "***", "  ", "****");
        System.out.println(line6);
    }
}
