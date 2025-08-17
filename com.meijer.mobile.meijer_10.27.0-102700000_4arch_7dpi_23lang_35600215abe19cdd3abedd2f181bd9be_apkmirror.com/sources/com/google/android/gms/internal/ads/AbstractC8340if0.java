package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.if0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC8340if0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private Object f74990a;

    /* renamed from: b, reason: collision with root package name */
    private int f74991b = 2;

    protected AbstractC8340if0() {
    }

    protected abstract Object a();

    protected final Object c() {
        this.f74991b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C6657Df0.l(this.f74991b != 4);
        int i10 = this.f74991b;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            return true;
        }
        if (i11 != 2) {
            this.f74991b = 4;
            this.f74990a = a();
            if (this.f74991b != 3) {
                this.f74991b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f74991b = 2;
            Object obj = this.f74990a;
            this.f74990a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
