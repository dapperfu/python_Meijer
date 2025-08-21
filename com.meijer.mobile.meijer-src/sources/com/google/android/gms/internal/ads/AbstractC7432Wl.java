package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.Wl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7432Wl {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC7432Wl f71995a = new C9970wk();

    protected AbstractC7432Wl() {
    }

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract C7431Wk d(int i10, C7431Wk c7431Wk, boolean z10);

    public abstract C10079xl e(int i10, C10079xl c10079xl, long j10);

    public final boolean equals(Object obj) {
        int iH;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC7432Wl)) {
            return false;
        }
        AbstractC7432Wl abstractC7432Wl = (AbstractC7432Wl) obj;
        if (abstractC7432Wl.c() == c() && abstractC7432Wl.b() == b()) {
            C10079xl c10079xl = new C10079xl();
            C7431Wk c7431Wk = new C7431Wk();
            C10079xl c10079xl2 = new C10079xl();
            C7431Wk c7431Wk2 = new C7431Wk();
            for (int i10 = 0; i10 < c(); i10++) {
                if (!e(i10, c10079xl, 0L).equals(abstractC7432Wl.e(i10, c10079xl2, 0L))) {
                    return false;
                }
            }
            for (int i11 = 0; i11 < b(); i11++) {
                if (!d(i11, c7431Wk, true).equals(abstractC7432Wl.d(i11, c7431Wk2, true))) {
                    return false;
                }
            }
            int iG = g(true);
            if (iG == abstractC7432Wl.g(true) && (iH = h(true)) == abstractC7432Wl.h(true)) {
                while (iG != iH) {
                    int iJ = j(iG, 0, true);
                    if (iJ != abstractC7432Wl.j(iG, 0, true)) {
                        return false;
                    }
                    iG = iJ;
                }
                return true;
            }
        }
        return false;
    }

    public abstract Object f(int i10);

    public final int i(int i10, C7431Wk c7431Wk, C10079xl c10079xl, int i11, boolean z10) {
        int i12 = d(i10, c7431Wk, false).f71990c;
        if (e(i12, c10079xl, 0L).f80699n != i10) {
            return i10 + 1;
        }
        int iJ = j(i12, i11, z10);
        if (iJ == -1) {
            return -1;
        }
        return e(iJ, c10079xl, 0L).f80698m;
    }

    public int j(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == h(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == h(z10) ? g(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public int k(int i10, int i11, boolean z10) {
        if (i10 == g(false)) {
            return -1;
        }
        return i10 - 1;
    }

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
    }

    public final int hashCode() {
        int i10;
        C10079xl c10079xl = new C10079xl();
        C7431Wk c7431Wk = new C7431Wk();
        int iC = c() + 217;
        int i11 = 0;
        while (true) {
            i10 = iC * 31;
            if (i11 >= c()) {
                break;
            }
            iC = i10 + e(i11, c10079xl, 0L).hashCode();
            i11++;
        }
        int iB = i10 + b();
        for (int i12 = 0; i12 < b(); i12++) {
            iB = (iB * 31) + d(i12, c7431Wk, true).hashCode();
        }
        int iG = g(true);
        while (iG != -1) {
            iB = (iB * 31) + iG;
            iG = j(iG, 0, true);
        }
        return iB;
    }

    public final Pair l(C10079xl c10079xl, C7431Wk c7431Wk, int i10, long j10) {
        Pair pairM = m(c10079xl, c7431Wk, i10, j10, 0L);
        pairM.getClass();
        return pairM;
    }

    public int g(boolean z10) {
        if (o()) {
            return -1;
        }
        return 0;
    }

    public int h(boolean z10) {
        if (o()) {
            return -1;
        }
        return c() - 1;
    }

    public final Pair m(C10079xl c10079xl, C7431Wk c7431Wk, int i10, long j10, long j11) {
        C8211gC.a(i10, 0, c());
        e(i10, c10079xl, j11);
        if (j10 == -9223372036854775807L) {
            long j12 = c10079xl.f80696k;
            j10 = 0;
        }
        int i11 = c10079xl.f80698m;
        d(i11, c7431Wk, false);
        while (i11 < c10079xl.f80699n) {
            long j13 = c7431Wk.f71992e;
            if (j10 == 0) {
                break;
            }
            int i12 = i11 + 1;
            long j14 = d(i12, c7431Wk, false).f71992e;
            if (j10 < 0) {
                break;
            }
            i11 = i12;
        }
        d(i11, c7431Wk, true);
        long j15 = c7431Wk.f71992e;
        long j16 = c7431Wk.f71991d;
        if (j16 != -9223372036854775807L) {
            j10 = Math.min(j10, j16 - 1);
        }
        long jMax = Math.max(0L, j10);
        Object obj = c7431Wk.f71989b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public C7431Wk n(Object obj, C7431Wk c7431Wk) {
        return d(a(obj), c7431Wk, true);
    }

    public final boolean o() {
        if (c() == 0) {
            return true;
        }
        return false;
    }
}
