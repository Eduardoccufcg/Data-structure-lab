package adt.VariationsStackandQueue;

import adt.queue.Queue;
import adt.queue.QueueDoubleLinkedListImpl;
import adt.queue.QueueOverflowException;
import adt.queue.QueueUnderflowException;

public class QueueWithTwoStack <T> implements Queue<T>{
	
	QueueDoubleLinkedListImpl<T> fila;
	QueueDoubleLinkedListImpl<T> aux;
	int top;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	public QueueWithTwoStack(int size) {
		
		this.fila = new QueueDoubleLinkedListImpl<T>(size);
		this.aux = new QueueDoubleLinkedListImpl<T>(size);
		this.top = -1;
		
	}



	@Override
	public void enqueue(T element) throws QueueOverflowException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T dequeue() throws QueueUnderflowException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T head() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

}
