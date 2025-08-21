package com.google.android.gms.internal.atv_ads_framework;

import java.util.Map;

/* loaded from: classes6.dex */
final class H1 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final Comparable f81665a;

    /* renamed from: b, reason: collision with root package name */
    private Object f81666b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ N1 f81667c;

    H1(N1 n12, Comparable comparable, Object obj) {
        this.f81667c = n12;
        this.f81665a = comparable;
        this.f81666b = obj;
    }

    public final Comparable a() {
        return this.f81665a;
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
        return b(this.f81665a, entry.getKey()) && b(this.f81666b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f81665a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f81666b;
    }

    private static final boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f81665a.compareTo(((H1) obj).f81665a);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f81665a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f81666b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f81667c.s();
        Object obj2 = this.f81666b;
        this.f81666b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f81665a) + "=" + String.valueOf(this.f81666b);
    }
}
