import java.util.LinkedList;
import java.util.Queue;

public class RBTester {
    
    public static void main(String[] args) {
        RBTree<Integer, String> tree = new RBTree<>();
        
        // Insert keys 1 to 60
        for (int i = 1; i <= 60; i++) {
            tree.insert(i, "Value " + i);
        }
        
        System.out.println("Tree after inserting 1 to 60:");
        printTree(tree.root);
        
        // Delete keys 1 to 20
        for (int i = 1; i <= 20; i++) {
            tree.delete(i);
        }
        
        System.out.println("\nTree after deleting 1 to 20:");
        printTree(tree.root);
    }
    
    private static void printTree(RBTree<Integer, String>.Node root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }
    
        Queue<RBTree<Integer, String>.Node> queue = new LinkedList<>();
        queue.add(root);
    
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
    
            while (levelSize > 0) {
                RBTree<Integer, String>.Node node = queue.poll();
                System.out.print(node + " ");
    
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
    
                levelSize--;
            }
            System.out.println();
        }
    }
}  

// OUTPUT:

// Tree after inserting 1 to 60:
// 32(B)
// 16(R) 48(B)
// 8(B) 24(B) 40(R) 56(B)
// 4(B) 12(B) 20(B) 28(B) 36(B) 44(B) 52(R) 58(B)
// 2(B) 6(B) 10(B) 14(B) 18(B) 22(B) 26(B) 30(B) 34(B) 38(B) 42(B) 46(B) 50(B) 54(B) 57(B) 60(B)
// 1(B) 3(B) 5(B) 7(B) 9(B) 11(B) 13(B) 15(B) 17(B) 19(B) 21(B) 23(B) 25(B) 27(B) 29(B) 31(B) 33(B) 35(B) 37(B) 39(B) 41(B) 43(B) 45(B) 47(B) 49(B) 51(B) 53(B) 55(B) 59(R)

// Tree after deleting 1 to 20:
// 40(B)
// 32(B) 48(B)
// 28(B) 36(B) 44(B) 56(B)
// 24(R) 30(B) 34(B) 38(B) 42(B) 46(B) 52(R) 58(B)
// 22(B) 26(B) 29(B) 31(B) 33(B) 35(B) 37(B) 39(B) 41(B) 43(B) 45(B) 47(B) 50(B) 54(B) 57(B) 60(B)
// 21(B) 23(B) 25(B) 27(B) 49(B) 51(B) 53(B) 55(B) 59(R)

// Note: to understand output, note that at each sublevel, the parent has the first two corresponding children (if there is any).