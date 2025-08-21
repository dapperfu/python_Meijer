package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.x0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11210x0 implements C2 {

    /* renamed from: a, reason: collision with root package name */
    private final zzii f85520a;

    @Override // com.google.android.gms.internal.vision.C2
    public final void C(int i10, List<?> list, O1 o12) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            A(i10, list.get(i11), o12);
        }
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void a(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f85520a.f0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f85520a.m(i10, 2);
        int iS0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iS0 += zzii.s0(list.get(i12).intValue());
        }
        this.f85520a.O(iS0);
        while (i11 < list.size()) {
            this.f85520a.W(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void b(int i10, List<Boolean> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f85520a.s(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f85520a.m(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iL += zzii.L(list.get(i12).booleanValue());
        }
        this.f85520a.O(iL);
        while (i11 < list.size()) {
            this.f85520a.y(list.get(i11).booleanValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void d(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f85520a.j0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f85520a.m(i10, 2);
        int iZ0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZ0 += zzii.z0(list.get(i12).intValue());
        }
        this.f85520a.O(iZ0);
        while (i11 < list.size()) {
            this.f85520a.e0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void f(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f85520a.P(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f85520a.m(i10, 2);
        int iK0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iK0 += zzii.k0(list.get(i12).intValue());
        }
        this.f85520a.O(iK0);
        while (i11 < list.size()) {
            this.f85520a.j(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void i(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f85520a.j0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f85520a.m(i10, 2);
        int iW0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iW0 += zzii.w0(list.get(i12).intValue());
        }
        this.f85520a.O(iW0);
        while (i11 < list.size()) {
            this.f85520a.e0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void q(int i10, List<AbstractC11161h0> list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f85520a.o(i10, list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void u(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f85520a.P(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f85520a.m(i10, 2);
        int iB0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iB0 += zzii.B0(list.get(i12).intValue());
        }
        this.f85520a.O(iB0);
        while (i11 < list.size()) {
            this.f85520a.j(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void v(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f85520a.Y(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f85520a.m(i10, 2);
        int iR0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iR0 += zzii.r0(list.get(i12).longValue());
        }
        this.f85520a.O(iR0);
        while (i11 < list.size()) {
            this.f85520a.Z(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void w(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f85520a.n(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f85520a.m(i10, 2);
        int iI0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iI0 += zzii.i0(list.get(i12).longValue());
        }
        this.f85520a.O(iI0);
        while (i11 < list.size()) {
            this.f85520a.t(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void x(int i10, List<Float> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f85520a.l(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f85520a.m(i10, 2);
        int iA = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iA += zzii.A(list.get(i12).floatValue());
        }
        this.f85520a.O(iA);
        while (i11 < list.size()) {
            this.f85520a.i(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void z(int i10, List<?> list, O1 o12) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            B(i10, list.get(i11), o12);
        }
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final int zza() {
        return B2.f85122a;
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void zzb(int i10, int i11) throws IOException {
        this.f85520a.P(i10, i11);
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void zzc(int i10, long j10) throws IOException {
        this.f85520a.n(i10, j10);
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void zzg(int i10, List<Double> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f85520a.k(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f85520a.m(i10, 2);
        int iZ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZ += zzii.z(list.get(i12).doubleValue());
        }
        this.f85520a.O(iZ);
        while (i11 < list.size()) {
            this.f85520a.h(list.get(i11).doubleValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void zzj(int i10, List<Integer> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f85520a.X(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f85520a.m(i10, 2);
        int iO0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iO0 += zzii.o0(list.get(i12).intValue());
        }
        this.f85520a.O(iO0);
        while (i11 < list.size()) {
            this.f85520a.O(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void zzl(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f85520a.Y(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f85520a.m(i10, 2);
        int iV0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iV0 += zzii.v0(list.get(i12).longValue());
        }
        this.f85520a.O(iV0);
        while (i11 < list.size()) {
            this.f85520a.Z(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void zzn(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f85520a.Q(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f85520a.m(i10, 2);
        int iN0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iN0 += zzii.n0(list.get(i12).longValue());
        }
        this.f85520a.O(iN0);
        while (i11 < list.size()) {
            this.f85520a.S(list.get(i11).longValue());
            i11++;
        }
    }

    public static C11210x0 D(zzii zziiVar) {
        C11210x0 c11210x0 = zziiVar.f85538a;
        return c11210x0 != null ? c11210x0 : new C11210x0(zziiVar);
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void A(int i10, Object obj, O1 o12) throws IOException {
        this.f85520a.q(i10, (InterfaceC11208w1) obj, o12);
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void B(int i10, Object obj, O1 o12) throws IOException {
        zzii zziiVar = this.f85520a;
        zziiVar.m(i10, 3);
        o12.c((InterfaceC11208w1) obj, zziiVar.f85538a);
        zziiVar.m(i10, 4);
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void c(int i10, String str) throws IOException {
        this.f85520a.r(i10, str);
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void e(int i10, long j10) throws IOException {
        this.f85520a.Y(i10, j10);
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void g(int i10, int i11) throws IOException {
        this.f85520a.P(i10, i11);
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void h(int i10, Object obj) throws IOException {
        if (obj instanceof AbstractC11161h0) {
            this.f85520a.R(i10, (AbstractC11161h0) obj);
        } else {
            this.f85520a.p(i10, (InterfaceC11208w1) obj);
        }
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void j(int i10, int i11) throws IOException {
        this.f85520a.j0(i10, i11);
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void k(int i10, double d10) throws IOException {
        this.f85520a.k(i10, d10);
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void l(int i10, float f10) throws IOException {
        this.f85520a.l(i10, f10);
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void m(int i10, int i11) throws IOException {
        this.f85520a.f0(i10, i11);
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void n(int i10, long j10) throws IOException {
        this.f85520a.Q(i10, j10);
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void o(int i10, boolean z10) throws IOException {
        this.f85520a.s(i10, z10);
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void p(int i10, AbstractC11161h0 abstractC11161h0) throws IOException {
        this.f85520a.o(i10, abstractC11161h0);
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void r(int i10, int i11) throws IOException {
        this.f85520a.j0(i10, i11);
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void s(int i10, int i11) throws IOException {
        this.f85520a.X(i10, i11);
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void t(int i10, List<String> list) throws IOException {
        int i11 = 0;
        if (!(list instanceof InterfaceC11158g1)) {
            while (i11 < list.size()) {
                this.f85520a.r(i10, list.get(i11));
                i11++;
            }
            return;
        }
        InterfaceC11158g1 interfaceC11158g1 = (InterfaceC11158g1) list;
        while (i11 < list.size()) {
            Object objZzb = interfaceC11158g1.zzb(i11);
            if (objZzb instanceof String) {
                this.f85520a.r(i10, (String) objZzb);
            } else {
                this.f85520a.o(i10, (AbstractC11161h0) objZzb);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void zza(int i10, long j10) throws IOException {
        this.f85520a.n(i10, j10);
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void zzc(int i10, List<Long> list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f85520a.n(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f85520a.m(i10, 2);
        int iD0 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iD0 += zzii.d0(list.get(i12).longValue());
        }
        this.f85520a.O(iD0);
        while (i11 < list.size()) {
            this.f85520a.t(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void zzd(int i10, long j10) throws IOException {
        this.f85520a.Y(i10, j10);
    }

    private C11210x0(zzii zziiVar) {
        zzii zziiVar2 = (zzii) S0.f(zziiVar, "output");
        this.f85520a = zziiVar2;
        zziiVar2.f85538a = this;
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final <K, V> void y(int i10, C11193r1<K, V> c11193r1, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f85520a.m(i10, 2);
            this.f85520a.O(C11185o1.a(c11193r1, entry.getKey(), entry.getValue()));
            C11185o1.b(this.f85520a, c11193r1, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void zzb(int i10) throws IOException {
        this.f85520a.m(i10, 4);
    }

    @Override // com.google.android.gms.internal.vision.C2
    public final void zza(int i10) throws IOException {
        this.f85520a.m(i10, 3);
    }
}
