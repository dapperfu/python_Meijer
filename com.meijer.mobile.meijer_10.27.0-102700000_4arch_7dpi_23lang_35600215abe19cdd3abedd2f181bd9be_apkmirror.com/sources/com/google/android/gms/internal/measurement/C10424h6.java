package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.h6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10424h6 {

    /* renamed from: f, reason: collision with root package name */
    private static final C10424h6 f82203f = new C10424h6(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f82204a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f82205b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f82206c;

    /* renamed from: d, reason: collision with root package name */
    private int f82207d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f82208e;

    private C10424h6(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f82207d = -1;
        this.f82204a = i10;
        this.f82205b = iArr;
        this.f82206c = objArr;
        this.f82208e = z10;
    }

    public static C10424h6 a() {
        return f82203f;
    }

    static C10424h6 b() {
        return new C10424h6(0, new int[8], new Object[8], true);
    }

    public final void d() {
        if (this.f82208e) {
            this.f82208e = false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C10424h6)) {
            return false;
        }
        C10424h6 c10424h6 = (C10424h6) obj;
        int i10 = this.f82204a;
        if (i10 == c10424h6.f82204a) {
            int[] iArr = this.f82205b;
            int[] iArr2 = c10424h6.f82205b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f82206c;
                    Object[] objArr2 = c10424h6.f82206c;
                    int i12 = this.f82204a;
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

    final void f(InterfaceC10531t6 interfaceC10531t6) throws IOException {
        for (int i10 = 0; i10 < this.f82204a; i10++) {
            interfaceC10531t6.zzv(this.f82205b[i10] >>> 3, this.f82206c[i10]);
        }
    }

    final void j(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f82204a; i11++) {
            M5.b(sb2, i10, String.valueOf(this.f82205b[i11] >>> 3), this.f82206c[i11]);
        }
    }

    private C10424h6() {
        this(0, new int[8], new Object[8], true);
    }

    static C10424h6 c(C10424h6 c10424h6, C10424h6 c10424h62) {
        int i10 = c10424h6.f82204a + c10424h62.f82204a;
        int[] iArrCopyOf = Arrays.copyOf(c10424h6.f82205b, i10);
        System.arraycopy(c10424h62.f82205b, 0, iArrCopyOf, c10424h6.f82204a, c10424h62.f82204a);
        Object[] objArrCopyOf = Arrays.copyOf(c10424h6.f82206c, i10);
        System.arraycopy(c10424h62.f82206c, 0, objArrCopyOf, c10424h6.f82204a, c10424h62.f82204a);
        return new C10424h6(i10, iArrCopyOf, objArrCopyOf, true);
    }

    private final void m(int i10) {
        int[] iArr = this.f82205b;
        if (i10 > iArr.length) {
            int i11 = this.f82204a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f82205b = Arrays.copyOf(iArr, i10);
            this.f82206c = Arrays.copyOf(this.f82206c, i10);
        }
    }

    final void e() {
        if (!this.f82208e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g(InterfaceC10531t6 interfaceC10531t6) throws IOException {
        if (this.f82204a != 0) {
            for (int i10 = 0; i10 < this.f82204a; i10++) {
                int i11 = this.f82205b[i10];
                Object obj = this.f82206c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    interfaceC10531t6.zzc(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    interfaceC10531t6.zzj(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    interfaceC10531t6.d(i13, (G4) obj);
                } else if (i12 == 3) {
                    interfaceC10531t6.zzt(i13);
                    ((C10424h6) obj).g(interfaceC10531t6);
                    interfaceC10531t6.zzu(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new zzmq("Protocol message tag had invalid wire type."));
                    }
                    interfaceC10531t6.zzk(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int h() {
        int i10 = this.f82207d;
        if (i10 != -1) {
            return i10;
        }
        int iG = 0;
        for (int i11 = 0; i11 < this.f82204a; i11++) {
            int i12 = this.f82205b[i11] >>> 3;
            G4 g42 = (G4) this.f82206c[i11];
            int iG2 = K4.G(8);
            int iG3 = K4.G(16) + K4.G(i12);
            int iG4 = K4.G(24);
            int iF = g42.f();
            iG += iG2 + iG2 + iG3 + iG4 + K4.G(iF) + iF;
        }
        this.f82207d = iG;
        return iG;
    }

    public final int hashCode() {
        int i10 = this.f82204a;
        int i11 = i10 + 527;
        int[] iArr = this.f82205b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f82206c;
        int i15 = this.f82204a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final int i() {
        int iG;
        int iA;
        int iG2;
        int i10 = this.f82207d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f82204a; i12++) {
            int i13 = this.f82205b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f82206c[i12]).getClass();
                    iG2 = K4.G(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    G4 g42 = (G4) this.f82206c[i12];
                    int iG3 = K4.G(i16);
                    int iF = g42.f();
                    iG2 = iG3 + K4.G(iF) + iF;
                } else if (i15 == 3) {
                    int iG4 = K4.G(i14 << 3);
                    iG = iG4 + iG4;
                    iA = ((C10424h6) this.f82206c[i12]).i();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new zzmq("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f82206c[i12]).getClass();
                    iG2 = K4.G(i14 << 3) + 4;
                }
                i11 += iG2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.f82206c[i12]).longValue();
                iG = K4.G(i17);
                iA = K4.a(jLongValue);
            }
            iG2 = iG + iA;
            i11 += iG2;
        }
        this.f82207d = i11;
        return i11;
    }

    final C10424h6 l(C10424h6 c10424h6) {
        if (c10424h6.equals(f82203f)) {
            return this;
        }
        e();
        int i10 = this.f82204a + c10424h6.f82204a;
        m(i10);
        System.arraycopy(c10424h6.f82205b, 0, this.f82205b, this.f82204a, c10424h6.f82204a);
        System.arraycopy(c10424h6.f82206c, 0, this.f82206c, this.f82204a, c10424h6.f82204a);
        this.f82204a = i10;
        return this;
    }

    final void k(int i10, Object obj) {
        e();
        m(this.f82204a + 1);
        int[] iArr = this.f82205b;
        int i11 = this.f82204a;
        iArr[i11] = i10;
        this.f82206c[i11] = obj;
        this.f82204a = i11 + 1;
    }
}
