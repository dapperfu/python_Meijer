package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.measurement.h6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10549h6 {

    /* renamed from: f, reason: collision with root package name */
    private static final C10549h6 f83043f = new C10549h6(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f83044a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f83045b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f83046c;

    /* renamed from: d, reason: collision with root package name */
    private int f83047d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f83048e;

    private C10549h6(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f83047d = -1;
        this.f83044a = i10;
        this.f83045b = iArr;
        this.f83046c = objArr;
        this.f83048e = z10;
    }

    public static C10549h6 a() {
        return f83043f;
    }

    static C10549h6 b() {
        return new C10549h6(0, new int[8], new Object[8], true);
    }

    public final void d() {
        if (this.f83048e) {
            this.f83048e = false;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C10549h6)) {
            return false;
        }
        C10549h6 c10549h6 = (C10549h6) obj;
        int i10 = this.f83044a;
        if (i10 == c10549h6.f83044a) {
            int[] iArr = this.f83045b;
            int[] iArr2 = c10549h6.f83045b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f83046c;
                    Object[] objArr2 = c10549h6.f83046c;
                    int i12 = this.f83044a;
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

    final void f(InterfaceC10656t6 interfaceC10656t6) throws IOException {
        for (int i10 = 0; i10 < this.f83044a; i10++) {
            interfaceC10656t6.zzv(this.f83045b[i10] >>> 3, this.f83046c[i10]);
        }
    }

    final void j(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f83044a; i11++) {
            M5.b(sb2, i10, String.valueOf(this.f83045b[i11] >>> 3), this.f83046c[i11]);
        }
    }

    private C10549h6() {
        this(0, new int[8], new Object[8], true);
    }

    static C10549h6 c(C10549h6 c10549h6, C10549h6 c10549h62) {
        int i10 = c10549h6.f83044a + c10549h62.f83044a;
        int[] iArrCopyOf = Arrays.copyOf(c10549h6.f83045b, i10);
        System.arraycopy(c10549h62.f83045b, 0, iArrCopyOf, c10549h6.f83044a, c10549h62.f83044a);
        Object[] objArrCopyOf = Arrays.copyOf(c10549h6.f83046c, i10);
        System.arraycopy(c10549h62.f83046c, 0, objArrCopyOf, c10549h6.f83044a, c10549h62.f83044a);
        return new C10549h6(i10, iArrCopyOf, objArrCopyOf, true);
    }

    private final void m(int i10) {
        int[] iArr = this.f83045b;
        if (i10 > iArr.length) {
            int i11 = this.f83044a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f83045b = Arrays.copyOf(iArr, i10);
            this.f83046c = Arrays.copyOf(this.f83046c, i10);
        }
    }

    final void e() {
        if (!this.f83048e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void g(InterfaceC10656t6 interfaceC10656t6) throws IOException {
        if (this.f83044a != 0) {
            for (int i10 = 0; i10 < this.f83044a; i10++) {
                int i11 = this.f83045b[i10];
                Object obj = this.f83046c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    interfaceC10656t6.zzc(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    interfaceC10656t6.zzj(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    interfaceC10656t6.d(i13, (G4) obj);
                } else if (i12 == 3) {
                    interfaceC10656t6.zzt(i13);
                    ((C10549h6) obj).g(interfaceC10656t6);
                    interfaceC10656t6.zzu(i13);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(new zzmq("Protocol message tag had invalid wire type."));
                    }
                    interfaceC10656t6.zzk(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int h() {
        int i10 = this.f83047d;
        if (i10 != -1) {
            return i10;
        }
        int iG = 0;
        for (int i11 = 0; i11 < this.f83044a; i11++) {
            int i12 = this.f83045b[i11] >>> 3;
            G4 g42 = (G4) this.f83046c[i11];
            int iG2 = K4.G(8);
            int iG3 = K4.G(16) + K4.G(i12);
            int iG4 = K4.G(24);
            int iF = g42.f();
            iG += iG2 + iG2 + iG3 + iG4 + K4.G(iF) + iF;
        }
        this.f83047d = iG;
        return iG;
    }

    public final int hashCode() {
        int i10 = this.f83044a;
        int i11 = i10 + 527;
        int[] iArr = this.f83045b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f83046c;
        int i15 = this.f83044a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final int i() {
        int iG;
        int iA;
        int iG2;
        int i10 = this.f83047d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f83044a; i12++) {
            int i13 = this.f83045b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 == 1) {
                    ((Long) this.f83046c[i12]).getClass();
                    iG2 = K4.G(i14 << 3) + 8;
                } else if (i15 == 2) {
                    int i16 = i14 << 3;
                    G4 g42 = (G4) this.f83046c[i12];
                    int iG3 = K4.G(i16);
                    int iF = g42.f();
                    iG2 = iG3 + K4.G(iF) + iF;
                } else if (i15 == 3) {
                    int iG4 = K4.G(i14 << 3);
                    iG = iG4 + iG4;
                    iA = ((C10549h6) this.f83046c[i12]).i();
                } else {
                    if (i15 != 5) {
                        throw new IllegalStateException(new zzmq("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f83046c[i12]).getClass();
                    iG2 = K4.G(i14 << 3) + 4;
                }
                i11 += iG2;
            } else {
                int i17 = i14 << 3;
                long jLongValue = ((Long) this.f83046c[i12]).longValue();
                iG = K4.G(i17);
                iA = K4.a(jLongValue);
            }
            iG2 = iG + iA;
            i11 += iG2;
        }
        this.f83047d = i11;
        return i11;
    }

    final C10549h6 l(C10549h6 c10549h6) {
        if (c10549h6.equals(f83043f)) {
            return this;
        }
        e();
        int i10 = this.f83044a + c10549h6.f83044a;
        m(i10);
        System.arraycopy(c10549h6.f83045b, 0, this.f83045b, this.f83044a, c10549h6.f83044a);
        System.arraycopy(c10549h6.f83046c, 0, this.f83046c, this.f83044a, c10549h6.f83044a);
        this.f83044a = i10;
        return this;
    }

    final void k(int i10, Object obj) {
        e();
        m(this.f83044a + 1);
        int[] iArr = this.f83045b;
        int i11 = this.f83044a;
        iArr[i11] = i10;
        this.f83046c[i11] = obj;
        this.f83044a = i11 + 1;
    }
}
