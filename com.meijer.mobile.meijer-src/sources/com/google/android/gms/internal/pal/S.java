package com.google.android.gms.internal.pal;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
final class S extends U {

    /* renamed from: a, reason: collision with root package name */
    private int f83701a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f83702b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC10730b0 f83703c;

    S(AbstractC10730b0 abstractC10730b0) {
        this.f83703c = abstractC10730b0;
        this.f83702b = abstractC10730b0.f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f83701a < this.f83702b;
    }

    @Override // com.google.android.gms.internal.pal.W
    public final byte zza() {
        int i10 = this.f83701a;
        if (i10 >= this.f83702b) {
            throw new NoSuchElementException();
        }
        this.f83701a = i10 + 1;
        return this.f83703c.e(i10);
    }
}
