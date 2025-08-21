package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10649t implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f83251a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10658u f83252b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f83251a < this.f83252b.a().length();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C10658u c10658u = this.f83252b;
        String strA = c10658u.a();
        int i10 = this.f83251a;
        if (i10 >= strA.length()) {
            throw new NoSuchElementException();
        }
        this.f83251a = i10 + 1;
        return new C10658u(String.valueOf(c10658u.a().charAt(i10)));
    }

    C10649t(C10658u c10658u) {
        Objects.requireNonNull(c10658u);
        this.f83252b = c10658u;
        this.f83251a = 0;
    }
}
