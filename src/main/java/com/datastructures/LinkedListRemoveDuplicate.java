package com.datastructures;

import java.util.HashSet;

public class LinkedListRemoveDuplicate {
	public static void main(String[] args) {
		Chain input = new Chain();
		input.add(3).add(5).add(4).add(2).add(3).add(2).add(6).add(3).add(4);
		Chain output = removeDuplicate(input);
		for (Node node = output.head; node != null; node = node.next)
			System.out.print(node.value + "->");
		System.out.println();
	}

	private static Chain removeDuplicate(Chain input) {
		Chain output = new Chain();
		HashSet hashSet = new HashSet();
		for (Node node = input.head; node != null; node = node.next) {
			if (!hashSet.contains(node.value)) {
				hashSet.add(node.value);
				output.add(node.value);
			}
		}
		return output;
	}

	public static class Node {
		int value;
		Node next;

		public Node(int value) {
			this.value = value;
		}
	}

	private static class Chain {
		Node head;
		Node last;

		public Chain add(int value) {
			Node node = new Node(value);
			if (head == null) {
				head = node;
				last = node;
			} else {
				last.next = node;
				last = node;
			}
			return this;
		}
	}
}