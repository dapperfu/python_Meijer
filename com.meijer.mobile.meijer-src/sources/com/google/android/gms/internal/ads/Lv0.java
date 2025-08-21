package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes6.dex */
final class Lv0 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final Comparable f69292a;

    /* renamed from: b, reason: collision with root package name */
    private Object f69293b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Rv0 f69294c;

    Lv0(Rv0 rv0, Comparable comparable, Object obj) {
        this.f69294c = rv0;
        this.f69292a = comparable;
        this.f69293b = obj;
    }

    public final Comparable a() {
        return this.f69292a;
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
        return b(this.f69292a, entry.getKey()) && b(this.f69293b, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f69292a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f69293b;
    }

    private static final boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f69292a.compareTo(((Lv0) obj).f69292a);
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f69292a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f69293b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f69294c.t();
        Object obj2 = this.f69293b;
        this.f69293b = obj;
        return obj2;
    }

    public final String toString() {
        return String.valueOf(this.f69292a) + "=" + String.valueOf(this.f69293b);
    }
}
