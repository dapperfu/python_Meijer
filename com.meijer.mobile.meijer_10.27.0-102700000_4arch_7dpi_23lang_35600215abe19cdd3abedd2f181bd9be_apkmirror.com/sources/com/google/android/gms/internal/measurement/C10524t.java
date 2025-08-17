package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10524t implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f82411a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10533u f82412b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f82411a < this.f82412b.a().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C10533u c10533u = this.f82412b;
        String strA = c10533u.a();
        int i10 = this.f82411a;
        if (i10 >= strA.length()) {
            throw new NoSuchElementException();
        }
        this.f82411a = i10 + 1;
        return new C10533u(String.valueOf(c10533u.a().charAt(i10)));
    }

    C10524t(C10533u c10533u) {
        Objects.requireNonNull(c10533u);
        this.f82412b = c10533u;
        this.f82411a = 0;
    }
}
