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
public class Playground {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] colNam = new String[]{"col1", "col2", "col3"};
        String[] rowNam = new String[]{"row1", "row2ss", "row3"};
        String[][] dat = new String[][]{{"val11", "val12", "val13"}, {"val21", "val22", "val23"}, {"val31", "val32", "val33"}};
        System.out.println(ArrayPrintFormat.prettifyArray(dat, colNam, rowNam));
        String[] colNam2 = new String[]{"col1", "col2", "col3"};
        String[] rowNam2 = new String[]{"row1", "row2sss", "row3"};
        String[][] dat2 = new String[][]{{"val11", "val12", "val13"}, {"val21", "val22", "val23"}, {"val31", "val32", "val33"}};
        System.out.println(ArrayPrintFormat.prettifyArray(dat2, colNam2, rowNam2));
    }

}
