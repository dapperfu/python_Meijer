package com.google.android.gms.internal.atv_ads_framework;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.y0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10272y0 implements i2 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC10269x0 f81081a;

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void a(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81081a.j(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f81081a.p(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        this.f81081a.r(i12);
        while (i11 < list.size()) {
            this.f81081a.k(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void b(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81081a.l(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f81081a.p(i10, 2);
        int iV = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iV += AbstractC10269x0.v(((Integer) list.get(i12)).intValue());
        }
        this.f81081a.r(iV);
        while (i11 < list.size()) {
            this.f81081a.m(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void d(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81081a.h(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f81081a.p(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            i12 += 4;
        }
        this.f81081a.r(i12);
        while (i11 < list.size()) {
            this.f81081a.i(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void e(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81081a.l(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f81081a.p(i10, 2);
        int iV = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iV += AbstractC10269x0.v(((Integer) list.get(i12)).intValue());
        }
        this.f81081a.r(iV);
        while (i11 < list.size()) {
            this.f81081a.m(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void g(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81081a.s(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f81081a.p(i10, 2);
        int iZ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZ += AbstractC10269x0.z(((Long) list.get(i12)).longValue());
        }
        this.f81081a.r(iZ);
        while (i11 < list.size()) {
            this.f81081a.t(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void n(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81081a.h(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        this.f81081a.p(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            i12 += 4;
        }
        this.f81081a.r(i12);
        while (i11 < list.size()) {
            this.f81081a.i(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void p(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81081a.q(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f81081a.p(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iY += AbstractC10269x0.y(((Integer) list.get(i12)).intValue());
        }
        this.f81081a.r(iY);
        while (i11 < list.size()) {
            this.f81081a.r(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void zzA(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                AbstractC10269x0 abstractC10269x0 = this.f81081a;
                int iIntValue = ((Integer) list.get(i11)).intValue();
                abstractC10269x0.q(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i11++;
            }
            return;
        }
        this.f81081a.p(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue2 = ((Integer) list.get(i12)).intValue();
            iY += AbstractC10269x0.y((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        this.f81081a.r(iY);
        while (i11 < list.size()) {
            AbstractC10269x0 abstractC10269x02 = this.f81081a;
            int iIntValue3 = ((Integer) list.get(i11)).intValue();
            abstractC10269x02.r((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void zzI(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81081a.s(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f81081a.p(i10, 2);
        int iZ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iZ += AbstractC10269x0.z(((Long) list.get(i12)).longValue());
        }
        this.f81081a.r(iZ);
        while (i11 < list.size()) {
            this.f81081a.t(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void zzc(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81081a.f(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        this.f81081a.p(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            i12++;
        }
        this.f81081a.r(i12);
        while (i11 < list.size()) {
            this.f81081a.e(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void zze(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f81081a.g(i10, (AbstractC10249q0) list.get(i11));
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void zzg(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81081a.j(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        this.f81081a.p(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            i12 += 8;
        }
        this.f81081a.r(i12);
        while (i11 < list.size()) {
            this.f81081a.k(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void zzw(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81081a.h(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        this.f81081a.p(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            i12 += 4;
        }
        this.f81081a.r(i12);
        while (i11 < list.size()) {
            this.f81081a.i(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void zzy(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f81081a.j(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        this.f81081a.p(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            i12 += 8;
        }
        this.f81081a.r(i12);
        while (i11 < list.size()) {
            this.f81081a.k(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static C10272y0 x(AbstractC10269x0 abstractC10269x0) {
        C10272y0 c10272y0 = abstractC10269x0.f81075a;
        return c10272y0 != null ? c10272y0 : new C10272y0(abstractC10269x0);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void c(int i10, int i11) throws IOException {
        this.f81081a.h(i10, i11);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void f(int i10, long j10) throws IOException {
        this.f81081a.s(i10, j10);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void h(int i10, List list) throws IOException {
        int i11 = 0;
        if (!(list instanceof W0)) {
            while (i11 < list.size()) {
                this.f81081a.o(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        W0 w02 = (W0) list;
        while (i11 < list.size()) {
            Object objZze = w02.zze(i11);
            if (objZze instanceof String) {
                this.f81081a.o(i10, (String) objZze);
            } else {
                this.f81081a.g(i10, (AbstractC10249q0) objZze);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void i(int i10, int i11) throws IOException {
        this.f81081a.l(i10, i11);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void j(int i10, Object obj, InterfaceC10276z1 interfaceC10276z1) throws IOException {
        AbstractC10269x0 abstractC10269x0 = this.f81081a;
        abstractC10269x0.p(i10, 3);
        interfaceC10276z1.b((InterfaceC10247p1) obj, abstractC10269x0.f81075a);
        abstractC10269x0.p(i10, 4);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void k(int i10, long j10) throws IOException {
        this.f81081a.j(i10, j10);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void l(int i10, long j10) throws IOException {
        this.f81081a.s(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void m(int i10, int i11) throws IOException {
        this.f81081a.h(i10, i11);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void o(int i10, Object obj, InterfaceC10276z1 interfaceC10276z1) throws IOException {
        InterfaceC10247p1 interfaceC10247p1 = (InterfaceC10247p1) obj;
        C10263v0 c10263v0 = (C10263v0) this.f81081a;
        c10263v0.r((i10 << 3) | 2);
        c10263v0.r(((AbstractC10210d0) interfaceC10247p1).b(interfaceC10276z1));
        interfaceC10276z1.b(interfaceC10247p1, c10263v0.f81075a);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void q(int i10, long j10) throws IOException {
        this.f81081a.s(i10, j10);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void q0(int i10, long j10) throws IOException {
        this.f81081a.j(i10, j10);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void r(int i10, int i11) throws IOException {
        this.f81081a.l(i10, i11);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void s(int i10, int i11) throws IOException {
        this.f81081a.q(i10, i11);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void t(int i10, int i11) throws IOException {
        this.f81081a.q(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void u(int i10, AbstractC10249q0 abstractC10249q0) throws IOException {
        this.f81081a.g(i10, abstractC10249q0);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void v(int i10, float f10) throws IOException {
        this.f81081a.h(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void w(int i10, String str) throws IOException {
        this.f81081a.o(i10, str);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void zzC(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                AbstractC10269x0 abstractC10269x0 = this.f81081a;
                long jLongValue = ((Long) list.get(i11)).longValue();
                abstractC10269x0.s(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i11++;
            }
            return;
        }
        this.f81081a.p(i10, 2);
        int iZ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iZ += AbstractC10269x0.z((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.f81081a.r(iZ);
        while (i11 < list.size()) {
            AbstractC10269x0 abstractC10269x02 = this.f81081a;
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            abstractC10269x02.t((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void zzb(int i10, boolean z10) throws IOException {
        this.f81081a.f(i10, z10);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.i2
    public final void zzf(int i10, double d10) throws IOException {
        this.f81081a.j(i10, Double.doubleToRawLongBits(d10));
    }

    private C10272y0(AbstractC10269x0 abstractC10269x0) {
        byte[] bArr = S0.f80875d;
        this.f81081a = abstractC10269x0;
        abstractC10269x0.f81075a = this;
    }
}
