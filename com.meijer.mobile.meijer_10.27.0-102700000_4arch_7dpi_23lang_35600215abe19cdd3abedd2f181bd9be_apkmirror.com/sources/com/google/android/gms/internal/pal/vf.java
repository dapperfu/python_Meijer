package com.google.android.gms.internal.pal;

import java.util.Map;

/* loaded from: classes6.dex */
final class vf implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    vf f84155a;

    /* renamed from: b, reason: collision with root package name */
    vf f84156b;

    /* renamed from: c, reason: collision with root package name */
    vf f84157c;

    /* renamed from: d, reason: collision with root package name */
    vf f84158d;

    /* renamed from: e, reason: collision with root package name */
    vf f84159e;

    /* renamed from: f, reason: collision with root package name */
    final Object f84160f;

    /* renamed from: g, reason: collision with root package name */
    Object f84161g;

    /* renamed from: h, reason: collision with root package name */
    int f84162h;

    vf() {
        this.f84160f = null;
        this.f84159e = this;
        this.f84158d = this;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f84160f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f84161g;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f84161g;
        this.f84161g = obj;
        return obj2;
    }

    vf(vf vfVar, Object obj, vf vfVar2, vf vfVar3) {
        this.f84155a = vfVar;
        this.f84160f = obj;
        this.f84162h = 1;
        this.f84158d = vfVar2;
        this.f84159e = vfVar3;
        vfVar3.f84158d = this;
        vfVar2.f84159e = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.f84160f;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.f84161g;
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
        Object obj = this.f84160f;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f84161g;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return this.f84160f + "=" + this.f84161g;
    }
}
