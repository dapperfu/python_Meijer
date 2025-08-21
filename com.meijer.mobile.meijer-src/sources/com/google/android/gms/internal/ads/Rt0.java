package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
final class Rt0 extends St0 {

    /* renamed from: a, reason: collision with root package name */
    private int f70794a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f70795b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Zt0 f70796c;

    Rt0(Zt0 zt0) {
        this.f70796c = zt0;
        this.f70795b = zt0.k();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f70794a < this.f70795b;
    }

    @Override // com.google.android.gms.internal.ads.Ut0
    public final byte zza() {
        int i10 = this.f70794a;
        if (i10 >= this.f70795b) {
            throw new NoSuchElementException();
        }
        this.f70794a = i10 + 1;
        return this.f70796c.f(i10);
    }
}
