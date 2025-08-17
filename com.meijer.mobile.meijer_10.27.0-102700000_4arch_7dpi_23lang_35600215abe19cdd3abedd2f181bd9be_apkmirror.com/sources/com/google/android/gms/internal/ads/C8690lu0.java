package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.lu0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8690lu0 implements InterfaceC8480jw0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC8583ku0 f76672a;

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zze(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f76672a.m(i10, (Zt0) list.get(i11));
        }
    }

    public static C8690lu0 d(AbstractC8583ku0 abstractC8583ku0) {
        C8690lu0 c8690lu0 = abstractC8583ku0.f75714a;
        return c8690lu0 != null ? c8690lu0 : new C8690lu0(abstractC8583ku0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void a(int i10, Object obj, Hv0 hv0) throws IOException {
        AbstractC8583ku0 abstractC8583ku0 = this.f76672a;
        abstractC8583ku0.y(i10, 3);
        hv0.c((InterfaceC9120pv0) obj, abstractC8583ku0.f75714a);
        abstractC8583ku0.y(i10, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void b(int i10, Object obj, Hv0 hv0) throws IOException {
        this.f76672a.u(i10, (InterfaceC9120pv0) obj, hv0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void c(int i10, Zt0 zt0) throws IOException {
        this.f76672a.m(i10, zt0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzA(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof C7945ev0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f76672a.q(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.f76672a.y(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            this.f76672a.A(i12);
            while (i11 < list.size()) {
                this.f76672a.r(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C7945ev0 c7945ev0 = (C7945ev0) list;
        if (!z10) {
            while (i11 < c7945ev0.size()) {
                this.f76672a.q(i10, c7945ev0.e(i11));
                i11++;
            }
            return;
        }
        this.f76672a.y(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c7945ev0.size(); i15++) {
            c7945ev0.e(i15);
            i14 += 8;
        }
        this.f76672a.A(i14);
        while (i11 < c7945ev0.size()) {
            this.f76672a.r(c7945ev0.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzB(int i10, int i11) throws IOException {
        this.f76672a.z(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzC(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof Hu0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    AbstractC8583ku0 abstractC8583ku0 = this.f76672a;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    abstractC8583ku0.z(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            this.f76672a.y(i10, 2);
            int iE = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iE += AbstractC8583ku0.e((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            this.f76672a.A(iE);
            while (i11 < list.size()) {
                AbstractC8583ku0 abstractC8583ku02 = this.f76672a;
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                abstractC8583ku02.A((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        Hu0 hu0 = (Hu0) list;
        if (!z10) {
            while (i11 < hu0.size()) {
                AbstractC8583ku0 abstractC8583ku03 = this.f76672a;
                int iE2 = hu0.e(i11);
                abstractC8583ku03.z(i10, (iE2 >> 31) ^ (iE2 + iE2));
                i11++;
            }
            return;
        }
        this.f76672a.y(i10, 2);
        int iE3 = 0;
        for (int i13 = 0; i13 < hu0.size(); i13++) {
            int iE4 = hu0.e(i13);
            iE3 += AbstractC8583ku0.e((iE4 >> 31) ^ (iE4 + iE4));
        }
        this.f76672a.A(iE3);
        while (i11 < hu0.size()) {
            AbstractC8583ku0 abstractC8583ku04 = this.f76672a;
            int iE5 = hu0.e(i11);
            abstractC8583ku04.A((iE5 >> 31) ^ (iE5 + iE5));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzD(int i10, long j10) throws IOException {
        this.f76672a.B(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzE(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof C7945ev0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    AbstractC8583ku0 abstractC8583ku0 = this.f76672a;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    abstractC8583ku0.B(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            this.f76672a.y(i10, 2);
            int iF = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iF += AbstractC8583ku0.f((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            this.f76672a.A(iF);
            while (i11 < list.size()) {
                AbstractC8583ku0 abstractC8583ku02 = this.f76672a;
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                abstractC8583ku02.C((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        C7945ev0 c7945ev0 = (C7945ev0) list;
        if (!z10) {
            while (i11 < c7945ev0.size()) {
                AbstractC8583ku0 abstractC8583ku03 = this.f76672a;
                long jE = c7945ev0.e(i11);
                abstractC8583ku03.B(i10, (jE >> 63) ^ (jE + jE));
                i11++;
            }
            return;
        }
        this.f76672a.y(i10, 2);
        int iF2 = 0;
        for (int i13 = 0; i13 < c7945ev0.size(); i13++) {
            long jE2 = c7945ev0.e(i13);
            iF2 += AbstractC8583ku0.f((jE2 >> 63) ^ (jE2 + jE2));
        }
        this.f76672a.A(iF2);
        while (i11 < c7945ev0.size()) {
            AbstractC8583ku0 abstractC8583ku04 = this.f76672a;
            long jE3 = c7945ev0.e(i11);
            abstractC8583ku04.C((jE3 >> 63) ^ (jE3 + jE3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    @Deprecated
    public final void zzF(int i10) throws IOException {
        this.f76672a.y(i10, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzG(int i10, String str) throws IOException {
        this.f76672a.x(i10, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzH(int i10, List list) throws IOException {
        int i11 = 0;
        if (!(list instanceof InterfaceC7626bv0)) {
            while (i11 < list.size()) {
                this.f76672a.x(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        InterfaceC7626bv0 interfaceC7626bv0 = (InterfaceC7626bv0) list;
        while (i11 < list.size()) {
            Object objZzc = interfaceC7626bv0.zzc();
            if (objZzc instanceof String) {
                this.f76672a.x(i10, (String) objZzc);
            } else {
                this.f76672a.m(i10, (Zt0) objZzc);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzI(int i10, int i11) throws IOException {
        this.f76672a.z(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzJ(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof Hu0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f76672a.z(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f76672a.y(i10, 2);
            int iE = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iE += AbstractC8583ku0.e(((Integer) list.get(i12)).intValue());
            }
            this.f76672a.A(iE);
            while (i11 < list.size()) {
                this.f76672a.A(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        Hu0 hu0 = (Hu0) list;
        if (!z10) {
            while (i11 < hu0.size()) {
                this.f76672a.z(i10, hu0.e(i11));
                i11++;
            }
            return;
        }
        this.f76672a.y(i10, 2);
        int iE2 = 0;
        for (int i13 = 0; i13 < hu0.size(); i13++) {
            iE2 += AbstractC8583ku0.e(hu0.e(i13));
        }
        this.f76672a.A(iE2);
        while (i11 < hu0.size()) {
            this.f76672a.A(hu0.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzK(int i10, long j10) throws IOException {
        this.f76672a.B(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzL(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof C7945ev0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f76672a.B(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.f76672a.y(i10, 2);
            int iF = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iF += AbstractC8583ku0.f(((Long) list.get(i12)).longValue());
            }
            this.f76672a.A(iF);
            while (i11 < list.size()) {
                this.f76672a.C(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C7945ev0 c7945ev0 = (C7945ev0) list;
        if (!z10) {
            while (i11 < c7945ev0.size()) {
                this.f76672a.B(i10, c7945ev0.e(i11));
                i11++;
            }
            return;
        }
        this.f76672a.y(i10, 2);
        int iF2 = 0;
        for (int i13 = 0; i13 < c7945ev0.size(); i13++) {
            iF2 += AbstractC8583ku0.f(c7945ev0.e(i13));
        }
        this.f76672a.A(iF2);
        while (i11 < c7945ev0.size()) {
            this.f76672a.C(c7945ev0.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzb(int i10, boolean z10) throws IOException {
        this.f76672a.l(i10, z10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzc(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof Ot0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f76672a.l(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            this.f76672a.y(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).getClass();
                i12++;
            }
            this.f76672a.A(i12);
            while (i11 < list.size()) {
                this.f76672a.k(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        Ot0 ot0 = (Ot0) list;
        if (!z10) {
            while (i11 < ot0.size()) {
                this.f76672a.l(i10, ot0.h(i11));
                i11++;
            }
            return;
        }
        this.f76672a.y(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < ot0.size(); i15++) {
            ot0.h(i15);
            i14++;
        }
        this.f76672a.A(i14);
        while (i11 < ot0.size()) {
            this.f76672a.k(ot0.h(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzf(int i10, double d10) throws IOException {
        this.f76672a.q(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzg(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof C8797mu0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f76672a.q(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            this.f76672a.y(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).getClass();
                i12 += 8;
            }
            this.f76672a.A(i12);
            while (i11 < list.size()) {
                this.f76672a.r(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        C8797mu0 c8797mu0 = (C8797mu0) list;
        if (!z10) {
            while (i11 < c8797mu0.size()) {
                this.f76672a.q(i10, Double.doubleToRawLongBits(c8797mu0.e(i11)));
                i11++;
            }
            return;
        }
        this.f76672a.y(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c8797mu0.size(); i15++) {
            c8797mu0.e(i15);
            i14 += 8;
        }
        this.f76672a.A(i14);
        while (i11 < c8797mu0.size()) {
            this.f76672a.r(Double.doubleToRawLongBits(c8797mu0.e(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    @Deprecated
    public final void zzh(int i10) throws IOException {
        this.f76672a.y(i10, 4);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzi(int i10, int i11) throws IOException {
        this.f76672a.s(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzj(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof Hu0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f76672a.s(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f76672a.y(i10, 2);
            int iF = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iF += AbstractC8583ku0.f(((Integer) list.get(i12)).intValue());
            }
            this.f76672a.A(iF);
            while (i11 < list.size()) {
                this.f76672a.t(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        Hu0 hu0 = (Hu0) list;
        if (!z10) {
            while (i11 < hu0.size()) {
                this.f76672a.s(i10, hu0.e(i11));
                i11++;
            }
            return;
        }
        this.f76672a.y(i10, 2);
        int iF2 = 0;
        for (int i13 = 0; i13 < hu0.size(); i13++) {
            iF2 += AbstractC8583ku0.f(hu0.e(i13));
        }
        this.f76672a.A(iF2);
        while (i11 < hu0.size()) {
            this.f76672a.t(hu0.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzk(int i10, int i11) throws IOException {
        this.f76672a.o(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzl(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof Hu0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f76672a.o(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f76672a.y(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            this.f76672a.A(i12);
            while (i11 < list.size()) {
                this.f76672a.p(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        Hu0 hu0 = (Hu0) list;
        if (!z10) {
            while (i11 < hu0.size()) {
                this.f76672a.o(i10, hu0.e(i11));
                i11++;
            }
            return;
        }
        this.f76672a.y(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < hu0.size(); i15++) {
            hu0.e(i15);
            i14 += 4;
        }
        this.f76672a.A(i14);
        while (i11 < hu0.size()) {
            this.f76672a.p(hu0.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzm(int i10, long j10) throws IOException {
        this.f76672a.q(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzn(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof C7945ev0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f76672a.q(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.f76672a.y(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            this.f76672a.A(i12);
            while (i11 < list.size()) {
                this.f76672a.r(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C7945ev0 c7945ev0 = (C7945ev0) list;
        if (!z10) {
            while (i11 < c7945ev0.size()) {
                this.f76672a.q(i10, c7945ev0.e(i11));
                i11++;
            }
            return;
        }
        this.f76672a.y(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c7945ev0.size(); i15++) {
            c7945ev0.e(i15);
            i14 += 8;
        }
        this.f76672a.A(i14);
        while (i11 < c7945ev0.size()) {
            this.f76672a.r(c7945ev0.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzo(int i10, float f10) throws IOException {
        this.f76672a.o(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzp(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof C9973xu0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f76672a.o(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            this.f76672a.y(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            this.f76672a.A(i12);
            while (i11 < list.size()) {
                this.f76672a.p(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        C9973xu0 c9973xu0 = (C9973xu0) list;
        if (!z10) {
            while (i11 < c9973xu0.size()) {
                this.f76672a.o(i10, Float.floatToRawIntBits(c9973xu0.e(i11)));
                i11++;
            }
            return;
        }
        this.f76672a.y(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c9973xu0.size(); i15++) {
            c9973xu0.e(i15);
            i14 += 4;
        }
        this.f76672a.A(i14);
        while (i11 < c9973xu0.size()) {
            this.f76672a.p(Float.floatToRawIntBits(c9973xu0.e(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzr(int i10, int i11) throws IOException {
        this.f76672a.s(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzs(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof Hu0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f76672a.s(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f76672a.y(i10, 2);
            int iF = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iF += AbstractC8583ku0.f(((Integer) list.get(i12)).intValue());
            }
            this.f76672a.A(iF);
            while (i11 < list.size()) {
                this.f76672a.t(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        Hu0 hu0 = (Hu0) list;
        if (!z10) {
            while (i11 < hu0.size()) {
                this.f76672a.s(i10, hu0.e(i11));
                i11++;
            }
            return;
        }
        this.f76672a.y(i10, 2);
        int iF2 = 0;
        for (int i13 = 0; i13 < hu0.size(); i13++) {
            iF2 += AbstractC8583ku0.f(hu0.e(i13));
        }
        this.f76672a.A(iF2);
        while (i11 < hu0.size()) {
            this.f76672a.t(hu0.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzt(int i10, long j10) throws IOException {
        this.f76672a.B(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzu(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof C7945ev0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f76672a.B(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            this.f76672a.y(i10, 2);
            int iF = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iF += AbstractC8583ku0.f(((Long) list.get(i12)).longValue());
            }
            this.f76672a.A(iF);
            while (i11 < list.size()) {
                this.f76672a.C(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C7945ev0 c7945ev0 = (C7945ev0) list;
        if (!z10) {
            while (i11 < c7945ev0.size()) {
                this.f76672a.B(i10, c7945ev0.e(i11));
                i11++;
            }
            return;
        }
        this.f76672a.y(i10, 2);
        int iF2 = 0;
        for (int i13 = 0; i13 < c7945ev0.size(); i13++) {
            iF2 += AbstractC8583ku0.f(c7945ev0.e(i13));
        }
        this.f76672a.A(iF2);
        while (i11 < c7945ev0.size()) {
            this.f76672a.C(c7945ev0.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzw(int i10, Object obj) throws IOException {
        if (obj instanceof Zt0) {
            this.f76672a.w(i10, (Zt0) obj);
        } else {
            this.f76672a.v(i10, (InterfaceC9120pv0) obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzx(int i10, int i11) throws IOException {
        this.f76672a.o(i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzy(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof Hu0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f76672a.o(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            this.f76672a.y(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            this.f76672a.A(i12);
            while (i11 < list.size()) {
                this.f76672a.p(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        Hu0 hu0 = (Hu0) list;
        if (!z10) {
            while (i11 < hu0.size()) {
                this.f76672a.o(i10, hu0.e(i11));
                i11++;
            }
            return;
        }
        this.f76672a.y(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < hu0.size(); i15++) {
            hu0.e(i15);
            i14 += 4;
        }
        this.f76672a.A(i14);
        while (i11 < hu0.size()) {
            this.f76672a.p(hu0.e(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8480jw0
    public final void zzz(int i10, long j10) throws IOException {
        this.f76672a.q(i10, j10);
    }

    private C8690lu0(AbstractC8583ku0 abstractC8583ku0) {
        Tu0.c(abstractC8583ku0, "output");
        this.f76672a = abstractC8583ku0;
        abstractC8583ku0.f75714a = this;
    }
}
