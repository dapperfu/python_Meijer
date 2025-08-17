package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.dg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7809dg0 extends AbstractC8559ki0 {

    /* renamed from: a, reason: collision with root package name */
    private Object f73456a;

    /* renamed from: b, reason: collision with root package name */
    private int f73457b = 2;

    protected AbstractC7809dg0() {
    }

    protected abstract Object a();

    protected final Object c() {
        this.f73457b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C6657Df0.l(this.f73457b != 4);
        int i10 = this.f73457b;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            return true;
        }
        if (i11 != 2) {
            this.f73457b = 4;
            this.f73456a = a();
            if (this.f73457b != 3) {
                this.f73457b = 1;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f73457b = 2;
            Object obj = this.f73456a;
            this.f73456a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
