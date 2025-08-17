package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.AbstractC10293f0;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.clearcut.s1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10332s1 {

    /* renamed from: f, reason: collision with root package name */
    private static final C10332s1 f81558f = new C10332s1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f81559a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f81560b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f81561c;

    /* renamed from: d, reason: collision with root package name */
    private int f81562d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f81563e;

    private C10332s1() {
        this(0, new int[8], new Object[8], true);
    }

    static C10332s1 a(C10332s1 c10332s1, C10332s1 c10332s12) {
        int i10 = c10332s1.f81559a + c10332s12.f81559a;
        int[] iArrCopyOf = Arrays.copyOf(c10332s1.f81560b, i10);
        System.arraycopy(c10332s12.f81560b, 0, iArrCopyOf, c10332s1.f81559a, c10332s12.f81559a);
        Object[] objArrCopyOf = Arrays.copyOf(c10332s1.f81561c, i10);
        System.arraycopy(c10332s12.f81561c, 0, objArrCopyOf, c10332s1.f81559a, c10332s12.f81559a);
        return new C10332s1(i10, iArrCopyOf, objArrCopyOf, true);
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
        } else if (m12.p() == AbstractC10293f0.e.f81445l) {
            m12.G(i11);
            ((C10332s1) obj).g(m12);
            m12.A(i11);
        } else {
            m12.A(i11);
            ((C10332s1) obj).g(m12);
            m12.G(i11);
        }
    }

    public static C10332s1 h() {
        return f81558f;
    }

    static C10332s1 i() {
        return new C10332s1();
    }

    final void b(M1 m12) throws IOException {
        if (m12.p() == AbstractC10293f0.e.f81446m) {
            for (int i10 = this.f81559a - 1; i10 >= 0; i10--) {
                m12.h(this.f81560b[i10] >>> 3, this.f81561c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f81559a; i11++) {
            m12.h(this.f81560b[i11] >>> 3, this.f81561c[i11]);
        }
    }

    final void c(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f81559a; i11++) {
            M0.c(sb2, i10, String.valueOf(this.f81560b[i11] >>> 3), this.f81561c[i11]);
        }
    }

    public final int d() {
        int iD0;
        int i10 = this.f81562d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f81559a; i12++) {
            int i13 = this.f81560b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 == 0) {
                iD0 = zzbn.d0(i14, ((Long) this.f81561c[i12]).longValue());
            } else if (i15 == 1) {
                iD0 = zzbn.k0(i14, ((Long) this.f81561c[i12]).longValue());
            } else if (i15 == 2) {
                iD0 = zzbn.N(i14, (A) this.f81561c[i12]);
            } else if (i15 == 3) {
                iD0 = (zzbn.B0(i14) << 1) + ((C10332s1) this.f81561c[i12]).d();
            } else {
                if (i15 != 5) {
                    throw new IllegalStateException(zzco.c());
                }
                iD0 = zzbn.t0(i14, ((Integer) this.f81561c[i12]).intValue());
            }
            i11 += iD0;
        }
        this.f81562d = i11;
        return i11;
    }

    final void e(int i10, Object obj) {
        if (!this.f81563e) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.f81559a;
        int[] iArr = this.f81560b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.f81560b = Arrays.copyOf(iArr, i12);
            this.f81561c = Arrays.copyOf(this.f81561c, i12);
        }
        int[] iArr2 = this.f81560b;
        int i13 = this.f81559a;
        iArr2[i13] = i10;
        this.f81561c[i13] = obj;
        this.f81559a = i13 + 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C10332s1)) {
            return false;
        }
        C10332s1 c10332s1 = (C10332s1) obj;
        int i10 = this.f81559a;
        if (i10 == c10332s1.f81559a) {
            int[] iArr = this.f81560b;
            int[] iArr2 = c10332s1.f81560b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f81561c;
                    Object[] objArr2 = c10332s1.f81561c;
                    int i12 = this.f81559a;
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
        if (this.f81559a == 0) {
            return;
        }
        if (m12.p() == AbstractC10293f0.e.f81445l) {
            for (int i10 = 0; i10 < this.f81559a; i10++) {
                f(this.f81560b[i10], this.f81561c[i10], m12);
            }
            return;
        }
        for (int i11 = this.f81559a - 1; i11 >= 0; i11--) {
            f(this.f81560b[i11], this.f81561c[i11], m12);
        }
    }

    public final int hashCode() {
        int i10 = this.f81559a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f81560b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f81561c;
        int i15 = this.f81559a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final int j() {
        int i10 = this.f81562d;
        if (i10 != -1) {
            return i10;
        }
        int iX = 0;
        for (int i11 = 0; i11 < this.f81559a; i11++) {
            iX += zzbn.X(this.f81560b[i11] >>> 3, (A) this.f81561c[i11]);
        }
        this.f81562d = iX;
        return iX;
    }

    public final void k() {
        this.f81563e = false;
    }

    private C10332s1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f81562d = -1;
        this.f81559a = i10;
        this.f81560b = iArr;
        this.f81561c = objArr;
        this.f81563e = z10;
    }
}
