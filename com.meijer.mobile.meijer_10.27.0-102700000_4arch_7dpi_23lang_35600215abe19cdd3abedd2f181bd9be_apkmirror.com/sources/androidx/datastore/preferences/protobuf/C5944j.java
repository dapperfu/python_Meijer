package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.r0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5944j implements r0 {

    /* renamed from: a, reason: collision with root package name */
    private final CodedOutputStream f54293a;

    private void Q(int i10, C5939e c5939e, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < c5939e.size()) {
                this.f54293a.j0(i10, c5939e.n(i11));
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iE = 0;
        for (int i12 = 0; i12 < c5939e.size(); i12++) {
            iE += CodedOutputStream.e(c5939e.n(i12));
        }
        this.f54293a.X0(iE);
        while (i11 < c5939e.size()) {
            this.f54293a.k0(c5939e.n(i11));
            i11++;
        }
    }

    private void R(int i10, List<Boolean> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f54293a.j0(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iE = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iE += CodedOutputStream.e(list.get(i12).booleanValue());
        }
        this.f54293a.X0(iE);
        while (i11 < list.size()) {
            this.f54293a.k0(list.get(i11).booleanValue());
            i11++;
        }
    }

    private void X(int i10, C5945k c5945k, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < c5945k.size()) {
                this.f54293a.p0(i10, c5945k.n(i11));
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iJ = 0;
        for (int i12 = 0; i12 < c5945k.size(); i12++) {
            iJ += CodedOutputStream.j(c5945k.n(i12));
        }
        this.f54293a.X0(iJ);
        while (i11 < c5945k.size()) {
            this.f54293a.q0(c5945k.n(i11));
            i11++;
        }
    }

    private void Y(int i10, List<Double> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f54293a.p0(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iJ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iJ += CodedOutputStream.j(list.get(i12).doubleValue());
        }
        this.f54293a.X0(iJ);
        while (i11 < list.size()) {
            this.f54293a.q0(list.get(i11).doubleValue());
            i11++;
        }
    }

    private void Z(int i10, C5957x c5957x, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < c5957x.size()) {
                this.f54293a.r0(i10, c5957x.getInt(i11));
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < c5957x.size(); i12++) {
            iL += CodedOutputStream.l(c5957x.getInt(i12));
        }
        this.f54293a.X0(iL);
        while (i11 < c5957x.size()) {
            this.f54293a.s0(c5957x.getInt(i11));
            i11++;
        }
    }

    private void a0(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f54293a.r0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iL += CodedOutputStream.l(list.get(i12).intValue());
        }
        this.f54293a.X0(iL);
        while (i11 < list.size()) {
            this.f54293a.s0(list.get(i11).intValue());
            i11++;
        }
    }

    private void b0(int i10, C5957x c5957x, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < c5957x.size()) {
                this.f54293a.t0(i10, c5957x.getInt(i11));
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < c5957x.size(); i12++) {
            iN += CodedOutputStream.n(c5957x.getInt(i12));
        }
        this.f54293a.X0(iN);
        while (i11 < c5957x.size()) {
            this.f54293a.u0(c5957x.getInt(i11));
            i11++;
        }
    }

    private void c0(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f54293a.t0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iN += CodedOutputStream.n(list.get(i12).intValue());
        }
        this.f54293a.X0(iN);
        while (i11 < list.size()) {
            this.f54293a.u0(list.get(i11).intValue());
            i11++;
        }
    }

    private void d0(int i10, G g10, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < g10.size()) {
                this.f54293a.v0(i10, g10.n(i11));
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < g10.size(); i12++) {
            iP += CodedOutputStream.p(g10.n(i12));
        }
        this.f54293a.X0(iP);
        while (i11 < g10.size()) {
            this.f54293a.w0(g10.n(i11));
            i11++;
        }
    }

    private void e0(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f54293a.v0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iP += CodedOutputStream.p(list.get(i12).longValue());
        }
        this.f54293a.X0(iP);
        while (i11 < list.size()) {
            this.f54293a.w0(list.get(i11).longValue());
            i11++;
        }
    }

    private void f0(int i10, C5954u c5954u, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < c5954u.size()) {
                this.f54293a.x0(i10, c5954u.n(i11));
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < c5954u.size(); i12++) {
            iR += CodedOutputStream.r(c5954u.n(i12));
        }
        this.f54293a.X0(iR);
        while (i11 < c5954u.size()) {
            this.f54293a.y0(c5954u.n(i11));
            i11++;
        }
    }

    private void g0(int i10, List<Float> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f54293a.x0(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iR += CodedOutputStream.r(list.get(i12).floatValue());
        }
        this.f54293a.X0(iR);
        while (i11 < list.size()) {
            this.f54293a.y0(list.get(i11).floatValue());
            i11++;
        }
    }

    private void h0(int i10, C5957x c5957x, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < c5957x.size()) {
                this.f54293a.D0(i10, c5957x.getInt(i11));
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < c5957x.size(); i12++) {
            iW += CodedOutputStream.w(c5957x.getInt(i12));
        }
        this.f54293a.X0(iW);
        while (i11 < c5957x.size()) {
            this.f54293a.E0(c5957x.getInt(i11));
            i11++;
        }
    }

    private void i0(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f54293a.D0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iW += CodedOutputStream.w(list.get(i12).intValue());
        }
        this.f54293a.X0(iW);
        while (i11 < list.size()) {
            this.f54293a.E0(list.get(i11).intValue());
            i11++;
        }
    }

    private void j0(int i10, G g10, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < g10.size()) {
                this.f54293a.F0(i10, g10.n(i11));
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < g10.size(); i12++) {
            iY += CodedOutputStream.y(g10.n(i12));
        }
        this.f54293a.X0(iY);
        while (i11 < g10.size()) {
            this.f54293a.G0(g10.n(i11));
            i11++;
        }
    }

    private void k0(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f54293a.F0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iY += CodedOutputStream.y(list.get(i12).longValue());
        }
        this.f54293a.X0(iY);
        while (i11 < list.size()) {
            this.f54293a.G0(list.get(i11).longValue());
            i11++;
        }
    }

    private void m0(int i10, C5957x c5957x, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < c5957x.size()) {
                this.f54293a.L0(i10, c5957x.getInt(i11));
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < c5957x.size(); i12++) {
            iL += CodedOutputStream.L(c5957x.getInt(i12));
        }
        this.f54293a.X0(iL);
        while (i11 < c5957x.size()) {
            this.f54293a.M0(c5957x.getInt(i11));
            i11++;
        }
    }

    private void n0(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f54293a.L0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iL += CodedOutputStream.L(list.get(i12).intValue());
        }
        this.f54293a.X0(iL);
        while (i11 < list.size()) {
            this.f54293a.M0(list.get(i11).intValue());
            i11++;
        }
    }

    private void o0(int i10, G g10, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < g10.size()) {
                this.f54293a.N0(i10, g10.n(i11));
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < g10.size(); i12++) {
            iN += CodedOutputStream.N(g10.n(i12));
        }
        this.f54293a.X0(iN);
        while (i11 < g10.size()) {
            this.f54293a.O0(g10.n(i11));
            i11++;
        }
    }

    private void p0(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f54293a.N0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iN += CodedOutputStream.N(list.get(i12).longValue());
        }
        this.f54293a.X0(iN);
        while (i11 < list.size()) {
            this.f54293a.O0(list.get(i11).longValue());
            i11++;
        }
    }

    private void q0(int i10, C5957x c5957x, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < c5957x.size()) {
                this.f54293a.P0(i10, c5957x.getInt(i11));
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < c5957x.size(); i12++) {
            iP += CodedOutputStream.P(c5957x.getInt(i12));
        }
        this.f54293a.X0(iP);
        while (i11 < c5957x.size()) {
            this.f54293a.Q0(c5957x.getInt(i11));
            i11++;
        }
    }

    private void s0(int i10, G g10, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < g10.size()) {
                this.f54293a.R0(i10, g10.n(i11));
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < g10.size(); i12++) {
            iR += CodedOutputStream.R(g10.n(i12));
        }
        this.f54293a.X0(iR);
        while (i11 < g10.size()) {
            this.f54293a.S0(g10.n(i11));
            i11++;
        }
    }

    private void t0(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f54293a.R0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iR += CodedOutputStream.R(list.get(i12).longValue());
        }
        this.f54293a.X0(iR);
        while (i11 < list.size()) {
            this.f54293a.S0(list.get(i11).longValue());
            i11++;
        }
    }

    private void u0(int i10, C5957x c5957x, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < c5957x.size()) {
                this.f54293a.W0(i10, c5957x.getInt(i11));
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < c5957x.size(); i12++) {
            iW += CodedOutputStream.W(c5957x.getInt(i12));
        }
        this.f54293a.X0(iW);
        while (i11 < c5957x.size()) {
            this.f54293a.X0(c5957x.getInt(i11));
            i11++;
        }
    }

    private void w0(int i10, G g10, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < g10.size()) {
                this.f54293a.Y0(i10, g10.n(i11));
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < g10.size(); i12++) {
            iY += CodedOutputStream.Y(g10.n(i12));
        }
        this.f54293a.X0(iY);
        while (i11 < g10.size()) {
            this.f54293a.Z0(g10.n(i11));
            i11++;
        }
    }

    private void x0(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f54293a.Y0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iY += CodedOutputStream.Y(list.get(i12).longValue());
        }
        this.f54293a.X0(iY);
        while (i11 < list.size()) {
            this.f54293a.Z0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void I(int i10, List<AbstractC5941g> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f54293a.n0(i10, list.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void J(int i10, List<?> list, f0 f0Var) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            N(i10, list.get(i11), f0Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void O(int i10, List<?> list, f0 f0Var) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            L(i10, list.get(i11), f0Var);
        }
    }

    public void r0(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f54293a.P0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iP += CodedOutputStream.P(list.get(i12).intValue());
        }
        this.f54293a.X0(iP);
        while (i11 < list.size()) {
            this.f54293a.Q0(list.get(i11).intValue());
            i11++;
        }
    }

    public void v0(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f54293a.W0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f54293a.V0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iW += CodedOutputStream.W(list.get(i12).intValue());
        }
        this.f54293a.X0(iW);
        while (i11 < list.size()) {
            this.f54293a.X0(list.get(i11).intValue());
            i11++;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.j$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f54294a;

        static {
            int[] iArr = new int[q0.b.values().length];
            f54294a = iArr;
            try {
                iArr[q0.b.f54356j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54294a[q0.b.f54355i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54294a[q0.b.f54353g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54294a[q0.b.f54363q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54294a[q0.b.f54365s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f54294a[q0.b.f54361o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f54294a[q0.b.f54354h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f54294a[q0.b.f54351e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f54294a[q0.b.f54364r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f54294a[q0.b.f54366t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f54294a[q0.b.f54352f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f54294a[q0.b.f54357k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static C5944j P(CodedOutputStream codedOutputStream) {
        C5944j c5944j = codedOutputStream.f54149a;
        return c5944j != null ? c5944j : new C5944j(codedOutputStream);
    }

    private <V> void S(int i10, boolean z10, V v10, I.a<Boolean, V> aVar) throws IOException {
        this.f54293a.V0(i10, 2);
        this.f54293a.X0(I.b(aVar, Boolean.valueOf(z10), v10));
        I.e(this.f54293a, aVar, Boolean.valueOf(z10), v10);
    }

    private <K, V> void V(int i10, I.a<K, V> aVar, Map<K, V> map) throws IOException {
        switch (a.f54294a[aVar.f54172a.ordinal()]) {
            case 1:
                V v10 = map.get(Boolean.FALSE);
                if (v10 != null) {
                    S(i10, false, v10, aVar);
                }
                V v11 = map.get(Boolean.TRUE);
                if (v11 != null) {
                    S(i10, true, v11, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                T(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                U(i10, aVar, map);
                return;
            case 12:
                W(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f54172a);
        }
    }

    private void l0(int i10, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f54293a.T0(i10, (String) obj);
        } else {
            this.f54293a.n0(i10, (AbstractC5941g) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void A(int i10, List<Boolean> list, boolean z10) throws IOException {
        if (list instanceof C5939e) {
            Q(i10, (C5939e) list, z10);
        } else {
            R(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void B(int i10, float f10) throws IOException {
        this.f54293a.x0(i10, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    @Deprecated
    public void C(int i10) throws IOException {
        this.f54293a.V0(i10, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void D(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof C5957x) {
            q0(i10, (C5957x) list, z10);
        } else {
            r0(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void E(int i10, int i11) throws IOException {
        this.f54293a.r0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void F(int i10, List<Long> list, boolean z10) throws IOException {
        if (list instanceof G) {
            j0(i10, (G) list, z10);
        } else {
            k0(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void G(int i10, List<Double> list, boolean z10) throws IOException {
        if (list instanceof C5945k) {
            X(i10, (C5945k) list, z10);
        } else {
            Y(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void H(int i10, int i11) throws IOException {
        this.f54293a.P0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void K(int i10, AbstractC5941g abstractC5941g) throws IOException {
        this.f54293a.n0(i10, abstractC5941g);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void L(int i10, Object obj, f0 f0Var) throws IOException {
        this.f54293a.H0(i10, (P) obj, f0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public <K, V> void M(int i10, I.a<K, V> aVar, Map<K, V> map) throws IOException {
        if (this.f54293a.d0()) {
            V(i10, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f54293a.V0(i10, 2);
            this.f54293a.X0(I.b(aVar, entry.getKey(), entry.getValue()));
            I.e(this.f54293a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void N(int i10, Object obj, f0 f0Var) throws IOException {
        this.f54293a.A0(i10, (P) obj, f0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void a(int i10, List<Float> list, boolean z10) throws IOException {
        if (list instanceof C5954u) {
            f0(i10, (C5954u) list, z10);
        } else {
            g0(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public final void b(int i10, Object obj) throws IOException {
        if (obj instanceof AbstractC5941g) {
            this.f54293a.K0(i10, (AbstractC5941g) obj);
        } else {
            this.f54293a.J0(i10, (P) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void c(int i10, int i11) throws IOException {
        this.f54293a.t0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void d(int i10, List<String> list) throws IOException {
        int i11 = 0;
        if (!(list instanceof C)) {
            while (i11 < list.size()) {
                this.f54293a.T0(i10, list.get(i11));
                i11++;
            }
        } else {
            C c10 = (C) list;
            while (i11 < list.size()) {
                l0(i10, c10.c(i11));
                i11++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void e(int i10, String str) throws IOException {
        this.f54293a.T0(i10, str);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void f(int i10, long j10) throws IOException {
        this.f54293a.Y0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void g(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof C5957x) {
            h0(i10, (C5957x) list, z10);
        } else {
            i0(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void h(int i10, int i11) throws IOException {
        this.f54293a.D0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void i(int i10, long j10) throws IOException {
        this.f54293a.N0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void j(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof C5957x) {
            b0(i10, (C5957x) list, z10);
        } else {
            c0(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void k(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof C5957x) {
            u0(i10, (C5957x) list, z10);
        } else {
            v0(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void l(int i10, List<Long> list, boolean z10) throws IOException {
        if (list instanceof G) {
            s0(i10, (G) list, z10);
        } else {
            t0(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void m(int i10, long j10) throws IOException {
        this.f54293a.R0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void n(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof C5957x) {
            Z(i10, (C5957x) list, z10);
        } else {
            a0(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void o(int i10, int i11) throws IOException {
        this.f54293a.W0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void p(int i10, double d10) throws IOException {
        this.f54293a.p0(i10, d10);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void q(int i10, List<Long> list, boolean z10) throws IOException {
        if (list instanceof G) {
            o0(i10, (G) list, z10);
        } else {
            p0(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void r(int i10, List<Long> list, boolean z10) throws IOException {
        if (list instanceof G) {
            w0(i10, (G) list, z10);
        } else {
            x0(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void s(int i10, long j10) throws IOException {
        this.f54293a.v0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public r0.a t() {
        return r0.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void u(int i10, long j10) throws IOException {
        this.f54293a.F0(i10, j10);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void v(int i10, boolean z10) throws IOException {
        this.f54293a.j0(i10, z10);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void w(int i10, int i11) throws IOException {
        this.f54293a.L0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    @Deprecated
    public void x(int i10) throws IOException {
        this.f54293a.V0(i10, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void y(int i10, List<Long> list, boolean z10) throws IOException {
        if (list instanceof G) {
            d0(i10, (G) list, z10);
        } else {
            e0(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.r0
    public void z(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof C5957x) {
            m0(i10, (C5957x) list, z10);
        } else {
            n0(i10, list, z10);
        }
    }

    private C5944j(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) C5958y.b(codedOutputStream, "output");
        this.f54293a = codedOutputStream2;
        codedOutputStream2.f54149a = this;
    }

    private <V> void T(int i10, I.a<Integer, V> aVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = it.next().intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            V v10 = map.get(Integer.valueOf(i13));
            this.f54293a.V0(i10, 2);
            this.f54293a.X0(I.b(aVar, Integer.valueOf(i13), v10));
            I.e(this.f54293a, aVar, Integer.valueOf(i13), v10);
        }
    }

    private <V> void U(int i10, I.a<Long, V> aVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = it.next().longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            V v10 = map.get(Long.valueOf(j10));
            this.f54293a.V0(i10, 2);
            this.f54293a.X0(I.b(aVar, Long.valueOf(j10), v10));
            I.e(this.f54293a, aVar, Long.valueOf(j10), v10);
        }
    }

    private <V> void W(int i10, I.a<String, V> aVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = it.next();
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str = strArr[i12];
            V v10 = map.get(str);
            this.f54293a.V0(i10, 2);
            this.f54293a.X0(I.b(aVar, str, v10));
            I.e(this.f54293a, aVar, str, v10);
        }
    }
}
