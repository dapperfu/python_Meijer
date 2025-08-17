package com.google.android.gms.internal.atv_ads_framework;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC10215f implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private Object f80975a;

    /* renamed from: b, reason: collision with root package name */
    private int f80976b = 2;

    protected AbstractC10215f() {
    }

    protected abstract Object a();

    protected final Object c() {
        this.f80976b = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f80976b;
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
            this.f80976b = 4;
            this.f80975a = a();
            if (this.f80976b != 3) {
                this.f80976b = 1;
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
            this.f80976b = 2;
            Object obj = this.f80975a;
            this.f80975a = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}
