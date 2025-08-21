package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes6.dex */
final class Dv0 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque f67143a = new ArrayDeque();

    private static final int c(int i10) {
        int iBinarySearch = Arrays.binarySearch(Gv0.f68142h, i10);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    /* synthetic */ Dv0(Fv0 fv0) {
    }

    static /* bridge */ /* synthetic */ Zt0 a(Dv0 dv0, Zt0 zt0, Zt0 zt02) {
        dv0.b(zt0);
        dv0.b(zt02);
        Zt0 gv0 = (Zt0) dv0.f67143a.pop();
        while (!dv0.f67143a.isEmpty()) {
            gv0 = new Gv0((Zt0) dv0.f67143a.pop(), gv0);
        }
        return gv0;
    }

    private final void b(Zt0 zt0) {
        Fv0 fv0;
        if (zt0.n()) {
            int iC = c(zt0.k());
            ArrayDeque arrayDeque = this.f67143a;
            int iH = Gv0.H(iC + 1);
            if (!arrayDeque.isEmpty() && ((Zt0) this.f67143a.peek()).k() < iH) {
                int iH2 = Gv0.H(iC);
                Zt0 gv0 = (Zt0) this.f67143a.pop();
                while (true) {
                    fv0 = null;
                    if (this.f67143a.isEmpty() || ((Zt0) this.f67143a.peek()).k() >= iH2) {
                        break;
                    } else {
                        gv0 = new Gv0((Zt0) this.f67143a.pop(), gv0);
                    }
                }
                Gv0 gv02 = new Gv0(gv0, zt0);
                while (!this.f67143a.isEmpty()) {
                    int iC2 = c(gv02.k()) + 1;
                    ArrayDeque arrayDeque2 = this.f67143a;
                    if (((Zt0) arrayDeque2.peek()).k() >= Gv0.H(iC2)) {
                        break;
                    } else {
                        gv02 = new Gv0((Zt0) this.f67143a.pop(), gv02);
                    }
                }
                this.f67143a.push(gv02);
                return;
            }
            this.f67143a.push(zt0);
            return;
        }
        if (zt0 instanceof Gv0) {
            Gv0 gv03 = (Gv0) zt0;
            b(gv03.f68144d);
            b(gv03.f68145e);
            return;
        }
        throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zt0.getClass())));
    }
}
