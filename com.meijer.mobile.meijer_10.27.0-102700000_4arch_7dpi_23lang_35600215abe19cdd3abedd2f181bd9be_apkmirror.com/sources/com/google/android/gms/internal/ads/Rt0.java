package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
final class Rt0 extends St0 {

    /* renamed from: a, reason: collision with root package name */
    private int f69954a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f69955b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Zt0 f69956c;

    Rt0(Zt0 zt0) {
        this.f69956c = zt0;
        this.f69955b = zt0.k();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f69954a < this.f69955b;
    }

    @Override // com.google.android.gms.internal.ads.Ut0
    public final byte zza() {
        int i10 = this.f69954a;
        if (i10 >= this.f69955b) {
            throw new NoSuchElementException();
        }
        this.f69954a = i10 + 1;
        return this.f69956c.f(i10);
    }
}
