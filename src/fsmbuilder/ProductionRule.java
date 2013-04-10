package fsmbuilder;

/**
 * Production rule encapsulation
 * @author Zaurbek Gasanov
 */
public class ProductionRule {
    private char leftNonterminal;   // левый нетерминал
    private char rightNonterminal;  // правый нетерминал
    private char terminal;  // терминал

    public char getLeftNonterminal() {
        return leftNonterminal;
    }

    public char getRightNonterminal() {
        return rightNonterminal;
    }

    public char getTerminal() {
        return terminal;
    }

    /**
     * Основной конструктор класса
     * @param leftNonterminal Левый нетерминал
     * @param rightNonterminal  Правый нетерминал
     * @param terminal  Терминал
     */
    public ProductionRule(char leftNonterminal, char rightNonterminal,
            char terminal) {
        this.leftNonterminal = leftNonterminal;
        this.rightNonterminal = rightNonterminal;
        this.terminal = terminal;
    }

    @Override
    public String toString() {
        String string = leftNonterminal + " -> " + terminal;
        if (rightNonterminal != RegularGrammar.EMPTY_NONTERMINAL) {
            string += rightNonterminal;
        }
        return string;
    }
}
