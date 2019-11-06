package effective.tree;

import sun.jvm.hotspot.utilities.*;

import java.util.Comparator;
import java.util.Random;

/**
 * Created by tuqi on 2018/10/8.
 */
public class RBTreeTest {
    public static void main(String[] args) {
        int treeSize = 100;
        int maxVal = treeSize;
        System.err.println("Building tree...");
        sun.jvm.hotspot.utilities.RBTree tree = new sun.jvm.hotspot.utilities.RBTree(new Comparator() {
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer)o1;
                Integer i2 = (Integer)o2;
                return i1.intValue() < i2.intValue()?-1:(i1.intValue() == i2.intValue()?0:1);
            }
        });
        Random rand = new Random(System.currentTimeMillis());

        int i;
        for(i = 0; i < treeSize; ++i) {
            Integer val = new Integer(rand.nextInt(maxVal) + 1);

            try {
                tree.insertNode(new RBNode(val));
                if(i > 0 && i % 100 == 0) {
                    System.err.print(i + "...");
                    System.err.flush();
                }
            } catch (Exception var11) {
                var11.printStackTrace();
                System.err.println("While inserting value " + val);
                tree.printOn(System.err);
                System.exit(1);
            }
        }

        System.err.println();
        System.err.println("Churning tree...");

        for(i = 0; i < treeSize; ++i) {
            System.err.println("Iteration " + i + ":");
            tree.printOn(System.err);
            RBNode xParent = null;
            RBNode x = tree.getRoot();

            int depth;
            for(depth = 0; x != null; ++depth) {
                xParent = x;
                if(rand.nextBoolean()) {
                    x = x.getLeft();
                } else {
                    x = x.getRight();
                }
            }

            int height = rand.nextInt(depth);
            if(height >= depth) {
                throw new RuntimeException("bug in java.util.Random");
            }

            while(height > 0) {
                xParent = xParent.getParent();
                --height;
            }

//            System.err.println("(Removing value " + tree.getNodeValue(xParent) + ")");
            tree.deleteNode(xParent);
            Integer newVal = new Integer(rand.nextInt(maxVal) + 1);
            System.err.println("(Inserting value " + newVal + ")");
            tree.insertNode(new RBNode(newVal));
        }

        System.err.println("All tests passed.");
    }
}
