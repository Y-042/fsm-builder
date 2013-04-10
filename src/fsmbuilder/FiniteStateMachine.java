package fsmbuilder;

/**
 * Finite-state machine encapsulation
 * @author Zaurbek Gasanov
 */
public class FiniteStateMachine {
    private char[] inputSymbols;    // входные символы
    private char[] states;  // состояния
    private char initialState;  // начальное состояние
    private char[][] stateTransitions;  // функция переходов
    private char[] finalStates; // заключительные состояния

    public char[] getInputSymbols() {
        return inputSymbols;
    }

    public char[] getStates() {
        return states;
    }

    public char getInitialState() {
        return initialState;
    }

    public char[][] getStateTransitions() {
        return stateTransitions;
    }

    public char[] getFinalStates() {
        return finalStates;
    }

    /**
     * Конструктор класса, инициализирующий все элементы конечного автомата
     * @param inputSymbols Входные символы
     * @param states Состояния
     * @param initialState Начальное состояние
     * @param stateTransitions Функция переходов
     * @param finalStates Заключительные состояния
     */
    public FiniteStateMachine(char[] inputSymbols, char[] states,
            char initialState, char[][] stateTransitions, char[] finalStates) {
        this.inputSymbols = inputSymbols;
        this.states = states;
        this.initialState = initialState;
        this.stateTransitions = stateTransitions;
        this.finalStates = finalStates;
    }
}
