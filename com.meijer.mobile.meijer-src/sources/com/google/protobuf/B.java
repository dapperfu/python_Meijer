package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes8.dex */
public class B extends C {

    /* renamed from: f, reason: collision with root package name */
    private final P f91252f;

    static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: a, reason: collision with root package name */
        private Map.Entry<K, B> f91253a;

        private b(Map.Entry<K, B> entry) {
            this.f91253a = entry;
        }

        public B a() {
            return this.f91253a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f91253a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            B value = this.f91253a.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof P) {
                return this.f91253a.getValue().d((P) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f91254a;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f91254a.next();
            return next.getValue() instanceof B ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f91254a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f91254a.remove();
        }

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f91254a = it;
        }
    }

    public P f() {
        return c(this.f91252f);
    }

    @Override // com.google.protobuf.C
    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    @Override // com.google.protobuf.C
    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
