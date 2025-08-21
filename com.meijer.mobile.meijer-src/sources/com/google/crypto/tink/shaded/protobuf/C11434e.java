package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC11452x;
import com.google.crypto.tink.shaded.protobuf.C11454z;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.medallia.digital.mobilesdk.l3;
import fsimpl.C14170dq;
import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C11434e {

    /* renamed from: a, reason: collision with root package name */
    private static volatile int f89172a = 100;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.e$a */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f89173a;

        static {
            int[] iArr = new int[q0.b.values().length];
            f89173a = iArr;
            try {
                iArr[q0.b.f89296c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f89173a[q0.b.f89297d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f89173a[q0.b.f89298e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f89173a[q0.b.f89299f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f89173a[q0.b.f89300g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f89173a[q0.b.f89308o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f89173a[q0.b.f89301h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f89173a[q0.b.f89311r.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f89173a[q0.b.f89302i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f89173a[q0.b.f89310q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f89173a[q0.b.f89303j.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f89173a[q0.b.f89312s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f89173a[q0.b.f89313t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f89173a[q0.b.f89309p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f89173a[q0.b.f89307n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f89173a[q0.b.f89304k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f89173a[q0.b.f89305l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f89173a[q0.b.f89306m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.e$b */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f89174a;

        /* renamed from: b, reason: collision with root package name */
        public long f89175b;

        /* renamed from: c, reason: collision with root package name */
        public Object f89176c;

        /* renamed from: d, reason: collision with root package name */
        public final C11444o f89177d;

        /* renamed from: e, reason: collision with root package name */
        public int f89178e;

        b(C11444o c11444o) {
            c11444o.getClass();
            this.f89177d = c11444o;
        }
    }

    static int A(byte[] bArr, int i10, C11454z.i<?> iVar, b bVar) throws IOException {
        H h10 = (H) iVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f89174a + iJ;
        while (iJ < i11) {
            iJ = M(bArr, iJ, bVar);
            h10.k(bVar.f89175b);
        }
        if (iJ == i11) {
            return iJ;
        }
        throw InvalidProtocolBufferException.m();
    }

    static int B(int i10, byte[] bArr, int i11, int i12, C11454z.i<?> iVar, b bVar) {
        C11453y c11453y = (C11453y) iVar;
        int iJ = J(bArr, i11, bVar);
        c11453y.b2(AbstractC11438i.c(bVar.f89174a));
        while (iJ < i12) {
            int iJ2 = J(bArr, iJ, bVar);
            if (i10 != bVar.f89174a) {
                break;
            }
            iJ = J(bArr, iJ2, bVar);
            c11453y.b2(AbstractC11438i.c(bVar.f89174a));
        }
        return iJ;
    }

    static int C(int i10, byte[] bArr, int i11, int i12, C11454z.i<?> iVar, b bVar) {
        H h10 = (H) iVar;
        int iM = M(bArr, i11, bVar);
        h10.k(AbstractC11438i.d(bVar.f89175b));
        while (iM < i12) {
            int iJ = J(bArr, iM, bVar);
            if (i10 != bVar.f89174a) {
                break;
            }
            iM = M(bArr, iJ, bVar);
            h10.k(AbstractC11438i.d(bVar.f89175b));
        }
        return iM;
    }

    static int I(int i10, byte[] bArr, int i11, b bVar) {
        int i12 = i10 & l3.f93324d;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            bVar.f89174a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & Byte.MAX_VALUE) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            bVar.f89174a = i14 | (b11 << C14170dq.LIGHTEN);
            return i15;
        }
        int i16 = i14 | ((b11 & Byte.MAX_VALUE) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            bVar.f89174a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & Byte.MAX_VALUE) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            bVar.f89174a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                bVar.f89174a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    static int J(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return I(b10, bArr, i11, bVar);
        }
        bVar.f89174a = b10;
        return i11;
    }

    static int K(int i10, byte[] bArr, int i11, int i12, C11454z.i<?> iVar, b bVar) {
        C11453y c11453y = (C11453y) iVar;
        int iJ = J(bArr, i11, bVar);
        c11453y.b2(bVar.f89174a);
        while (iJ < i12) {
            int iJ2 = J(bArr, iJ, bVar);
            if (i10 != bVar.f89174a) {
                break;
            }
            iJ = J(bArr, iJ2, bVar);
            c11453y.b2(bVar.f89174a);
        }
        return iJ;
    }

    static int L(long j10, byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | ((b10 & Byte.MAX_VALUE) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            i12 += 7;
            j11 |= (b11 & Byte.MAX_VALUE) << i12;
            i11 = i13;
            b10 = b11;
        }
        bVar.f89175b = j11;
        return i11;
    }

    static int M(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 < 0) {
            return L(j10, bArr, i11, bVar);
        }
        bVar.f89175b = j10;
        return i11;
    }

    static int N(int i10, byte[] bArr, int i11, int i12, C11454z.i<?> iVar, b bVar) {
        H h10 = (H) iVar;
        int iM = M(bArr, i11, bVar);
        h10.k(bVar.f89175b);
        while (iM < i12) {
            int iJ = J(bArr, iM, bVar);
            if (i10 != bVar.f89174a) {
                break;
            }
            iM = M(bArr, iJ, bVar);
            h10.k(bVar.f89175b);
        }
        return iM;
    }

    static int O(Object obj, f0 f0Var, byte[] bArr, int i10, int i11, int i12, b bVar) throws IOException {
        int i13 = bVar.f89178e + 1;
        bVar.f89178e = i13;
        a(i13);
        int iD0 = ((U) f0Var).d0(obj, bArr, i10, i11, i12, bVar);
        bVar.f89178e--;
        bVar.f89176c = obj;
        return iD0;
    }

    static int P(Object obj, f0 f0Var, byte[] bArr, int i10, int i11, b bVar) throws IOException {
        int I10 = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            I10 = I(i12, bArr, I10, bVar);
            i12 = bVar.f89174a;
        }
        int i13 = I10;
        if (i12 < 0 || i12 > i11 - i13) {
            throw InvalidProtocolBufferException.m();
        }
        int i14 = bVar.f89178e + 1;
        bVar.f89178e = i14;
        a(i14);
        int i15 = i13 + i12;
        f0Var.h(obj, bArr, i13, i15, bVar);
        bVar.f89178e--;
        bVar.f89176c = obj;
        return i15;
    }

    private static void a(int i10) throws InvalidProtocolBufferException {
        if (i10 >= f89172a) {
            throw InvalidProtocolBufferException.i();
        }
    }

    static int b(int i10, byte[] bArr, int i11, int i12, C11454z.i<?> iVar, b bVar) {
        C11435f c11435f = (C11435f) iVar;
        int iM = M(bArr, i11, bVar);
        c11435f.k(bVar.f89175b != 0);
        while (iM < i12) {
            int iJ = J(bArr, iM, bVar);
            if (i10 != bVar.f89174a) {
                break;
            }
            iM = M(bArr, iJ, bVar);
            c11435f.k(bVar.f89175b != 0);
        }
        return iM;
    }

    static int f(int i10, byte[] bArr, int i11, int i12, C11454z.i<?> iVar, b bVar) {
        C11441l c11441l = (C11441l) iVar;
        c11441l.h(e(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int iJ = J(bArr, i13, bVar);
            if (i10 != bVar.f89174a) {
                break;
            }
            c11441l.h(e(bArr, iJ));
            i13 = iJ + 8;
        }
        return i13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static int g(int i10, byte[] bArr, int i11, int i12, AbstractC11452x.c<?, ?> cVar, AbstractC11452x.e<?, ?> eVar, l0<m0, m0> l0Var, b bVar) throws IOException {
        int i13;
        int i14;
        C11448t<AbstractC11452x.d> c11448t = cVar.extensions;
        int i15 = i10 >>> 3;
        if (eVar.f89419b.h() && eVar.f89419b.k()) {
            switch (a.f89173a[eVar.a().ordinal()]) {
                case 1:
                    C11441l c11441l = new C11441l();
                    int iT = t(bArr, i11, c11441l, bVar);
                    c11448t.x(eVar.f89419b, c11441l);
                    return iT;
                case 2:
                    C11450v c11450v = new C11450v();
                    int iW = w(bArr, i11, c11450v, bVar);
                    c11448t.x(eVar.f89419b, c11450v);
                    return iW;
                case 3:
                case 4:
                    H h10 = new H();
                    int iA = A(bArr, i11, h10, bVar);
                    c11448t.x(eVar.f89419b, h10);
                    return iA;
                case 5:
                case 6:
                    C11453y c11453y = new C11453y();
                    int iZ = z(bArr, i11, c11453y, bVar);
                    c11448t.x(eVar.f89419b, c11453y);
                    return iZ;
                case 7:
                case 8:
                    H h11 = new H();
                    int iV = v(bArr, i11, h11, bVar);
                    c11448t.x(eVar.f89419b, h11);
                    return iV;
                case 9:
                case 10:
                    C11453y c11453y2 = new C11453y();
                    int iU = u(bArr, i11, c11453y2, bVar);
                    c11448t.x(eVar.f89419b, c11453y2);
                    return iU;
                case 11:
                    C11435f c11435f = new C11435f();
                    int iS = s(bArr, i11, c11435f, bVar);
                    c11448t.x(eVar.f89419b, c11435f);
                    return iS;
                case 12:
                    C11453y c11453y3 = new C11453y();
                    int iX = x(bArr, i11, c11453y3, bVar);
                    c11448t.x(eVar.f89419b, c11453y3);
                    return iX;
                case 13:
                    H h12 = new H();
                    int iY = y(bArr, i11, h12, bVar);
                    c11448t.x(eVar.f89419b, h12);
                    return iY;
                case 14:
                    C11453y c11453y4 = new C11453y();
                    int iZ2 = z(bArr, i11, c11453y4, bVar);
                    h0.z(cVar, i15, c11453y4, eVar.f89419b.b(), null, l0Var);
                    c11448t.x(eVar.f89419b, c11453y4);
                    return iZ2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f89419b.i());
            }
        }
        Object objValueOf = null;
        if (eVar.a() == q0.b.f89309p) {
            i11 = J(bArr, i11, bVar);
            if (eVar.f89419b.b().a(bVar.f89174a) == null) {
                h0.J(cVar, i15, bVar.f89174a, null, l0Var);
                return i11;
            }
            objValueOf = Integer.valueOf(bVar.f89174a);
        } else {
            switch (a.f89173a[eVar.a().ordinal()]) {
                case 1:
                    i13 = i11;
                    objValueOf = Double.valueOf(e(bArr, i13));
                    i11 = i13 + 8;
                    break;
                case 2:
                    i14 = i11;
                    objValueOf = Float.valueOf(m(bArr, i14));
                    i11 = i14 + 4;
                    break;
                case 3:
                case 4:
                    i11 = M(bArr, i11, bVar);
                    objValueOf = Long.valueOf(bVar.f89175b);
                    break;
                case 5:
                case 6:
                    i11 = J(bArr, i11, bVar);
                    objValueOf = Integer.valueOf(bVar.f89174a);
                    break;
                case 7:
                case 8:
                    i13 = i11;
                    objValueOf = Long.valueOf(k(bArr, i13));
                    i11 = i13 + 8;
                    break;
                case 9:
                case 10:
                    i14 = i11;
                    objValueOf = Integer.valueOf(i(bArr, i14));
                    i11 = i14 + 4;
                    break;
                case 11:
                    i11 = M(bArr, i11, bVar);
                    objValueOf = Boolean.valueOf(bVar.f89175b != 0);
                    break;
                case 12:
                    i11 = J(bArr, i11, bVar);
                    objValueOf = Integer.valueOf(AbstractC11438i.c(bVar.f89174a));
                    break;
                case 13:
                    i11 = M(bArr, i11, bVar);
                    objValueOf = Long.valueOf(AbstractC11438i.d(bVar.f89175b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i11 = c(bArr, i11, bVar);
                    objValueOf = bVar.f89176c;
                    break;
                case 16:
                    i11 = D(bArr, i11, bVar);
                    objValueOf = bVar.f89176c;
                    break;
                case 17:
                    int i16 = (i15 << 3) | 4;
                    f0 f0VarC = b0.a().c(eVar.b().getClass());
                    if (eVar.d()) {
                        int iO = o(f0VarC, bArr, i11, i12, i16, bVar);
                        c11448t.a(eVar.f89419b, bVar.f89176c);
                        return iO;
                    }
                    Object objI = c11448t.i(eVar.f89419b);
                    if (objI == null) {
                        objI = f0VarC.d();
                        c11448t.x(eVar.f89419b, objI);
                    }
                    return O(objI, f0VarC, bArr, i11, i12, i16, bVar);
                case 18:
                    f0 f0VarC2 = b0.a().c(eVar.b().getClass());
                    if (eVar.d()) {
                        int iQ = q(f0VarC2, bArr, i11, i12, bVar);
                        c11448t.a(eVar.f89419b, bVar.f89176c);
                        return iQ;
                    }
                    Object objI2 = c11448t.i(eVar.f89419b);
                    if (objI2 == null) {
                        objI2 = f0VarC2.d();
                        c11448t.x(eVar.f89419b, objI2);
                    }
                    return P(objI2, f0VarC2, bArr, i11, i12, bVar);
            }
        }
        if (eVar.d()) {
            c11448t.a(eVar.f89419b, objValueOf);
            return i11;
        }
        c11448t.x(eVar.f89419b, objValueOf);
        return i11;
    }

    static int h(int i10, byte[] bArr, int i11, int i12, Object obj, Q q10, l0<m0, m0> l0Var, b bVar) throws IOException {
        AbstractC11452x.e eVarA = bVar.f89177d.a(q10, i10 >>> 3);
        if (eVarA == null) {
            return H(i10, bArr, i11, i12, U.w(obj), bVar);
        }
        AbstractC11452x.c cVar = (AbstractC11452x.c) obj;
        cVar.X();
        return g(i10, bArr, i11, i12, cVar, eVarA, l0Var, bVar);
    }

    static int i(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    static int j(int i10, byte[] bArr, int i11, int i12, C11454z.i<?> iVar, b bVar) {
        C11453y c11453y = (C11453y) iVar;
        c11453y.b2(i(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int iJ = J(bArr, i13, bVar);
            if (i10 != bVar.f89174a) {
                break;
            }
            c11453y.b2(i(bArr, iJ));
            i13 = iJ + 4;
        }
        return i13;
    }

    static long k(byte[] bArr, int i10) {
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    static int l(int i10, byte[] bArr, int i11, int i12, C11454z.i<?> iVar, b bVar) {
        H h10 = (H) iVar;
        h10.k(k(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int iJ = J(bArr, i13, bVar);
            if (i10 != bVar.f89174a) {
                break;
            }
            h10.k(k(bArr, iJ));
            i13 = iJ + 8;
        }
        return i13;
    }

    static int n(int i10, byte[] bArr, int i11, int i12, C11454z.i<?> iVar, b bVar) {
        C11450v c11450v = (C11450v) iVar;
        c11450v.h(m(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int iJ = J(bArr, i13, bVar);
            if (i10 != bVar.f89174a) {
                break;
            }
            c11450v.h(m(bArr, iJ));
            i13 = iJ + 4;
        }
        return i13;
    }

    static int p(f0 f0Var, int i10, byte[] bArr, int i11, int i12, C11454z.i<?> iVar, b bVar) throws IOException {
        int i13 = (i10 & (-8)) | 4;
        int iO = o(f0Var, bArr, i11, i12, i13, bVar);
        iVar.add(bVar.f89176c);
        while (iO < i12) {
            int iJ = J(bArr, iO, bVar);
            if (i10 != bVar.f89174a) {
                break;
            }
            iO = o(f0Var, bArr, iJ, i12, i13, bVar);
            iVar.add(bVar.f89176c);
        }
        return iO;
    }

    static int s(byte[] bArr, int i10, C11454z.i<?> iVar, b bVar) throws IOException {
        C11435f c11435f = (C11435f) iVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f89174a + iJ;
        while (iJ < i11) {
            iJ = M(bArr, iJ, bVar);
            c11435f.k(bVar.f89175b != 0);
        }
        if (iJ == i11) {
            return iJ;
        }
        throw InvalidProtocolBufferException.m();
    }

    static int t(byte[] bArr, int i10, C11454z.i<?> iVar, b bVar) throws IOException {
        C11441l c11441l = (C11441l) iVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f89174a + iJ;
        while (iJ < i11) {
            c11441l.h(e(bArr, iJ));
            iJ += 8;
        }
        if (iJ == i11) {
            return iJ;
        }
        throw InvalidProtocolBufferException.m();
    }

    static int u(byte[] bArr, int i10, C11454z.i<?> iVar, b bVar) throws IOException {
        C11453y c11453y = (C11453y) iVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f89174a + iJ;
        while (iJ < i11) {
            c11453y.b2(i(bArr, iJ));
            iJ += 4;
        }
        if (iJ == i11) {
            return iJ;
        }
        throw InvalidProtocolBufferException.m();
    }

    static int v(byte[] bArr, int i10, C11454z.i<?> iVar, b bVar) throws IOException {
        H h10 = (H) iVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f89174a + iJ;
        while (iJ < i11) {
            h10.k(k(bArr, iJ));
            iJ += 8;
        }
        if (iJ == i11) {
            return iJ;
        }
        throw InvalidProtocolBufferException.m();
    }

    static int w(byte[] bArr, int i10, C11454z.i<?> iVar, b bVar) throws IOException {
        C11450v c11450v = (C11450v) iVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f89174a + iJ;
        while (iJ < i11) {
            c11450v.h(m(bArr, iJ));
            iJ += 4;
        }
        if (iJ == i11) {
            return iJ;
        }
        throw InvalidProtocolBufferException.m();
    }

    static int x(byte[] bArr, int i10, C11454z.i<?> iVar, b bVar) throws IOException {
        C11453y c11453y = (C11453y) iVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f89174a + iJ;
        while (iJ < i11) {
            iJ = J(bArr, iJ, bVar);
            c11453y.b2(AbstractC11438i.c(bVar.f89174a));
        }
        if (iJ == i11) {
            return iJ;
        }
        throw InvalidProtocolBufferException.m();
    }

    static int y(byte[] bArr, int i10, C11454z.i<?> iVar, b bVar) throws IOException {
        H h10 = (H) iVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f89174a + iJ;
        while (iJ < i11) {
            iJ = M(bArr, iJ, bVar);
            h10.k(AbstractC11438i.d(bVar.f89175b));
        }
        if (iJ == i11) {
            return iJ;
        }
        throw InvalidProtocolBufferException.m();
    }

    static int z(byte[] bArr, int i10, C11454z.i<?> iVar, b bVar) throws IOException {
        C11453y c11453y = (C11453y) iVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f89174a + iJ;
        while (iJ < i11) {
            iJ = J(bArr, iJ, bVar);
            c11453y.b2(bVar.f89174a);
        }
        if (iJ == i11) {
            return iJ;
        }
        throw InvalidProtocolBufferException.m();
    }

    static int D(byte[] bArr, int i10, b bVar) throws InvalidProtocolBufferException {
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f89174a;
        if (i11 >= 0) {
            if (i11 == 0) {
                bVar.f89176c = "";
                return iJ;
            }
            bVar.f89176c = new String(bArr, iJ, i11, C11454z.f89432b);
            return iJ + i11;
        }
        throw InvalidProtocolBufferException.g();
    }

    static int E(int i10, byte[] bArr, int i11, int i12, C11454z.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        int iJ = J(bArr, i11, bVar);
        int i13 = bVar.f89174a;
        if (i13 >= 0) {
            if (i13 == 0) {
                iVar.add("");
            } else {
                iVar.add(new String(bArr, iJ, i13, C11454z.f89432b));
                iJ += i13;
            }
            while (iJ < i12) {
                int iJ2 = J(bArr, iJ, bVar);
                if (i10 != bVar.f89174a) {
                    break;
                }
                iJ = J(bArr, iJ2, bVar);
                int i14 = bVar.f89174a;
                if (i14 >= 0) {
                    if (i14 == 0) {
                        iVar.add("");
                    } else {
                        iVar.add(new String(bArr, iJ, i14, C11454z.f89432b));
                        iJ += i14;
                    }
                } else {
                    throw InvalidProtocolBufferException.g();
                }
            }
            return iJ;
        }
        throw InvalidProtocolBufferException.g();
    }

    static int F(int i10, byte[] bArr, int i11, int i12, C11454z.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        int iJ = J(bArr, i11, bVar);
        int i13 = bVar.f89174a;
        if (i13 >= 0) {
            if (i13 == 0) {
                iVar.add("");
            } else {
                int i14 = iJ + i13;
                if (p0.m(bArr, iJ, i14)) {
                    iVar.add(new String(bArr, iJ, i13, C11454z.f89432b));
                    iJ = i14;
                } else {
                    throw InvalidProtocolBufferException.d();
                }
            }
            while (iJ < i12) {
                int iJ2 = J(bArr, iJ, bVar);
                if (i10 != bVar.f89174a) {
                    break;
                }
                iJ = J(bArr, iJ2, bVar);
                int i15 = bVar.f89174a;
                if (i15 >= 0) {
                    if (i15 == 0) {
                        iVar.add("");
                    } else {
                        int i16 = iJ + i15;
                        if (p0.m(bArr, iJ, i16)) {
                            iVar.add(new String(bArr, iJ, i15, C11454z.f89432b));
                            iJ = i16;
                        } else {
                            throw InvalidProtocolBufferException.d();
                        }
                    }
                } else {
                    throw InvalidProtocolBufferException.g();
                }
            }
            return iJ;
        }
        throw InvalidProtocolBufferException.g();
    }

    static int G(byte[] bArr, int i10, b bVar) throws InvalidProtocolBufferException {
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f89174a;
        if (i11 >= 0) {
            if (i11 == 0) {
                bVar.f89176c = "";
                return iJ;
            }
            bVar.f89176c = p0.e(bArr, iJ, i11);
            return iJ + i11;
        }
        throw InvalidProtocolBufferException.g();
    }

    static int H(int i10, byte[] bArr, int i11, int i12, m0 m0Var, b bVar) throws InvalidProtocolBufferException {
        if (q0.a(i10) != 0) {
            int iB = q0.b(i10);
            if (iB != 0) {
                if (iB != 1) {
                    if (iB != 2) {
                        if (iB != 3) {
                            if (iB == 5) {
                                m0Var.n(i10, Integer.valueOf(i(bArr, i11)));
                                return i11 + 4;
                            }
                            throw InvalidProtocolBufferException.c();
                        }
                        m0 m0VarK = m0.k();
                        int i13 = (i10 & (-8)) | 4;
                        int i14 = bVar.f89178e + 1;
                        bVar.f89178e = i14;
                        a(i14);
                        int i15 = 0;
                        while (true) {
                            if (i11 >= i12) {
                                break;
                            }
                            int iJ = J(bArr, i11, bVar);
                            i15 = bVar.f89174a;
                            if (i15 == i13) {
                                i11 = iJ;
                                break;
                            }
                            i11 = H(i15, bArr, iJ, i12, m0VarK, bVar);
                        }
                        bVar.f89178e--;
                        if (i11 <= i12 && i15 == i13) {
                            m0Var.n(i10, m0VarK);
                            return i11;
                        }
                        throw InvalidProtocolBufferException.h();
                    }
                    int iJ2 = J(bArr, i11, bVar);
                    int i16 = bVar.f89174a;
                    if (i16 >= 0) {
                        if (i16 <= bArr.length - iJ2) {
                            if (i16 == 0) {
                                m0Var.n(i10, AbstractC11437h.f89182b);
                            } else {
                                m0Var.n(i10, AbstractC11437h.l(bArr, iJ2, i16));
                            }
                            return iJ2 + i16;
                        }
                        throw InvalidProtocolBufferException.m();
                    }
                    throw InvalidProtocolBufferException.g();
                }
                m0Var.n(i10, Long.valueOf(k(bArr, i11)));
                return i11 + 8;
            }
            int iM = M(bArr, i11, bVar);
            m0Var.n(i10, Long.valueOf(bVar.f89175b));
            return iM;
        }
        throw InvalidProtocolBufferException.c();
    }

    static int Q(int i10, byte[] bArr, int i11, int i12, b bVar) throws InvalidProtocolBufferException {
        if (q0.a(i10) != 0) {
            int iB = q0.b(i10);
            if (iB != 0) {
                if (iB != 1) {
                    if (iB != 2) {
                        if (iB != 3) {
                            if (iB == 5) {
                                return i11 + 4;
                            }
                            throw InvalidProtocolBufferException.c();
                        }
                        int i13 = (i10 & (-8)) | 4;
                        int i14 = 0;
                        while (i11 < i12) {
                            i11 = J(bArr, i11, bVar);
                            i14 = bVar.f89174a;
                            if (i14 == i13) {
                                break;
                            }
                            i11 = Q(i14, bArr, i11, i12, bVar);
                        }
                        if (i11 <= i12 && i14 == i13) {
                            return i11;
                        }
                        throw InvalidProtocolBufferException.h();
                    }
                    return J(bArr, i11, bVar) + bVar.f89174a;
                }
                return i11 + 8;
            }
            return M(bArr, i11, bVar);
        }
        throw InvalidProtocolBufferException.c();
    }

    static int c(byte[] bArr, int i10, b bVar) throws InvalidProtocolBufferException {
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f89174a;
        if (i11 >= 0) {
            if (i11 <= bArr.length - iJ) {
                if (i11 == 0) {
                    bVar.f89176c = AbstractC11437h.f89182b;
                    return iJ;
                }
                bVar.f89176c = AbstractC11437h.l(bArr, iJ, i11);
                return iJ + i11;
            }
            throw InvalidProtocolBufferException.m();
        }
        throw InvalidProtocolBufferException.g();
    }

    static int d(int i10, byte[] bArr, int i11, int i12, C11454z.i<?> iVar, b bVar) throws InvalidProtocolBufferException {
        int iJ = J(bArr, i11, bVar);
        int i13 = bVar.f89174a;
        if (i13 >= 0) {
            if (i13 <= bArr.length - iJ) {
                if (i13 == 0) {
                    iVar.add(AbstractC11437h.f89182b);
                } else {
                    iVar.add(AbstractC11437h.l(bArr, iJ, i13));
                    iJ += i13;
                }
                while (iJ < i12) {
                    int iJ2 = J(bArr, iJ, bVar);
                    if (i10 != bVar.f89174a) {
                        break;
                    }
                    iJ = J(bArr, iJ2, bVar);
                    int i14 = bVar.f89174a;
                    if (i14 >= 0) {
                        if (i14 <= bArr.length - iJ) {
                            if (i14 == 0) {
                                iVar.add(AbstractC11437h.f89182b);
                            } else {
                                iVar.add(AbstractC11437h.l(bArr, iJ, i14));
                                iJ += i14;
                            }
                        } else {
                            throw InvalidProtocolBufferException.m();
                        }
                    } else {
                        throw InvalidProtocolBufferException.g();
                    }
                }
                return iJ;
            }
            throw InvalidProtocolBufferException.m();
        }
        throw InvalidProtocolBufferException.g();
    }

    static double e(byte[] bArr, int i10) {
        return Double.longBitsToDouble(k(bArr, i10));
    }

    static float m(byte[] bArr, int i10) {
        return Float.intBitsToFloat(i(bArr, i10));
    }

    static int o(f0 f0Var, byte[] bArr, int i10, int i11, int i12, b bVar) throws IOException {
        Object objD = f0Var.d();
        int iO = O(objD, f0Var, bArr, i10, i11, i12, bVar);
        f0Var.e(objD);
        bVar.f89176c = objD;
        return iO;
    }

    static int q(f0 f0Var, byte[] bArr, int i10, int i11, b bVar) throws IOException {
        Object objD = f0Var.d();
        int iP = P(objD, f0Var, bArr, i10, i11, bVar);
        f0Var.e(objD);
        bVar.f89176c = objD;
        return iP;
    }

    static int r(f0<?> f0Var, int i10, byte[] bArr, int i11, int i12, C11454z.i<?> iVar, b bVar) throws IOException {
        int iQ = q(f0Var, bArr, i11, i12, bVar);
        iVar.add(bVar.f89176c);
        while (iQ < i12) {
            int iJ = J(bArr, iQ, bVar);
            if (i10 != bVar.f89174a) {
                break;
            }
            iQ = q(f0Var, bArr, iJ, i12, bVar);
            iVar.add(bVar.f89176c);
        }
        return iQ;
    }
}
