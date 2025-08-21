package com.google.android.gms.internal.atv_ads_framework;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC10340f implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private Object f81815a;

    /* renamed from: b, reason: collision with root package name */
    private int f81816b = 2;

    protected AbstractC10340f() {
    }

    protected abstract Object a();

    protected final Object c() {
        this.f81816b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f81816b;
        if (i10 == 4) {
            throw new IllegalStateException();
        }
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        if (i11 == 0) {
            return true;
        }
        if (i11 != 2) {
            this.f81816b = 4;
            this.f81815a = a();
            if (this.f81816b != 3) {
                this.f81816b = 1;
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
            this.f81816b = 2;
            Object obj = this.f81815a;
            this.f81815a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
