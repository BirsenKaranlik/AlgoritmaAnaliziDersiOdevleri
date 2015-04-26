package bst;

import java.util.Random;
import java.util.Scanner;

public class BST {

    public static void main(String[] args) {
        Random rnd = new Random();

        BinaryTree tree = new BinaryTree();
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Kaç Node lu ağaç oluşturacaksınız?");
        int node_sayisi=scan.nextInt();
        System.out.println("Kaç tane arama yapmak istersiniz?");
        int arama_sayisi=scan.nextInt();
        while (tree.countLeaves(tree.root) != node_sayisi) {
            tree.AddNode(rnd.nextInt(1000));
        }
     
        for(int i=0;i<arama_sayisi;i++){
             tree.sayarakArama(rnd.nextInt(1000));
        }
        System.out.print(arama_sayisi+ " Gezinti Ortalaması : ");
        System.out.println(tree.arama/arama_sayisi);


    }
}
