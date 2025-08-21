package Ed;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* renamed from: Ed.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3194i implements Map, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private transient AbstractC3195j f7122a;

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC3195j f7123b;

    /* renamed from: c, reason: collision with root package name */
    private transient AbstractC3188c f7124c;

    abstract AbstractC3188c a();

    abstract AbstractC3195j d();

    abstract AbstractC3195j f();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    public static AbstractC3194i c(Object obj, Object obj2) {
        b0.a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return C3202q.h(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC3188c values() {
        AbstractC3188c abstractC3188c = this.f7124c;
        if (abstractC3188c != null) {
            return abstractC3188c;
        }
        AbstractC3188c abstractC3188cA = a();
        this.f7124c = abstractC3188cA;
        return abstractC3188cA;
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
    public final AbstractC3195j entrySet() {
        AbstractC3195j abstractC3195j = this.f7122a;
        if (abstractC3195j != null) {
            return abstractC3195j;
        }
        AbstractC3195j abstractC3195jD = d();
        this.f7122a = abstractC3195jD;
        return abstractC3195jD;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC3195j abstractC3195j = this.f7123b;
        if (abstractC3195j != null) {
            return abstractC3195j;
        }
        AbstractC3195j abstractC3195jF = f();
        this.f7123b = abstractC3195jF;
        return abstractC3195jF;
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

    AbstractC3194i() {
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
