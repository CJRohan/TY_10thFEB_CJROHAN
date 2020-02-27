package com.ty.collections;

public class CustomStringList {
	
	private String[] list;
	private int bufferLength;
	private int capacity;
	private int pointer;

	public CustomStringList(int size) {
		bufferLength = size;
		capacity = size;
		list = new String[bufferLength];		
	}
	
	public CustomStringList() {
		this(10);
	}
	
	public int size() {
		return pointer;
	}
	
	private void increaseCapacity() {
		capacity += bufferLength;
		String[] list1 = new String[capacity];
		System.arraycopy(list, 0, list1, 0, pointer);	
		list = list1;	
	}
	
	public void add(String string) {
		if (pointer == capacity)
			increaseCapacity();
        list[pointer++] = string;
	}
	
	public void add(int index, String string) {
		if (pointer == capacity)
			increaseCapacity();
		System.arraycopy(list, index, list, index+1, pointer-index);
        list[index] = string;
        pointer++;
	}
	
	public String get(int index) {
		return list[index];
	}
	
	public int getIndex(String string) {
		for (int i = 0; i < pointer; i++) {
			if (list[i].equals(string))
				return i;
		}
		return -1;
	}
	
	public String remove() {
		String string = list[--pointer];
		list[pointer] = null;
		return string;
	}
	
	public String remove(int index) {
		String string = list[index];
		System.arraycopy(list, index+1, list, index, pointer-index-1);
		return string;
	}
	
	public int remove(String string) {
		int index = getIndex(string);
		System.arraycopy(list, index+1, list, index, pointer-index-1);
		return index;
	}
	
	@Override
	public String toString() {
		String string = "[";
		for (int i = 0; i < pointer; i++) {
			if (i < pointer-1)
				string += list[i] + ", ";
			else
				string += list[i] + "]";
		}
		return string;
	}
	
}
