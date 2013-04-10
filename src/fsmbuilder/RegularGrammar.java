package fsmbuilder;

/**
 * Regular grammar encapsulation
 * @author Zaurbek Gasanov
 */
public class RegularGrammar {
    public static final char EMPTY_TRANSITION = '$';
    public static final char EMPTY_NONTERMINAL = '~';
    public static final char FINAL_STATE = 'f';
    
    private char[] terminals;  // терминальные символы
    private char[] nonterminals;  // нетерминальные символы
    private ProductionRule[] productionRules; // правила вывода
    private char startSymbol; // начальный символ

    public char[] getTerminals() {
        return terminals;
    }

    public char[] getNonterminals() {
        return nonterminals;
    }

    public ProductionRule[] getProductionRules() {
        return productionRules;
    }

    public char getStartSymbol() {
        return startSymbol;
    }

    /**
     * Конструктор класса, инициализирующий все элементы грамматики
     * @param terminals Терминальные символы
     * @param nonterminals Нетерминальные символы
     * @param productionRules Правила вывода
     * @param startSymbol Начальный символ
     */
    public RegularGrammar(char[] terminals, char[] nonterminals,
            ProductionRule[] productionRules, char startSymbol) {
        this.terminals = terminals;
        this.nonterminals = nonterminals;
        this.productionRules = productionRules;
        this.startSymbol = startSymbol;
    }
    
    /**
     * Преобразует грамматику в конечный автомат
     * @return Конечный автомат
     */
    public FiniteStateMachine toFiniteStateMachine() {
        char[][] stateTransitions =
                new char[terminals.length][nonterminals.length];
        for (int i = 0; i < terminals.length; i++) {
            for (int j = 0; j < nonterminals.length; j++) {
                stateTransitions[i][j] = EMPTY_TRANSITION;
            }
        }
        for (ProductionRule pr: productionRules) {
            char rightNonterminal = pr.getRightNonterminal();
            if (rightNonterminal == EMPTY_NONTERMINAL) {
                rightNonterminal = FINAL_STATE;
            }
            int terminalIndex = getIndex(pr.getTerminal(), terminals);
            int nonterminalIndex =
                    getIndex(pr.getLeftNonterminal(), nonterminals);
            stateTransitions[terminalIndex][nonterminalIndex] =
                    rightNonterminal;
        }
        char[] finalStates = {FINAL_STATE};
        return new FiniteStateMachine(terminals, nonterminals, startSymbol,
                stateTransitions, finalStates);
    }
    
    /**
     * Возвращает индекс элемента в массиве
     * @param element Элемент, индекс которого определяется
     * @param array Массив, в котором ведется поиск
     * @return Индекс элемента в массиве или -1, если элемент отсутствует
     */
    public static int getIndex(char element, char[] array) {
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
