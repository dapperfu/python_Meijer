package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10640s implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f83232a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10658u f83233b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f83232a < this.f83233b.a().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        String strA = this.f83233b.a();
        int i10 = this.f83232a;
        if (i10 >= strA.length()) {
            throw new NoSuchElementException();
        }
        this.f83232a = i10 + 1;
        return new C10658u(String.valueOf(i10));
    }

    C10640s(C10658u c10658u) {
        Objects.requireNonNull(c10658u);
        this.f83233b = c10658u;
        this.f83232a = 0;
    }
}
