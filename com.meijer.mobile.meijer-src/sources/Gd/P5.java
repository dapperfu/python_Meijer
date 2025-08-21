package Gd;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class P5 implements Map, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private transient Q5 f11820a;

    /* renamed from: b, reason: collision with root package name */
    private transient Q5 f11821b;

    /* renamed from: c, reason: collision with root package name */
    private transient M4 f11822c;

    abstract M4 a();

    abstract Q5 d();

    abstract Q5 f();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    public static P5 c(Object obj, Object obj2) {
        C3683j3.a("optional-module-barcode", "com.google.android.gms.vision.barcode");
        return X5.h(1, new Object[]{"optional-module-barcode", "com.google.android.gms.vision.barcode"}, null);
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final M4 values() {
        M4 m42 = this.f11822c;
        if (m42 != null) {
            return m42;
        }
        M4 m4A = a();
        this.f11822c = m4A;
        return m4A;
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
    public final Q5 entrySet() {
        Q5 q52 = this.f11820a;
        if (q52 != null) {
            return q52;
        }
        Q5 q5D = d();
        this.f11820a = q5D;
        return q5D;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        Q5 q52 = this.f11821b;
        if (q52 != null) {
            return q52;
        }
        Q5 q5F = f();
        this.f11821b = q5F;
        return q5F;
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

    P5() {
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
        return C3623b.a(entrySet());
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
