public class Tree {
    Node root = null;

    void insertRoot(int id, Node place) {
        if (place == null) {
            root = new Node(id);
        } else if (id < place.id) {
            if (place.left == null) {
                place.left = new Node(id);
            } else {
                insertRoot(id, place.left);
            }
        } else if (id > place.id) {
            if (place.right == null) {
                place.right = new Node(id);
            } else {
                insertRoot(id, place.right);
            }
        }
    }

    boolean search(int id, Node place) {
        if (place == null) {
            return false;
        } else if (id < place.id) {
            if (place.left != null) {
                if (place.left.id == id) {
                    System.out.println("search left: " + place.left.id);
                    return true;
                } else {
                    search(id, place.left);
                }
            }
        } else if (id > place.id) {
            if (place.right != null) {
                if (place.right.id == id) {
                    System.out.println("search right: " + place.right.id);
                    return true;
                } else {
                    search(id, place.right);
                }
            }
        } else if (id == place.id) {
            return true;
        } else {
            // System.out.println("value not found");
            return false;
        }
        return false;
    }

    public void reset(Node place) {

    }

}