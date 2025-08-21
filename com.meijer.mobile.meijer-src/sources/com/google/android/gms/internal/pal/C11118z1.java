package com.google.android.gms.internal.pal;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.pal.z1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11118z1 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final Comparable f85086a;

    /* renamed from: b, reason: collision with root package name */
    private Object f85087b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ G1 f85088c;

    C11118z1(G1 g12, Comparable comparable, Object obj) {
        this.f85088c = g12;
        this.f85086a = comparable;
        this.f85087b = obj;
    }

    public final Comparable a() {
        return this.f85086a;
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
        return b(this.f85086a, entry.getKey()) && b(this.f85087b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f85086a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f85087b;
    }

    private static final boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f85086a.compareTo(((C11118z1) obj).f85086a);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f85086a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f85087b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f85088c.s();
        Object obj2 = this.f85087b;
        this.f85087b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f85086a) + "=" + String.valueOf(this.f85087b);
    }
}
