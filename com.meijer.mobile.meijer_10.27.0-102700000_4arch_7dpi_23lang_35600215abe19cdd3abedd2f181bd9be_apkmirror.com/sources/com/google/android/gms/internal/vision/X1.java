package com.google.android.gms.internal.vision;

import java.util.Map;

/* loaded from: classes6.dex */
final class X1 implements Comparable, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    private final Comparable f84485a;

    /* renamed from: b, reason: collision with root package name */
    private Object f84486b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ S1 f84487c;

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
        return a(this.f84485a, entry.getKey()) && a(this.f84486b, entry.getValue());
    }

    X1(S1 s12, Comparable comparable, Object obj) {
        this.f84487c = s12;
        this.f84485a = comparable;
        this.f84486b = obj;
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
        return this.f84485a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f84486b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f84485a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f84486b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f84487c.w();
        Object obj2 = this.f84486b;
        this.f84486b = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f84485a);
        String strValueOf2 = String.valueOf(this.f84486b);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length());
        sb2.append(strValueOf);
        sb2.append("=");
        sb2.append(strValueOf2);
        return sb2.toString();
    }
}
