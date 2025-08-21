package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes14.dex */
public class LazyField extends LazyFieldLite {

    /* renamed from: e, reason: collision with root package name */
    private final MessageLite f146784e;

    static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: a, reason: collision with root package name */
        private Map.Entry<K, LazyField> f146785a;

        private b(Map.Entry<K, LazyField> entry) {
            this.f146785a = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f146785a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            LazyField value = this.f146785a.getValue();
            if (value == null) {
                return null;
            }
            return value.e();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof MessageLite) {
                return this.f146785a.getValue().d((MessageLite) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f146786a;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f146786a.next();
            return next.getValue() instanceof LazyField ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f146786a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f146786a.remove();
        }

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f146786a = it;
        }
    }

    public MessageLite e() {
        return c(this.f146784e);
    }

    public boolean equals(Object obj) {
        return e().equals(obj);
    }

    public int hashCode() {
        return e().hashCode();
    }

    public String toString() {
        return e().toString();
    }
}
