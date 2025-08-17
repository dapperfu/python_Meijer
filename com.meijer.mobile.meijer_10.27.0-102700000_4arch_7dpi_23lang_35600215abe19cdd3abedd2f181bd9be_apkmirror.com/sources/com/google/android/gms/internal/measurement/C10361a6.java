package com.google.android.gms.internal.measurement;

import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.a6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10361a6 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final Comparable f82121a;

    /* renamed from: b, reason: collision with root package name */
    private Object f82122b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C10388d6 f82123c;

    public final Comparable a() {
        return this.f82121a;
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
        return b(this.f82121a, entry.getKey()) && b(this.f82122b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f82121a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f82122b;
    }

    private static final boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f82121a.compareTo(((C10361a6) obj).f82121a);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f82121a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f82122b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f82123c.i();
        Object obj2 = this.f82122b;
        this.f82122b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f82121a);
        String strValueOf2 = String.valueOf(this.f82122b);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append("=");
        sb2.append(strValueOf2);
        return sb2.toString();
    }

    C10361a6(C10388d6 c10388d6, Comparable comparable, Object obj) {
        Objects.requireNonNull(c10388d6);
        this.f82123c = c10388d6;
        this.f82121a = comparable;
        this.f82122b = obj;
    }
}
