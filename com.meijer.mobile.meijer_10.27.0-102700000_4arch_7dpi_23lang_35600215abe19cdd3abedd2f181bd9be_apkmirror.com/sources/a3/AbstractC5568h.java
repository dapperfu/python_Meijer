package a3;

import a3.F;
import java.util.List;

/* renamed from: a3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5568h implements B {

    /* renamed from: a, reason: collision with root package name */
    protected final F.c f43831a = new F.c();

    @Override // a3.B
    public final void P(long j10) {
        n0(j10, 5);
    }

    @Override // a3.B
    public final void i() {
        q(true);
    }

    protected abstract void m0(int i10, long j10, int i11, boolean z10);

    @Override // a3.B
    public final void pause() {
        q(false);
    }

    public final void s0(List<v> list) {
        n(list, true);
    }

    @Override // a3.B
    public final void D(int i10, long j10) {
        m0(i10, j10, 10, false);
    }

    protected AbstractC5568h() {
    }

    private int j0() {
        int iA0 = a0();
        if (iA0 == 1) {
            return 0;
        }
        return iA0;
    }

    private void l0(int i10) {
        m0(W(), -9223372036854775807L, i10, true);
    }

    private void n0(long j10, int i10) {
        m0(W(), j10, i10, false);
    }

    private void p0(int i10) {
        int iB = b();
        if (iB == -1) {
            k0(i10);
        } else if (iB == W()) {
            l0(i10);
        } else {
            o0(iB, i10);
        }
    }

    private void q0(long j10, int i10) {
        long jG0 = g0() + j10;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            jG0 = Math.min(jG0, duration);
        }
        n0(Math.max(jG0, 0L), i10);
    }

    private void r0(int i10) {
        int iC = c();
        if (iC == -1) {
            k0(i10);
        } else if (iC == W()) {
            l0(i10);
        } else {
            o0(iC, i10);
        }
    }

    @Override // a3.B
    public final void B() {
        if (!y().q() && !j()) {
            if (s()) {
                p0(9);
                return;
            } else if (i0() && w()) {
                o0(W(), 9);
                return;
            } else {
                k0(9);
                return;
            }
        }
        k0(9);
    }

    @Override // a3.B
    public final long I() {
        F fY = y();
        if (fY.q()) {
            return -9223372036854775807L;
        }
        return fY.n(W(), this.f43831a).d();
    }

    @Override // a3.B
    public final boolean N() {
        if (c() != -1) {
            return true;
        }
        return false;
    }

    @Override // a3.B
    public final void Q(v vVar) {
        s0(Ce.L.y(vVar));
    }

    @Override // a3.B
    public final boolean T() {
        F fY = y();
        if (!fY.q() && fY.n(W(), this.f43831a).f43622h) {
            return true;
        }
        return false;
    }

    @Override // a3.B
    public final boolean V() {
        if (U() == 3 && F() && x() == 0) {
            return true;
        }
        return false;
    }

    public final int b() {
        F fY = y();
        if (fY.q()) {
            return -1;
        }
        return fY.e(W(), j0(), b0());
    }

    public final int c() {
        F fY = y();
        if (fY.q()) {
            return -1;
        }
        return fY.l(W(), j0(), b0());
    }

    @Override // a3.B
    public final void d0() {
        q0(R(), 12);
    }

    @Override // a3.B
    public final void e0() {
        q0(-h0(), 11);
    }

    @Override // a3.B
    public final boolean i0() {
        F fY = y();
        if (!fY.q() && fY.n(W(), this.f43831a).f()) {
            return true;
        }
        return false;
    }

    @Override // a3.B
    public final void m() {
        o0(W(), 4);
    }

    @Override // a3.B
    public final void p() {
        if (!y().q() && !j()) {
            boolean zN = N();
            if (i0() && !T()) {
                if (zN) {
                    r0(7);
                    return;
                } else {
                    k0(7);
                    return;
                }
            }
            if (zN && g0() <= H()) {
                r0(7);
                return;
            } else {
                n0(0L, 7);
                return;
            }
        }
        k0(7);
    }

    @Override // a3.B
    public final boolean s() {
        if (b() != -1) {
            return true;
        }
        return false;
    }

    @Override // a3.B
    public final boolean v(int i10) {
        return E().b(i10);
    }

    @Override // a3.B
    public final boolean w() {
        F fY = y();
        if (!fY.q() && fY.n(W(), this.f43831a).f43623i) {
            return true;
        }
        return false;
    }

    private void k0(int i10) {
        m0(-1, -9223372036854775807L, i10, false);
    }

    private void o0(int i10, int i11) {
        m0(i10, -9223372036854775807L, i11, false);
    }
}
