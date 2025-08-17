package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
final class Uh0 extends AbstractC7917eh0 {

    /* renamed from: d, reason: collision with root package name */
    private final transient Object[] f70680d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f70681e;

    /* renamed from: f, reason: collision with root package name */
    private final transient int f70682f;

    @Override // com.google.android.gms.internal.ads.AbstractC7401Zg0
    final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f70682f;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C6657Df0.a(i10, this.f70682f, "index");
        Object obj = this.f70680d[i10 + i10 + this.f70681e];
        Objects.requireNonNull(obj);
        return obj;
    }

    Uh0(Object[] objArr, int i10, int i11) {
        this.f70680d = objArr;
        this.f70681e = i10;
        this.f70682f = i11;
    }
}
