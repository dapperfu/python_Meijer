package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10390e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f82162a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10399f f82163b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f82162a < this.f82163b.m();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C10399f c10399f = this.f82163b;
        if (this.f82162a < c10399f.m()) {
            int i10 = this.f82162a;
            this.f82162a = i10 + 1;
            return c10399f.o(i10);
        }
        int i11 = this.f82162a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 21);
        sb2.append("Out of bounds index: ");
        sb2.append(i11);
        throw new NoSuchElementException(sb2.toString());
    }

    C10390e(C10399f c10399f) {
        Objects.requireNonNull(c10399f);
        this.f82163b = c10399f;
        this.f82162a = 0;
    }
}
