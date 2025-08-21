package com.google.android.gms.internal.vision;

import java.util.Map;

/* loaded from: classes6.dex */
final class X1 implements Comparable, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    private final Comparable f85325a;

    /* renamed from: b, reason: collision with root package name */
    private Object f85326b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ S1 f85327c;

    X1(S1 s12, Map.Entry entry) {
        this(s12, (Comparable) entry.getKey(), entry.getValue());
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
        return a(this.f85325a, entry.getKey()) && a(this.f85326b, entry.getValue());
    }

    X1(S1 s12, Comparable comparable, Object obj) {
        this.f85327c = s12;
        this.f85325a = comparable;
        this.f85326b = obj;
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((X1) obj).getKey());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f85325a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f85326b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f85325a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f85326b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f85327c.v();
        Object obj2 = this.f85326b;
        this.f85326b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f85325a);
        String strValueOf2 = String.valueOf(this.f85326b);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append("=");
        sb2.append(strValueOf2);
        return sb2.toString();
    }
}
