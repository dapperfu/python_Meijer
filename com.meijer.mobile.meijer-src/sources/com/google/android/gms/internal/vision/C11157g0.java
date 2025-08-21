package com.google.android.gms.internal.vision;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.vision.g0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11157g0 extends AbstractC11165i0 {

    /* renamed from: a, reason: collision with root package name */
    private int f85380a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final int f85381b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ AbstractC11161h0 f85382c;

    C11157g0(AbstractC11161h0 abstractC11161h0) {
        this.f85382c = abstractC11161h0;
        this.f85381b = abstractC11161h0.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f85380a < this.f85381b;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11178m0
    public final byte zza() {
        int i10 = this.f85380a;
        if (i10 >= this.f85381b) {
            throw new NoSuchElementException();
        }
        this.f85380a = i10 + 1;
        return this.f85382c.p(i10);
    }
}
