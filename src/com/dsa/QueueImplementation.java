package com.dsa;

class QueueUsingArray {
	int front_q, rear_q, capacityOfQueue;
	static int[] q1;

	QueueUsingArray(int size) {
		capacityOfQueue = size;
		q1 = new int[capacityOfQueue];
	}

	void enqueue(int value) {
		if (rear_q == capacityOfQueue) {
			System.out.println("Queue is full");
		} else {
			q1[rear_q] = value;
			rear_q++;
		}
	}

	void dequeue() {
		if (rear_q == 0) {
			System.out.println("Queue is empty");
		}
		for (int i = 0; i < rear_q - 1; i++) {
			q1[i] = q1[i + 1];
		}
		rear_q--;
	}

	void display() {
		if (rear_q == 0) {
			System.out.println("Queue is empty");
		} else {
			for (int i = 0; i < rear_q; i++) {
				System.out.print(q1[i] + " ");
			}
		}
	}
}

public class QueueImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Enqueue
//		Dequeue
//		size
//		display
//		isEmpty
		QueueUsingArray queue = new QueueUsingArray(5);
		queue.enqueue(67);
		queue.enqueue(37);
		queue.enqueue(88);
		queue.enqueue(12);
		queue.display();
		System.out.println();
		queue.dequeue();
		queue.display();
	}

}
