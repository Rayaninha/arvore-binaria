import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Tree tree = new Tree();

        // for (int i = 0; i < 10; i++) {
        // tree.insertRoot(random.nextInt(10), tree.root);
        // }

        tree.insertRoot(1, tree.root);
        tree.insertRoot(2, tree.root);
        tree.insertRoot(3, tree.root);
        tree.insertRoot(4, tree.root);

        System.out.println(tree.search(3, tree.root));

    }
}