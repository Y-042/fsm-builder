package fsmbuilder;

/**
 * Regular grammar encapsulation
 * @author Zaurbek Gasanov
 */
public class RegularGrammar {
    private char[] terminals;  // терминальные символы
    private char[] nonterminals;  // нетерминальные символы
    private String[] productionRules; // правила вывода
    private char startSymbol; // начальный символ

    public char[] getTerminals() {
        return terminals;
    }

    public char[] getNonterminals() {
        return nonterminals;
    }

    public String[] getProductionRules() {
        return productionRules;
    }

    public char getStartSymbol() {
        return startSymbol;
    }
}
