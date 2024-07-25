package HashTable;

import java.util.Objects;

public class HashTable<K, V> {

    private class HashTableNode<K, V> {
        K key;
        V value;
        HashTableNode<K, V> next;

        public HashTableNode(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private HashTableNode<K, V>[] arrayChain;

    private int capacity = 11;
    private int size;
    private final double LOAD_FACTOR = 0.75;

    public HashTable() {
        arrayChain = new HashTableNode[capacity];
        size = 0;
    }

    private int hash(K key) {
        int hashCode = Objects.hashCode(key);
        hashCode ^= (hashCode >>> 20) ^ (hashCode >>> 12);
        hashCode ^= (hashCode >>> 7) ^ (hashCode >>> 4);
        return hashCode & (capacity - 1);
    }

    public void put(K key, V value) {
        if ((1.0 * size) / capacity >= LOAD_FACTOR) {
            resize();
        }
        int index = hash(key);
        HashTableNode<K, V> head = arrayChain[index];
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = arrayChain[index];
        HashTableNode<K, V> newNode = new HashTableNode<>(key, value);
        newNode.next = head;
        arrayChain[index] = newNode;
    }

    public V get(K key) {
        int index = hash(key);
        HashTableNode<K, V> head = arrayChain[index];
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public V remove(K key) {
        int index = hash(key);
        HashTableNode<K, V> head = arrayChain[index];
        HashTableNode<K, V> prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                if (prev != null) {
                    prev.next = head.next;
                } else {
                    arrayChain[index] = head.next;
                }
                size--;
                return head.value;
            }
            prev = head;
            head = head.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize() {
        int oldM = capacity;
        capacity = 2 * capacity;
        HashTableNode<K, V>[] oldChainArray = arrayChain;
        arrayChain = new HashTableNode[capacity];
        size = 0;

        for (int i = 0; i < oldM; i++) {
            HashTableNode<K, V> head = oldChainArray[i];
            while (head != null) {
                put(head.key, head.value);
                head = head.next;
            }
        }
    }

}
