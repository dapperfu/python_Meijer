package Cd;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* renamed from: Cd.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC2991i implements Map, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private transient AbstractC2992j f3810a;

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC2992j f3811b;

    /* renamed from: c, reason: collision with root package name */
    private transient AbstractC2985c f3812c;

    abstract AbstractC2985c a();

    abstract AbstractC2992j d();

    abstract AbstractC2992j f();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    public static AbstractC2991i c(Object obj, Object obj2) {
        b0.a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return C2999q.h(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC2985c values() {
        AbstractC2985c abstractC2985c = this.f3812c;
        if (abstractC2985c != null) {
            return abstractC2985c;
        }
        AbstractC2985c abstractC2985cA = a();
        this.f3812c = abstractC2985cA;
        return abstractC2985cA;
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
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final AbstractC2992j entrySet() {
        AbstractC2992j abstractC2992j = this.f3810a;
        if (abstractC2992j != null) {
            return abstractC2992j;
        }
        AbstractC2992j abstractC2992jD = d();
        this.f3810a = abstractC2992jD;
        return abstractC2992jD;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC2992j abstractC2992j = this.f3811b;
        if (abstractC2992j != null) {
            return abstractC2992j;
        }
        AbstractC2992j abstractC2992jF = f();
        this.f3811b = abstractC2992jF;
        return abstractC2992jF;
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

    AbstractC2991i() {
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
        return r.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
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
