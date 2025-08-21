package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC10418f0;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.clearcut.s1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10457s1 {

    /* renamed from: f, reason: collision with root package name */
    private static final C10457s1 f82398f = new C10457s1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f82399a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f82400b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f82401c;

    /* renamed from: d, reason: collision with root package name */
    private int f82402d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f82403e;

    private C10457s1() {
        this(0, new int[8], new Object[8], true);
    }

    static C10457s1 a(C10457s1 c10457s1, C10457s1 c10457s12) {
        int i10 = c10457s1.f82399a + c10457s12.f82399a;
        int[] iArrCopyOf = Arrays.copyOf(c10457s1.f82400b, i10);
        System.arraycopy(c10457s12.f82400b, 0, iArrCopyOf, c10457s1.f82399a, c10457s12.f82399a);
        Object[] objArrCopyOf = Arrays.copyOf(c10457s1.f82401c, i10);
        System.arraycopy(c10457s12.f82401c, 0, objArrCopyOf, c10457s1.f82399a, c10457s12.f82399a);
        return new C10457s1(i10, iArrCopyOf, objArrCopyOf, true);
    }

    private static void f(int i10, Object obj, M1 m12) throws IOException {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            m12.E(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 1) {
            m12.zzc(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 2) {
            m12.B(i11, (A) obj);
            return;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new RuntimeException(zzco.c());
            }
            m12.m(i11, ((Integer) obj).intValue());
        } else if (m12.p() == AbstractC10418f0.e.f82285l) {
            m12.G(i11);
            ((C10457s1) obj).g(m12);
            m12.A(i11);
        } else {
            m12.A(i11);
            ((C10457s1) obj).g(m12);
            m12.G(i11);
        }
    }

    public static C10457s1 h() {
        return f82398f;
    }

    static C10457s1 i() {
        return new C10457s1();
    }

    final void b(M1 m12) throws IOException {
        if (m12.p() == AbstractC10418f0.e.f82286m) {
            for (int i10 = this.f82399a - 1; i10 >= 0; i10--) {
                m12.h(this.f82400b[i10] >>> 3, this.f82401c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f82399a; i11++) {
            m12.h(this.f82400b[i11] >>> 3, this.f82401c[i11]);
        }
    }

    final void c(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f82399a; i11++) {
            M0.c(sb2, i10, String.valueOf(this.f82400b[i11] >>> 3), this.f82401c[i11]);
        }
    }

    public final int d() {
        int iD0;
        int i10 = this.f82402d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f82399a; i12++) {
            int i13 = this.f82400b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 == 0) {
                iD0 = zzbn.d0(i14, ((Long) this.f82401c[i12]).longValue());
            } else if (i15 == 1) {
                iD0 = zzbn.k0(i14, ((Long) this.f82401c[i12]).longValue());
            } else if (i15 == 2) {
                iD0 = zzbn.N(i14, (A) this.f82401c[i12]);
            } else if (i15 == 3) {
                iD0 = (zzbn.B0(i14) << 1) + ((C10457s1) this.f82401c[i12]).d();
            } else {
                if (i15 != 5) {
                    throw new IllegalStateException(zzco.c());
                }
                iD0 = zzbn.t0(i14, ((Integer) this.f82401c[i12]).intValue());
            }
            i11 += iD0;
        }
        this.f82402d = i11;
        return i11;
    }

    final void e(int i10, Object obj) {
        if (!this.f82403e) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.f82399a;
        int[] iArr = this.f82400b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.f82400b = Arrays.copyOf(iArr, i12);
            this.f82401c = Arrays.copyOf(this.f82401c, i12);
        }
        int[] iArr2 = this.f82400b;
        int i13 = this.f82399a;
        iArr2[i13] = i10;
        this.f82401c[i13] = obj;
        this.f82399a = i13 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C10457s1)) {
            return false;
        }
        C10457s1 c10457s1 = (C10457s1) obj;
        int i10 = this.f82399a;
        if (i10 == c10457s1.f82399a) {
            int[] iArr = this.f82400b;
            int[] iArr2 = c10457s1.f82400b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f82401c;
                    Object[] objArr2 = c10457s1.f82401c;
                    int i12 = this.f82399a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final void g(M1 m12) throws IOException {
        if (this.f82399a == 0) {
            return;
        }
        if (m12.p() == AbstractC10418f0.e.f82285l) {
            for (int i10 = 0; i10 < this.f82399a; i10++) {
                f(this.f82400b[i10], this.f82401c[i10], m12);
            }
            return;
        }
        for (int i11 = this.f82399a - 1; i11 >= 0; i11--) {
            f(this.f82400b[i11], this.f82401c[i11], m12);
        }
    }

    public final int hashCode() {
        int i10 = this.f82399a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f82400b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f82401c;
        int i15 = this.f82399a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final int j() {
        int i10 = this.f82402d;
        if (i10 != -1) {
            return i10;
        }
        int iX = 0;
        for (int i11 = 0; i11 < this.f82399a; i11++) {
            iX += zzbn.X(this.f82400b[i11] >>> 3, (A) this.f82401c[i11]);
        }
        this.f82402d = iX;
        return iX;
    }

    public final void k() {
        this.f82403e = false;
    }

    private C10457s1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f82402d = -1;
        this.f82399a = i10;
        this.f82400b = iArr;
        this.f82401c = objArr;
        this.f82403e = z10;
    }
}
