package Fd;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* renamed from: Fd.l0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3424l0 implements Map, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private transient AbstractC3436m0 f10178a;

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC3436m0 f10179b;

    /* renamed from: c, reason: collision with root package name */
    private transient AbstractC3340e0 f10180c;

    abstract AbstractC3340e0 a();

    abstract AbstractC3436m0 d();

    abstract AbstractC3436m0 f();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final boolean isEmpty() {
        return false;
    }

    public static AbstractC3424l0 c(Object obj, Object obj2) {
        N.b("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return D0.h(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC3340e0 values() {
        AbstractC3340e0 abstractC3340e0 = this.f10180c;
        if (abstractC3340e0 != null) {
            return abstractC3340e0;
        }
        AbstractC3340e0 abstractC3340e0A = a();
        this.f10180c = abstractC3340e0A;
        return abstractC3340e0A;
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
    public final AbstractC3436m0 entrySet() {
        AbstractC3436m0 abstractC3436m0 = this.f10178a;
        if (abstractC3436m0 != null) {
            return abstractC3436m0;
        }
        AbstractC3436m0 abstractC3436m0D = d();
        this.f10178a = abstractC3436m0D;
        return abstractC3436m0D;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        AbstractC3436m0 abstractC3436m0 = this.f10179b;
        if (abstractC3436m0 != null) {
            return abstractC3436m0;
        }
        AbstractC3436m0 abstractC3436m0F = f();
        this.f10179b = abstractC3436m0F;
        return abstractC3436m0F;
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

    AbstractC3424l0() {
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
        return F0.a(entrySet());
    }

    public final String toString() {
        int size = size();
        N.a(size, "size");
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
}
