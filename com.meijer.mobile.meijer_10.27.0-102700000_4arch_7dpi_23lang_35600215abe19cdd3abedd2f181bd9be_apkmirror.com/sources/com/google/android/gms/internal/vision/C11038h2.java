package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.vision.h2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11038h2 {

    /* renamed from: f, reason: collision with root package name */
    private static final C11038h2 f84550f = new C11038h2(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f84551a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f84552b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f84553c;

    /* renamed from: d, reason: collision with root package name */
    private int f84554d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f84555e;

    private C11038h2() {
        this(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C11038h2)) {
            return false;
        }
        C11038h2 c11038h2 = (C11038h2) obj;
        int i10 = this.f84551a;
        if (i10 == c11038h2.f84551a) {
            int[] iArr = this.f84552b;
            int[] iArr2 = c11038h2.f84552b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f84553c;
                    Object[] objArr2 = c11038h2.f84553c;
                    int i12 = this.f84551a;
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

    final void f(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f84551a; i11++) {
            B1.d(sb2, i10, String.valueOf(this.f84552b[i11] >>> 3), this.f84553c[i11]);
        }
    }

    public final void i() {
        this.f84555e = false;
    }

    private C11038h2(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f84554d = -1;
        this.f84551a = i10;
        this.f84552b = iArr;
        this.f84553c = objArr;
        this.f84555e = z10;
    }

    public static C11038h2 a() {
        return f84550f;
    }

    static C11038h2 b(C11038h2 c11038h2, C11038h2 c11038h22) {
        int i10 = c11038h2.f84551a + c11038h22.f84551a;
        int[] iArrCopyOf = Arrays.copyOf(c11038h2.f84552b, i10);
        System.arraycopy(c11038h22.f84552b, 0, iArrCopyOf, c11038h2.f84551a, c11038h22.f84551a);
        Object[] objArrCopyOf = Arrays.copyOf(c11038h2.f84553c, i10);
        System.arraycopy(c11038h22.f84553c, 0, objArrCopyOf, c11038h2.f84551a, c11038h22.f84551a);
        return new C11038h2(i10, iArrCopyOf, objArrCopyOf, true);
    }

    private static void d(int i10, Object obj, C2 c22) throws IOException {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            c22.zza(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 1) {
            c22.zzd(i11, ((Long) obj).longValue());
            return;
        }
        if (i12 == 2) {
            c22.p(i11, (AbstractC11036h0) obj);
            return;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new RuntimeException(zzjk.d());
            }
            c22.r(i11, ((Integer) obj).intValue());
        } else if (c22.zza() == B2.f84282a) {
            c22.zza(i11);
            ((C11038h2) obj).h(c22);
            c22.zzb(i11);
        } else {
            c22.zzb(i11);
            ((C11038h2) obj).h(c22);
            c22.zza(i11);
        }
    }

    static C11038h2 g() {
        return new C11038h2();
    }

    final void c(int i10, Object obj) {
        if (!this.f84555e) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.f84551a;
        int[] iArr = this.f84552b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.f84552b = Arrays.copyOf(iArr, i12);
            this.f84553c = Arrays.copyOf(this.f84553c, i12);
        }
        int[] iArr2 = this.f84552b;
        int i13 = this.f84551a;
        iArr2[i13] = i10;
        this.f84553c[i13] = obj;
        this.f84551a = i13 + 1;
    }

    public final void h(C2 c22) throws IOException {
        if (this.f84551a == 0) {
            return;
        }
        if (c22.zza() == B2.f84282a) {
            for (int i10 = 0; i10 < this.f84551a; i10++) {
                d(this.f84552b[i10], this.f84553c[i10], c22);
            }
            return;
        }
        for (int i11 = this.f84551a - 1; i11 >= 0; i11--) {
            d(this.f84552b[i11], this.f84553c[i11], c22);
        }
    }

    public final int hashCode() {
        int i10 = this.f84551a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f84552b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f84553c;
        int i15 = this.f84551a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final int j() {
        int i10 = this.f84554d;
        if (i10 != -1) {
            return i10;
        }
        int iC0 = 0;
        for (int i11 = 0; i11 < this.f84551a; i11++) {
            iC0 += zzii.c0(this.f84552b[i11] >>> 3, (AbstractC11036h0) this.f84553c[i11]);
        }
        this.f84554d = iC0;
        return iC0;
    }

    public final int k() {
        int iH0;
        int i10 = this.f84554d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f84551a; i12++) {
            int i13 = this.f84552b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 == 0) {
                iH0 = zzii.h0(i14, ((Long) this.f84553c[i12]).longValue());
            } else if (i15 == 1) {
                iH0 = zzii.q0(i14, ((Long) this.f84553c[i12]).longValue());
            } else if (i15 == 2) {
                iH0 = zzii.T(i14, (AbstractC11036h0) this.f84553c[i12]);
            } else if (i15 == 3) {
                iH0 = (zzii.g0(i14) << 1) + ((C11038h2) this.f84553c[i12]).k();
            } else {
                if (i15 != 5) {
                    throw new IllegalStateException(zzjk.d());
                }
                iH0 = zzii.x0(i14, ((Integer) this.f84553c[i12]).intValue());
            }
            i11 += iH0;
        }
        this.f84554d = i11;
        return i11;
    }

    final void e(C2 c22) throws IOException {
        if (c22.zza() == B2.f84283b) {
            for (int i10 = this.f84551a - 1; i10 >= 0; i10--) {
                c22.h(this.f84552b[i10] >>> 3, this.f84553c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f84551a; i11++) {
            c22.h(this.f84552b[i11] >>> 3, this.f84553c[i11]);
        }
    }
}
