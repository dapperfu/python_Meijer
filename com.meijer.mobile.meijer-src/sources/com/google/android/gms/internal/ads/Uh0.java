package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
final class Uh0 extends AbstractC8042eh0 {

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f71520d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f71521e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f71522f;

    @Override // com.google.android.gms.internal.ads.AbstractC7526Zg0
    final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f71522f;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C6782Df0.a(i10, this.f71522f, "index");
        Object obj = this.f71520d[i10 + i10 + this.f71521e];
        Objects.requireNonNull(obj);
        return obj;
    }

    Uh0(Object[] objArr, int i10, int i11) {
        this.f71520d = objArr;
        this.f71521e = i10;
        this.f71522f = i11;
    }
}
