package com.company;

public class BST {
     class Node{
         Student student;
         Node left;
         Node right;

         Node(Student student){
             this.student=student;
         }
     }

     private Node root;
     public void insert(Student newEl){
         root=insertNode(root,newEl);
     }

     private Node insertNode(Node current, Student newEl){
         if(current == null){
             return new Node(newEl);
         }
         if(newEl.getMissedLes()<current.student.getMissedLes()){
             current.left=insertNode(current.left,newEl);
             current=rotationR(current);
         }
         else {
             current.right=insertNode(current.right,newEl);
             current=rotationL(current);
         }
         return current;
     }

     private Node rotationR(Node current){
         Node temp=current.left;
         current.left=temp.right;
         temp.right=current;
         current=temp;
         return current;
     }

     private Node rotationL(Node current){
         Node temp=current.right;
         current.right=temp.left;
         temp.left=current;
         current=temp;
         return current;
     }

     public void find(int key){
         System.out.println("Element with key "+key);
         Node findN=findNode(root,key);
         if(findN==null){
             System.out.println("No elements");
         } else {
             System.out.println(findN.student.toString());
         }
     }

     private Node findNode(Node current, int key){
         if(current==null){
             return null;
         }
         if(current.student.getMissedLes()>key){
             current=findNode(current.left,key);
         } else if(current.student.getMissedLes()<key){
             current=findNode(current.right,key);
         } else return current;
         return current;
     }

     public void print(){
         inOrder(root);
     }

     private void inOrder(Node cur){
         if(cur==null){
             return;
         }
         inOrder(cur.left);
         System.out.println(cur.student.toString());
         inOrder(cur.right);
     }
}
