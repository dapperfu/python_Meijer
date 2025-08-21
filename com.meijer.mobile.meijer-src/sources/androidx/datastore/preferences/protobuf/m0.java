package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.r0;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: f, reason: collision with root package name */
    private static final m0 f54530f = new m0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f54531a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f54532b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f54533c;

    /* renamed from: d, reason: collision with root package name */
    private int f54534d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f54535e;

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
        int i10 = this.f54531a;
        return i10 == m0Var.f54531a && o(this.f54532b, m0Var.f54532b, i10) && l(this.f54533c, m0Var.f54533c, this.f54531a);
    }

    final void m(StringBuilder sb2, int i10) {
        for (int i11 = 0; i11 < this.f54531a; i11++) {
            S.d(sb2, i10, String.valueOf(q0.a(this.f54532b[i11])), this.f54533c[i11]);
        }
    }

    private m0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f54534d = -1;
        this.f54531a = i10;
        this.f54532b = iArr;
        this.f54533c = objArr;
        this.f54535e = z10;
    }

    private void b(int i10) {
        int[] iArr = this.f54532b;
        if (i10 > iArr.length) {
            int i11 = this.f54531a;
            int i12 = i11 + (i11 / 2);
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f54532b = Arrays.copyOf(iArr, i10);
            this.f54533c = Arrays.copyOf(this.f54533c, i10);
        }
    }

    public static m0 c() {
        return f54530f;
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
        int i10 = m0Var.f54531a + m0Var2.f54531a;
        int[] iArrCopyOf = Arrays.copyOf(m0Var.f54532b, i10);
        System.arraycopy(m0Var2.f54532b, 0, iArrCopyOf, m0Var.f54531a, m0Var2.f54531a);
        Object[] objArrCopyOf = Arrays.copyOf(m0Var.f54533c, i10);
        System.arraycopy(m0Var2.f54533c, 0, objArrCopyOf, m0Var.f54531a, m0Var2.f54531a);
        return new m0(i10, iArrCopyOf, objArrCopyOf, true);
    }

    static m0 k() {
        return new m0();
    }

    void a() {
        if (!this.f54535e) {
            throw new UnsupportedOperationException();
        }
    }

    public int d() {
        int iX;
        int i10 = this.f54534d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f54531a; i12++) {
            int i13 = this.f54532b[i12];
            int iA = q0.a(i13);
            int iB = q0.b(i13);
            if (iB == 0) {
                iX = CodedOutputStream.X(iA, ((Long) this.f54533c[i12]).longValue());
            } else if (iB == 1) {
                iX = CodedOutputStream.o(iA, ((Long) this.f54533c[i12]).longValue());
            } else if (iB == 2) {
                iX = CodedOutputStream.g(iA, (AbstractC6083g) this.f54533c[i12]);
            } else if (iB == 3) {
                iX = (CodedOutputStream.U(iA) * 2) + ((m0) this.f54533c[i12]).d();
            } else {
                if (iB != 5) {
                    throw new IllegalStateException(InvalidProtocolBufferException.e());
                }
                iX = CodedOutputStream.m(iA, ((Integer) this.f54533c[i12]).intValue());
            }
            i11 += iX;
        }
        this.f54534d = i11;
        return i11;
    }

    public int e() {
        int i10 = this.f54534d;
        if (i10 != -1) {
            return i10;
        }
        int iJ = 0;
        for (int i11 = 0; i11 < this.f54531a; i11++) {
            iJ += CodedOutputStream.J(q0.a(this.f54532b[i11]), (AbstractC6083g) this.f54533c[i11]);
        }
        this.f54534d = iJ;
        return iJ;
    }

    public void h() {
        if (this.f54535e) {
            this.f54535e = false;
        }
    }

    public int hashCode() {
        int i10 = this.f54531a;
        return ((((527 + i10) * 31) + f(this.f54532b, i10)) * 31) + g(this.f54533c, this.f54531a);
    }

    public void r(r0 r0Var) throws IOException {
        if (this.f54531a == 0) {
            return;
        }
        if (r0Var.t() == r0.a.ASCENDING) {
            for (int i10 = 0; i10 < this.f54531a; i10++) {
                q(this.f54532b[i10], this.f54533c[i10], r0Var);
            }
            return;
        }
        for (int i11 = this.f54531a - 1; i11 >= 0; i11--) {
            q(this.f54532b[i11], this.f54533c[i11], r0Var);
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
                r0Var.K(iA, (AbstractC6083g) obj);
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
        int i10 = this.f54531a + m0Var.f54531a;
        b(i10);
        System.arraycopy(m0Var.f54532b, 0, this.f54532b, this.f54531a, m0Var.f54531a);
        System.arraycopy(m0Var.f54533c, 0, this.f54533c, this.f54531a, m0Var.f54531a);
        this.f54531a = i10;
        return this;
    }

    void n(int i10, Object obj) {
        a();
        b(this.f54531a + 1);
        int[] iArr = this.f54532b;
        int i11 = this.f54531a;
        iArr[i11] = i10;
        this.f54533c[i11] = obj;
        this.f54531a = i11 + 1;
    }

    void p(r0 r0Var) throws IOException {
        if (r0Var.t() == r0.a.DESCENDING) {
            for (int i10 = this.f54531a - 1; i10 >= 0; i10--) {
                r0Var.b(q0.a(this.f54532b[i10]), this.f54533c[i10]);
            }
            return;
        }
        for (int i11 = 0; i11 < this.f54531a; i11++) {
            r0Var.b(q0.a(this.f54532b[i11]), this.f54533c[i11]);
        }
    }
}
