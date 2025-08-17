package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes6.dex */
public abstract class Cy0 extends AbstractC7307Wl {

    /* renamed from: b, reason: collision with root package name */
    private final int f66094b;

    /* renamed from: c, reason: collision with root package name */
    private final WF0 f66095c;

    @Override // com.google.android.gms.internal.ads.AbstractC7307Wl
    public final C7306Wk n(Object obj, C7306Wk c7306Wk) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int iP = p(obj2);
        int iT = t(iP);
        u(iP).n(obj3, c7306Wk);
        c7306Wk.f71150c += iT;
        c7306Wk.f71149b = obj;
        return c7306Wk;
    }

    protected abstract int p(Object obj);

    protected abstract int q(int i10);

    protected abstract int r(int i10);

    protected abstract int s(int i10);

    protected abstract int t(int i10);

    protected abstract AbstractC7307Wl u(int i10);

    protected abstract Object v(int i10);

    private final int w(int i10, boolean z10) {
        if (z10) {
            return this.f66095c.d(i10);
        }
        if (i10 >= this.f66094b - 1) {
            return -1;
        }
        return i10 + 1;
    }

    private final int x(int i10, boolean z10) {
        if (z10) {
            return this.f66095c.e(i10);
        }
        if (i10 <= 0) {
            return -1;
        }
        return i10 - 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7307Wl
    public final int a(Object obj) {
        int iA;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int iP = p(obj2);
            if (iP != -1 && (iA = u(iP).a(obj3)) != -1) {
                return s(iP) + iA;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7307Wl
    public final int g(boolean z10) {
        if (this.f66094b != 0) {
            int iA = z10 ? this.f66095c.a() : 0;
            while (u(iA).o()) {
                iA = w(iA, z10);
                if (iA == -1) {
                }
            }
            return t(iA) + u(iA).g(z10);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7307Wl
    public final int h(boolean z10) {
        int i10 = this.f66094b;
        if (i10 != 0) {
            int iB = z10 ? this.f66095c.b() : i10 - 1;
            while (u(iB).o()) {
                iB = x(iB, z10);
                if (iB == -1) {
                }
            }
            return t(iB) + u(iB).h(z10);
        }
        return -1;
    }

    public Cy0(boolean z10, WF0 wf0) {
        this.f66095c = wf0;
        this.f66094b = wf0.c();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7307Wl
    public final C7306Wk d(int i10, C7306Wk c7306Wk, boolean z10) {
        int iQ = q(i10);
        int iT = t(iQ);
        u(iQ).d(i10 - s(iQ), c7306Wk, z10);
        c7306Wk.f71150c += iT;
        if (z10) {
            Object objV = v(iQ);
            Object obj = c7306Wk.f71149b;
            obj.getClass();
            c7306Wk.f71149b = Pair.create(objV, obj);
        }
        return c7306Wk;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7307Wl
    public final C9954xl e(int i10, C9954xl c9954xl, long j10) {
        int iR = r(i10);
        int iT = t(iR);
        int iS = s(iR);
        u(iR).e(i10 - iT, c9954xl, j10);
        Object objV = v(iR);
        if (!C9954xl.f79844o.equals(c9954xl.f79846a)) {
            objV = Pair.create(objV, c9954xl.f79846a);
        }
        c9954xl.f79846a = objV;
        c9954xl.f79858m += iS;
        c9954xl.f79859n += iS;
        return c9954xl;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7307Wl
    public final Object f(int i10) {
        int iQ = q(i10);
        return Pair.create(v(iQ), u(iQ).f(i10 - s(iQ)));
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7307Wl
    public final int j(int i10, int i11, boolean z10) {
        int i12;
        int iR = r(i10);
        int iT = t(iR);
        AbstractC7307Wl abstractC7307WlU = u(iR);
        int i13 = i10 - iT;
        if (i11 == 2) {
            i12 = 0;
        } else {
            i12 = i11;
        }
        int iJ = abstractC7307WlU.j(i13, i12, z10);
        if (iJ != -1) {
            return iT + iJ;
        }
        int iW = w(iR, z10);
        while (iW != -1 && u(iW).o()) {
            iW = w(iW, z10);
        }
        if (iW != -1) {
            return t(iW) + u(iW).g(z10);
        }
        if (i11 != 2) {
            return -1;
        }
        return g(z10);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7307Wl
    public final int k(int i10, int i11, boolean z10) {
        int iR = r(i10);
        int iT = t(iR);
        int iK = u(iR).k(i10 - iT, 0, false);
        if (iK != -1) {
            return iT + iK;
        }
        int iX = x(iR, false);
        while (iX != -1 && u(iX).o()) {
            iX = x(iX, false);
        }
        if (iX == -1) {
            return -1;
        }
        return t(iX) + u(iX).h(false);
    }
}
