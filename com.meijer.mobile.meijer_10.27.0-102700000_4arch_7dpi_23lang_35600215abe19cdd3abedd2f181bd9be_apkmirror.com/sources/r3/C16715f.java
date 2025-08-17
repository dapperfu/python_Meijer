package r3;

import Ce.L;
import Ce.Q;
import c3.C6350a;
import java.util.ArrayList;

/* renamed from: r3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C16715f implements InterfaceC16710a {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<U3.e> f157808a = new ArrayList<>();

    private int f(long j10) {
        for (int i10 = 0; i10 < this.f157808a.size(); i10++) {
            if (j10 < this.f157808a.get(i10).f35702b) {
                return i10;
            }
        }
        return this.f157808a.size();
    }

    @Override // r3.InterfaceC16710a
    public long b(long j10) {
        if (this.f157808a.isEmpty() || j10 < this.f157808a.get(0).f35702b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < this.f157808a.size(); i10++) {
            long j11 = this.f157808a.get(i10).f35702b;
            if (j10 == j11) {
                return j11;
            }
            if (j10 < j11) {
                U3.e eVar = this.f157808a.get(i10 - 1);
                long j12 = eVar.f35704d;
                return (j12 == -9223372036854775807L || j12 > j10) ? eVar.f35702b : j12;
            }
        }
        U3.e eVar2 = (U3.e) Q.f(this.f157808a);
        long j13 = eVar2.f35704d;
        return (j13 == -9223372036854775807L || j10 < j13) ? eVar2.f35702b : j13;
    }

    @Override // r3.InterfaceC16710a
    public long c(long j10) {
        if (this.f157808a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < this.f157808a.get(0).f35702b) {
            return this.f157808a.get(0).f35702b;
        }
        for (int i10 = 1; i10 < this.f157808a.size(); i10++) {
            U3.e eVar = this.f157808a.get(i10);
            if (j10 < eVar.f35702b) {
                long j11 = this.f157808a.get(i10 - 1).f35704d;
                return (j11 == -9223372036854775807L || j11 <= j10 || j11 >= eVar.f35702b) ? eVar.f35702b : j11;
            }
        }
        long j12 = ((U3.e) Q.f(this.f157808a)).f35704d;
        if (j12 == -9223372036854775807L || j10 >= j12) {
            return Long.MIN_VALUE;
        }
        return j12;
    }

    @Override // r3.InterfaceC16710a
    public void clear() {
        this.f157808a.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // r3.InterfaceC16710a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d(U3.e r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f35702b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r4 = 1
            if (r0 == 0) goto Lf
            r0 = r4
            goto L10
        Lf:
            r0 = r1
        L10:
            d3.C13466a.a(r0)
            long r5 = r10.f35702b
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 > 0) goto L25
            long r5 = r10.f35704d
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L23
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 >= 0) goto L25
        L23:
            r0 = r4
            goto L26
        L25:
            r0 = r1
        L26:
            java.util.ArrayList<U3.e> r2 = r9.f157808a
            int r2 = r2.size()
            int r2 = r2 - r4
        L2d:
            if (r2 < 0) goto L58
            long r5 = r10.f35702b
            java.util.ArrayList<U3.e> r3 = r9.f157808a
            java.lang.Object r3 = r3.get(r2)
            U3.e r3 = (U3.e) r3
            long r7 = r3.f35702b
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L46
            java.util.ArrayList<U3.e> r11 = r9.f157808a
            int r2 = r2 + r4
            r11.add(r2, r10)
            return r0
        L46:
            java.util.ArrayList<U3.e> r3 = r9.f157808a
            java.lang.Object r3 = r3.get(r2)
            U3.e r3 = (U3.e) r3
            long r5 = r3.f35702b
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 > 0) goto L55
            r0 = r1
        L55:
            int r2 = r2 + (-1)
            goto L2d
        L58:
            java.util.ArrayList<U3.e> r11 = r9.f157808a
            r11.add(r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.C16715f.d(U3.e, long):boolean");
    }

    @Override // r3.InterfaceC16710a
    public L<C6350a> a(long j10) {
        int iF = f(j10);
        if (iF == 0) {
            return L.x();
        }
        U3.e eVar = this.f157808a.get(iF - 1);
        long j11 = eVar.f35704d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            return L.x();
        }
        return eVar.f35701a;
    }

    @Override // r3.InterfaceC16710a
    public void e(long j10) {
        int iF = f(j10);
        if (iF == 0) {
            return;
        }
        long j11 = this.f157808a.get(iF - 1).f35704d;
        if (j11 == -9223372036854775807L || j11 >= j10) {
            iF--;
        }
        this.f157808a.subList(0, iF).clear();
    }
}
