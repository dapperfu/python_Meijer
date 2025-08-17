package com.google.android.gms.internal.clearcut;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.k1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10309k1 implements Comparable, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    private final Comparable f81505a;

    /* renamed from: b, reason: collision with root package name */
    private Object f81506b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C10288d1 f81507c;

    C10309k1(C10288d1 c10288d1, Comparable comparable, Object obj) {
        this.f81507c = c10288d1;
        this.f81505a = comparable;
        this.f81506b = obj;
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C10309k1) obj).getKey());
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
        return a(this.f81505a, entry.getKey()) && a(this.f81506b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f81505a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f81506b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f81505a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f81506b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f81507c.v();
        Object obj2 = this.f81506b;
        this.f81506b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f81505a);
        String strValueOf2 = String.valueOf(this.f81506b);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append("=");
        sb2.append(strValueOf2);
        return sb2.toString();
    }

    C10309k1(C10288d1 c10288d1, Map.Entry entry) {
        this(c10288d1, (Comparable) entry.getKey(), entry.getValue());
    }
}
