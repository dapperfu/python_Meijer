package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.crypto.tink.shaded.protobuf.r0;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C11440k implements r0 {

    /* renamed from: a, reason: collision with root package name */
    private final CodedOutputStream f89247a;

    private void Q(int i10, C11435f c11435f, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < c11435f.size()) {
                this.f89247a.g0(i10, c11435f.n(i11));
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iE = 0;
        for (int i12 = 0; i12 < c11435f.size(); i12++) {
            iE += CodedOutputStream.e(c11435f.n(i12));
        }
        this.f89247a.N0(iE);
        while (i11 < c11435f.size()) {
            this.f89247a.h0(c11435f.n(i11));
            i11++;
        }
    }

    private void R(int i10, List<Boolean> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f89247a.g0(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iE = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iE += CodedOutputStream.e(list.get(i12).booleanValue());
        }
        this.f89247a.N0(iE);
        while (i11 < list.size()) {
            this.f89247a.h0(list.get(i11).booleanValue());
            i11++;
        }
    }

    private void T(int i10, C11441l c11441l, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < c11441l.size()) {
                this.f89247a.j0(i10, c11441l.n(i11));
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iJ = 0;
        for (int i12 = 0; i12 < c11441l.size(); i12++) {
            iJ += CodedOutputStream.j(c11441l.n(i12));
        }
        this.f89247a.N0(iJ);
        while (i11 < c11441l.size()) {
            this.f89247a.k0(c11441l.n(i11));
            i11++;
        }
    }

    private void U(int i10, List<Double> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f89247a.j0(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iJ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iJ += CodedOutputStream.j(list.get(i12).doubleValue());
        }
        this.f89247a.N0(iJ);
        while (i11 < list.size()) {
            this.f89247a.k0(list.get(i11).doubleValue());
            i11++;
        }
    }

    private void V(int i10, C11453y c11453y, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < c11453y.size()) {
                this.f89247a.l0(i10, c11453y.getInt(i11));
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < c11453y.size(); i12++) {
            iL += CodedOutputStream.l(c11453y.getInt(i12));
        }
        this.f89247a.N0(iL);
        while (i11 < c11453y.size()) {
            this.f89247a.m0(c11453y.getInt(i11));
            i11++;
        }
    }

    private void W(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f89247a.l0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iL += CodedOutputStream.l(list.get(i12).intValue());
        }
        this.f89247a.N0(iL);
        while (i11 < list.size()) {
            this.f89247a.m0(list.get(i11).intValue());
            i11++;
        }
    }

    private void X(int i10, C11453y c11453y, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < c11453y.size()) {
                this.f89247a.n0(i10, c11453y.getInt(i11));
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < c11453y.size(); i12++) {
            iN += CodedOutputStream.n(c11453y.getInt(i12));
        }
        this.f89247a.N0(iN);
        while (i11 < c11453y.size()) {
            this.f89247a.o0(c11453y.getInt(i11));
            i11++;
        }
    }

    private void Y(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f89247a.n0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iN += CodedOutputStream.n(list.get(i12).intValue());
        }
        this.f89247a.N0(iN);
        while (i11 < list.size()) {
            this.f89247a.o0(list.get(i11).intValue());
            i11++;
        }
    }

    private void Z(int i10, H h10, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < h10.size()) {
                this.f89247a.p0(i10, h10.n(i11));
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < h10.size(); i12++) {
            iP += CodedOutputStream.p(h10.n(i12));
        }
        this.f89247a.N0(iP);
        while (i11 < h10.size()) {
            this.f89247a.q0(h10.n(i11));
            i11++;
        }
    }

    private void a0(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f89247a.p0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iP += CodedOutputStream.p(list.get(i12).longValue());
        }
        this.f89247a.N0(iP);
        while (i11 < list.size()) {
            this.f89247a.q0(list.get(i11).longValue());
            i11++;
        }
    }

    private void b0(int i10, C11450v c11450v, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < c11450v.size()) {
                this.f89247a.r0(i10, c11450v.n(i11));
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < c11450v.size(); i12++) {
            iR += CodedOutputStream.r(c11450v.n(i12));
        }
        this.f89247a.N0(iR);
        while (i11 < c11450v.size()) {
            this.f89247a.s0(c11450v.n(i11));
            i11++;
        }
    }

    private void c0(int i10, List<Float> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f89247a.r0(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iR += CodedOutputStream.r(list.get(i12).floatValue());
        }
        this.f89247a.N0(iR);
        while (i11 < list.size()) {
            this.f89247a.s0(list.get(i11).floatValue());
            i11++;
        }
    }

    private void d0(int i10, C11453y c11453y, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < c11453y.size()) {
                this.f89247a.v0(i10, c11453y.getInt(i11));
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < c11453y.size(); i12++) {
            iW += CodedOutputStream.w(c11453y.getInt(i12));
        }
        this.f89247a.N0(iW);
        while (i11 < c11453y.size()) {
            this.f89247a.w0(c11453y.getInt(i11));
            i11++;
        }
    }

    private void e0(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f89247a.v0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iW += CodedOutputStream.w(list.get(i12).intValue());
        }
        this.f89247a.N0(iW);
        while (i11 < list.size()) {
            this.f89247a.w0(list.get(i11).intValue());
            i11++;
        }
    }

    private void f0(int i10, H h10, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < h10.size()) {
                this.f89247a.x0(i10, h10.n(i11));
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < h10.size(); i12++) {
            iY += CodedOutputStream.y(h10.n(i12));
        }
        this.f89247a.N0(iY);
        while (i11 < h10.size()) {
            this.f89247a.y0(h10.n(i11));
            i11++;
        }
    }

    private void g0(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f89247a.x0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iY += CodedOutputStream.y(list.get(i12).longValue());
        }
        this.f89247a.N0(iY);
        while (i11 < list.size()) {
            this.f89247a.y0(list.get(i11).longValue());
            i11++;
        }
    }

    private void i0(int i10, C11453y c11453y, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < c11453y.size()) {
                this.f89247a.C0(i10, c11453y.getInt(i11));
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iK = 0;
        for (int i12 = 0; i12 < c11453y.size(); i12++) {
            iK += CodedOutputStream.K(c11453y.getInt(i12));
        }
        this.f89247a.N0(iK);
        while (i11 < c11453y.size()) {
            this.f89247a.D0(c11453y.getInt(i11));
            i11++;
        }
    }

    private void j0(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f89247a.C0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iK = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iK += CodedOutputStream.K(list.get(i12).intValue());
        }
        this.f89247a.N0(iK);
        while (i11 < list.size()) {
            this.f89247a.D0(list.get(i11).intValue());
            i11++;
        }
    }

    private void k0(int i10, H h10, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < h10.size()) {
                this.f89247a.E0(i10, h10.n(i11));
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iM = 0;
        for (int i12 = 0; i12 < h10.size(); i12++) {
            iM += CodedOutputStream.M(h10.n(i12));
        }
        this.f89247a.N0(iM);
        while (i11 < h10.size()) {
            this.f89247a.F0(h10.n(i11));
            i11++;
        }
    }

    private void l0(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f89247a.E0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iM = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM += CodedOutputStream.M(list.get(i12).longValue());
        }
        this.f89247a.N0(iM);
        while (i11 < list.size()) {
            this.f89247a.F0(list.get(i11).longValue());
            i11++;
        }
    }

    private void m0(int i10, C11453y c11453y, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < c11453y.size()) {
                this.f89247a.G0(i10, c11453y.getInt(i11));
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iO = 0;
        for (int i12 = 0; i12 < c11453y.size(); i12++) {
            iO += CodedOutputStream.O(c11453y.getInt(i12));
        }
        this.f89247a.N0(iO);
        while (i11 < c11453y.size()) {
            this.f89247a.H0(c11453y.getInt(i11));
            i11++;
        }
    }

    private void o0(int i10, H h10, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < h10.size()) {
                this.f89247a.I0(i10, h10.n(i11));
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iQ = 0;
        for (int i12 = 0; i12 < h10.size(); i12++) {
            iQ += CodedOutputStream.Q(h10.n(i12));
        }
        this.f89247a.N0(iQ);
        while (i11 < h10.size()) {
            this.f89247a.J0(h10.n(i11));
            i11++;
        }
    }

    private void p0(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f89247a.I0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iQ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iQ += CodedOutputStream.Q(list.get(i12).longValue());
        }
        this.f89247a.N0(iQ);
        while (i11 < list.size()) {
            this.f89247a.J0(list.get(i11).longValue());
            i11++;
        }
    }

    private void q0(int i10, C11453y c11453y, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < c11453y.size()) {
                this.f89247a.M0(i10, c11453y.getInt(i11));
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iV = 0;
        for (int i12 = 0; i12 < c11453y.size(); i12++) {
            iV += CodedOutputStream.V(c11453y.getInt(i12));
        }
        this.f89247a.N0(iV);
        while (i11 < c11453y.size()) {
            this.f89247a.N0(c11453y.getInt(i11));
            i11++;
        }
    }

    private void s0(int i10, H h10, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < h10.size()) {
                this.f89247a.O0(i10, h10.n(i11));
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < h10.size(); i12++) {
            iX += CodedOutputStream.X(h10.n(i12));
        }
        this.f89247a.N0(iX);
        while (i11 < h10.size()) {
            this.f89247a.P0(h10.n(i11));
            i11++;
        }
    }

    private void t0(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f89247a.O0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += CodedOutputStream.X(list.get(i12).longValue());
        }
        this.f89247a.N0(iX);
        while (i11 < list.size()) {
            this.f89247a.P0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void I(int i10, List<AbstractC11437h> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f89247a.i0(i10, list.get(i11));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void L(int i10, List<?> list, f0 f0Var) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            N(i10, list.get(i11), f0Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void O(int i10, List<?> list, f0 f0Var) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            K(i10, list.get(i11), f0Var);
        }
    }

    public void n0(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f89247a.G0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iO = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iO += CodedOutputStream.O(list.get(i12).intValue());
        }
        this.f89247a.N0(iO);
        while (i11 < list.size()) {
            this.f89247a.H0(list.get(i11).intValue());
            i11++;
        }
    }

    public void r0(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f89247a.M0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f89247a.L0(i10, 2);
        int iV = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iV += CodedOutputStream.V(list.get(i12).intValue());
        }
        this.f89247a.N0(iV);
        while (i11 < list.size()) {
            this.f89247a.N0(list.get(i11).intValue());
            i11++;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.k$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f89248a;

        static {
            int[] iArr = new int[q0.b.values().length];
            f89248a = iArr;
            try {
                iArr[q0.b.f89303j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f89248a[q0.b.f89302i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f89248a[q0.b.f89300g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f89248a[q0.b.f89310q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f89248a[q0.b.f89312s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f89248a[q0.b.f89308o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f89248a[q0.b.f89301h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f89248a[q0.b.f89298e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f89248a[q0.b.f89311r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f89248a[q0.b.f89313t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f89248a[q0.b.f89299f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f89248a[q0.b.f89304k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static C11440k P(CodedOutputStream codedOutputStream) {
        C11440k c11440k = codedOutputStream.f89104a;
        return c11440k != null ? c11440k : new C11440k(codedOutputStream);
    }

    private <K, V> void S(int i10, J.a<K, V> aVar, Map<K, V> map) throws IOException {
        int[] iArr = a.f89248a;
        throw null;
    }

    private void h0(int i10, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f89247a.K0(i10, (String) obj);
        } else {
            this.f89247a.i0(i10, (AbstractC11437h) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void A(int i10, List<Boolean> list, boolean z10) throws IOException {
        if (list instanceof C11435f) {
            Q(i10, (C11435f) list, z10);
        } else {
            R(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void B(int i10, float f10) throws IOException {
        this.f89247a.r0(i10, f10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    @Deprecated
    public void C(int i10) throws IOException {
        this.f89247a.L0(i10, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void D(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof C11453y) {
            m0(i10, (C11453y) list, z10);
        } else {
            n0(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void E(int i10, int i11) throws IOException {
        this.f89247a.l0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void F(int i10, List<Long> list, boolean z10) throws IOException {
        if (list instanceof H) {
            f0(i10, (H) list, z10);
        } else {
            g0(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void G(int i10, List<Double> list, boolean z10) throws IOException {
        if (list instanceof C11441l) {
            T(i10, (C11441l) list, z10);
        } else {
            U(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void H(int i10, int i11) throws IOException {
        this.f89247a.G0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public <K, V> void J(int i10, J.a<K, V> aVar, Map<K, V> map) throws IOException {
        if (this.f89247a.b0()) {
            S(i10, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f89247a.L0(i10, 2);
            this.f89247a.N0(J.b(aVar, entry.getKey(), entry.getValue()));
            J.d(this.f89247a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void K(int i10, Object obj, f0 f0Var) throws IOException {
        this.f89247a.t0(i10, (Q) obj, f0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void M(int i10, AbstractC11437h abstractC11437h) throws IOException {
        this.f89247a.i0(i10, abstractC11437h);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void N(int i10, Object obj, f0 f0Var) throws IOException {
        this.f89247a.z0(i10, (Q) obj, f0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void a(int i10, List<Float> list, boolean z10) throws IOException {
        if (list instanceof C11450v) {
            b0(i10, (C11450v) list, z10);
        } else {
            c0(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final void b(int i10, Object obj) throws IOException {
        if (obj instanceof AbstractC11437h) {
            this.f89247a.B0(i10, (AbstractC11437h) obj);
        } else {
            this.f89247a.A0(i10, (Q) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void c(int i10, int i11) throws IOException {
        this.f89247a.n0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void d(int i10, List<String> list) throws IOException {
        int i11 = 0;
        if (!(list instanceof D)) {
            while (i11 < list.size()) {
                this.f89247a.K0(i10, list.get(i11));
                i11++;
            }
        } else {
            D d10 = (D) list;
            while (i11 < list.size()) {
                h0(i10, d10.c(i11));
                i11++;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void e(int i10, String str) throws IOException {
        this.f89247a.K0(i10, str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void f(int i10, long j10) throws IOException {
        this.f89247a.O0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void g(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof C11453y) {
            d0(i10, (C11453y) list, z10);
        } else {
            e0(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void h(int i10, int i11) throws IOException {
        this.f89247a.v0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void i(int i10, long j10) throws IOException {
        this.f89247a.E0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void j(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof C11453y) {
            X(i10, (C11453y) list, z10);
        } else {
            Y(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void k(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof C11453y) {
            q0(i10, (C11453y) list, z10);
        } else {
            r0(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void l(int i10, List<Long> list, boolean z10) throws IOException {
        if (list instanceof H) {
            o0(i10, (H) list, z10);
        } else {
            p0(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void m(int i10, long j10) throws IOException {
        this.f89247a.I0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void n(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof C11453y) {
            V(i10, (C11453y) list, z10);
        } else {
            W(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void o(int i10, int i11) throws IOException {
        this.f89247a.M0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void p(int i10, double d10) throws IOException {
        this.f89247a.j0(i10, d10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void q(int i10, List<Long> list, boolean z10) throws IOException {
        if (list instanceof H) {
            k0(i10, (H) list, z10);
        } else {
            l0(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void r(int i10, List<Long> list, boolean z10) throws IOException {
        if (list instanceof H) {
            s0(i10, (H) list, z10);
        } else {
            t0(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void s(int i10, long j10) throws IOException {
        this.f89247a.p0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public r0.a t() {
        return r0.a.ASCENDING;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void u(int i10, long j10) throws IOException {
        this.f89247a.x0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void v(int i10, boolean z10) throws IOException {
        this.f89247a.g0(i10, z10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void w(int i10, int i11) throws IOException {
        this.f89247a.C0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    @Deprecated
    public void x(int i10) throws IOException {
        this.f89247a.L0(i10, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void y(int i10, List<Long> list, boolean z10) throws IOException {
        if (list instanceof H) {
            Z(i10, (H) list, z10);
        } else {
            a0(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void z(int i10, List<Integer> list, boolean z10) throws IOException {
        if (list instanceof C11453y) {
            i0(i10, (C11453y) list, z10);
        } else {
            j0(i10, list, z10);
        }
    }

    private C11440k(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) C11454z.b(codedOutputStream, "output");
        this.f89247a = codedOutputStream2;
        codedOutputStream2.f89104a = this;
    }
}
