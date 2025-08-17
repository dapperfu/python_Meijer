package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.Rh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7136Rh0 extends AbstractC7917eh0 {

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C7170Sh0 f69922d;

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0
    public final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f69922d.f70140e;
    }

    C7136Rh0(C7170Sh0 c7170Sh0) {
        this.f69922d = c7170Sh0;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        C6657Df0.a(i10, this.f69922d.f70140e, "index");
        int i11 = i10 + i10;
        Object obj = this.f69922d.f70139d[i11];
        Objects.requireNonNull(obj);
        Object obj2 = this.f69922d.f70139d[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }
}
