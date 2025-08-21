package com.google.protobuf;

import com.google.protobuf.I;
import com.google.protobuf.r0;
import com.google.protobuf.s0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C11649j implements s0 {

    /* renamed from: a, reason: collision with root package name */
    private final CodedOutputStream f91399a;

    @Override // com.google.protobuf.s0
    public void A(int i10, List<Boolean> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f91399a.g0(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f91399a.S0(i10, 2);
        int iE = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iE += CodedOutputStream.e(list.get(i12).booleanValue());
        }
        this.f91399a.U0(iE);
        while (i11 < list.size()) {
            this.f91399a.h0(list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void D(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f91399a.M0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f91399a.S0(i10, 2);
        int iO = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iO += CodedOutputStream.O(list.get(i12).intValue());
        }
        this.f91399a.U0(iO);
        while (i11 < list.size()) {
            this.f91399a.N0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void F(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f91399a.C0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f91399a.S0(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iY += CodedOutputStream.y(list.get(i12).longValue());
        }
        this.f91399a.U0(iY);
        while (i11 < list.size()) {
            this.f91399a.D0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void G(int i10, List<Double> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f91399a.m0(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f91399a.S0(i10, 2);
        int iJ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iJ += CodedOutputStream.j(list.get(i12).doubleValue());
        }
        this.f91399a.U0(iJ);
        while (i11 < list.size()) {
            this.f91399a.n0(list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void I(int i10, List<AbstractC11646g> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f91399a.k0(i10, list.get(i11));
        }
    }

    @Override // com.google.protobuf.s0
    public void J(int i10, List<?> list, f0 f0Var) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            N(i10, list.get(i11), f0Var);
        }
    }

    @Override // com.google.protobuf.s0
    public void M(int i10, List<?> list, f0 f0Var) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            K(i10, list.get(i11), f0Var);
        }
    }

    @Override // com.google.protobuf.s0
    public void a(int i10, List<Float> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f91399a.u0(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f91399a.S0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iR += CodedOutputStream.r(list.get(i12).floatValue());
        }
        this.f91399a.U0(iR);
        while (i11 < list.size()) {
            this.f91399a.v0(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void g(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f91399a.A0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f91399a.S0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iW += CodedOutputStream.w(list.get(i12).intValue());
        }
        this.f91399a.U0(iW);
        while (i11 < list.size()) {
            this.f91399a.B0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void j(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f91399a.q0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f91399a.S0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iN += CodedOutputStream.n(list.get(i12).intValue());
        }
        this.f91399a.U0(iN);
        while (i11 < list.size()) {
            this.f91399a.r0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void k(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f91399a.T0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f91399a.S0(i10, 2);
        int iV = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iV += CodedOutputStream.V(list.get(i12).intValue());
        }
        this.f91399a.U0(iV);
        while (i11 < list.size()) {
            this.f91399a.U0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void l(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f91399a.O0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f91399a.S0(i10, 2);
        int iQ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iQ += CodedOutputStream.Q(list.get(i12).longValue());
        }
        this.f91399a.U0(iQ);
        while (i11 < list.size()) {
            this.f91399a.P0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void n(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f91399a.o0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f91399a.S0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iL += CodedOutputStream.l(list.get(i12).intValue());
        }
        this.f91399a.U0(iL);
        while (i11 < list.size()) {
            this.f91399a.p0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void q(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f91399a.K0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f91399a.S0(i10, 2);
        int iM = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM += CodedOutputStream.M(list.get(i12).longValue());
        }
        this.f91399a.U0(iM);
        while (i11 < list.size()) {
            this.f91399a.L0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void r(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f91399a.V0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f91399a.S0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += CodedOutputStream.X(list.get(i12).longValue());
        }
        this.f91399a.U0(iX);
        while (i11 < list.size()) {
            this.f91399a.W0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void y(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f91399a.s0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f91399a.S0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iP += CodedOutputStream.p(list.get(i12).longValue());
        }
        this.f91399a.U0(iP);
        while (i11 < list.size()) {
            this.f91399a.t0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.protobuf.s0
    public void z(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f91399a.I0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f91399a.S0(i10, 2);
        int iK = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iK += CodedOutputStream.K(list.get(i12).intValue());
        }
        this.f91399a.U0(iK);
        while (i11 < list.size()) {
            this.f91399a.J0(list.get(i11).intValue());
            i11++;
        }
    }

    /* renamed from: com.google.protobuf.j$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f91400a;

        static {
            int[] iArr = new int[r0.b.values().length];
            f91400a = iArr;
            try {
                iArr[r0.b.f91469j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f91400a[r0.b.f91468i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f91400a[r0.b.f91466g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f91400a[r0.b.f91476q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f91400a[r0.b.f91478s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f91400a[r0.b.f91474o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f91400a[r0.b.f91467h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f91400a[r0.b.f91464e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f91400a[r0.b.f91477r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f91400a[r0.b.f91479t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f91400a[r0.b.f91465f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f91400a[r0.b.f91470k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public static C11649j P(CodedOutputStream codedOutputStream) {
        C11649j c11649j = codedOutputStream.f91262a;
        return c11649j != null ? c11649j : new C11649j(codedOutputStream);
    }

    private <V> void Q(int i10, boolean z10, V v10, I.a<Boolean, V> aVar) throws IOException {
        this.f91399a.S0(i10, 2);
        this.f91399a.U0(I.b(aVar, Boolean.valueOf(z10), v10));
        I.e(this.f91399a, aVar, Boolean.valueOf(z10), v10);
    }

    private <K, V> void T(int i10, I.a<K, V> aVar, Map<K, V> map) throws IOException {
        switch (a.f91400a[aVar.f91284a.ordinal()]) {
            case 1:
                V v10 = map.get(Boolean.FALSE);
                if (v10 != null) {
                    Q(i10, false, v10, aVar);
                }
                V v11 = map.get(Boolean.TRUE);
                if (v11 != null) {
                    Q(i10, true, v11, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i10, aVar, map);
                return;
            case 12:
                U(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f91284a);
        }
    }

    private void V(int i10, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f91399a.Q0(i10, (String) obj);
        } else {
            this.f91399a.k0(i10, (AbstractC11646g) obj);
        }
    }

    @Override // com.google.protobuf.s0
    public void B(int i10, float f10) throws IOException {
        this.f91399a.u0(i10, f10);
    }

    @Override // com.google.protobuf.s0
    @Deprecated
    public void C(int i10) throws IOException {
        this.f91399a.S0(i10, 4);
    }

    @Override // com.google.protobuf.s0
    public void E(int i10, int i11) throws IOException {
        this.f91399a.o0(i10, i11);
    }

    @Override // com.google.protobuf.s0
    public void H(int i10, int i11) throws IOException {
        this.f91399a.M0(i10, i11);
    }

    @Override // com.google.protobuf.s0
    public void K(int i10, Object obj, f0 f0Var) throws IOException {
        this.f91399a.x0(i10, (P) obj, f0Var);
    }

    @Override // com.google.protobuf.s0
    public void L(int i10, AbstractC11646g abstractC11646g) throws IOException {
        this.f91399a.k0(i10, abstractC11646g);
    }

    @Override // com.google.protobuf.s0
    public void N(int i10, Object obj, f0 f0Var) throws IOException {
        this.f91399a.E0(i10, (P) obj, f0Var);
    }

    @Override // com.google.protobuf.s0
    public <K, V> void O(int i10, I.a<K, V> aVar, Map<K, V> map) throws IOException {
        if (this.f91399a.b0()) {
            T(i10, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f91399a.S0(i10, 2);
            this.f91399a.U0(I.b(aVar, entry.getKey(), entry.getValue()));
            I.e(this.f91399a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.s0
    public final void b(int i10, Object obj) throws IOException {
        if (obj instanceof AbstractC11646g) {
            this.f91399a.H0(i10, (AbstractC11646g) obj);
        } else {
            this.f91399a.G0(i10, (P) obj);
        }
    }

    @Override // com.google.protobuf.s0
    public void c(int i10, int i11) throws IOException {
        this.f91399a.q0(i10, i11);
    }

    @Override // com.google.protobuf.s0
    public void d(int i10, List<String> list) throws IOException {
        int i11 = 0;
        if (!(list instanceof E)) {
            while (i11 < list.size()) {
                this.f91399a.Q0(i10, list.get(i11));
                i11++;
            }
        } else {
            E e10 = (E) list;
            while (i11 < list.size()) {
                V(i10, e10.c(i11));
                i11++;
            }
        }
    }

    @Override // com.google.protobuf.s0
    public void e(int i10, String str) throws IOException {
        this.f91399a.Q0(i10, str);
    }

    @Override // com.google.protobuf.s0
    public void f(int i10, long j10) throws IOException {
        this.f91399a.V0(i10, j10);
    }

    @Override // com.google.protobuf.s0
    public void h(int i10, int i11) throws IOException {
        this.f91399a.A0(i10, i11);
    }

    @Override // com.google.protobuf.s0
    public void i(int i10, long j10) throws IOException {
        this.f91399a.K0(i10, j10);
    }

    @Override // com.google.protobuf.s0
    public void m(int i10, long j10) throws IOException {
        this.f91399a.O0(i10, j10);
    }

    @Override // com.google.protobuf.s0
    public void o(int i10, int i11) throws IOException {
        this.f91399a.T0(i10, i11);
    }

    @Override // com.google.protobuf.s0
    public void p(int i10, double d10) throws IOException {
        this.f91399a.m0(i10, d10);
    }

    @Override // com.google.protobuf.s0
    public void s(int i10, long j10) throws IOException {
        this.f91399a.s0(i10, j10);
    }

    @Override // com.google.protobuf.s0
    public s0.a t() {
        return s0.a.ASCENDING;
    }

    @Override // com.google.protobuf.s0
    public void u(int i10, long j10) throws IOException {
        this.f91399a.C0(i10, j10);
    }

    @Override // com.google.protobuf.s0
    public void v(int i10, boolean z10) throws IOException {
        this.f91399a.g0(i10, z10);
    }

    @Override // com.google.protobuf.s0
    public void w(int i10, int i11) throws IOException {
        this.f91399a.I0(i10, i11);
    }

    @Override // com.google.protobuf.s0
    @Deprecated
    public void x(int i10) throws IOException {
        this.f91399a.S0(i10, 3);
    }

    private C11649j(CodedOutputStream codedOutputStream) {
        CodedOutputStream codedOutputStream2 = (CodedOutputStream) C11663y.b(codedOutputStream, "output");
        this.f91399a = codedOutputStream2;
        codedOutputStream2.f91262a = this;
    }

    private <V> void R(int i10, I.a<Integer, V> aVar, Map<Integer, V> map) throws IOException {
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
            this.f91399a.S0(i10, 2);
            this.f91399a.U0(I.b(aVar, Integer.valueOf(i13), v10));
            I.e(this.f91399a, aVar, Integer.valueOf(i13), v10);
        }
    }

    private <V> void S(int i10, I.a<Long, V> aVar, Map<Long, V> map) throws IOException {
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
            this.f91399a.S0(i10, 2);
            this.f91399a.U0(I.b(aVar, Long.valueOf(j10), v10));
            I.e(this.f91399a, aVar, Long.valueOf(j10), v10);
        }
    }

    private <V> void U(int i10, I.a<String, V> aVar, Map<String, V> map) throws IOException {
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
            this.f91399a.S0(i10, 2);
            this.f91399a.U0(I.b(aVar, str, v10));
            I.e(this.f91399a, aVar, str, v10);
        }
    }
}
