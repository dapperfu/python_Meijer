package com.google.android.gms.internal.pal;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.pal.z1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10993z1 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final Comparable f84246a;

    /* renamed from: b, reason: collision with root package name */
    private Object f84247b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ G1 f84248c;

    C10993z1(G1 g12, Comparable comparable, Object obj) {
        this.f84248c = g12;
        this.f84246a = comparable;
        this.f84247b = obj;
    }

    public final Comparable a() {
        return this.f84246a;
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
        return b(this.f84246a, entry.getKey()) && b(this.f84247b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f84246a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f84247b;
    }

    private static final boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f84246a.compareTo(((C10993z1) obj).f84246a);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f84246a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f84247b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f84248c.s();
        Object obj2 = this.f84247b;
        this.f84247b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f84246a) + "=" + String.valueOf(this.f84247b);
    }
}
