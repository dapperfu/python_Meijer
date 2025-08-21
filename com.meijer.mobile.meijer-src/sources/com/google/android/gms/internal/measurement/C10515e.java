package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10515e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f83002a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10524f f83003b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f83002a < this.f83003b.m();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C10524f c10524f = this.f83003b;
        if (this.f83002a < c10524f.m()) {
            int i10 = this.f83002a;
            this.f83002a = i10 + 1;
            return c10524f.o(i10);
        }
        int i11 = this.f83002a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 21);
        sb2.append("Out of bounds index: ");
        sb2.append(i11);
        throw new NoSuchElementException(sb2.toString());
    }

    C10515e(C10524f c10524f) {
        Objects.requireNonNull(c10524f);
        this.f83003b = c10524f;
        this.f83002a = 0;
    }
}
