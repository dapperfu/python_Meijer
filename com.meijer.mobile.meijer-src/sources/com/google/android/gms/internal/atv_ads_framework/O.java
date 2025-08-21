package com.google.android.gms.internal.atv_ads_framework;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class O extends J {

    /* renamed from: c, reason: collision with root package name */
    private final transient I f81694c;

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f81695d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f81696e;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f81696e;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f81694c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.J
    final F o() {
        return new N(this);
    }

    O(I i10, Object[] objArr, int i11, int i12) {
        this.f81694c = i10;
        this.f81695d = objArr;
        this.f81696e = i12;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C
    final int a(Object[] objArr, int i10) {
        return h().a(objArr, 0);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.J, com.google.android.gms.internal.atv_ads_framework.C, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return h().listIterator(0);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.J, com.google.android.gms.internal.atv_ads_framework.C
    /* renamed from: k */
    public final W iterator() {
        return h().listIterator(0);
    }
}
