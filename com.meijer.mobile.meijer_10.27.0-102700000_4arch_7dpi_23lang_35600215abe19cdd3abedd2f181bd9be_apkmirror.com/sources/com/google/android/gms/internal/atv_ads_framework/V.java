package com.google.android.gms.internal.atv_ads_framework;

import java.util.Iterator;

/* loaded from: classes6.dex */
final class V extends J {

    /* renamed from: c, reason: collision with root package name */
    final transient Object f80907c;

    @Override // com.google.android.gms.internal.atv_ads_framework.C
    final int a(Object[] objArr, int i10) {
        objArr[0] = this.f80907c;
        return 1;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.J, com.google.android.gms.internal.atv_ads_framework.C, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new K(this.f80907c);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.J, com.google.android.gms.internal.atv_ads_framework.C
    /* renamed from: k */
    public final W iterator() {
        return new K(this.f80907c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.C, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f80907c.equals(obj);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.J, com.google.android.gms.internal.atv_ads_framework.C
    public final F h() {
        Object obj = this.f80907c;
        int i10 = F.f80755c;
        Object[] objArr = {obj};
        L.b(objArr, 1);
        return F.o(objArr, 1);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.J, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f80907c.hashCode();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f80907c.toString() + "]";
    }

    V(Object obj) {
        obj.getClass();
        this.f80907c = obj;
    }
}
