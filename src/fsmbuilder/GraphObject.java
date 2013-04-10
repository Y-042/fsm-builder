package fsmbuilder;

/**
 * Graph object encapsulation
 * @author Zaurbek Gasanov
 */
public class GraphObject {
    protected String title;

    public GraphObject(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }
}
