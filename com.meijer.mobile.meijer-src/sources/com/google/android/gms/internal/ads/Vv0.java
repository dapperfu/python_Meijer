package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class Vv0 {

    /* renamed from: f, reason: collision with root package name */
    private static final Vv0 f71784f = new Vv0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f71785a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f71786b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f71787c;

    /* renamed from: d, reason: collision with root package name */
    private int f71788d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f71789e;

    private Vv0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f71788d = -1;
        this.f71785a = i10;
        this.f71786b = iArr;
        this.f71787c = objArr;
        this.f71789e = z10;
    }

    public static Vv0 c() {
        return f71784f;
    }

    static Vv0 f() {
        return new Vv0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Vv0)) {
            return false;
        }
        Vv0 vv0 = (Vv0) obj;
        int i10 = this.f71785a;
        if (i10 == vv0.f71785a) {
            int[] iArr = this.f71786b;
            int[] iArr2 = vv0.f71786b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f71787c;
                    Object[] objArr2 = vv0.f71787c;
                    int i12 = this.f71785a;
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

    public final void h() {
        if (this.f71789e) {
            this.f71789e = false;
        }
    }

    final void i(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f71785a; i11++) {
            C9458rv0.b(sb2, i10, String.valueOf(this.f71786b[i11] >>> 3), this.f71787c[i11]);
        }
    }

    final void k(InterfaceC8605jw0 interfaceC8605jw0) throws IOException {
        for (int i10 = 0; i10 < this.f71785a; i10++) {
            interfaceC8605jw0.zzw(this.f71786b[i10] >>> 3, this.f71787c[i10]);
        }
    }

    private Vv0() {
        this(0, new int[8], new Object[8], true);
    }

    static Vv0 e(Vv0 vv0, Vv0 vv02) {
        int i10 = vv0.f71785a + vv02.f71785a;
        int[] iArrCopyOf = Arrays.copyOf(vv0.f71786b, i10);
        System.arraycopy(vv02.f71786b, 0, iArrCopyOf, vv0.f71785a, vv02.f71785a);
        Object[] objArrCopyOf = Arrays.copyOf(vv0.f71787c, i10);
        System.arraycopy(vv02.f71787c, 0, objArrCopyOf, vv0.f71785a, vv02.f71785a);
        return new Vv0(i10, iArrCopyOf, objArrCopyOf, true);
    }

    private final void m(int i10) {
        int[] iArr = this.f71786b;
        if (i10 > iArr.length) {
            int i11 = this.f71785a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f71786b = Arrays.copyOf(iArr, i10);
            this.f71787c = Arrays.copyOf(this.f71787c, i10);
        }
    }

    public final int a() {
        int iE;
        int iF;
        int iE2;
        int i10 = this.f71788d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f71785a; i12++) {
            int i13 = this.f71786b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f71787c[i12]).getClass();
                    iE2 = AbstractC8708ku0.e(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    Zt0 zt0 = (Zt0) this.f71787c[i12];
                    int iE3 = AbstractC8708ku0.e(i16);
                    int iK = zt0.k();
                    iE2 = iE3 + AbstractC8708ku0.e(iK) + iK;
                } else if (i15 == 3) {
                    int iE4 = AbstractC8708ku0.e(i14 << 3);
                    iE = iE4 + iE4;
                    iF = ((Vv0) this.f71787c[i12]).a();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new zzgyf("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f71787c[i12]).getClass();
                    iE2 = AbstractC8708ku0.e(i14 << 3) + 4;
                }
                i11 += iE2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.f71787c[i12]).longValue();
                iE = AbstractC8708ku0.e(i17);
                iF = AbstractC8708ku0.f(jLongValue);
            }
            iE2 = iE + iF;
            i11 += iE2;
        }
        this.f71788d = i11;
        return i11;
    }

    public final int b() {
        int i10 = this.f71788d;
        if (i10 != -1) {
            return i10;
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.f71785a; i11++) {
            int i12 = this.f71786b[i11] >>> 3;
            Zt0 zt0 = (Zt0) this.f71787c[i11];
            int iE2 = AbstractC8708ku0.e(8);
            int iE3 = AbstractC8708ku0.e(16) + AbstractC8708ku0.e(i12);
            int iE4 = AbstractC8708ku0.e(24);
            int iK = zt0.k();
            iE += iE2 + iE2 + iE3 + iE4 + AbstractC8708ku0.e(iK) + iK;
        }
        this.f71788d = iE;
        return iE;
    }

    final Vv0 d(Vv0 vv0) {
        if (vv0.equals(f71784f)) {
            return this;
        }
        g();
        int i10 = this.f71785a + vv0.f71785a;
        m(i10);
        System.arraycopy(vv0.f71786b, 0, this.f71786b, this.f71785a, vv0.f71785a);
        System.arraycopy(vv0.f71787c, 0, this.f71787c, this.f71785a, vv0.f71785a);
        this.f71785a = i10;
        return this;
    }

    final void g() {
        if (!this.f71789e) {
            throw new UnsupportedOperationException();
        }
    }

    public final int hashCode() {
        int i10 = this.f71785a;
        int i11 = i10 + 527;
        int[] iArr = this.f71786b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f71787c;
        int i15 = this.f71785a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final void l(InterfaceC8605jw0 interfaceC8605jw0) throws IOException {
        if (this.f71785a != 0) {
            for (int i10 = 0; i10 < this.f71785a; i10++) {
                int i11 = this.f71786b[i10];
                Object obj = this.f71787c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    interfaceC8605jw0.zzt(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    interfaceC8605jw0.zzm(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    interfaceC8605jw0.c(i13, (Zt0) obj);
                } else if (i12 == 3) {
                    interfaceC8605jw0.zzF(i13);
                    ((Vv0) obj).l(interfaceC8605jw0);
                    interfaceC8605jw0.zzh(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new zzgyf("Protocol message tag had invalid wire type."));
                    }
                    interfaceC8605jw0.zzk(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    final void j(int i10, Object obj) {
        g();
        m(this.f71785a + 1);
        int[] iArr = this.f71786b;
        int i11 = this.f71785a;
        iArr[i11] = i10;
        this.f71787c[i11] = obj;
        this.f71785a = i11 + 1;
    }
}
