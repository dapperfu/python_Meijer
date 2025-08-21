package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.r0;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class m0 {

    /* renamed from: f, reason: collision with root package name */
    private static final m0 f89254f = new m0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f89255a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f89256b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f89257c;

    /* renamed from: d, reason: collision with root package name */
    private int f89258d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f89259e;

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
        int i10 = this.f89255a;
        return i10 == m0Var.f89255a && o(this.f89256b, m0Var.f89256b, i10) && l(this.f89257c, m0Var.f89257c, this.f89255a);
    }

    final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f89255a; i11++) {
            T.d(sb2, i10, String.valueOf(q0.a(this.f89256b[i11])), this.f89257c[i11]);
        }
    }

    private m0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f89258d = -1;
        this.f89255a = i10;
        this.f89256b = iArr;
        this.f89257c = objArr;
        this.f89259e = z10;
    }

    private void b(int i10) {
        int[] iArr = this.f89256b;
        if (i10 > iArr.length) {
            int i11 = this.f89255a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f89256b = Arrays.copyOf(iArr, i10);
            this.f89257c = Arrays.copyOf(this.f89257c, i10);
        }
    }

    public static m0 c() {
        return f89254f;
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
        int i10 = m0Var.f89255a + m0Var2.f89255a;
        int[] iArrCopyOf = Arrays.copyOf(m0Var.f89256b, i10);
        System.arraycopy(m0Var2.f89256b, 0, iArrCopyOf, m0Var.f89255a, m0Var2.f89255a);
        Object[] objArrCopyOf = Arrays.copyOf(m0Var.f89257c, i10);
        System.arraycopy(m0Var2.f89257c, 0, objArrCopyOf, m0Var.f89255a, m0Var2.f89255a);
        return new m0(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static m0 k() {
        return new m0();
    }

    void a() {
        if (!this.f89259e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int iW;
        int i10 = this.f89258d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f89255a; i12++) {
            int i13 = this.f89256b[i12];
            int iA = q0.a(i13);
            int iB = q0.b(i13);
            if (iB == 0) {
                iW = CodedOutputStream.W(iA, ((Long) this.f89257c[i12]).longValue());
            } else if (iB == 1) {
                iW = CodedOutputStream.o(iA, ((Long) this.f89257c[i12]).longValue());
            } else if (iB == 2) {
                iW = CodedOutputStream.g(iA, (AbstractC11437h) this.f89257c[i12]);
            } else if (iB == 3) {
                iW = (CodedOutputStream.T(iA) * 2) + ((m0) this.f89257c[i12]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.e());
                }
                iW = CodedOutputStream.m(iA, ((Integer) this.f89257c[i12]).intValue());
            }
            i11 += iW;
        }
        this.f89258d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f89258d;
        if (i10 != -1) {
            return i10;
        }
        int I10 = 0;
        for (int i11 = 0; i11 < this.f89255a; i11++) {
            I10 += CodedOutputStream.I(q0.a(this.f89256b[i11]), (AbstractC11437h) this.f89257c[i11]);
        }
        this.f89258d = I10;
        return I10;
    }

    public void h() {
        if (this.f89259e) {
            this.f89259e = false;
        }
    }

    public int hashCode() {
        int i10 = this.f89255a;
        return ((((527 + i10) * 31) + f(this.f89256b, i10)) * 31) + g(this.f89257c, this.f89255a);
    }

    public void r(r0 r0Var) throws IOException {
        if (this.f89255a == 0) {
            return;
        }
        if (r0Var.t() == r0.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f89255a; i10++) {
                q(this.f89256b[i10], this.f89257c[i10], r0Var);
            }
            return;
        }
        for (int i11 = this.f89255a - 1; i11 >= 0; i11--) {
            q(this.f89256b[i11], this.f89257c[i11], r0Var);
        }
    }

    private static void q(int i10, Object obj, r0 r0Var) throws IOException {
        int iA = q0.a(i10);
        int iB = q0.b(i10);
        if (iB != 0) {
            if (iB != 1) {
                if (iB != 2) {
                    if (iB != 3) {
                        if (iB == 5) {
                            r0Var.c(iA, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(InvalidProtocolBufferException.e());
                    }
                    if (r0Var.t() == r0.a.ASCENDING) {
                        r0Var.x(iA);
                        ((m0) obj).r(r0Var);
                        r0Var.C(iA);
                        return;
                    } else {
                        r0Var.C(iA);
                        ((m0) obj).r(r0Var);
                        r0Var.x(iA);
                        return;
                    }
                }
                r0Var.M(iA, (AbstractC11437h) obj);
                return;
            }
            r0Var.s(iA, ((Long) obj).longValue());
            return;
        }
        r0Var.u(iA, ((Long) obj).longValue());
    }

    m0 i(m0 m0Var) {
        if (m0Var.equals(c())) {
            return this;
        }
        a();
        int i10 = this.f89255a + m0Var.f89255a;
        b(i10);
        System.arraycopy(m0Var.f89256b, 0, this.f89256b, this.f89255a, m0Var.f89255a);
        System.arraycopy(m0Var.f89257c, 0, this.f89257c, this.f89255a, m0Var.f89255a);
        this.f89255a = i10;
        return this;
    }

    void n(int i10, Object obj) {
        a();
        b(this.f89255a + 1);
        int[] iArr = this.f89256b;
        int i11 = this.f89255a;
        iArr[i11] = i10;
        this.f89257c[i11] = obj;
        this.f89255a = i11 + 1;
    }

    void p(r0 r0Var) throws IOException {
        if (r0Var.t() == r0.a.DESCENDING) {
            for (int i10 = this.f89255a - 1; i10 >= 0; i10--) {
                r0Var.b(q0.a(this.f89256b[i10]), this.f89257c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f89255a; i11++) {
            r0Var.b(q0.a(this.f89256b[i11]), this.f89257c[i11]);
        }
    }
}
