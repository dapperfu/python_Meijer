package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.hh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8363hh0 implements Map, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private transient AbstractC8575jh0 f75609a;

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC8575jh0 f75610b;

    /* renamed from: c, reason: collision with root package name */
    private transient AbstractC7526Zg0 f75611c;

    AbstractC8363hh0() {
    }

    public static AbstractC8363hh0 d() {
        return Vh0.f71743g;
    }

    abstract AbstractC7526Zg0 a();

    abstract AbstractC8575jh0 g();

    @Override // java.util.Map
    public abstract Object get(Object obj);

    abstract AbstractC8575jh0 h();

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public static AbstractC8363hh0 f(Object obj, Object obj2) {
        C6682Ag0.b("dialog_not_shown_reason", obj2);
        return Vh0.k(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC7526Zg0 values() {
        AbstractC7526Zg0 abstractC7526Zg0 = this.f75611c;
        if (abstractC7526Zg0 != null) {
            return abstractC7526Zg0;
        }
        AbstractC7526Zg0 abstractC7526Zg0A = a();
        this.f75611c = abstractC7526Zg0A;
        return abstractC7526Zg0A;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final AbstractC8575jh0 entrySet() {
        AbstractC8575jh0 abstractC8575jh0 = this.f75609a;
        if (abstractC8575jh0 != null) {
            return abstractC8575jh0;
        }
        AbstractC8575jh0 abstractC8575jh0G = g();
        this.f75609a = abstractC8575jh0G;
        return abstractC8575jh0G;
    }

    @Override // java.util.Map
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final AbstractC8575jh0 keySet() {
        AbstractC8575jh0 abstractC8575jh0 = this.f75610b;
        if (abstractC8575jh0 != null) {
            return abstractC8575jh0;
        }
        AbstractC8575jh0 abstractC8575jh0H = h();
        this.f75610b = abstractC8575jh0H;
        return abstractC8575jh0H;
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

    public static AbstractC8363hh0 c(Map map) {
        int size;
        Set setEntrySet = map.entrySet();
        if (setEntrySet instanceof Collection) {
            size = setEntrySet.size();
        } else {
            size = 4;
        }
        C8256gh0 c8256gh0 = new C8256gh0(size);
        c8256gh0.b(setEntrySet);
        return c8256gh0.c();
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
    public final boolean equals(Object obj) {
        return C6718Bh0.b(this, obj);
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
        return C8258gi0.a(entrySet());
    }

    public final String toString() {
        int size = size();
        C6682Ag0.a(size, "size");
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
