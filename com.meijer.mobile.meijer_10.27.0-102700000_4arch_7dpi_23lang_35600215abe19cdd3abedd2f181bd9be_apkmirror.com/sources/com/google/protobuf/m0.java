package com.google.protobuf;

import com.google.protobuf.s0;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class m0 {

    /* renamed from: f, reason: collision with root package name */
    private static final m0 f90573f = new m0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f90574a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f90575b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f90576c;

    /* renamed from: d, reason: collision with root package name */
    private int f90577d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f90578e;

    private m0() {
        this(0, new int[8], new Object[8], true);
    }

    private static boolean l(Object[] objArr, Object[] objArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (!objArr[i11].equals(objArr2[i11])) {
                return false;
            }
        }
        return true;
    }

    private static boolean o(int[] iArr, int[] iArr2, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        int i10 = this.f90574a;
        return i10 == m0Var.f90574a && o(this.f90575b, m0Var.f90575b, i10) && l(this.f90576c, m0Var.f90576c, this.f90574a);
    }

    final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f90574a; i11++) {
            S.d(sb2, i10, String.valueOf(r0.a(this.f90575b[i11])), this.f90576c[i11]);
        }
    }

    private m0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f90577d = -1;
        this.f90574a = i10;
        this.f90575b = iArr;
        this.f90576c = objArr;
        this.f90578e = z10;
    }

    private void b(int i10) {
        int[] iArr = this.f90575b;
        if (i10 > iArr.length) {
            int i11 = this.f90574a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f90575b = Arrays.copyOf(iArr, i10);
            this.f90576c = Arrays.copyOf(this.f90576c, i10);
        }
    }

    public static m0 c() {
        return f90573f;
    }

    private static int f(int[] iArr, int i10) {
        int i11 = 17;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        return i11;
    }

    private static int g(Object[] objArr, int i10) {
        int iHashCode = 17;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode = (iHashCode * 31) + objArr[i11].hashCode();
        }
        return iHashCode;
    }

    static m0 j(m0 m0Var, m0 m0Var2) {
        int i10 = m0Var.f90574a + m0Var2.f90574a;
        int[] iArrCopyOf = Arrays.copyOf(m0Var.f90575b, i10);
        System.arraycopy(m0Var2.f90575b, 0, iArrCopyOf, m0Var.f90574a, m0Var2.f90574a);
        Object[] objArrCopyOf = Arrays.copyOf(m0Var.f90576c, i10);
        System.arraycopy(m0Var2.f90576c, 0, objArrCopyOf, m0Var.f90574a, m0Var2.f90574a);
        return new m0(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static m0 k() {
        return new m0();
    }

    void a() {
        if (!this.f90578e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int iW;
        int i10 = this.f90577d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f90574a; i12++) {
            int i13 = this.f90575b[i12];
            int iA = r0.a(i13);
            int iB = r0.b(i13);
            if (iB == 0) {
                iW = CodedOutputStream.W(iA, ((Long) this.f90576c[i12]).longValue());
            } else if (iB == 1) {
                iW = CodedOutputStream.o(iA, ((Long) this.f90576c[i12]).longValue());
            } else if (iB == 2) {
                iW = CodedOutputStream.g(iA, (AbstractC11521g) this.f90576c[i12]);
            } else if (iB == 3) {
                iW = (CodedOutputStream.T(iA) * 2) + ((m0) this.f90576c[i12]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.e());
                }
                iW = CodedOutputStream.m(iA, ((Integer) this.f90576c[i12]).intValue());
            }
            i11 += iW;
        }
        this.f90577d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f90577d;
        if (i10 != -1) {
            return i10;
        }
        int I10 = 0;
        for (int i11 = 0; i11 < this.f90574a; i11++) {
            I10 += CodedOutputStream.I(r0.a(this.f90575b[i11]), (AbstractC11521g) this.f90576c[i11]);
        }
        this.f90577d = I10;
        return I10;
    }

    public void h() {
        if (this.f90578e) {
            this.f90578e = false;
        }
    }

    public int hashCode() {
        int i10 = this.f90574a;
        return ((((527 + i10) * 31) + f(this.f90575b, i10)) * 31) + g(this.f90576c, this.f90574a);
    }

    public void r(s0 s0Var) throws IOException {
        if (this.f90574a == 0) {
            return;
        }
        if (s0Var.t() == s0.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f90574a; i10++) {
                q(this.f90575b[i10], this.f90576c[i10], s0Var);
            }
            return;
        }
        for (int i11 = this.f90574a - 1; i11 >= 0; i11--) {
            q(this.f90575b[i11], this.f90576c[i11], s0Var);
        }
    }

    private static void q(int i10, Object obj, s0 s0Var) throws IOException {
        int iA = r0.a(i10);
        int iB = r0.b(i10);
        if (iB != 0) {
            if (iB != 1) {
                if (iB != 2) {
                    if (iB != 3) {
                        if (iB == 5) {
                            s0Var.c(iA, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(InvalidProtocolBufferException.e());
                    }
                    if (s0Var.t() == s0.a.ASCENDING) {
                        s0Var.x(iA);
                        ((m0) obj).r(s0Var);
                        s0Var.C(iA);
                        return;
                    } else {
                        s0Var.C(iA);
                        ((m0) obj).r(s0Var);
                        s0Var.x(iA);
                        return;
                    }
                }
                s0Var.L(iA, (AbstractC11521g) obj);
                return;
            }
            s0Var.s(iA, ((Long) obj).longValue());
            return;
        }
        s0Var.u(iA, ((Long) obj).longValue());
    }

    m0 i(m0 m0Var) {
        if (m0Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f90574a + m0Var.f90574a;
        b(i10);
        System.arraycopy(m0Var.f90575b, 0, this.f90575b, this.f90574a, m0Var.f90574a);
        System.arraycopy(m0Var.f90576c, 0, this.f90576c, this.f90574a, m0Var.f90574a);
        this.f90574a = i10;
        return this;
    }

    void n(int i10, Object obj) {
        a();
        b(this.f90574a + 1);
        int[] iArr = this.f90575b;
        int i11 = this.f90574a;
        iArr[i11] = i10;
        this.f90576c[i11] = obj;
        this.f90574a = i11 + 1;
    }

    void p(s0 s0Var) throws IOException {
        if (s0Var.t() == s0.a.DESCENDING) {
            for (int i10 = this.f90574a - 1; i10 >= 0; i10--) {
                s0Var.b(r0.a(this.f90575b[i10]), this.f90576c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f90574a; i11++) {
            s0Var.b(r0.a(this.f90575b[i11]), this.f90576c[i11]);
        }
    }
}
