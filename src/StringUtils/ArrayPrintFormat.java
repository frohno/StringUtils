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
public class ArrayPrintFormat {

    public static <T> String prettifyArray(T[][] dataArray) {
        StringBuilder sb = new StringBuilder();
        int widestElement = 0;
        for (T[] i : dataArray) {
            for (T j : i) {
                if (widestElement < j.toString().length()) {
                    widestElement = j.toString().length();
                }
            }
        }
        widestElement += 2;
        for (int i = 0; i < dataArray.length; i++) {
            for (int j = 0; j < dataArray[i].length; j++) {
                sb.append("|").append(StringUtil.centerStringLeft(dataArray[i][j].toString(), widestElement));
            }
            sb.append("|").append(String.format("%n"));
        }
        return sb.toString();
    }

    public static <T> String prettifyArray(T[][] dataArray, String[] headerNames, boolean isColumns) {
        StringBuilder sb = new StringBuilder();
        int widestElement = 0;
        for (String headerName : headerNames) {
            if (widestElement < headerName.length()) {
                widestElement = headerName.length();
            }
        }
        for (T[] i : dataArray) {
            for (T j : i) {
                if (widestElement < j.toString().length()) {
                    widestElement = j.toString().length();
                }
            }
        }
        widestElement += 2;
        if (isColumns) {
            sb.append("|").append(StringUtil.centerStringLeft("", widestElement));
            for (String headerName : headerNames) {
                sb.append("|").append(StringUtil.centerStringLeft(headerName, widestElement));
            }
            sb.append(String.format("|%n"));
            for (int i = 0; i < dataArray.length; i++) {
                for (int j = 0; j < dataArray[i].length; j++) {
                    sb.append("|").append(StringUtil.centerStringLeft(dataArray[i][j].toString(), widestElement));
                }
                sb.append("|").append(String.format("%n"));
            }
            return sb.toString();
        } else {
            for (int i = 0; i < dataArray.length; i++) {
                sb.append("|").append(StringUtil.centerStringLeft(headerNames[i], widestElement));
                for (int j = 0; j < dataArray[i].length; j++) {
                    sb.append("|").append(StringUtil.centerStringLeft(dataArray[i][j].toString(), widestElement));
                }
                sb.append("|").append(String.format("%n"));
            }
            return sb.toString();
        }
    }

    public static <T> String prettifyArray(T[][] dataArray, String[] collumnNames, String[] rowNames) {
        StringBuilder sb = new StringBuilder();
        int widestElement = 0;
        for (String collumnName : collumnNames) {
            if (widestElement < collumnName.length()) {
                widestElement = collumnName.length();
            }
        }
        for (String i : rowNames) {
            if (widestElement < i.length()) {
                widestElement = i.length();
            }
        }
        for (T[] i : dataArray) {
            for (T j : i) {
                if (widestElement < j.toString().length()) {
                    widestElement = j.toString().length();
                }
            }
        }
        widestElement += 2;
        sb.append("|").append(String.format(String.format("%%%ds", widestElement + 2), ""));
        for (String collumnName : collumnNames) {
            sb.append("|").append(StringUtil.centerStringLeft(collumnName, widestElement));
        }
        sb.append(String.format("|%n"));
        for (int i = 0; i < dataArray.length; i++) {
            sb.append("|").append(StringUtil.centerStringLeft(rowNames[i], widestElement));
            for (int j = 0; j < dataArray[i].length; j++) {
                sb.append("|").append(StringUtil.centerStringLeft(dataArray[i][j].toString(), widestElement));
            }
            sb.append("|").append(String.format("%n"));
        }

        return sb.toString();
    }

}
