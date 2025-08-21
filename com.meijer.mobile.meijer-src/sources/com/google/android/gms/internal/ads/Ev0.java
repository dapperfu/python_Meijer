package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
final class Ev0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque f67518a;

    /* renamed from: b, reason: collision with root package name */
    private Vt0 f67519b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f67519b != null;
    }

    private final Vt0 c(Zt0 zt0) {
        while (zt0 instanceof Gv0) {
            Gv0 gv0 = (Gv0) zt0;
            this.f67518a.push(gv0);
            zt0 = gv0.f68144d;
        }
        return (Vt0) zt0;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Vt0 next() {
        Vt0 vt0C;
        Vt0 vt0 = this.f67519b;
        if (vt0 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.f67518a;
            vt0C = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            vt0C = c(((Gv0) this.f67518a.pop()).f68145e);
        } while (vt0C.k() == 0);
        this.f67519b = vt0C;
        return vt0;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* synthetic */ Ev0(Zt0 zt0, Fv0 fv0) {
        if (zt0 instanceof Gv0) {
            Gv0 gv0 = (Gv0) zt0;
            ArrayDeque arrayDeque = new ArrayDeque(gv0.m());
            this.f67518a = arrayDeque;
            arrayDeque.push(gv0);
            this.f67519b = c(gv0.f68144d);
            return;
        }
        this.f67518a = null;
        this.f67519b = (Vt0) zt0;
    }
}
