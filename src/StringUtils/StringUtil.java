/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringUtils;

/**
 *
 * @author frede
 */
public class StringUtil {
    /**
     * Centers a string in a given new string
     * @param input The string to be centered
     * @param centerWidth The total width of the returned string
     * @return The input centered in a strign the width of centerWidth
     */
    public static String centerStringLeft(String input, Integer centerWidth) {
        boolean inputEven = input.length() % 2 == 0;
        boolean maxEven = centerWidth % 2 == 0;
        int extraFronSpace = (inputEven && !maxEven) || (!inputEven && maxEven) ? 1 : 0;
        Integer whitespace = centerWidth - input.length();
        return String.format(String.format("%%-%ds%%-%ds",
                        (whitespace / 2) + extraFronSpace,
                        (whitespace / 2) + input.length()),
                "",
                input);
    }
        /**
     * Centers a string in a given new string with excess spaces on the right side
     * @param input The string to be centered
     * @param centerWidth The total width of the returned string
     * @return The input centered in a strign the width of centerWidth
     */
    public static String centerStringRight(String input, Integer centerWidth) {
        boolean inputEven = input.length() % 2 == 0;
        boolean maxEven = centerWidth % 2 == 0;
        Integer whitespace = centerWidth - input.length();
        return String.format(String.format("%%-%ds%%-%ds",
                        (whitespace / 2),
                        (whitespace / 2) + input.length() + (maxEven^inputEven ? 1 : 0)),
                "",
                input);
    }
}
