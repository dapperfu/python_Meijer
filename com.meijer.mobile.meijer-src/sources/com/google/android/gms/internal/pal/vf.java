package com.google.android.gms.internal.pal;

import java.util.Map;

/* loaded from: classes6.dex */
final class vf implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    vf f84995a;

    /* renamed from: b, reason: collision with root package name */
    vf f84996b;

    /* renamed from: c, reason: collision with root package name */
    vf f84997c;

    /* renamed from: d, reason: collision with root package name */
    vf f84998d;

    /* renamed from: e, reason: collision with root package name */
    vf f84999e;

    /* renamed from: f, reason: collision with root package name */
    final Object f85000f;

    /* renamed from: g, reason: collision with root package name */
    Object f85001g;

    /* renamed from: h, reason: collision with root package name */
    int f85002h;

    vf() {
        this.f85000f = null;
        this.f84999e = this;
        this.f84998d = this;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f85000f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f85001g;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f85001g;
        this.f85001g = obj;
        return obj2;
    }

    vf(vf vfVar, Object obj, vf vfVar2, vf vfVar3) {
        this.f84995a = vfVar;
        this.f85000f = obj;
        this.f85002h = 1;
        this.f84998d = vfVar2;
        this.f84999e = vfVar3;
        vfVar3.f84998d = this;
        vfVar2.f84999e = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f85000f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f85001g;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f85000f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f85001g;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return this.f85000f + "=" + this.f85001g;
    }
}
