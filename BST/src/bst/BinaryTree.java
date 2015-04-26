package bst;

public class BinaryTree {

    Node root;

    public void AddNode(int key) {

        Node newNode = new Node(key);

        if (root == null) {
            root = newNode;
        } else {
            Node focusNode = root;

            Node parent;
            while (true) {
                parent = focusNode;
                if (key < focusNode.key) {
                    focusNode = focusNode.leftChild;
                }
                if (focusNode == null) {
                    parent.leftChild = newNode;
                    return;
                }
                if (key > focusNode.key) {
                    focusNode = focusNode.rightChild;
                }
                if (focusNode == null) {
                    parent.rightChild = newNode;
                    return;
                }
                if (focusNode.key == key) {
                    return;
                }
            }

        }
    }

    public void InOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            InOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);

            InOrderTraverseTree(focusNode.rightChild);

        }
    }

    public void PreOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {
            System.out.println(focusNode);
            PreOrderTraverseTree(focusNode.leftChild);
            PreOrderTraverseTree(focusNode.rightChild);

        }
    }

    public void PostOrderTraverseTree(Node focusNode) {
        if (focusNode != null) {

            PostOrderTraverseTree(focusNode.leftChild);
            PostOrderTraverseTree(focusNode.rightChild);
            System.out.println(focusNode);
        }
    }

    public Node findNode(int key) {
        Node focusNode = root;
        while (focusNode.key != key) {
            if (key < focusNode.key) {
                focusNode = focusNode.leftChild;
            } else {
                focusNode = focusNode.rightChild;
            }
            if (focusNode == null) {
                return null;
            }
        }
        return focusNode;
    }

    int countLeaves(Node node) {
        if (node == null) {
            return 0;
        } else if (node.leftChild == null && node.rightChild == null) {
            return 1;
        } else {
            return 1 + countLeaves(node.leftChild) + countLeaves(node.rightChild);
        }

    }
    public int arama = 0;

    public int sayarakArama(int val) {
        Node focusNode = root;
        while (focusNode.key != val) {
            if (val < focusNode.key) {
                arama = arama + 1;
                focusNode = focusNode.leftChild;

            } else {
                arama = arama + 1;
                focusNode = focusNode.rightChild;

            }
            if (focusNode == null) {
               System.out.println("arama counter su an degeri : "+arama +"\n");
                return arama;

            }
          
        }
       System.out.println("arama counter su an degeri : "+arama +"\n");
        return arama;
    }
}
