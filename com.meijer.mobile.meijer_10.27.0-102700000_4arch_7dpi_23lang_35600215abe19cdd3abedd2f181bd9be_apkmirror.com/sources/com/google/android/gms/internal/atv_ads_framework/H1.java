package com.google.android.gms.internal.atv_ads_framework;

import java.util.Map;

/* loaded from: classes6.dex */
final class H1 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final Comparable f80825a;

    /* renamed from: b, reason: collision with root package name */
    private Object f80826b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ N1 f80827c;

    H1(N1 n12, Comparable comparable, Object obj) {
        this.f80827c = n12;
        this.f80825a = comparable;
        this.f80826b = obj;
    }

    public final Comparable a() {
        return this.f80825a;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return b(this.f80825a, entry.getKey()) && b(this.f80826b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f80825a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f80826b;
    }

    private static final boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f80825a.compareTo(((H1) obj).f80825a);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f80825a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f80826b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f80827c.s();
        Object obj2 = this.f80826b;
        this.f80826b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f80825a) + "=" + String.valueOf(this.f80826b);
    }
}
