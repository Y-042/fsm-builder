package fsmbuilder;

/**
 * Graph vertex encapsulation
 * @author Zaurbek Gasanov
 */
public class GraphVertex extends GraphObject {

    public GraphVertex(String title) {
        super(title);
    }

    public static int getVertexIndex(GraphVertex[] vertices, String title) {
        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }
}
