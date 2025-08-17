package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC10293f0;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
final class N implements M1 {

    /* renamed from: a, reason: collision with root package name */
    private final zzbn f81156a;

    private N(zzbn zzbnVar) {
        zzbn zzbnVar2 = (zzbn) C10299h0.e(zzbnVar, "output");
        this.f81156a = zzbnVar2;
        zzbnVar2.f81637a = this;
    }

    public static N j(zzbn zzbnVar) {
        N n10 = zzbnVar.f81637a;
        return n10 != null ? n10 : new N(zzbnVar);
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void A(int i10) throws IOException {
        this.f81156a.G(i10, 4);
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void B(int i10, A a10) throws IOException {
        this.f81156a.m(i10, a10);
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void C(int i10, Object obj, InterfaceC10279a1 interfaceC10279a1) throws IOException {
        this.f81156a.o(i10, (J0) obj, interfaceC10279a1);
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void D(int i10, Object obj, InterfaceC10279a1 interfaceC10279a1) throws IOException {
        zzbn zzbnVar = this.f81156a;
        zzbnVar.G(i10, 3);
        interfaceC10279a1.a((J0) obj, zzbnVar.f81637a);
        zzbnVar.G(i10, 4);
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void E(int i10, long j10) throws IOException {
        this.f81156a.l(i10, j10);
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void F(int i10, int i11) throws IOException {
        this.f81156a.T(i10, i11);
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void G(int i10) throws IOException {
        this.f81156a.G(i10, 3);
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final <K, V> void H(int i10, C0<K, V> c02, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f81156a.G(i10, 2);
            this.f81156a.y0(B0.a(c02, entry.getKey(), entry.getValue()));
            B0.b(this.f81156a, c02, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void I(int i10, int i11) throws IOException {
        this.f81156a.i0(i10, i11);
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void a(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81156a.f0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f81156a.G(i10, 2);
        int iE0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iE0 += zzbn.E0(list.get(i12).intValue());
        }
        this.f81156a.y0(iE0);
        while (i11 < list.size()) {
            this.f81156a.z0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void b(int i10, List<Boolean> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81156a.K(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f81156a.G(i10, 2);
        int iF = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iF += zzbn.F(list.get(i12).booleanValue());
        }
        this.f81156a.y0(iF);
        while (i11 < list.size()) {
            this.f81156a.t(list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void c(int i10, String str) throws IOException {
        this.f81156a.p(i10, str);
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void d(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81156a.i0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f81156a.G(i10, 2);
        int iG0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iG0 += zzbn.G0(list.get(i12).intValue());
        }
        this.f81156a.y0(iG0);
        while (i11 < list.size()) {
            this.f81156a.A0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void e(int i10, long j10) throws IOException {
        this.f81156a.H(i10, j10);
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void f(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81156a.T(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f81156a.G(i10, 2);
        int iC0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iC0 += zzbn.C0(list.get(i12).intValue());
        }
        this.f81156a.y0(iC0);
        while (i11 < list.size()) {
            this.f81156a.x0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void g(int i10, int i11) throws IOException {
        this.f81156a.T(i10, i11);
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void h(int i10, Object obj) throws IOException {
        if (obj instanceof A) {
            this.f81156a.I(i10, (A) obj);
        } else {
            this.f81156a.J(i10, (J0) obj);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void i(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81156a.i0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f81156a.G(i10, 2);
        int iF0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iF0 += zzbn.F0(list.get(i12).intValue());
        }
        this.f81156a.y0(iF0);
        while (i11 < list.size()) {
            this.f81156a.A0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void k(int i10, double d10) throws IOException {
        this.f81156a.j(i10, d10);
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void l(int i10, float f10) throws IOException {
        this.f81156a.k(i10, f10);
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void m(int i10, int i11) throws IOException {
        this.f81156a.i0(i10, i11);
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final int p() {
        return AbstractC10293f0.e.f81445l;
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void q(int i10, List<A> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f81156a.m(i10, list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void r(int i10, int i11) throws IOException {
        this.f81156a.b0(i10, i11);
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void s(int i10, int i11) throws IOException {
        this.f81156a.f0(i10, i11);
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void t(int i10, List<String> list) throws IOException {
        int i11 = 0;
        if (!(list instanceof InterfaceC10331s0)) {
            while (i11 < list.size()) {
                this.f81156a.p(i10, list.get(i11));
                i11++;
            }
            return;
        }
        InterfaceC10331s0 interfaceC10331s0 = (InterfaceC10331s0) list;
        while (i11 < list.size()) {
            Object objC = interfaceC10331s0.c(i11);
            if (objC instanceof String) {
                this.f81156a.p(i10, (String) objC);
            } else {
                this.f81156a.m(i10, (A) objC);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void u(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81156a.T(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f81156a.G(i10, 2);
        int iH0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iH0 += zzbn.H0(list.get(i12).intValue());
        }
        this.f81156a.y0(iH0);
        while (i11 < list.size()) {
            this.f81156a.x0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void v(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81156a.U(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f81156a.G(i10, 2);
        int iP0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iP0 += zzbn.p0(list.get(i12).longValue());
        }
        this.f81156a.y0(iP0);
        while (i11 < list.size()) {
            this.f81156a.c0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void w(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81156a.l(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f81156a.G(i10, 2);
        int iH0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iH0 += zzbn.h0(list.get(i12).longValue());
        }
        this.f81156a.y0(iH0);
        while (i11 < list.size()) {
            this.f81156a.L(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void x(int i10, List<Float> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81156a.k(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f81156a.G(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += zzbn.x(list.get(i12).floatValue());
        }
        this.f81156a.y0(iX);
        while (i11 < list.size()) {
            this.f81156a.i(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void y(int i10, List<?> list, InterfaceC10279a1 interfaceC10279a1) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            D(i10, list.get(i11), interfaceC10279a1);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void z(int i10, List<?> list, InterfaceC10279a1 interfaceC10279a1) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            C(i10, list.get(i11), interfaceC10279a1);
        }
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void zza(int i10, long j10) throws IOException {
        this.f81156a.l(i10, j10);
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void zzb(int i10, boolean z10) throws IOException {
        this.f81156a.K(i10, z10);
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void zzc(int i10, long j10) throws IOException {
        this.f81156a.U(i10, j10);
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void zzg(int i10, List<Double> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81156a.j(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f81156a.G(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iW += zzbn.w(list.get(i12).doubleValue());
        }
        this.f81156a.y0(iW);
        while (i11 < list.size()) {
            this.f81156a.h(list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void zzj(int i10, long j10) throws IOException {
        this.f81156a.U(i10, j10);
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void zzl(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81156a.U(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f81156a.G(i10, 2);
        int iS0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iS0 += zzbn.s0(list.get(i12).longValue());
        }
        this.f81156a.y0(iS0);
        while (i11 < list.size()) {
            this.f81156a.c0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void zzn(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81156a.H(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f81156a.G(i10, 2);
        int iL0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iL0 += zzbn.l0(list.get(i12).longValue());
        }
        this.f81156a.y0(iL0);
        while (i11 < list.size()) {
            this.f81156a.V(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void zzc(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81156a.l(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f81156a.G(i10, 2);
        int iE0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iE0 += zzbn.e0(list.get(i12).longValue());
        }
        this.f81156a.y0(iE0);
        while (i11 < list.size()) {
            this.f81156a.L(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.M1
    public final void zzj(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81156a.b0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f81156a.G(i10, 2);
        int iD0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iD0 += zzbn.D0(list.get(i12).intValue());
        }
        this.f81156a.y0(iD0);
        while (i11 < list.size()) {
            this.f81156a.y0(list.get(i11).intValue());
            i11++;
        }
    }
}
