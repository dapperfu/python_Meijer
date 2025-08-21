package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes6.dex */
abstract class Uv0 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f71573a = 100;

    Uv0() {
    }

    abstract Object a(Object obj);

    abstract Object b();

    abstract Object c(Object obj);

    abstract void d(Object obj, int i10, int i11);

    abstract void e(Object obj, int i10, long j10);

    abstract void f(Object obj, int i10, Object obj2);

    abstract void g(Object obj, int i10, Zt0 zt0);

    abstract void h(Object obj, int i10, long j10);

    abstract void i(Object obj);

    abstract void j(Object obj, Object obj2);

    final boolean k(Object obj, Bv0 bv0, int i10) throws IOException {
        int iZzd = bv0.zzd();
        int i11 = iZzd >>> 3;
        int i12 = iZzd & 7;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            if (i12 == 5) {
                                d(obj, i11, bv0.zzf());
                                return true;
                            }
                            throw new zzgyf("Protocol message tag had invalid wire type.");
                        }
                        return false;
                    }
                    Object objB = b();
                    int i13 = i11 << 3;
                    int i14 = i10 + 1;
                    if (i14 < f71573a) {
                        while (bv0.zzc() != Integer.MAX_VALUE && k(objB, bv0, i14)) {
                        }
                        if ((i13 | 4) == bv0.zzd()) {
                            f(obj, i11, c(objB));
                            return true;
                        }
                        throw new zzgyg("Protocol message end-group tag did not match expected tag.");
                    }
                    throw new zzgyg("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
                g(obj, i11, bv0.zzp());
                return true;
            }
            e(obj, i11, bv0.zzk());
            return true;
        }
        h(obj, i11, bv0.zzl());
        return true;
    }
}
