<<<<<<< HEAD
public class TreesMain {

    public static void main(String[] args) {


        //try height
        BinaryNode<Integer> n1 = new BinaryNode<Integer>(8);
        n1.setLeft(new BinaryNode<Integer>(1));
        n1.getLeft().setLeft(new BinaryNode<Integer>(1));
        n1.getLeft().getLeft().setRight(new BinaryNode<Integer>(7));

        System.out.println(n1.getHeight());


        //try insert

        BinaryNode<Integer> n2 = new BinaryNode<Integer>(8);

        AVLTree<Integer> avl_tree = new AVLTree<>(n2);

        avl_tree.insert(new BinaryNode<Integer>(10));
        avl_tree.insert(new BinaryNode<Integer>(15));
        avl_tree.insert(new BinaryNode<Integer>(14));


        avl_tree.insert(new BinaryNode<Integer>(16));
        avl_tree.insert(new BinaryNode<Integer>(13));
        avl_tree.insert(new BinaryNode<Integer>(4));
        System.out.println(avl_tree.insert(new BinaryNode<Integer>(3)));
        


        
        

        System.out.println(avl_tree.toString());








    }
    
}
=======
public class TreesMain {

    public static void main(String[] args) {


        //try height
        BinaryNode<Integer> n1 = new BinaryNode<Integer>(8);
        n1.setLeft(new BinaryNode<Integer>(1));
        n1.getLeft().setLeft(new BinaryNode<Integer>(1));
        n1.getLeft().getLeft().setRight(new BinaryNode<Integer>(7));

        System.out.println(n1.getHeight());


        //try insert

        BinaryNode<Integer> n2 = new BinaryNode<Integer>(30);

        AVLTree<Integer> avl_tree = new AVLTree<>(n2);

        avl_tree.insert(new BinaryNode<Integer>(2));
        avl_tree.insert(new BinaryNode<Integer>(0));
        avl_tree.insert(new BinaryNode<Integer>(100));


        avl_tree.insert(new BinaryNode<Integer>(90));
        avl_tree.insert(new BinaryNode<Integer>(40));
        avl_tree.insert(new BinaryNode<Integer>(-100));
        avl_tree.insert(new BinaryNode<Integer>(20));
        avl_tree.insert(new BinaryNode<Integer>(1));
        avl_tree.insert(new BinaryNode<Integer>(-110));
        avl_tree.insert(new BinaryNode<Integer>(10));


        System.out.println(avl_tree.toString());








    }
    
}
>>>>>>> a0d27342b55368c11b0793526dce4600f21be9eb
