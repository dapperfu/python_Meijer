package com.google.android.gms.internal.atv_ads_framework;

import java.util.Iterator;

/* loaded from: classes6.dex */
final class T extends J {

    /* renamed from: h, reason: collision with root package name */
    private static final Object[] f81718h;

    /* renamed from: i, reason: collision with root package name */
    static final T f81719i;

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f81720c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f81721d;

    /* renamed from: e, reason: collision with root package name */
    final transient Object[] f81722e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f81723f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f81724g;

    static {
        Object[] objArr = new Object[0];
        f81718h = objArr;
        f81719i = new T(objArr, 0, objArr, 0, 0);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C
    final int e() {
        return this.f81724g;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C
    final int f() {
        return 0;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.J, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f81721d;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C
    final Object[] m() {
        return this.f81720c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f81724g;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.J
    final boolean t() {
        return true;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C
    final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f81720c, 0, objArr, 0, this.f81724g);
        return this.f81724g;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Object[] objArr = this.f81722e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iA = B.a(obj.hashCode());
        while (true) {
            int i10 = iA & this.f81723f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iA = i10 + 1;
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.J
    final F o() {
        return F.o(this.f81720c, this.f81724g);
    }

    T(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f81720c = objArr;
        this.f81721d = i10;
        this.f81722e = objArr2;
        this.f81723f = i11;
        this.f81724g = i12;
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
