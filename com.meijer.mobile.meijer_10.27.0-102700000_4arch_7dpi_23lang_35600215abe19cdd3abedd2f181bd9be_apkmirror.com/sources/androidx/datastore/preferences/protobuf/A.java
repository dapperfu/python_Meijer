package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class A extends B {

    /* renamed from: e, reason: collision with root package name */
    private final P f54140e;

    static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: a, reason: collision with root package name */
        private Map.Entry<K, A> f54141a;

        private b(Map.Entry<K, A> entry) {
            this.f54141a = entry;
        }

        public A a() {
            return this.f54141a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f54141a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            A value = this.f54141a.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof P) {
                return this.f54141a.getValue().d((P) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f54142a;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f54142a.next();
            return next.getValue() instanceof A ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f54142a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f54142a.remove();
        }

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f54142a = it;
        }
    }

    public P f() {
        return c(this.f54140e);
    }

    @Override // androidx.datastore.preferences.protobuf.B
    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.B
    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
