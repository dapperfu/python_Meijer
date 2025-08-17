package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.z4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10583z4 extends A4 {

    /* renamed from: a, reason: collision with root package name */
    private int f82466a;

    /* renamed from: b, reason: collision with root package name */
    private final int f82467b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ G4 f82468c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f82466a < this.f82467b;
    }

    @Override // com.google.android.gms.internal.measurement.C4
    public final byte zza() {
        int i10 = this.f82466a;
        if (i10 >= this.f82467b) {
            throw new NoSuchElementException();
        }
        this.f82466a = i10 + 1;
        return this.f82468c.e(i10);
    }

    C10583z4(G4 g42) {
        Objects.requireNonNull(g42);
        this.f82468c = g42;
        this.f82466a = 0;
        this.f82467b = g42.f();
    }
}
