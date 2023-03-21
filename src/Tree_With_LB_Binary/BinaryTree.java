package Tree_With_LB_Binary;

import java.util.*;

class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinaryTree {

    static Node buildTree(Node root) {
        System.out.println("enter the the data");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        root = new Node(data);
        if (data == -1) {
            return null;
        }
        System.out.println("enter the data for inserting the data in left " + data);
        root.left = buildTree(root.left);
        System.out.println("enter the value for inserting data in right " + data);
        root.right = buildTree(root.right);
        return root;

    }

    public static void levelOrderTravesal(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            Node temp = queue.peek();
            queue.remove();
            if (temp == null) {
                System.out.println("");
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            } else {
                System.out.print(temp.data + "  ");

                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }
    }

    public static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data + "  ");
        inOrderTraversal(root.right);

    }

    public static void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data + "  ");

    }

    public static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + "  ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }

    public static void buildLevelOrderTraversal(Node root) {
        Scanner sc = new Scanner(System.in);

        Queue<Node> q = new LinkedList<Node>();
        System.out.println("enter the root node ");
        int data=sc.nextInt();
        root=new Node(data);
        
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.peek();
            q.remove();
            System.out.println("enter left node for " + temp.data);
            int leftData = sc.nextInt();
            if (leftData != -1) {
                temp.left = new Node(leftData);
                q.add(temp.left);
            }
            System.out.println("enter right node for " + temp.data);
            int rightData = sc.nextInt();
            if (rightData != -1) {
                temp.right = new Node(rightData);
                q.add(temp.right);
            }

        }
    }

    public static void main(String[] args) {

        Node root = null;

//        buildLevelOrderTraversal(root);
//
//       levelOrderTravesal(root);
        root = buildTree(root);
        levelOrderTravesal(root);
        System.out.println("inORDERTRAVERSAL ");
        inOrderTraversal(root);
        System.out.println("");
        System.out.println("POST ORDER TRAVERSAL");
        postOrderTraversal(root);
        System.out.println("");
        System.out.println("pre Order traversal ");
        preOrderTraversal(root);
    }
}
