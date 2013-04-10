package fsmbuilder;

import java.util.StringTokenizer;

/**
 * Class that provides various methods of string processing
 * @author Zaurbek Gasanov
 */
public class StringProcessing {
    
    /**
     * Возвращает массив символов на основе парсинга строки с заданными
     * разделителями
     * @param inputString Входная строка
     * @param delimiters Разделители
     * @return Массив символов
     */
    public static char[] parseSymbols(String inputString, String delimiters) {
        StringTokenizer st = new StringTokenizer(inputString, delimiters);
        char[] symbols = new char[st.countTokens()];
        int currentIndex = 0;
        while (st.hasMoreTokens()) {
            symbols[currentIndex++] = st.nextToken().charAt(0);
        }
        return symbols;
    }
    
    /**
     * Возвращает массив строк на основе парсинга строки, состоящей из лексем,
     * разделенных символами новой строки
     * @param inputString Входная строка
     * @return Массив строк
     */
    public static String[] parseLines(String inputString) {
        StringTokenizer st = new StringTokenizer(
                inputString, System.getProperty("line.separator"));
        String[] lines = new String[st.countTokens()];
        int currentIndex = 0;
        while (st.hasMoreTokens()) {
            lines[currentIndex++] = st.nextToken();
        }
        return lines;
    }
    
    /**
     * Возвращает правило вывода на основе парсинга строки следующего формата:
     * <нетерминал> -> <терминал>{<нетерминал>}
     * @param inputString Входная строка
     * @return Правило вывода
     */
    public static ProductionRule parseProductionRule(String inputString) {
        char leftNonterminal = inputString.charAt(0);
        char terminal = inputString.charAt(inputString.indexOf('>') + 2);
        char rightNonterminal = inputString.charAt(inputString.length() - 1);
        if (rightNonterminal == terminal) {
            rightNonterminal = RegularGrammar.EMPTY_NONTERMINAL;
        }
        return new ProductionRule(leftNonterminal, rightNonterminal, terminal);
    }
}
