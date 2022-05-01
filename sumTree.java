package com.greatlearning.app;

import java.util.HashSet;

public class sumTree {
	static class Node{
		int data;
		Node left;
		Node right;
		
		Node(int data){
			this.data=data;
			left= null;
			right=null;
			
		}
	
	}

	//Inorder traversal function
	
	static boolean treeTraversal(Node node, int sum, HashSet<Integer> set)
	{
		if (node == null)
            return false;
 
		if (treeTraversal(node.left, sum, set)) {
			return true;
		}
		
		if (set.contains(sum-node.data)) {
			System.out.println("Pair Exists - Sum found");
			return true;
		}
		else {
			
			set.add(node.data);
		}
		
		set.add(node.data);
		
		
       // System.out.print(node.data + " ");
        
        if (treeTraversal(node.right, sum, set)) {
        	return true;
        }
        
        return false;
	}

	
	public static void main(String args[]){
		
		HashSet<Integer> iteration = new HashSet<Integer>();
		
		//int sum to find out the pair
		
		int sum=60;
		
		Node root = new Node(40);
		
		Node left= new Node(20);		
		left.left= new Node(10);
		left.right= new Node(30);
		
		Node right=new Node(60);		
		right.left= new Node(50);
		right.right= new Node(70);
		
		
		//setting the left and right of root node
		root.left= left;
		root.right=right;
		
		boolean binarySearch =treeTraversal(root,sum, iteration);
		
		if (binarySearch == false)
		{
			System.out.println("Pair Does not Exist -Sum not found");
		}
	}
	

}
