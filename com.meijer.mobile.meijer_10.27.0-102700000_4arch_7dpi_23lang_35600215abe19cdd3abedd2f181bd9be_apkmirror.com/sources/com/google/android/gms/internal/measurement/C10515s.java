package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10515s implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f82392a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10533u f82393b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f82392a < this.f82393b.a().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String strA = this.f82393b.a();
        int i10 = this.f82392a;
        if (i10 >= strA.length()) {
            throw new NoSuchElementException();
        }
        this.f82392a = i10 + 1;
        return new C10533u(String.valueOf(i10));
    }

    C10515s(C10533u c10533u) {
        Objects.requireNonNull(c10533u);
        this.f82393b = c10533u;
        this.f82392a = 0;
    }
}
