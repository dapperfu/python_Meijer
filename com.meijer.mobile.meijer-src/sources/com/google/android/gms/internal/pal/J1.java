package com.google.android.gms.internal.pal;

import java.io.IOException;

/* loaded from: classes6.dex */
abstract class J1 {
    J1() {
    }

    abstract int a(Object obj);

    abstract int b(Object obj);

    abstract Object c(Object obj);

    abstract Object d(Object obj);

    abstract Object e(Object obj, Object obj2);

    abstract Object f();

    abstract Object g(Object obj);

    abstract void h(Object obj, int i10, int i11);

    abstract void i(Object obj, int i10, long j10);

    abstract void j(Object obj, int i10, Object obj2);

    abstract void k(Object obj, int i10, AbstractC10730b0 abstractC10730b0);

    abstract void l(Object obj, int i10, long j10);

    abstract void m(Object obj);

    abstract void n(Object obj, Object obj2);

    abstract void o(Object obj, Object obj2);

    abstract void p(Object obj, InterfaceC10749c2 interfaceC10749c2) throws IOException;

    abstract boolean r(InterfaceC10990r1 interfaceC10990r1);

    final boolean q(Object obj, InterfaceC10990r1 interfaceC10990r1) throws IOException {
        int iZzd = interfaceC10990r1.zzd();
        int i10 = iZzd >>> 3;
        int i11 = iZzd & 7;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                h(obj, i10, interfaceC10990r1.zzf());
                                return true;
                            }
                            throw zzadi.a();
                        }
                        return false;
                    }
                    Object objF = f();
                    int i12 = 4 | (i10 << 3);
                    while (interfaceC10990r1.zzc() != Integer.MAX_VALUE && q(objF, interfaceC10990r1)) {
                    }
                    if (i12 == interfaceC10990r1.zzd()) {
                        g(objF);
                        j(obj, i10, objF);
                        return true;
                    }
                    throw zzadi.b();
                }
                k(obj, i10, interfaceC10990r1.zzp());
                return true;
            }
            i(obj, i10, interfaceC10990r1.zzk());
            return true;
        }
        l(obj, i10, interfaceC10990r1.zzl());
        return true;
    }
}
