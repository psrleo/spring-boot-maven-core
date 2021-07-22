package com.core;

public class RecurrsiveFactorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recurrsive(4);
	}

	static int recurrsive(int num) {
		if (num == 0) {
			return 1;
		} else {
			return recurrsive(num, 1);
		}
	}

	static int recurrsive(int num, int sum) {
		if (num == 1) {
			System.out.println(sum);
			return sum;
		} else {
			return recurrsive(num - 1, num * sum);
		}
	}
}
