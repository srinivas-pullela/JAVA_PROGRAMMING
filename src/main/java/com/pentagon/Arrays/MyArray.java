package com.pentagon.Arrays;

public class MyArray<T> {
	T[] arr;
	int index;

	public void add(Object o) {
		if (arr == null) {
			arr = (T[]) new Object[5];
			arr[index++] = (T) o;
		} else if (index == arr.length)
			resize();
		else if (index < arr.length) {
			arr[index++] = (T) o;
		}
	}

	private void resize() {
		T[] res = (T[]) new Object[arr.length * 2];
		for (int i = 0; i < arr.length; i++) {
			res[i] = arr[i];
		}
		arr = res;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < index - 1; i++) {
			sb.append(arr[i] + ", ");
		}
		sb.append(arr[index - 1] + "]");
		return sb.toString();
	}

	// Only int values to accept in the array
	public void addInt(int i) {
		if (arr == null) {
			arr = (T[]) new Object[5];
			arr[index++] = (T) Integer.valueOf(i);
		} else if (index == arr.length)
			resize();
		else if (index < arr.length) {
			arr[index++] = (T) Integer.valueOf(i);
		}
	}

	// size of array
	public int size() {
		return arr.length;
	}

	// remove element from array at particular index
	public void remove(int index) {
		if (index < 0 || index >= this.index) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.index);
		}
		for (int i = index; i < this.index - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[--this.index] = null;
	}

	// remove all elements from array using boolean datatype
	public boolean clear() {
		for (int i = 0; i < index; i++) {
			arr[i] = null;
		}
		index = 0;
		return true;
	}

	// remove element from array
	public void removeElement(T element) {
		for (int i = 0; i < index; i++) {
			if (arr[i].equals(element)) {
				remove(i);
				return;
			}
		}
	}
	
	//add all elements from another array at particular index
	public void addAll(int index, T[] elements) {
		if (index < 0 || index > this.index) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + this.index);
		}
		if (elements == null || elements.length == 0) {
			return;
		}
		while (this.index + elements.length > arr.length) {
			resize();
		}
		for (int i = this.index - 1; i >= index; i--) {
			arr[i + elements.length] = arr[i];
		}
		for (int i = 0; i < elements.length; i++) {
			arr[index + i] = elements[i];
		}
		this.index += elements.length;
	}

}
