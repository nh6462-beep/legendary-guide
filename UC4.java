/**
 * UC4: OOPS Banner with Arrays and Loops
 * 
 * Use Case 4 - Data Structure-Driven Approach with Arrays
 * This class refactors UC3 by storing all banner lines in a String array
 * and using an enhanced for-loop to print them.
 * 
 * Demonstrates:
 * - String arrays for organizing data
 * - Enhanced for-loop iteration (for-each)
 * - Modular and scalable code design
 * - Data-driven programming approach
 * - Loop-based iteration instead of individual statements
 * 
 * Key Improvements over UC3:
 * - Centralized data storage in array structure
 * - Eliminates repetitive individual print statements
 * - Single loop handles all output (DRY principle)
 * - Easier to add/modify/extend banner patterns
 * - Foundation for dynamic banner generation
 * 
 * Goal: Display OOPS banner using array storage and loop iteration
 * 
 * @author OOPSBannerApp Team
 * @version 4.0
 * @since 2026-02-17
 */
public class UC4 {
    
    /**
     * Main method - Entry point of the Java application
     * 
     * Uses String array to store all banner lines and enhanced for-loop to iterate
     * and print each line. This approach is highly modular and scalable.
     * 
     * Array-Based Approach Benefits:
     * - All banner data in one place (bannerLines array)
     * - Loop-based printing (no repetitive code)
     * - Easy to add new patterns or lines
     * - Can be saved/loaded from files
     * - Supports dynamic manipulation (sorting, filtering, etc.)
     * 
     * @param args Command-line arguments (not used in UC4)
     */
    public static void main(String[] args) {
        // UC4: Store all banner lines in a String array
        // Each element represents one line of the ASCII art banner
        String[] bannerLines = {
            // Line 1: Top borders of all letters (O, O, P, S)
            String.join("", " ***", "  ", "***", "  ", "***", "  ", "****"),
            
            // Line 2: Upper middle section
            String.join("", "*   *", "*   *", "*    ", "*   *"),
            
            // Line 3: Middle section (distinctive for letter P)
            String.join("", "*   *", "*   *", "* ** ", "*   *"),
            
            // Line 4: Lower middle section
            String.join("", "*   *", "*   *", "**   ", "*   *"),
            
            // Line 5: Lower section continuation
            String.join("", "*   *", "*   *", "**   ", "*   *"),
            
            // Line 6: Bottom borders of all letters
            String.join("", " ***", "  ", "***", "  ", "***", "  ", "****")
        };
        
        // UC4: Use enhanced for-loop to print each line
        // Enhanced for-loop syntax: for (Type var : array) { ... }
        // This eliminates the need for index-based iteration or individual statements
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
