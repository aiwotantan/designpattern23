package com.tantan.jvm.designpattern.composite;

/**
 * 
 * Description:组合模式
 * 
 * 合模式有时又叫部分-整体模式在处理类似树形结构的问题时比较方便，看看关系图：
 * 
 * 
 * 树形结构 二叉树结构 数据队列
 * 
 */
public class Test {

	public static void main(String[] args) {
		
		Tree tree = new Tree("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");

		nodeB.add(nodeC);
		tree.root.add(nodeB);
		System.out.println("build the tree finished!");

	}
}
