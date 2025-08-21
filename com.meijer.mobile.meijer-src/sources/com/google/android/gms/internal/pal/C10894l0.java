package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.pal.l0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10894l0 implements InterfaceC10749c2 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC10878k0 f84059a;

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void zzB(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                AbstractC10878k0 abstractC10878k0 = this.f84059a;
                int iIntValue = ((Integer) list.get(i11)).intValue();
                abstractC10878k0.t(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i11++;
            }
            return;
        }
        this.f84059a.s(i10, 2);
        int iA = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue2 = ((Integer) list.get(i12)).intValue();
            iA += AbstractC10878k0.a((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        this.f84059a.u(iA);
        while (i11 < list.size()) {
            AbstractC10878k0 abstractC10878k02 = this.f84059a;
            int iIntValue3 = ((Integer) list.get(i11)).intValue();
            abstractC10878k02.u((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void zzI(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f84059a.t(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f84059a.s(i10, 2);
        int iA = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iA += AbstractC10878k0.a(((Integer) list.get(i12)).intValue());
        }
        this.f84059a.u(iA);
        while (i11 < list.size()) {
            this.f84059a.u(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void zzK(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f84059a.v(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f84059a.s(i10, 2);
        int iB = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iB += AbstractC10878k0.b(((Long) list.get(i12)).longValue());
        }
        this.f84059a.u(iB);
        while (i11 < list.size()) {
            this.f84059a.w(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void zzc(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f84059a.i(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f84059a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        this.f84059a.u(i12);
        while (i11 < list.size()) {
            this.f84059a.h(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void zze(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f84059a.j(i10, (AbstractC10730b0) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void zzg(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f84059a.m(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        this.f84059a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        this.f84059a.u(i12);
        while (i11 < list.size()) {
            this.f84059a.n(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void zzj(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f84059a.o(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f84059a.s(i10, 2);
        int iZ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZ += AbstractC10878k0.z(((Integer) list.get(i12)).intValue());
        }
        this.f84059a.u(iZ);
        while (i11 < list.size()) {
            this.f84059a.p(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void zzl(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f84059a.k(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f84059a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            i12 += 4;
        }
        this.f84059a.u(i12);
        while (i11 < list.size()) {
            this.f84059a.l(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void zzn(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f84059a.m(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f84059a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        this.f84059a.u(i12);
        while (i11 < list.size()) {
            this.f84059a.n(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void zzp(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f84059a.k(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        this.f84059a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            i12 += 4;
        }
        this.f84059a.u(i12);
        while (i11 < list.size()) {
            this.f84059a.l(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void zzs(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f84059a.o(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f84059a.s(i10, 2);
        int iZ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZ += AbstractC10878k0.z(((Integer) list.get(i12)).intValue());
        }
        this.f84059a.u(iZ);
        while (i11 < list.size()) {
            this.f84059a.p(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void zzu(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f84059a.v(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f84059a.s(i10, 2);
        int iB = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iB += AbstractC10878k0.b(((Long) list.get(i12)).longValue());
        }
        this.f84059a.u(iB);
        while (i11 < list.size()) {
            this.f84059a.w(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void zzx(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f84059a.k(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f84059a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            i12 += 4;
        }
        this.f84059a.u(i12);
        while (i11 < list.size()) {
            this.f84059a.l(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void zzz(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f84059a.m(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f84059a.s(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        this.f84059a.u(i12);
        while (i11 < list.size()) {
            this.f84059a.n(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static C10894l0 l(AbstractC10878k0 abstractC10878k0) {
        C10894l0 c10894l0 = abstractC10878k0.f84042a;
        return c10894l0 != null ? c10894l0 : new C10894l0(abstractC10878k0);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void a(int i10, int i11) throws IOException {
        this.f84059a.k(i10, i11);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void b(int i10, Object obj, InterfaceC11006s1 interfaceC11006s1) throws IOException {
        Object obj2 = (InterfaceC10815g1) obj;
        C10846i0 c10846i0 = (C10846i0) this.f84059a;
        c10846i0.u((i10 << 3) | 2);
        K k10 = (K) obj2;
        int iC = k10.c();
        if (iC == -1) {
            iC = interfaceC11006s1.zza(k10);
            k10.d(iC);
        }
        c10846i0.u(iC);
        interfaceC11006s1.b(obj2, c10846i0.f84042a);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void c(int i10, int i11) throws IOException {
        this.f84059a.t(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void d(int i10, String str) throws IOException {
        this.f84059a.r(i10, str);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void e(int i10, Object obj, InterfaceC11006s1 interfaceC11006s1) throws IOException {
        AbstractC10878k0 abstractC10878k0 = this.f84059a;
        abstractC10878k0.s(i10, 3);
        interfaceC11006s1.b((InterfaceC10815g1) obj, abstractC10878k0.f84042a);
        abstractC10878k0.s(i10, 4);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void f(int i10, AbstractC10730b0 abstractC10730b0) throws IOException {
        this.f84059a.j(i10, abstractC10730b0);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    @Deprecated
    public final void g(int i10) throws IOException {
        this.f84059a.s(i10, 3);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void h(int i10, long j10) throws IOException {
        this.f84059a.v(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void i(int i10, int i11) throws IOException {
        this.f84059a.t(i10, i11);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void j(int i10, long j10) throws IOException {
        this.f84059a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void k(int i10, long j10) throws IOException {
        this.f84059a.v(i10, j10);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void zzD(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                AbstractC10878k0 abstractC10878k0 = this.f84059a;
                long jLongValue = ((Long) list.get(i11)).longValue();
                abstractC10878k0.v(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return;
        }
        this.f84059a.s(i10, 2);
        int iB = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iB += AbstractC10878k0.b((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.f84059a.u(iB);
        while (i11 < list.size()) {
            AbstractC10878k0 abstractC10878k02 = this.f84059a;
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            abstractC10878k02.w((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void zzG(int i10, List list) throws IOException {
        int i11 = 0;
        if (!(list instanceof N0)) {
            while (i11 < list.size()) {
                this.f84059a.r(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        N0 n02 = (N0) list;
        while (i11 < list.size()) {
            Object objZzf = n02.zzf(i11);
            if (objZzf instanceof String) {
                this.f84059a.r(i10, (String) objZzf);
            } else {
                this.f84059a.j(i10, (AbstractC10730b0) objZzf);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void zzb(int i10, boolean z10) throws IOException {
        this.f84059a.i(i10, z10);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void zzf(int i10, double d10) throws IOException {
        this.f84059a.m(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    @Deprecated
    public final void zzh(int i10) throws IOException {
        this.f84059a.s(i10, 4);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void zzi(int i10, int i11) throws IOException {
        this.f84059a.o(i10, i11);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void zzk(int i10, int i11) throws IOException {
        this.f84059a.k(i10, i11);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void zzm(int i10, long j10) throws IOException {
        this.f84059a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void zzo(int i10, float f10) throws IOException {
        this.f84059a.k(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void zzr(int i10, int i11) throws IOException {
        this.f84059a.o(i10, i11);
    }

    @Override // com.google.android.gms.internal.pal.InterfaceC10749c2
    public final void zzt(int i10, long j10) throws IOException {
        this.f84059a.v(i10, j10);
    }

    private C10894l0(AbstractC10878k0 abstractC10878k0) {
        J0.f(abstractC10878k0, "output");
        this.f84059a = abstractC10878k0;
        abstractC10878k0.f84042a = this;
    }
}
