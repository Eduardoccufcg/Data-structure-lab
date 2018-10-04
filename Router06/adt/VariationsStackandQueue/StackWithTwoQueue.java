package adt.VariationsStackandQueue;

import adt.queue.QueueDoubleLinkedListImpl;
import adt.queue.QueueOverflowException;
import adt.queue.QueueUnderflowException;
import adt.stack.Stack;
import adt.stack.StackOverflowException;
import adt.stack.StackUnderflowException;

public class StackWithTwoQueue<T> implements Stack<T> {

	QueueDoubleLinkedListImpl<T> fila;
	QueueDoubleLinkedListImpl<T> aux;
	
	public static void main(String[] args) throws StackOverflowException, StackUnderflowException {
		StackWithTwoQueue<Integer> pilha = new StackWithTwoQueue<Integer>(5);

		System.out.println(pilha.top());

	}

	public StackWithTwoQueue(int size) {

		this.fila = new QueueDoubleLinkedListImpl<T>(size);
		this.aux = new QueueDoubleLinkedListImpl<T>(size);
		

	}

	@Override
	public void push(T element) throws StackOverflowException {
		if (!isFull()) {
			try {
				while (!fila.isEmpty()) {
					aux.enqueue(fila.dequeue());
				}
				fila.enqueue(element);
				while (!aux.isEmpty()) {
					fila.enqueue(aux.dequeue());
				}

			} catch (QueueOverflowException | QueueUnderflowException e) {
				e.printStackTrace();
			}

		} else {
			throw new StackOverflowException();
		}

	}

	@Override
	public T pop() throws StackUnderflowException {
		if (!isEmpty()) {
			T element = fila.head();
			try {
				fila.dequeue();
			} catch (QueueUnderflowException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return element;
		} else {
			throw new StackUnderflowException();
		}

	}

	@Override
	public T top() {
		T top = null;
		if (!isEmpty()) {
			top = fila.head();
		}
		return top;
	}

	@Override
	public boolean isEmpty() {
		return this.fila.isEmpty();
	}

	@Override
	public boolean isFull() {
		return this.fila.isFull();
	}

}
