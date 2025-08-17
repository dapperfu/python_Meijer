package com.google.android.gms.internal.atv_ads_framework;

import java.util.AbstractMap;

/* loaded from: classes6.dex */
final class N extends F {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ O f80847d;

    @Override // com.google.android.gms.internal.atv_ads_framework.C
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f80847d.f80856e;
    }

    N(O o10) {
        this.f80847d = o10;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        r.a(i10, this.f80847d.f80856e, "index");
        O o10 = this.f80847d;
        int i11 = i10 + i10;
        Object obj = o10.f80855d[i11];
        obj.getClass();
        Object obj2 = o10.f80855d[i11 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }
}
