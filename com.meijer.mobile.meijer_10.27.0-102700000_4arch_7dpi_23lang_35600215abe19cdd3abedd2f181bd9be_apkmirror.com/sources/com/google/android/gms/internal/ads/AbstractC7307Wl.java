package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.Wl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7307Wl {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC7307Wl f71155a = new C9845wk();

    protected AbstractC7307Wl() {
    }

    public abstract int a(Object obj);

    public abstract int b();

    public abstract int c();

    public abstract C7306Wk d(int i10, C7306Wk c7306Wk, boolean z10);

    public abstract C9954xl e(int i10, C9954xl c9954xl, long j10);

    public final boolean equals(Object obj) {
        int iH;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC7307Wl)) {
            return false;
        }
        AbstractC7307Wl abstractC7307Wl = (AbstractC7307Wl) obj;
        if (abstractC7307Wl.c() == c() && abstractC7307Wl.b() == b()) {
            C9954xl c9954xl = new C9954xl();
            C7306Wk c7306Wk = new C7306Wk();
            C9954xl c9954xl2 = new C9954xl();
            C7306Wk c7306Wk2 = new C7306Wk();
            for (int i10 = 0; i10 < c(); i10++) {
                if (!e(i10, c9954xl, 0L).equals(abstractC7307Wl.e(i10, c9954xl2, 0L))) {
                    return false;
                }
            }
            for (int i11 = 0; i11 < b(); i11++) {
                if (!d(i11, c7306Wk, true).equals(abstractC7307Wl.d(i11, c7306Wk2, true))) {
                    return false;
                }
            }
            int iG = g(true);
            if (iG == abstractC7307Wl.g(true) && (iH = h(true)) == abstractC7307Wl.h(true)) {
                while (iG != iH) {
                    int iJ = j(iG, 0, true);
                    if (iJ != abstractC7307Wl.j(iG, 0, true)) {
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

    public final int i(int i10, C7306Wk c7306Wk, C9954xl c9954xl, int i11, boolean z10) {
        int i12 = d(i10, c7306Wk, false).f71150c;
        if (e(i12, c9954xl, 0L).f79859n != i10) {
            return i10 + 1;
        }
        int iJ = j(i12, i11, z10);
        if (iJ == -1) {
            return -1;
        }
        return e(iJ, c9954xl, 0L).f79858m;
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
        C9954xl c9954xl = new C9954xl();
        C7306Wk c7306Wk = new C7306Wk();
        int iC = c() + 217;
        int i11 = 0;
        while (true) {
            i10 = iC * 31;
            if (i11 >= c()) {
                break;
            }
            iC = i10 + e(i11, c9954xl, 0L).hashCode();
            i11++;
        }
        int iB = i10 + b();
        for (int i12 = 0; i12 < b(); i12++) {
            iB = (iB * 31) + d(i12, c7306Wk, true).hashCode();
        }
        int iG = g(true);
        while (iG != -1) {
            iB = (iB * 31) + iG;
            iG = j(iG, 0, true);
        }
        return iB;
    }

    public final Pair l(C9954xl c9954xl, C7306Wk c7306Wk, int i10, long j10) {
        Pair pairM = m(c9954xl, c7306Wk, i10, j10, 0L);
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

    public final Pair m(C9954xl c9954xl, C7306Wk c7306Wk, int i10, long j10, long j11) {
        C8086gC.a(i10, 0, c());
        e(i10, c9954xl, j11);
        if (j10 == -9223372036854775807L) {
            long j12 = c9954xl.f79856k;
            j10 = 0;
        }
        int i11 = c9954xl.f79858m;
        d(i11, c7306Wk, false);
        while (i11 < c9954xl.f79859n) {
            long j13 = c7306Wk.f71152e;
            if (j10 == 0) {
                break;
            }
            int i12 = i11 + 1;
            long j14 = d(i12, c7306Wk, false).f71152e;
            if (j10 < 0) {
                break;
            }
            i11 = i12;
        }
        d(i11, c7306Wk, true);
        long j15 = c7306Wk.f71152e;
        long j16 = c7306Wk.f71151d;
        if (j16 != -9223372036854775807L) {
            j10 = Math.min(j10, j16 - 1);
        }
        long jMax = Math.max(0L, j10);
        Object obj = c7306Wk.f71149b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(jMax));
    }

    public C7306Wk n(Object obj, C7306Wk c7306Wk) {
        return d(a(obj), c7306Wk, true);
    }

    public final boolean o() {
        if (c() == 0) {
            return true;
        }
        return false;
    }
}
