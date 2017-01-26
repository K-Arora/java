                https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html

java.util
Class PriorityQueue<E>

java.lang.Object
java.util.AbstractCollection<E>
java.util.AbstractQueue<E>
java.util.PriorityQueue<E>

Type Parameters:
E - the type of elements held in this collection

All Implemented Interfaces:
Serializable, Iterable<E>, Collection<E>, Queue<E>

public class PriorityQueue<E>
extends AbstractQueue<E>
implements Serializable


* An unbounded priority queue based on a priority heap. The elements of the priority queue are ordered according to their natural 
ordering, or by a Comparator provided at queue construction time, depending on which constructor is used. A priority queue does not      permit null elements. A priority queue relying on natural ordering also does not permit insertion of non-comparable objects (doing so     may result in ClassCastException).

The head of this queue is the least element with respect to the specified ordering. If multiple elements are tied for least value,
the head is one of those elements -- ties are broken arbitrarily. The queue retrieval operations poll, remove, peek, and element access
the element at the head of the queue.

A priority queue is unbounded, but has an internal capacity governing the size of an array used to store the elements on the queue.
  It is always at least as large as the queue size. As elements are added to a priority queue, its capacity grows automatically.
  The details of the growth policy are not specified.

This class and its iterator implement all of the optional methods of the Collection and Iterator interfaces. 
  The Iterator provided in method iterator() is not guaranteed to traverse the elements of the priority queue in any particular order.
  If you need ordered traversal, consider using Arrays.sort(pq.toArray() ).

Note: that this implementation is not synchronized. Multiple threads should not access a PriorityQueue instance concurrently
  if any of the threads modifies the queue. Instead, use the thread-safe PriorityBlockingQueue class.

Implementation note: this implementation provides O(log(n)) time for the enqueing and dequeing methods (offer, poll, remove() and add);
linear time for the remove(Object) and contains(Object) methods; and constant time for the retrieval methods (peek, element, and size).

This class is a member of the Java Collections Framework.


Methods inherited from class java.util.AbstractQueue
addAll, element, remove


Methods inherited from class java.util.AbstractCollection
containsAll, isEmpty, removeAll, retainAll, toString


Methods inherited from class java.lang.Object
clone, equals, finalize, getClass, hashCode, notify, notifyAll, wait, wait, wait


Methods inherited from interface java.util.Collection
containsAll, equals, hashCode, isEmpty, removeAll, retainAll
