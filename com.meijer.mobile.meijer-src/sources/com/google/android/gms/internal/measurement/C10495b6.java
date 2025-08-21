package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.b6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10495b6 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private int f82972a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f82973b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f82974c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C10513d6 f82975d;

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f82973b = true;
        int i10 = this.f82972a + 1;
        this.f82972a = i10;
        C10513d6 c10513d6 = this.f82975d;
        return i10 < c10513d6.k() ? (C10486a6) c10513d6.j()[i10] : (Map.Entry) a().next();
    }

    private final Iterator a() {
        if (this.f82974c == null) {
            this.f82974c = this.f82975d.n().entrySet().iterator();
        }
        return this.f82974c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f82972a + 1;
        C10513d6 c10513d6 = this.f82975d;
        if (i10 >= c10513d6.k()) {
            return !c10513d6.n().isEmpty() && a().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f82973b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f82973b = false;
        C10513d6 c10513d6 = this.f82975d;
        c10513d6.i();
        int i10 = this.f82972a;
        if (i10 >= c10513d6.k()) {
            a().remove();
        } else {
            this.f82972a = i10 - 1;
            c10513d6.h(i10);
        }
    }

    /* synthetic */ C10495b6(C10513d6 c10513d6, byte[] bArr) {
        Objects.requireNonNull(c10513d6);
        this.f82975d = c10513d6;
        this.f82972a = -1;
    }
}
