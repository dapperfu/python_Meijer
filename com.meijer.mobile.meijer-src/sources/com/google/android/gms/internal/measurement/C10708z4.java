package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.z4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10708z4 extends A4 {

    /* renamed from: a, reason: collision with root package name */
    private int f83306a;

    /* renamed from: b, reason: collision with root package name */
    private final int f83307b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ G4 f83308c;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f83306a < this.f83307b;
    }

    @Override // com.google.android.gms.internal.measurement.C4
    public final byte zza() {
        int i10 = this.f83306a;
        if (i10 >= this.f83307b) {
            throw new NoSuchElementException();
        }
        this.f83306a = i10 + 1;
        return this.f83308c.e(i10);
    }

    C10708z4(G4 g42) {
        Objects.requireNonNull(g42);
        this.f83308c = g42;
        this.f83306a = 0;
        this.f83307b = g42.f();
    }
}
