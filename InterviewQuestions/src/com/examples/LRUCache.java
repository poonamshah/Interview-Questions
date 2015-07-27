package com.examples;

import java.util.concurrent.ConcurrentHashMap;
//Case 1 : find if key is duplicate remove from queue and add in beginning
// Case 2 : If cache is full remove old elements from map and queue
// Case 3 : add elements in map and queueu
import java.util.concurrent.ConcurrentLinkedQueue;

public class LRUCache<K, V> {

	int capacity;
	private ConcurrentHashMap<K, V> map;
	private ConcurrentLinkedQueue<K> queue;

	public void LRU(int capacity) {
		capacity = this.capacity;
		this.map = new ConcurrentHashMap<K, V>();
		this.queue = new ConcurrentLinkedQueue<K>();

	}

	public V getKey(final K key) {
		return map.get(key);
	}

	public synchronized void put(final K key, final V value) {
		if (key == null || value == null) {
			throw new NullPointerException();
		}
		// case 1
		if (map.contains(key)) {
			queue.remove(key);
		}

		// case 2
		while (queue.size() > capacity) {

			K expiredKey = queue.poll();
			if (expiredKey != null) {
				map.remove(expiredKey);
			}

		}
		// case 3
		queue.add(key);
		map.put(key, value);
	}
}
