package com.google.android.gms.internal.pal;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class J6 implements Map, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private transient K6 f82685a;

    /* renamed from: b, reason: collision with root package name */
    private transient K6 f82686b;

    /* renamed from: c, reason: collision with root package name */
    private transient C6 f82687c;

    J6() {
    }

    public static J6 c() {
        return Q6.f82842g;
    }

    abstract C6 a();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    abstract K6 h();

    abstract K6 i();

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C6 values() {
        C6 c62 = this.f82687c;
        if (c62 != null) {
            return c62;
        }
        C6 c6A = a();
        this.f82687c = c6A;
        return c6A;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final K6 entrySet() {
        K6 k62 = this.f82685a;
        if (k62 != null) {
            return k62;
        }
        K6 k6H = h();
        this.f82685a = k6H;
        return k6H;
    }

    @Override // java.util.Map
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final K6 keySet() {
        K6 k62 = this.f82686b;
        if (k62 != null) {
            return k62;
        }
        K6 k6I = i();
        this.f82686b = k6I;
        return k6I;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public static J6 d(Object obj, Object obj2) {
        A6.a(obj, obj2);
        return Q6.n(1, new Object[]{obj, obj2}, null);
    }

    public static J6 f(Object obj, Object obj2, Object obj3, Object obj4) {
        A6.a(obj, obj2);
        A6.a(obj3, obj4);
        return Q6.n(2, new Object[]{obj, obj2, obj3, obj4}, null);
    }

    public static J6 g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        A6.a(obj, obj2);
        A6.a(obj3, obj4);
        A6.a(obj5, obj6);
        return Q6.n(3, new Object[]{obj, obj2, obj3, obj4, obj5, obj6}, null);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        if (obj3 != null) {
            return obj3;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return R6.a(entrySet());
    }

    public final String toString() {
        int size = size();
        if (size >= 0) {
            StringBuilder sb2 = new StringBuilder((int) Math.min(size * 8, 1073741824L));
            sb2.append('{');
            boolean z10 = true;
            for (Map.Entry entry : entrySet()) {
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append(entry.getKey());
                sb2.append('=');
                sb2.append(entry.getValue());
                z10 = false;
            }
            sb2.append('}');
            return sb2.toString();
        }
        throw new IllegalArgumentException("size cannot be negative but was: " + size);
    }
}
