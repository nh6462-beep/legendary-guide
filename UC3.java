/**
 * UC3: OOPS Banner with String.join() Method
 * 
 * Use Case 3 - Optimized String Construction using String.join()
 * This class refactors UC2 by replacing individual print statements
 * with String.join() for more efficient string construction.
 * 
 * Demonstrates:
 * - String.join() method for efficient concatenation
 * - Memory-efficient banner line construction
 * - Modular line segment representation
 * - Java 8+ string utility features
 * 
 * Key Improvements over UC2:
 * - Avoids creating intermediate String objects from concatenation
 * - Separates logic (printing) from data (banner line segments)
 * - Better performance with multiple string segments
 * - Easier to modify individual letter segments
 * 
 * Goal: Display OOPS banner with optimized String construction
 * 
 * @author OOPSBannerApp Team
 * @version 3.0
 * @since 2026-02-17
 */
public class UC3 {
    
    /**
     * Main method - Entry point of the Java application
     * 
     * Constructs each banner line using String.join() with segment-based approach.
     * Each line is composed of individual letter segments for O, O, P, and S.
     * 
     * String.join() Advantages:
     * - Single operation joins all segments with a delimiter (empty string here)
     * - No intermediate String objects created for each concatenation
     * - More readable than chained + operators
     * 
     * @param args Command-line arguments (not used in UC3)
     */
    public static void main(String[] args) {
        // Line 1: Top borders of all letters (O, O, P, S)
        // Segments: letterO_line1, space, letterO_line1, space, letterP_line1, space, letterS_line1
        String line1 = String.join("", " ***", "  ", "***", "  ", "***", "  ", "****");
        System.out.println(line1);
        
        // Line 2: Upper middle section
        // Each segment represents the letter's pattern for this line
        String line2 = String.join("", "*   *", "*   *", "*    ", "*   *");
        System.out.println(line2);
        
        // Line 3: Middle section (distinctive for letter P: has inner border)
        String line3 = String.join("", "*   *", "*   *", "* ** ", "*   *");
        System.out.println(line3);
        
        // Line 4: Lower middle section
        String line4 = String.join("", "*   *", "*   *", "**   ", "*   *");
        System.out.println(line4);
        
        // Line 5: Lower section continuation
        String line5 = String.join("", "*   *", "*   *", "**   ", "*   *");
        System.out.println(line5);
        
        // Line 6: Bottom borders of all letters
        String line6 = String.join("", " ***", "  ", "***", "  ", "***", "  ", "****");
        System.out.println(line6);
    }
}
