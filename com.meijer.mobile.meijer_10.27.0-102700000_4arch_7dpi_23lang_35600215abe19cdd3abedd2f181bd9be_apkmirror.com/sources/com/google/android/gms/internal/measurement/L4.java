package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
final class L4 implements InterfaceC10531t6 {

    /* renamed from: a, reason: collision with root package name */
    private final K4 f81827a;

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzG(int i10, List list) throws IOException {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f81827a.q(i10, (G4) list.get(i11));
        }
    }

    public static L4 e(K4 k42) {
        L4 l42 = k42.f81817a;
        return l42 != null ? l42 : new L4(k42);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void b(int i10, Object obj, V5 v52) throws IOException {
        this.f81827a.t(i10, (K5) obj, v52);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void c(int i10, Object obj, V5 v52) throws IOException {
        K4 k42 = this.f81827a;
        k42.i(i10, 3);
        v52.d((K5) obj, k42.f81817a);
        k42.i(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void d(int i10, G4 g42) throws IOException {
        this.f81827a.q(i10, g42);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzA(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof C10575y5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f81827a.n(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            K4 k42 = this.f81827a;
            k42.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            k42.z(i12);
            while (i11 < list.size()) {
                k42.C(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C10575y5 c10575y5 = (C10575y5) list;
        if (!z10) {
            while (i11 < c10575y5.size()) {
                this.f81827a.n(i10, c10575y5.zzc(i11));
                i11++;
            }
            return;
        }
        K4 k43 = this.f81827a;
        k43.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c10575y5.size(); i15++) {
            c10575y5.zzc(i15);
            i14 += 8;
        }
        k43.z(i14);
        while (i11 < c10575y5.size()) {
            k43.C(c10575y5.zzc(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzB(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof W4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f81827a.l(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                    i11++;
                }
                return;
            }
            K4 k42 = this.f81827a;
            k42.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Float) list.get(i13)).getClass();
                i12 += 4;
            }
            k42.z(i12);
            while (i11 < list.size()) {
                k42.A(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        W4 w42 = (W4) list;
        if (!z10) {
            while (i11 < w42.size()) {
                this.f81827a.l(i10, Float.floatToRawIntBits(w42.f(i11)));
                i11++;
            }
            return;
        }
        K4 k43 = this.f81827a;
        k43.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < w42.size(); i15++) {
            w42.f(i15);
            i14 += 4;
        }
        k43.z(i14);
        while (i11 < w42.size()) {
            k43.A(Float.floatToRawIntBits(w42.f(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzC(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof M4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f81827a.n(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                    i11++;
                }
                return;
            }
            K4 k42 = this.f81827a;
            k42.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Double) list.get(i13)).getClass();
                i12 += 8;
            }
            k42.z(i12);
            while (i11 < list.size()) {
                k42.C(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        M4 m42 = (M4) list;
        if (!z10) {
            while (i11 < m42.size()) {
                this.f81827a.n(i10, Double.doubleToRawLongBits(m42.f(i11)));
                i11++;
            }
            return;
        }
        K4 k43 = this.f81827a;
        k43.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < m42.size(); i15++) {
            m42.f(i15);
            i14 += 8;
        }
        k43.z(i14);
        while (i11 < m42.size()) {
            k43.C(Double.doubleToRawLongBits(m42.f(i11)));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzD(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof C10405f5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f81827a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            K4 k42 = this.f81827a;
            k42.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += K4.a(((Integer) list.get(i12)).intValue());
            }
            k42.z(iA);
            while (i11 < list.size()) {
                k42.y(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C10405f5 c10405f5 = (C10405f5) list;
        if (!z10) {
            while (i11 < c10405f5.size()) {
                this.f81827a.j(i10, c10405f5.f(i11));
                i11++;
            }
            return;
        }
        K4 k43 = this.f81827a;
        k43.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c10405f5.size(); i13++) {
            iA2 += K4.a(c10405f5.f(i13));
        }
        k43.z(iA2);
        while (i11 < c10405f5.size()) {
            k43.y(c10405f5.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzE(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof C10556w4)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f81827a.o(i10, ((Boolean) list.get(i11)).booleanValue());
                    i11++;
                }
                return;
            }
            K4 k42 = this.f81827a;
            k42.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Boolean) list.get(i13)).getClass();
                i12++;
            }
            k42.z(i12);
            while (i11 < list.size()) {
                k42.x(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
                i11++;
            }
            return;
        }
        C10556w4 c10556w4 = (C10556w4) list;
        if (!z10) {
            while (i11 < c10556w4.size()) {
                this.f81827a.o(i10, c10556w4.f(i11));
                i11++;
            }
            return;
        }
        K4 k43 = this.f81827a;
        k43.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c10556w4.size(); i15++) {
            c10556w4.f(i15);
            i14++;
        }
        k43.z(i14);
        while (i11 < c10556w4.size()) {
            k43.x(c10556w4.f(i11) ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzF(int i10, List list) throws IOException {
        int i11 = 0;
        if (!(list instanceof InterfaceC10539u5)) {
            while (i11 < list.size()) {
                this.f81827a.p(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        InterfaceC10539u5 interfaceC10539u5 = (InterfaceC10539u5) list;
        while (i11 < list.size()) {
            Object objZzc = interfaceC10539u5.zzc();
            if (objZzc instanceof String) {
                this.f81827a.p(i10, (String) objZzc);
            } else {
                this.f81827a.q(i10, (G4) objZzc);
            }
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzH(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof C10405f5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f81827a.k(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            K4 k42 = this.f81827a;
            k42.i(i10, 2);
            int iG = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iG += K4.G(((Integer) list.get(i12)).intValue());
            }
            k42.z(iG);
            while (i11 < list.size()) {
                k42.z(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C10405f5 c10405f5 = (C10405f5) list;
        if (!z10) {
            while (i11 < c10405f5.size()) {
                this.f81827a.k(i10, c10405f5.f(i11));
                i11++;
            }
            return;
        }
        K4 k43 = this.f81827a;
        k43.i(i10, 2);
        int iG2 = 0;
        for (int i13 = 0; i13 < c10405f5.size(); i13++) {
            iG2 += K4.G(c10405f5.f(i13));
        }
        k43.z(iG2);
        while (i11 < c10405f5.size()) {
            k43.z(c10405f5.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzI(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof C10405f5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f81827a.l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            K4 k42 = this.f81827a;
            k42.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            k42.z(i12);
            while (i11 < list.size()) {
                k42.A(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C10405f5 c10405f5 = (C10405f5) list;
        if (!z10) {
            while (i11 < c10405f5.size()) {
                this.f81827a.l(i10, c10405f5.f(i11));
                i11++;
            }
            return;
        }
        K4 k43 = this.f81827a;
        k43.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c10405f5.size(); i15++) {
            c10405f5.f(i15);
            i14 += 4;
        }
        k43.z(i14);
        while (i11 < c10405f5.size()) {
            k43.A(c10405f5.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzJ(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof C10575y5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f81827a.n(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            K4 k42 = this.f81827a;
            k42.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                i12 += 8;
            }
            k42.z(i12);
            while (i11 < list.size()) {
                k42.C(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C10575y5 c10575y5 = (C10575y5) list;
        if (!z10) {
            while (i11 < c10575y5.size()) {
                this.f81827a.n(i10, c10575y5.zzc(i11));
                i11++;
            }
            return;
        }
        K4 k43 = this.f81827a;
        k43.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c10575y5.size(); i15++) {
            c10575y5.zzc(i15);
            i14 += 8;
        }
        k43.z(i14);
        while (i11 < c10575y5.size()) {
            k43.C(c10575y5.zzc(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzK(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof C10405f5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    K4 k42 = this.f81827a;
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    k42.k(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            K4 k43 = this.f81827a;
            k43.i(i10, 2);
            int iG = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iG += K4.G((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            k43.z(iG);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                k43.z((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        C10405f5 c10405f5 = (C10405f5) list;
        if (!z10) {
            while (i11 < c10405f5.size()) {
                K4 k44 = this.f81827a;
                int iF = c10405f5.f(i11);
                k44.k(i10, (iF >> 31) ^ (iF + iF));
                i11++;
            }
            return;
        }
        K4 k45 = this.f81827a;
        k45.i(i10, 2);
        int iG2 = 0;
        for (int i13 = 0; i13 < c10405f5.size(); i13++) {
            int iF2 = c10405f5.f(i13);
            iG2 += K4.G((iF2 >> 31) ^ (iF2 + iF2));
        }
        k45.z(iG2);
        while (i11 < c10405f5.size()) {
            int iF3 = c10405f5.f(i11);
            k45.z((iF3 >> 31) ^ (iF3 + iF3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzL(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof C10575y5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    K4 k42 = this.f81827a;
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    k42.m(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            K4 k43 = this.f81827a;
            k43.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iA += K4.a((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            k43.z(iA);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                k43.B((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        C10575y5 c10575y5 = (C10575y5) list;
        if (!z10) {
            while (i11 < c10575y5.size()) {
                K4 k44 = this.f81827a;
                long jZzc = c10575y5.zzc(i11);
                k44.m(i10, (jZzc >> 63) ^ (jZzc + jZzc));
                i11++;
            }
            return;
        }
        K4 k45 = this.f81827a;
        k45.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c10575y5.size(); i13++) {
            long jZzc2 = c10575y5.zzc(i13);
            iA2 += K4.a((jZzc2 >> 63) ^ (jZzc2 + jZzc2));
        }
        k45.z(iA2);
        while (i11 < c10575y5.size()) {
            long jZzc3 = c10575y5.zzc(i11);
            k45.B((jZzc3 >> 63) ^ (jZzc3 + jZzc3));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzb(int i10, int i11) throws IOException {
        this.f81827a.l(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzc(int i10, long j10) throws IOException {
        this.f81827a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzd(int i10, long j10) throws IOException {
        this.f81827a.n(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zze(int i10, float f10) throws IOException {
        this.f81827a.l(i10, Float.floatToRawIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzf(int i10, double d10) throws IOException {
        this.f81827a.n(i10, Double.doubleToRawLongBits(d10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzg(int i10, int i11) throws IOException {
        this.f81827a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzh(int i10, long j10) throws IOException {
        this.f81827a.m(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzi(int i10, int i11) throws IOException {
        this.f81827a.j(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzj(int i10, long j10) throws IOException {
        this.f81827a.n(i10, j10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzk(int i10, int i11) throws IOException {
        this.f81827a.l(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzl(int i10, boolean z10) throws IOException {
        this.f81827a.o(i10, z10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzm(int i10, String str) throws IOException {
        this.f81827a.p(i10, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzo(int i10, int i11) throws IOException {
        this.f81827a.k(i10, i11);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzp(int i10, int i11) throws IOException {
        this.f81827a.k(i10, (i11 >> 31) ^ (i11 + i11));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzq(int i10, long j10) throws IOException {
        this.f81827a.m(i10, (j10 >> 63) ^ (j10 + j10));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    @Deprecated
    public final void zzt(int i10) throws IOException {
        this.f81827a.i(i10, 3);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    @Deprecated
    public final void zzu(int i10) throws IOException {
        this.f81827a.i(i10, 4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzv(int i10, Object obj) throws IOException {
        if (obj instanceof G4) {
            this.f81827a.v(i10, (G4) obj);
        } else {
            this.f81827a.u(i10, (K5) obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzw(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof C10405f5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f81827a.j(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            K4 k42 = this.f81827a;
            k42.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += K4.a(((Integer) list.get(i12)).intValue());
            }
            k42.z(iA);
            while (i11 < list.size()) {
                k42.y(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C10405f5 c10405f5 = (C10405f5) list;
        if (!z10) {
            while (i11 < c10405f5.size()) {
                this.f81827a.j(i10, c10405f5.f(i11));
                i11++;
            }
            return;
        }
        K4 k43 = this.f81827a;
        k43.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c10405f5.size(); i13++) {
            iA2 += K4.a(c10405f5.f(i13));
        }
        k43.z(iA2);
        while (i11 < c10405f5.size()) {
            k43.y(c10405f5.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzx(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof C10405f5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f81827a.l(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            K4 k42 = this.f81827a;
            k42.i(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                i12 += 4;
            }
            k42.z(i12);
            while (i11 < list.size()) {
                k42.A(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        C10405f5 c10405f5 = (C10405f5) list;
        if (!z10) {
            while (i11 < c10405f5.size()) {
                this.f81827a.l(i10, c10405f5.f(i11));
                i11++;
            }
            return;
        }
        K4 k43 = this.f81827a;
        k43.i(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < c10405f5.size(); i15++) {
            c10405f5.f(i15);
            i14 += 4;
        }
        k43.z(i14);
        while (i11 < c10405f5.size()) {
            k43.A(c10405f5.f(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzy(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof C10575y5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f81827a.m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            K4 k42 = this.f81827a;
            k42.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += K4.a(((Long) list.get(i12)).longValue());
            }
            k42.z(iA);
            while (i11 < list.size()) {
                k42.B(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C10575y5 c10575y5 = (C10575y5) list;
        if (!z10) {
            while (i11 < c10575y5.size()) {
                this.f81827a.m(i10, c10575y5.zzc(i11));
                i11++;
            }
            return;
        }
        K4 k43 = this.f81827a;
        k43.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c10575y5.size(); i13++) {
            iA2 += K4.a(c10575y5.zzc(i13));
        }
        k43.z(iA2);
        while (i11 < c10575y5.size()) {
            k43.B(c10575y5.zzc(i11));
            i11++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void zzz(int i10, List list, boolean z10) throws IOException {
        int i11 = 0;
        if (!(list instanceof C10575y5)) {
            if (!z10) {
                while (i11 < list.size()) {
                    this.f81827a.m(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            K4 k42 = this.f81827a;
            k42.i(i10, 2);
            int iA = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iA += K4.a(((Long) list.get(i12)).longValue());
            }
            k42.z(iA);
            while (i11 < list.size()) {
                k42.B(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        C10575y5 c10575y5 = (C10575y5) list;
        if (!z10) {
            while (i11 < c10575y5.size()) {
                this.f81827a.m(i10, c10575y5.zzc(i11));
                i11++;
            }
            return;
        }
        K4 k43 = this.f81827a;
        k43.i(i10, 2);
        int iA2 = 0;
        for (int i13 = 0; i13 < c10575y5.size(); i13++) {
            iA2 += K4.a(c10575y5.zzc(i13));
        }
        k43.z(iA2);
        while (i11 < c10575y5.size()) {
            k43.B(c10575y5.zzc(i11));
            i11++;
        }
    }

    private L4(K4 k42) {
        byte[] bArr = C10486o5.f82316b;
        this.f81827a = k42;
        k42.f81817a = this;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10531t6
    public final void a(int i10, C5 c52, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            K4 k42 = this.f81827a;
            k42.i(i10, 2);
            k42.z(D5.c(c52, entry.getKey(), entry.getValue()));
            D5.b(k42, c52, entry.getKey(), entry.getValue());
        }
    }
}
