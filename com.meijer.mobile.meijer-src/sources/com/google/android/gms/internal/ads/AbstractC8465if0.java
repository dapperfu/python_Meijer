package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.if0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC8465if0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private Object f75830a;

    /* renamed from: b, reason: collision with root package name */
    private int f75831b = 2;

    protected AbstractC8465if0() {
    }

    protected abstract Object a();

    protected final Object c() {
        this.f75831b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C6782Df0.l(this.f75831b != 4);
        int i10 = this.f75831b;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            return true;
        }
        if (i11 != 2) {
            this.f75831b = 4;
            this.f75830a = a();
            if (this.f75831b != 3) {
                this.f75831b = 1;
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
            this.f75831b = 2;
            Object obj = this.f75830a;
            this.f75830a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
