package com.google.android.gms.internal.clearcut;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.k1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10434k1 implements Comparable, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    private final Comparable f82345a;

    /* renamed from: b, reason: collision with root package name */
    private Object f82346b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C10413d1 f82347c;

    C10434k1(C10413d1 c10413d1, Comparable comparable, Object obj) {
        this.f82347c = c10413d1;
        this.f82345a = comparable;
        this.f82346b = obj;
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C10434k1) obj).getKey());
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
        return a(this.f82345a, entry.getKey()) && a(this.f82346b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f82345a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f82346b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f82345a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f82346b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f82347c.t();
        Object obj2 = this.f82346b;
        this.f82346b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f82345a);
        String strValueOf2 = String.valueOf(this.f82346b);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append("=");
        sb2.append(strValueOf2);
        return sb2.toString();
    }

    C10434k1(C10413d1 c10413d1, Map.Entry entry) {
        this(c10413d1, (Comparable) entry.getKey(), entry.getValue());
    }
}
