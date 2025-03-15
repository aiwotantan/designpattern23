package com.tantan.jvm.designpattern.composite;

//树：表头
public class Tree {

	TreeNode root = null;

	public Tree(String name) {
		root = new TreeNode(name);
	}

}
