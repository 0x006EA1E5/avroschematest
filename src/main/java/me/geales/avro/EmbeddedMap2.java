package me.geales.avro;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class EmbeddedMap2 extends EmbeddedMap implements Map<CharSequence, Object> {

    public EmbeddedMap2(Map<CharSequence, Object> map) {
        super(map);
    }

    private Map<CharSequence, Object> getBackingMap() {
        return super.getMap();
    }
    
    @Override
    public int size() {
        return getBackingMap().size();
    }

    @Override
    public boolean isEmpty() {
        return getBackingMap().isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return getBackingMap().containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return getBackingMap().containsValue(value);
    }

    @Override
    public Object get(Object key) {
        return getBackingMap().get(key);
    }

    @Override
    public Object put(CharSequence key, Object value) {
        return getBackingMap().put(key, value);
    }

    @Override
    public Object remove(Object key) {
        return getBackingMap().remove(key);
    }

    @Override
    public void putAll(Map<? extends CharSequence, ?> m) {
        getBackingMap().putAll(m);
    }

    @Override
    public void clear() {
        getBackingMap().clear();
    }

    @Override
    public Set<CharSequence> keySet() {
        return getBackingMap().keySet();
    }

    @Override
    public Collection<Object> values() {
        return getBackingMap().values();
    }

    @Override
    public Set<Entry<CharSequence, Object>> entrySet() {
        return getBackingMap().entrySet();
    }

}
