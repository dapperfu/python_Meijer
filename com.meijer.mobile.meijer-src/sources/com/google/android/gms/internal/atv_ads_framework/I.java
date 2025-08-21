package com.google.android.gms.internal.atv_ads_framework;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class I implements Map, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private transient J f81668a;

    /* renamed from: b, reason: collision with root package name */
    private transient J f81669b;

    /* renamed from: c, reason: collision with root package name */
    private transient C f81670c;

    I() {
    }

    abstract C a();

    abstract J c();

    abstract J d();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C values() {
        C c10 = this.f81670c;
        if (c10 != null) {
            return c10;
        }
        C cA = a();
        this.f81670c = cA;
        return cA;
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
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final J entrySet() {
        J j10 = this.f81668a;
        if (j10 != null) {
            return j10;
        }
        J jC = c();
        this.f81668a = jC;
        return jC;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        J j10 = this.f81669b;
        if (j10 != null) {
            return j10;
        }
        J jD = d();
        this.f81669b = jD;
        return jD;
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
        return U.a(entrySet());
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
