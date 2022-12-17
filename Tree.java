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

    public boolean search(int id, Node place) {
        if (root == null) {
            return false;
        }
        while (id != place.id) {
            if (id < place.id) {
                place = place.left;
            } else {
                place = place.right;
            }
            if (place == null) {
                return false;
            }
        }
        return true;
    }
}