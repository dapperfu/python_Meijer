package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes6.dex */
public final class K1 {

    /* renamed from: f, reason: collision with root package name */
    private static final K1 f82706f = new K1(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f82707a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f82708b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f82709c;

    /* renamed from: d, reason: collision with root package name */
    private int f82710d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f82711e;

    private K1(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f82710d = -1;
        this.f82707a = i10;
        this.f82708b = iArr;
        this.f82709c = objArr;
        this.f82711e = z10;
    }

    public static K1 c() {
        return f82706f;
    }

    static K1 e() {
        return new K1(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof K1)) {
            return false;
        }
        K1 k12 = (K1) obj;
        int i10 = this.f82707a;
        if (i10 == k12.f82707a) {
            int[] iArr = this.f82708b;
            int[] iArr2 = k12.f82708b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f82709c;
                    Object[] objArr2 = k12.f82709c;
                    int i12 = this.f82707a;
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

    public final void f() {
        this.f82711e = false;
    }

    final void g(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f82707a; i11++) {
            C10722i1.b(sb2, i10, String.valueOf(this.f82708b[i11] >>> 3), this.f82709c[i11]);
        }
    }

    private K1() {
        this(0, new int[8], new Object[8], true);
    }

    static K1 d(K1 k12, K1 k13) {
        int i10 = k12.f82707a + k13.f82707a;
        int[] iArrCopyOf = Arrays.copyOf(k12.f82708b, i10);
        System.arraycopy(k13.f82708b, 0, iArrCopyOf, k12.f82707a, k13.f82707a);
        Object[] objArrCopyOf = Arrays.copyOf(k12.f82709c, i10);
        System.arraycopy(k13.f82709c, 0, objArrCopyOf, k12.f82707a, k13.f82707a);
        return new K1(i10, iArrCopyOf, objArrCopyOf, true);
    }

    public final int a() {
        int iA;
        int iB;
        int iA2;
        int i10 = this.f82710d;
        if (i10 != -1) {
            return i10;
        }
        int iA3 = 0;
        for (int i11 = 0; i11 < this.f82707a; i11++) {
            int i12 = this.f82708b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f82709c[i11]).getClass();
                    iA2 = AbstractC10753k0.a(i13 << 3) + 8;
                } else if (i14 == 2) {
                    AbstractC10605b0 abstractC10605b0 = (AbstractC10605b0) this.f82709c[i11];
                    int iA4 = AbstractC10753k0.a(i13 << 3);
                    int iF = abstractC10605b0.f();
                    iA3 += iA4 + AbstractC10753k0.a(iF) + iF;
                } else if (i14 == 3) {
                    int iD = AbstractC10753k0.D(i13);
                    iA = iD + iD;
                    iB = ((K1) this.f82709c[i11]).a();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(zzadi.a());
                    }
                    ((Integer) this.f82709c[i11]).getClass();
                    iA2 = AbstractC10753k0.a(i13 << 3) + 4;
                }
                iA3 += iA2;
            } else {
                long jLongValue = ((Long) this.f82709c[i11]).longValue();
                iA = AbstractC10753k0.a(i13 << 3);
                iB = AbstractC10753k0.b(jLongValue);
            }
            iA2 = iA + iB;
            iA3 += iA2;
        }
        this.f82710d = iA3;
        return iA3;
    }

    public final int b() {
        int i10 = this.f82710d;
        if (i10 != -1) {
            return i10;
        }
        int iA = 0;
        for (int i11 = 0; i11 < this.f82707a; i11++) {
            int i12 = this.f82708b[i11];
            AbstractC10605b0 abstractC10605b0 = (AbstractC10605b0) this.f82709c[i11];
            int iA2 = AbstractC10753k0.a(8);
            int iF = abstractC10605b0.f();
            iA += iA2 + iA2 + AbstractC10753k0.a(16) + AbstractC10753k0.a(i12 >>> 3) + AbstractC10753k0.a(24) + AbstractC10753k0.a(iF) + iF;
        }
        this.f82710d = iA;
        return iA;
    }

    final void h(int i10, Object obj) {
        if (!this.f82711e) {
            throw new UnsupportedOperationException();
        }
        int i11 = this.f82707a;
        int[] iArr = this.f82708b;
        if (i11 == iArr.length) {
            int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
            this.f82708b = Arrays.copyOf(iArr, i12);
            this.f82709c = Arrays.copyOf(this.f82709c, i12);
        }
        int[] iArr2 = this.f82708b;
        int i13 = this.f82707a;
        iArr2[i13] = i10;
        this.f82709c[i13] = obj;
        this.f82707a = i13 + 1;
    }

    public final int hashCode() {
        int i10 = this.f82707a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f82708b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = (i11 + i12) * 31;
        Object[] objArr = this.f82709c;
        int i15 = this.f82707a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }

    public final void i(InterfaceC10624c2 interfaceC10624c2) throws IOException {
        if (this.f82707a != 0) {
            for (int i10 = 0; i10 < this.f82707a; i10++) {
                int i11 = this.f82708b[i10];
                Object obj = this.f82709c[i10];
                int i12 = i11 >>> 3;
                int i13 = i11 & 7;
                if (i13 == 0) {
                    interfaceC10624c2.zzt(i12, ((Long) obj).longValue());
                } else if (i13 == 1) {
                    interfaceC10624c2.zzm(i12, ((Long) obj).longValue());
                } else if (i13 == 2) {
                    interfaceC10624c2.f(i12, (AbstractC10605b0) obj);
                } else if (i13 == 3) {
                    interfaceC10624c2.g(i12);
                    ((K1) obj).i(interfaceC10624c2);
                    interfaceC10624c2.zzh(i12);
                } else {
                    if (i13 != 5) {
                        throw new RuntimeException(zzadi.a());
                    }
                    interfaceC10624c2.zzk(i12, ((Integer) obj).intValue());
                }
            }
        }
    }
}
