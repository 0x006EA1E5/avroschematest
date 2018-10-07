package me.geales.avro;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class EmbeddedList2 extends EmbeddedList implements List<Object>  {

    public EmbeddedList2(List<Object> list) {
        super(list);
    }

    private List<Object> getBackingList() {
        return super.getList();
    }

    @Override
    public int size() {
        return getBackingList().size();
    }

    @Override
    public boolean isEmpty() {
        return getBackingList().isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return getBackingList().contains(o);
    }

    @Override
    public Iterator<Object> iterator() {
        return getBackingList().iterator();
    }

    @Override
    public Object[] toArray() {
        return getBackingList().toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return getBackingList().toArray(a);
    }

    @Override
    public boolean add(Object o) {
        return getBackingList().add(o);
    }

    @Override
    public boolean remove(Object o) {
        return getBackingList().remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return getBackingList().containsAll(c);
    }

    @Override
    public boolean addAll(Collection<?> c) {
        return getBackingList().addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<?> c) {
        return getBackingList().addAll(index, c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return getBackingList().removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return getBackingList().retainAll(c);
    }

    @Override
    public void clear() {
        getBackingList().clear();
    }

//    @Override
//    public Object get(int index) {
//        return getBackingList().get(index);
//    }

    @Override
    public Object set(int index, Object element) {
        return getBackingList().set(index,element);
    }

    @Override
    public void add(int index, Object element) {
        getBackingList().add(index, element);
    }

    @Override
    public Object remove(int index) {
        return getBackingList().remove(index);
    }

    @Override
    public int indexOf(Object o) {
        return getBackingList().indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return getBackingList().lastIndexOf(o);
    }

    @Override
    public ListIterator<Object> listIterator() {
        return getBackingList().listIterator();
    }

    @Override
    public ListIterator<Object> listIterator(int index) {
        return getBackingList().listIterator(index);
    }

    @Override
    public List<Object> subList(int fromIndex, int toIndex) {
        return getBackingList().subList(fromIndex, toIndex);
    }

}
