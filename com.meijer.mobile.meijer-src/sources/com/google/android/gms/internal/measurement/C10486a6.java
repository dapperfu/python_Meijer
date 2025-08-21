package com.google.android.gms.internal.measurement;

import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.a6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10486a6 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final Comparable f82961a;

    /* renamed from: b, reason: collision with root package name */
    private Object f82962b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C10513d6 f82963c;

    public final Comparable a() {
        return this.f82961a;
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
        return b(this.f82961a, entry.getKey()) && b(this.f82962b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f82961a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f82962b;
    }

    private static final boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f82961a.compareTo(((C10486a6) obj).f82961a);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f82961a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f82962b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f82963c.i();
        Object obj2 = this.f82962b;
        this.f82962b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f82961a);
        String strValueOf2 = String.valueOf(this.f82962b);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append("=");
        sb2.append(strValueOf2);
        return sb2.toString();
    }

    C10486a6(C10513d6 c10513d6, Comparable comparable, Object obj) {
        Objects.requireNonNull(c10513d6);
        this.f82963c = c10513d6;
        this.f82961a = comparable;
        this.f82962b = obj;
    }
}
