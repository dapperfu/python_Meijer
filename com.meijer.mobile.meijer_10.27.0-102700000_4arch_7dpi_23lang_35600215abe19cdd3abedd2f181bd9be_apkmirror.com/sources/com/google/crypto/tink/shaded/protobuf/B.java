package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public class B extends C {

    /* renamed from: e, reason: collision with root package name */
    private final Q f88255e;

    static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: a, reason: collision with root package name */
        private Map.Entry<K, B> f88256a;

        private b(Map.Entry<K, B> entry) {
            this.f88256a = entry;
        }

        public B a() {
            return this.f88256a.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f88256a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            B value = this.f88256a.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof Q) {
                return this.f88256a.getValue().d((Q) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f88257a;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f88257a.next();
            return next.getValue() instanceof B ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f88257a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f88257a.remove();
        }

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f88257a = it;
        }
    }

    public Q f() {
        return c(this.f88255e);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C
    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.C
    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
