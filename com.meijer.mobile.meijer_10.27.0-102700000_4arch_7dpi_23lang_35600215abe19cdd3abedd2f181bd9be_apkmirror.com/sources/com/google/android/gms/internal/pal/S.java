package com.google.android.gms.internal.pal;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
final class S extends U {

    /* renamed from: a, reason: collision with root package name */
    private int f82861a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f82862b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC10605b0 f82863c;

    S(AbstractC10605b0 abstractC10605b0) {
        this.f82863c = abstractC10605b0;
        this.f82862b = abstractC10605b0.f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f82861a < this.f82862b;
    }

    @Override // com.google.android.gms.internal.pal.W
    public final byte zza() {
        int i10 = this.f82861a;
        if (i10 >= this.f82862b) {
            throw new NoSuchElementException();
        }
        this.f82861a = i10 + 1;
        return this.f82863c.e(i10);
    }
}
