package com.google.android.gms.internal.vision;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.vision.g0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11032g0 extends AbstractC11040i0 {

    /* renamed from: a, reason: collision with root package name */
    private int f84540a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f84541b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ AbstractC11036h0 f84542c;

    C11032g0(AbstractC11036h0 abstractC11036h0) {
        this.f84542c = abstractC11036h0;
        this.f84541b = abstractC11036h0.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f84540a < this.f84541b;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11053m0
    public final byte zza() {
        int i10 = this.f84540a;
        if (i10 >= this.f84541b) {
            throw new NoSuchElementException();
        }
        this.f84540a = i10 + 1;
        return this.f84542c.p(i10);
    }
}
