package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC11437h;
import com.google.crypto.tink.shaded.protobuf.C11434e;
import com.google.crypto.tink.shaded.protobuf.C11454z;
import com.google.crypto.tink.shaded.protobuf.J;
import com.google.crypto.tink.shaded.protobuf.r0;
import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes8.dex */
final class U<T> implements f0<T> {

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f89126r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    private static final Unsafe f89127s = o0.D();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f89128a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f89129b;

    /* renamed from: c, reason: collision with root package name */
    private final int f89130c;

    /* renamed from: d, reason: collision with root package name */
    private final int f89131d;

    /* renamed from: e, reason: collision with root package name */
    private final Q f89132e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f89133f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f89134g;

    /* renamed from: h, reason: collision with root package name */
    private final a0 f89135h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f89136i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f89137j;

    /* renamed from: k, reason: collision with root package name */
    private final int f89138k;

    /* renamed from: l, reason: collision with root package name */
    private final int f89139l;

    /* renamed from: m, reason: collision with root package name */
    private final W f89140m;

    /* renamed from: n, reason: collision with root package name */
    private final E f89141n;

    /* renamed from: o, reason: collision with root package name */
    private final l0<?, ?> f89142o;

    /* renamed from: p, reason: collision with root package name */
    private final AbstractC11445p<?> f89143p;

    /* renamed from: q, reason: collision with root package name */
    private final L f89144q;

    private static boolean D(int i10) {
        return (i10 & Integer.MIN_VALUE) != 0;
    }

    private static boolean J(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static long W(int i10) {
        return i10 & 1048575;
    }

    private static int t0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private static boolean z(int i10) {
        return (i10 & 536870912) != 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public void h(T t10, byte[] bArr, int i10, int i11, C11434e.b bVar) throws IOException {
        d0(t10, bArr, i10, i11, 0, bVar);
    }

    private boolean F(T t10, int i10, int i11) {
        if (this.f89144q.e(o0.C(t10, W(i10))).isEmpty()) {
            return true;
        }
        this.f89144q.b(u(i11));
        throw null;
    }

    private static boolean G(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC11452x) {
            return ((AbstractC11452x) obj).H();
        }
        return true;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    private <UT, UB, ET extends com.google.crypto.tink.shaded.protobuf.C11448t.b<ET>> void L(com.google.crypto.tink.shaded.protobuf.l0<UT, UB> r18, com.google.crypto.tink.shaded.protobuf.AbstractC11445p<ET> r19, T r20, com.google.crypto.tink.shaded.protobuf.e0 r21, com.google.crypto.tink.shaded.protobuf.C11444o r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.U.L(com.google.crypto.tink.shaded.protobuf.l0, com.google.crypto.tink.shaded.protobuf.p, java.lang.Object, com.google.crypto.tink.shaded.protobuf.e0, com.google.crypto.tink.shaded.protobuf.o):void");
    }

    static <T> U<T> S(Class<T> cls, O o10, W w10, E e10, l0<?, ?> l0Var, AbstractC11445p<?> abstractC11445p, L l10) {
        return o10 instanceof d0 ? U((d0) o10, w10, e10, l0Var, abstractC11445p, l10) : T((j0) o10, w10, e10, l0Var, abstractC11445p, l10);
    }

    private int V(int i10) {
        return this.f89128a[i10];
    }

    private <K, V> int c0(T t10, byte[] bArr, int i10, int i11, int i12, long j10, C11434e.b bVar) throws IOException {
        Unsafe unsafe = f89127s;
        Object objU = u(i12);
        Object object = unsafe.getObject(t10, j10);
        if (this.f89144q.h(object)) {
            Object objD = this.f89144q.d(objU);
            this.f89144q.a(objD, object);
            unsafe.putObject(t10, j10, objD);
            object = objD;
        }
        this.f89144q.b(objU);
        return n(bArr, i10, i11, null, this.f89144q.c(object), bVar);
    }

    private int e0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, C11434e.b bVar) throws IOException {
        Unsafe unsafe = f89127s;
        long j11 = this.f89128a[i17 + 2] & 1048575;
        switch (i16) {
            case 51:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Double.valueOf(C11434e.e(bArr, i10)));
                int i18 = i10 + 8;
                unsafe.putInt(t10, j11, i13);
                return i18;
            case 52:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Float.valueOf(C11434e.m(bArr, i10)));
                int i19 = i10 + 4;
                unsafe.putInt(t10, j11, i13);
                return i19;
            case 53:
            case 54:
                if (i14 != 0) {
                    return i10;
                }
                int iM = C11434e.M(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Long.valueOf(bVar.f89175b));
                unsafe.putInt(t10, j11, i13);
                return iM;
            case 55:
            case 62:
                if (i14 != 0) {
                    return i10;
                }
                int iJ = C11434e.J(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Integer.valueOf(bVar.f89174a));
                unsafe.putInt(t10, j11, i13);
                return iJ;
            case 56:
            case 65:
                if (i14 != 1) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Long.valueOf(C11434e.k(bArr, i10)));
                int i20 = i10 + 8;
                unsafe.putInt(t10, j11, i13);
                return i20;
            case 57:
            case 64:
                if (i14 != 5) {
                    return i10;
                }
                unsafe.putObject(t10, j10, Integer.valueOf(C11434e.i(bArr, i10)));
                int i21 = i10 + 4;
                unsafe.putInt(t10, j11, i13);
                return i21;
            case 58:
                if (i14 != 0) {
                    return i10;
                }
                int iM2 = C11434e.M(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Boolean.valueOf(bVar.f89175b != 0));
                unsafe.putInt(t10, j11, i13);
                return iM2;
            case 59:
                if (i14 != 2) {
                    return i10;
                }
                int iJ2 = C11434e.J(bArr, i10, bVar);
                int i22 = bVar.f89174a;
                if (i22 == 0) {
                    unsafe.putObject(t10, j10, "");
                } else {
                    if ((i15 & 536870912) != 0 && !p0.m(bArr, iJ2, iJ2 + i22)) {
                        throw InvalidProtocolBufferException.d();
                    }
                    unsafe.putObject(t10, j10, new String(bArr, iJ2, i22, C11454z.f89432b));
                    iJ2 += i22;
                }
                unsafe.putInt(t10, j11, i13);
                return iJ2;
            case 60:
                if (i14 != 2) {
                    return i10;
                }
                Object objR = R(t10, i13, i17);
                int iP = C11434e.P(objR, v(i17), bArr, i10, i11, bVar);
                s0(t10, i13, i17, objR);
                return iP;
            case 61:
                if (i14 != 2) {
                    return i10;
                }
                int iC = C11434e.c(bArr, i10, bVar);
                unsafe.putObject(t10, j10, bVar.f89176c);
                unsafe.putInt(t10, j11, i13);
                return iC;
            case 63:
                if (i14 != 0) {
                    return i10;
                }
                int iJ3 = C11434e.J(bArr, i10, bVar);
                int i23 = bVar.f89174a;
                C11454z.e eVarT = t(i17);
                if (eVarT != null && !eVarT.a(i23)) {
                    w(t10).n(i12, Long.valueOf(i23));
                    return iJ3;
                }
                unsafe.putObject(t10, j10, Integer.valueOf(i23));
                unsafe.putInt(t10, j11, i13);
                return iJ3;
            case 66:
                if (i14 != 0) {
                    return i10;
                }
                int iJ4 = C11434e.J(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Integer.valueOf(AbstractC11438i.c(bVar.f89174a)));
                unsafe.putInt(t10, j11, i13);
                return iJ4;
            case 67:
                if (i14 != 0) {
                    return i10;
                }
                int iM3 = C11434e.M(bArr, i10, bVar);
                unsafe.putObject(t10, j10, Long.valueOf(AbstractC11438i.d(bVar.f89175b)));
                unsafe.putInt(t10, j11, i13);
                return iM3;
            case 68:
                if (i14 == 3) {
                    Object objR2 = R(t10, i13, i17);
                    int iO = C11434e.O(objR2, v(i17), bArr, i10, i11, (i12 & (-8)) | 4, bVar);
                    s0(t10, i13, i17, objR2);
                    return iO;
                }
                break;
        }
        return i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int f0(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, C11434e.b bVar) throws IOException {
        int iK;
        Unsafe unsafe = f89127s;
        C11454z.i iVarB = (C11454z.i) unsafe.getObject(t10, j11);
        if (!iVarB.j()) {
            int size = iVarB.size();
            iVarB = iVarB.b(size == 0 ? 10 : size * 2);
            unsafe.putObject(t10, j11, iVarB);
        }
        C11454z.i iVar = iVarB;
        switch (i16) {
            case 18:
            case 35:
                if (i14 == 2) {
                    return C11434e.t(bArr, i10, iVar, bVar);
                }
                if (i14 == 1) {
                    return C11434e.f(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 19:
            case 36:
                if (i14 == 2) {
                    return C11434e.w(bArr, i10, iVar, bVar);
                }
                if (i14 == 5) {
                    return C11434e.n(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i14 == 2) {
                    return C11434e.A(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return C11434e.N(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
            case 29:
            case 39:
            case 43:
                if (i14 == 2) {
                    return C11434e.z(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return C11434e.K(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 23:
            case l3.f93325e /* 32 */:
            case 40:
            case 46:
                if (i14 == 2) {
                    return C11434e.v(bArr, i10, iVar, bVar);
                }
                if (i14 == 1) {
                    return C11434e.l(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i14 == 2) {
                    return C11434e.u(bArr, i10, iVar, bVar);
                }
                if (i14 == 5) {
                    return C11434e.j(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 25:
            case 42:
                if (i14 == 2) {
                    return C11434e.s(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return C11434e.b(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 26:
                if (i14 == 2) {
                    return (j10 & 536870912) == 0 ? C11434e.E(i12, bArr, i10, i11, iVar, bVar) : C11434e.F(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 27:
                if (i14 == 2) {
                    return C11434e.r(v(i15), i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 28:
                if (i14 == 2) {
                    return C11434e.d(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 30:
            case 44:
                if (i14 != 2) {
                    if (i14 == 0) {
                        iK = C11434e.K(i12, bArr, i10, i11, iVar, bVar);
                    }
                    return i10;
                }
                iK = C11434e.z(bArr, i10, iVar, bVar);
                h0.A(t10, i13, iVar, t(i15), null, this.f89142o);
                return iK;
            case 33:
            case 47:
                if (i14 == 2) {
                    return C11434e.x(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return C11434e.B(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 34:
            case 48:
                if (i14 == 2) {
                    return C11434e.y(bArr, i10, iVar, bVar);
                }
                if (i14 == 0) {
                    return C11434e.C(i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            case 49:
                if (i14 == 3) {
                    return C11434e.p(v(i15), i12, bArr, i10, i11, iVar, bVar);
                }
                return i10;
            default:
                return i10;
        }
    }

    private int g0(int i10) {
        if (i10 < this.f89130c || i10 > this.f89131d) {
            return -1;
        }
        return q0(i10, 0);
    }

    private int h0(int i10, int i11) {
        if (i10 < this.f89130c || i10 > this.f89131d) {
            return -1;
        }
        return q0(i10, i11);
    }

    private int i0(int i10) {
        return this.f89128a[i10 + 2];
    }

    private <E> void j0(Object obj, long j10, e0 e0Var, f0<E> f0Var, C11444o c11444o) throws IOException {
        e0Var.P(this.f89141n.c(obj, j10), f0Var, c11444o);
    }

    private int q0(int i10, int i11) {
        int length = (this.f89128a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iV = V(i13);
            if (i10 == iV) {
                return i13;
            }
            if (i10 < iV) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private <K, V, UT, UB> UB r(int i10, int i11, Map<K, V> map, C11454z.e eVar, UB ub2, l0<UT, UB> l0Var, Object obj) {
        this.f89144q.b(u(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = l0Var.f(obj);
                }
                AbstractC11437h.C1289h c1289hQ = AbstractC11437h.q(J.b(null, next.getKey(), next.getValue()));
                try {
                    J.d(c1289hQ.b(), null, next.getKey(), next.getValue());
                    l0Var.d(ub2, i11, c1289hQ.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private void r0(T t10, int i10, Object obj) {
        f89127s.putObject(t10, W(u0(i10)), obj);
        o0(t10, i10);
    }

    private void s0(T t10, int i10, int i11, Object obj) {
        f89127s.putObject(t10, W(u0(i11)), obj);
        p0(t10, i10, i11);
    }

    private C11454z.e t(int i10) {
        return (C11454z.e) this.f89129b[((i10 / 3) * 2) + 1];
    }

    private Object u(int i10) {
        return this.f89129b[(i10 / 3) * 2];
    }

    private int u0(int i10) {
        return this.f89128a[i10 + 1];
    }

    private f0 v(int i10) {
        int i11 = (i10 / 3) * 2;
        f0 f0Var = (f0) this.f89129b[i11];
        if (f0Var != null) {
            return f0Var;
        }
        f0<T> f0VarC = b0.a().c((Class) this.f89129b[i11 + 1]);
        this.f89129b[i11] = f0VarC;
        return f0VarC;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void v0(T r19, com.google.crypto.tink.shaded.protobuf.r0 r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.U.v0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.r0):void");
    }

    static m0 w(Object obj) {
        AbstractC11452x abstractC11452x = (AbstractC11452x) obj;
        m0 m0Var = abstractC11452x.unknownFields;
        if (m0Var != m0.c()) {
            return m0Var;
        }
        m0 m0VarK = m0.k();
        abstractC11452x.unknownFields = m0VarK;
        return m0VarK;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void w0(T r11, com.google.crypto.tink.shaded.protobuf.r0 r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.U.w0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.r0):void");
    }

    private <K, V> void x0(r0 r0Var, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            this.f89144q.b(u(i11));
            r0Var.J(i10, null, this.f89144q.e(obj));
        }
    }

    private void y0(int i10, Object obj, r0 r0Var) throws IOException {
        if (obj instanceof String) {
            r0Var.e(i10, (String) obj);
        } else {
            r0Var.M(i10, (AbstractC11437h) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public int b(T t10) {
        int i10;
        int iF;
        int length = this.f89128a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iU0 = u0(i12);
            int iV = V(i12);
            long jW = W(iU0);
            int iHashCode = 37;
            switch (t0(iU0)) {
                case 0:
                    i10 = i11 * 53;
                    iF = C11454z.f(Double.doubleToLongBits(o0.x(t10, jW)));
                    i11 = i10 + iF;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iF = Float.floatToIntBits(o0.y(t10, jW));
                    i11 = i10 + iF;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iF = C11454z.f(o0.A(t10, jW));
                    i11 = i10 + iF;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iF = C11454z.f(o0.A(t10, jW));
                    i11 = i10 + iF;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iF = o0.z(t10, jW);
                    i11 = i10 + iF;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iF = C11454z.f(o0.A(t10, jW));
                    i11 = i10 + iF;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iF = o0.z(t10, jW);
                    i11 = i10 + iF;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iF = C11454z.c(o0.r(t10, jW));
                    i11 = i10 + iF;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iF = ((String) o0.C(t10, jW)).hashCode();
                    i11 = i10 + iF;
                    break;
                case 9:
                    Object objC = o0.C(t10, jW);
                    if (objC != null) {
                        iHashCode = objC.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iF = o0.C(t10, jW).hashCode();
                    i11 = i10 + iF;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iF = o0.z(t10, jW);
                    i11 = i10 + iF;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iF = o0.z(t10, jW);
                    i11 = i10 + iF;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iF = o0.z(t10, jW);
                    i11 = i10 + iF;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iF = C11454z.f(o0.A(t10, jW));
                    i11 = i10 + iF;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iF = o0.z(t10, jW);
                    i11 = i10 + iF;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iF = C11454z.f(o0.A(t10, jW));
                    i11 = i10 + iF;
                    break;
                case 17:
                    Object objC2 = o0.C(t10, jW);
                    if (objC2 != null) {
                        iHashCode = objC2.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case l3.f93325e /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i10 = i11 * 53;
                    iF = o0.C(t10, jW).hashCode();
                    i11 = i10 + iF;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iF = o0.C(t10, jW).hashCode();
                    i11 = i10 + iF;
                    break;
                case 51:
                    if (I(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iF = C11454z.f(Double.doubleToLongBits(Y(t10, jW)));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (I(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iF = Float.floatToIntBits(Z(t10, jW));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (I(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iF = C11454z.f(b0(t10, jW));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (I(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iF = C11454z.f(b0(t10, jW));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (I(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iF = a0(t10, jW);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (I(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iF = C11454z.f(b0(t10, jW));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (I(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iF = a0(t10, jW);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (I(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iF = C11454z.c(X(t10, jW));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (I(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iF = ((String) o0.C(t10, jW)).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (I(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iF = o0.C(t10, jW).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (I(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iF = o0.C(t10, jW).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (I(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iF = a0(t10, jW);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (I(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iF = a0(t10, jW);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (I(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iF = a0(t10, jW);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (I(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iF = C11454z.f(b0(t10, jW));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (I(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iF = a0(t10, jW);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (I(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iF = C11454z.f(b0(t10, jW));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (I(t10, iV, i12)) {
                        i10 = i11 * 53;
                        iF = o0.C(t10, jW).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i11 * 53) + this.f89142o.g(t10).hashCode();
        return this.f89133f ? (iHashCode2 * 53) + this.f89143p.c(t10).hashCode() : iHashCode2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public boolean c(T t10, T t11) {
        int length = this.f89128a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!p(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.f89142o.g(t10).equals(this.f89142o.g(t11))) {
            return false;
        }
        if (this.f89133f) {
            return this.f89143p.c(t10).equals(this.f89143p.c(t11));
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public T d() {
        return (T) this.f89140m.a(this.f89132e);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x009d. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0410 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x043e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    int d0(T r27, byte[] r28, int r29, int r30, int r31, com.google.crypto.tink.shaded.protobuf.C11434e.b r32) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.U.d0(java.lang.Object, byte[], int, int, int, com.google.crypto.tink.shaded.protobuf.e$b):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public int g(T t10) {
        int i10;
        int i11;
        int iQ;
        int iX;
        int i12;
        int iT;
        int iV;
        U<T> u10 = this;
        T t11 = t10;
        Unsafe unsafe = f89127s;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        while (i14 < u10.f89128a.length) {
            int iU0 = u10.u0(i14);
            int iT0 = t0(iU0);
            int iV2 = u10.V(i14);
            int i18 = u10.f89128a[i14 + 2];
            int i19 = i18 & i13;
            if (iT0 <= 17) {
                if (i19 != i17) {
                    i15 = i19 == i13 ? 0 : unsafe.getInt(t11, i19);
                    i17 = i19;
                }
                i10 = 1 << (i18 >>> 20);
            } else {
                i10 = 0;
            }
            int i20 = i16;
            long jW = W(iU0);
            if (iT0 < EnumC11449u.f89353O.a() || iT0 > EnumC11449u.f89366b0.a()) {
                i19 = 0;
            }
            switch (iT0) {
                case 0:
                    if (u10.B(t11, i14, i17, i15, i10)) {
                        i11 = CodedOutputStream.i(iV2, 0.0d);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 1:
                    if (u10.B(t11, i14, i17, i15, i10)) {
                        iQ = CodedOutputStream.q(iV2, 0.0f);
                        i16 = i20 + iQ;
                        u10 = this;
                        t11 = t10;
                        break;
                    }
                    u10 = this;
                    t11 = t10;
                    i16 = i20;
                    break;
                case 2:
                    if (u10.B(t11, i14, i17, i15, i10)) {
                        iX = CodedOutputStream.x(iV2, unsafe.getLong(t11, jW));
                        i16 = i20 + iX;
                        u10 = this;
                        break;
                    }
                    u10 = this;
                    i16 = i20;
                    break;
                case 3:
                    if (u10.B(t11, i14, i17, i15, i10)) {
                        iX = CodedOutputStream.W(iV2, unsafe.getLong(t11, jW));
                        i16 = i20 + iX;
                        u10 = this;
                        break;
                    }
                    u10 = this;
                    i16 = i20;
                    break;
                case 4:
                    if (u10.B(t11, i14, i17, i15, i10)) {
                        iX = CodedOutputStream.v(iV2, unsafe.getInt(t11, jW));
                        i16 = i20 + iX;
                        u10 = this;
                        break;
                    }
                    u10 = this;
                    i16 = i20;
                    break;
                case 5:
                    if (u10.B(t11, i14, i17, i15, i10)) {
                        iQ = CodedOutputStream.o(iV2, 0L);
                        i16 = i20 + iQ;
                        u10 = this;
                        t11 = t10;
                        break;
                    }
                    u10 = this;
                    t11 = t10;
                    i16 = i20;
                    break;
                case 6:
                    if (u10.B(t11, i14, i17, i15, i10)) {
                        iQ = CodedOutputStream.m(iV2, 0);
                        i16 = i20 + iQ;
                        u10 = this;
                        t11 = t10;
                        break;
                    }
                    u10 = this;
                    t11 = t10;
                    i16 = i20;
                    break;
                case 7:
                    if (u10.B(t11, i14, i17, i15, i10)) {
                        iQ = CodedOutputStream.d(iV2, true);
                        i16 = i20 + iQ;
                        u10 = this;
                        t11 = t10;
                        break;
                    }
                    u10 = this;
                    t11 = t10;
                    i16 = i20;
                    break;
                case 8:
                    if (u10.B(t11, i14, i17, i15, i10)) {
                        Object object = unsafe.getObject(t11, jW);
                        iX = object instanceof AbstractC11437h ? CodedOutputStream.g(iV2, (AbstractC11437h) object) : CodedOutputStream.R(iV2, (String) object);
                        i16 = i20 + iX;
                        u10 = this;
                        break;
                    }
                    u10 = this;
                    i16 = i20;
                    break;
                case 9:
                    if (u10.B(t11, i14, i17, i15, i10)) {
                        i11 = h0.o(iV2, unsafe.getObject(t11, jW), u10.v(i14));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 10:
                    if (u10.B(t11, i14, i17, i15, i10)) {
                        iX = CodedOutputStream.g(iV2, (AbstractC11437h) unsafe.getObject(t11, jW));
                        i16 = i20 + iX;
                        u10 = this;
                        break;
                    }
                    u10 = this;
                    i16 = i20;
                    break;
                case 11:
                    if (u10.B(t11, i14, i17, i15, i10)) {
                        iX = CodedOutputStream.U(iV2, unsafe.getInt(t11, jW));
                        i16 = i20 + iX;
                        u10 = this;
                        break;
                    }
                    u10 = this;
                    i16 = i20;
                    break;
                case 12:
                    if (u10.B(t11, i14, i17, i15, i10)) {
                        iX = CodedOutputStream.k(iV2, unsafe.getInt(t11, jW));
                        i16 = i20 + iX;
                        u10 = this;
                        break;
                    }
                    u10 = this;
                    i16 = i20;
                    break;
                case 13:
                    if (u10.B(t11, i14, i17, i15, i10)) {
                        iQ = CodedOutputStream.J(iV2, 0);
                        i16 = i20 + iQ;
                        u10 = this;
                        t11 = t10;
                        break;
                    }
                    u10 = this;
                    t11 = t10;
                    i16 = i20;
                    break;
                case 14:
                    if (u10.B(t11, i14, i17, i15, i10)) {
                        iQ = CodedOutputStream.L(iV2, 0L);
                        i16 = i20 + iQ;
                        u10 = this;
                        t11 = t10;
                        break;
                    }
                    u10 = this;
                    t11 = t10;
                    i16 = i20;
                    break;
                case 15:
                    if (u10.B(t11, i14, i17, i15, i10)) {
                        iX = CodedOutputStream.N(iV2, unsafe.getInt(t11, jW));
                        i16 = i20 + iX;
                        u10 = this;
                        break;
                    }
                    u10 = this;
                    i16 = i20;
                    break;
                case 16:
                    if (u10.B(t11, i14, i17, i15, i10)) {
                        iX = CodedOutputStream.P(iV2, unsafe.getLong(t11, jW));
                        i16 = i20 + iX;
                        u10 = this;
                        break;
                    }
                    u10 = this;
                    i16 = i20;
                    break;
                case 17:
                    if (u10.B(t11, i14, i17, i15, i10)) {
                        i11 = CodedOutputStream.s(iV2, (Q) unsafe.getObject(t11, jW), u10.v(i14));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 18:
                    i11 = h0.h(iV2, (List) unsafe.getObject(t11, jW), false);
                    i16 = i20 + i11;
                    break;
                case 19:
                    i11 = h0.f(iV2, (List) unsafe.getObject(t11, jW), false);
                    i16 = i20 + i11;
                    break;
                case 20:
                    i11 = h0.m(iV2, (List) unsafe.getObject(t11, jW), false);
                    i16 = i20 + i11;
                    break;
                case 21:
                    i11 = h0.x(iV2, (List) unsafe.getObject(t11, jW), false);
                    i16 = i20 + i11;
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    i11 = h0.k(iV2, (List) unsafe.getObject(t11, jW), false);
                    i16 = i20 + i11;
                    break;
                case 23:
                    i11 = h0.h(iV2, (List) unsafe.getObject(t11, jW), false);
                    i16 = i20 + i11;
                    break;
                case 24:
                    i11 = h0.f(iV2, (List) unsafe.getObject(t11, jW), false);
                    i16 = i20 + i11;
                    break;
                case 25:
                    i11 = h0.a(iV2, (List) unsafe.getObject(t11, jW), false);
                    i16 = i20 + i11;
                    break;
                case 26:
                    i11 = h0.u(iV2, (List) unsafe.getObject(t11, jW));
                    i16 = i20 + i11;
                    break;
                case 27:
                    i11 = h0.p(iV2, (List) unsafe.getObject(t11, jW), u10.v(i14));
                    i16 = i20 + i11;
                    break;
                case 28:
                    i11 = h0.c(iV2, (List) unsafe.getObject(t11, jW));
                    i16 = i20 + i11;
                    break;
                case 29:
                    i11 = h0.v(iV2, (List) unsafe.getObject(t11, jW), false);
                    i16 = i20 + i11;
                    break;
                case 30:
                    i11 = h0.d(iV2, (List) unsafe.getObject(t11, jW), false);
                    i16 = i20 + i11;
                    break;
                case 31:
                    i11 = h0.f(iV2, (List) unsafe.getObject(t11, jW), false);
                    i16 = i20 + i11;
                    break;
                case l3.f93325e /* 32 */:
                    i11 = h0.h(iV2, (List) unsafe.getObject(t11, jW), false);
                    i16 = i20 + i11;
                    break;
                case 33:
                    i11 = h0.q(iV2, (List) unsafe.getObject(t11, jW), false);
                    i16 = i20 + i11;
                    break;
                case 34:
                    i11 = h0.s(iV2, (List) unsafe.getObject(t11, jW), false);
                    i16 = i20 + i11;
                    break;
                case 35:
                    i12 = h0.i((List) unsafe.getObject(t11, jW));
                    if (i12 > 0) {
                        if (u10.f89136i) {
                            unsafe.putInt(t11, i19, i12);
                        }
                        iT = CodedOutputStream.T(iV2);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 36:
                    i12 = h0.g((List) unsafe.getObject(t11, jW));
                    if (i12 > 0) {
                        if (u10.f89136i) {
                            unsafe.putInt(t11, i19, i12);
                        }
                        iT = CodedOutputStream.T(iV2);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 37:
                    i12 = h0.n((List) unsafe.getObject(t11, jW));
                    if (i12 > 0) {
                        if (u10.f89136i) {
                            unsafe.putInt(t11, i19, i12);
                        }
                        iT = CodedOutputStream.T(iV2);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 38:
                    i12 = h0.y((List) unsafe.getObject(t11, jW));
                    if (i12 > 0) {
                        if (u10.f89136i) {
                            unsafe.putInt(t11, i19, i12);
                        }
                        iT = CodedOutputStream.T(iV2);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 39:
                    i12 = h0.l((List) unsafe.getObject(t11, jW));
                    if (i12 > 0) {
                        if (u10.f89136i) {
                            unsafe.putInt(t11, i19, i12);
                        }
                        iT = CodedOutputStream.T(iV2);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 40:
                    i12 = h0.i((List) unsafe.getObject(t11, jW));
                    if (i12 > 0) {
                        if (u10.f89136i) {
                            unsafe.putInt(t11, i19, i12);
                        }
                        iT = CodedOutputStream.T(iV2);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 41:
                    i12 = h0.g((List) unsafe.getObject(t11, jW));
                    if (i12 > 0) {
                        if (u10.f89136i) {
                            unsafe.putInt(t11, i19, i12);
                        }
                        iT = CodedOutputStream.T(iV2);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 42:
                    i12 = h0.b((List) unsafe.getObject(t11, jW));
                    if (i12 > 0) {
                        if (u10.f89136i) {
                            unsafe.putInt(t11, i19, i12);
                        }
                        iT = CodedOutputStream.T(iV2);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 43:
                    i12 = h0.w((List) unsafe.getObject(t11, jW));
                    if (i12 > 0) {
                        if (u10.f89136i) {
                            unsafe.putInt(t11, i19, i12);
                        }
                        iT = CodedOutputStream.T(iV2);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 44:
                    i12 = h0.e((List) unsafe.getObject(t11, jW));
                    if (i12 > 0) {
                        if (u10.f89136i) {
                            unsafe.putInt(t11, i19, i12);
                        }
                        iT = CodedOutputStream.T(iV2);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 45:
                    i12 = h0.g((List) unsafe.getObject(t11, jW));
                    if (i12 > 0) {
                        if (u10.f89136i) {
                            unsafe.putInt(t11, i19, i12);
                        }
                        iT = CodedOutputStream.T(iV2);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 46:
                    i12 = h0.i((List) unsafe.getObject(t11, jW));
                    if (i12 > 0) {
                        if (u10.f89136i) {
                            unsafe.putInt(t11, i19, i12);
                        }
                        iT = CodedOutputStream.T(iV2);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 47:
                    i12 = h0.r((List) unsafe.getObject(t11, jW));
                    if (i12 > 0) {
                        if (u10.f89136i) {
                            unsafe.putInt(t11, i19, i12);
                        }
                        iT = CodedOutputStream.T(iV2);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 48:
                    i12 = h0.t((List) unsafe.getObject(t11, jW));
                    if (i12 > 0) {
                        if (u10.f89136i) {
                            unsafe.putInt(t11, i19, i12);
                        }
                        iT = CodedOutputStream.T(iV2);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 49:
                    i11 = h0.j(iV2, (List) unsafe.getObject(t11, jW), u10.v(i14));
                    i16 = i20 + i11;
                    break;
                case 50:
                    i11 = u10.f89144q.g(iV2, unsafe.getObject(t11, jW), u10.u(i14));
                    i16 = i20 + i11;
                    break;
                case 51:
                    if (u10.I(t11, iV2, i14)) {
                        i11 = CodedOutputStream.i(iV2, 0.0d);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 52:
                    if (u10.I(t11, iV2, i14)) {
                        i11 = CodedOutputStream.q(iV2, 0.0f);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 53:
                    if (u10.I(t11, iV2, i14)) {
                        i11 = CodedOutputStream.x(iV2, b0(t11, jW));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 54:
                    if (u10.I(t11, iV2, i14)) {
                        i11 = CodedOutputStream.W(iV2, b0(t11, jW));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 55:
                    if (u10.I(t11, iV2, i14)) {
                        i11 = CodedOutputStream.v(iV2, a0(t11, jW));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 56:
                    if (u10.I(t11, iV2, i14)) {
                        i11 = CodedOutputStream.o(iV2, 0L);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 57:
                    if (u10.I(t11, iV2, i14)) {
                        i11 = CodedOutputStream.m(iV2, 0);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 58:
                    if (u10.I(t11, iV2, i14)) {
                        i11 = CodedOutputStream.d(iV2, true);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 59:
                    if (u10.I(t11, iV2, i14)) {
                        Object object2 = unsafe.getObject(t11, jW);
                        i11 = object2 instanceof AbstractC11437h ? CodedOutputStream.g(iV2, (AbstractC11437h) object2) : CodedOutputStream.R(iV2, (String) object2);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 60:
                    if (u10.I(t11, iV2, i14)) {
                        i11 = h0.o(iV2, unsafe.getObject(t11, jW), u10.v(i14));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 61:
                    if (u10.I(t11, iV2, i14)) {
                        i11 = CodedOutputStream.g(iV2, (AbstractC11437h) unsafe.getObject(t11, jW));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 62:
                    if (u10.I(t11, iV2, i14)) {
                        i11 = CodedOutputStream.U(iV2, a0(t11, jW));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 63:
                    if (u10.I(t11, iV2, i14)) {
                        i11 = CodedOutputStream.k(iV2, a0(t11, jW));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 64:
                    if (u10.I(t11, iV2, i14)) {
                        i11 = CodedOutputStream.J(iV2, 0);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 65:
                    if (u10.I(t11, iV2, i14)) {
                        i11 = CodedOutputStream.L(iV2, 0L);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 66:
                    if (u10.I(t11, iV2, i14)) {
                        i11 = CodedOutputStream.N(iV2, a0(t11, jW));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 67:
                    if (u10.I(t11, iV2, i14)) {
                        i11 = CodedOutputStream.P(iV2, b0(t11, jW));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 68:
                    if (u10.I(t11, iV2, i14)) {
                        i11 = CodedOutputStream.s(iV2, (Q) unsafe.getObject(t11, jW), u10.v(i14));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                default:
                    i16 = i20;
                    break;
            }
            i14 += 3;
            i13 = 1048575;
        }
        int iX2 = i16 + u10.x(u10.f89142o, t11);
        return u10.f89133f ? iX2 + u10.f89143p.c(t11).l() : iX2;
    }

    private U(int[] iArr, Object[] objArr, int i10, int i11, Q q10, a0 a0Var, boolean z10, int[] iArr2, int i12, int i13, W w10, E e10, l0<?, ?> l0Var, AbstractC11445p<?> abstractC11445p, L l10) {
        boolean z11;
        this.f89128a = iArr;
        this.f89129b = objArr;
        this.f89130c = i10;
        this.f89131d = i11;
        this.f89134g = q10 instanceof AbstractC11452x;
        this.f89135h = a0Var;
        if (abstractC11445p != null && abstractC11445p.e(q10)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f89133f = z11;
        this.f89136i = z10;
        this.f89137j = iArr2;
        this.f89138k = i12;
        this.f89139l = i13;
        this.f89140m = w10;
        this.f89141n = e10;
        this.f89142o = l0Var;
        this.f89143p = abstractC11445p;
        this.f89132e = q10;
        this.f89144q = l10;
    }

    private boolean A(T t10, int i10) {
        boolean zEquals;
        int iI0 = i0(i10);
        long j10 = 1048575 & iI0;
        if (j10 == 1048575) {
            int iU0 = u0(i10);
            long jW = W(iU0);
            switch (t0(iU0)) {
                case 0:
                    if (Double.doubleToRawLongBits(o0.x(t10, jW)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(o0.y(t10, jW)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (o0.A(t10, jW) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (o0.A(t10, jW) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (o0.z(t10, jW) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (o0.A(t10, jW) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (o0.z(t10, jW) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return o0.r(t10, jW);
                case 8:
                    Object objC = o0.C(t10, jW);
                    if (objC instanceof String) {
                        zEquals = ((String) objC).isEmpty();
                        break;
                    } else if (objC instanceof AbstractC11437h) {
                        zEquals = AbstractC11437h.f89182b.equals(objC);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (o0.C(t10, jW) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    zEquals = AbstractC11437h.f89182b.equals(o0.C(t10, jW));
                    break;
                case 11:
                    if (o0.z(t10, jW) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (o0.z(t10, jW) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (o0.z(t10, jW) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (o0.A(t10, jW) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (o0.z(t10, jW) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (o0.A(t10, jW) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (o0.C(t10, jW) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
            return !zEquals;
        }
        if ((o0.z(t10, j10) & (1 << (iI0 >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private boolean B(T t10, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return A(t10, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean C(Object obj, int i10, f0 f0Var) {
        return f0Var.f(o0.C(obj, W(i10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean E(Object obj, int i10, int i11) {
        List list = (List) o0.C(obj, W(i10));
        if (list.isEmpty()) {
            return true;
        }
        f0 f0VarV = v(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!f0VarV.f(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean H(T t10, T t11, int i10) {
        long jI0 = i0(i10) & 1048575;
        if (o0.z(t10, jI0) == o0.z(t11, jI0)) {
            return true;
        }
        return false;
    }

    private boolean I(T t10, int i10, int i11) {
        if (o0.z(t10, i0(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private static <T> long K(T t10, long j10) {
        return o0.A(t10, j10);
    }

    private final <K, V> void M(Object obj, int i10, Object obj2, C11444o c11444o, e0 e0Var) throws IOException {
        long jW = W(u0(i10));
        Object objC = o0.C(obj, jW);
        if (objC == null) {
            objC = this.f89144q.d(obj2);
            o0.R(obj, jW, objC);
        } else if (this.f89144q.h(objC)) {
            Object objD = this.f89144q.d(obj2);
            this.f89144q.a(objD, objC);
            o0.R(obj, jW, objD);
            objC = objD;
        }
        Map<?, ?> mapC = this.f89144q.c(objC);
        this.f89144q.b(obj2);
        e0Var.L(mapC, null, c11444o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void N(T t10, T t11, int i10) {
        if (!A(t11, i10)) {
            return;
        }
        long jW = W(u0(i10));
        Unsafe unsafe = f89127s;
        Object object = unsafe.getObject(t11, jW);
        if (object != null) {
            f0 f0VarV = v(i10);
            if (!A(t10, i10)) {
                if (!G(object)) {
                    unsafe.putObject(t10, jW, object);
                } else {
                    Object objD = f0VarV.d();
                    f0VarV.a(objD, object);
                    unsafe.putObject(t10, jW, objD);
                }
                o0(t10, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, jW);
            if (!G(object2)) {
                Object objD2 = f0VarV.d();
                f0VarV.a(objD2, object2);
                unsafe.putObject(t10, jW, objD2);
                object2 = objD2;
            }
            f0VarV.a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + V(i10) + " is present but null: " + t11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void O(T t10, T t11, int i10) {
        int iV = V(i10);
        if (!I(t11, iV, i10)) {
            return;
        }
        long jW = W(u0(i10));
        Unsafe unsafe = f89127s;
        Object object = unsafe.getObject(t11, jW);
        if (object != null) {
            f0 f0VarV = v(i10);
            if (!I(t10, iV, i10)) {
                if (!G(object)) {
                    unsafe.putObject(t10, jW, object);
                } else {
                    Object objD = f0VarV.d();
                    f0VarV.a(objD, object);
                    unsafe.putObject(t10, jW, objD);
                }
                p0(t10, iV, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, jW);
            if (!G(object2)) {
                Object objD2 = f0VarV.d();
                f0VarV.a(objD2, object2);
                unsafe.putObject(t10, jW, objD2);
                object2 = objD2;
            }
            f0VarV.a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + V(i10) + " is present but null: " + t11);
    }

    private void P(T t10, T t11, int i10) {
        int iU0 = u0(i10);
        long jW = W(iU0);
        int iV = V(i10);
        switch (t0(iU0)) {
            case 0:
                if (A(t11, i10)) {
                    o0.N(t10, jW, o0.x(t11, jW));
                    o0(t10, i10);
                    break;
                }
                break;
            case 1:
                if (A(t11, i10)) {
                    o0.O(t10, jW, o0.y(t11, jW));
                    o0(t10, i10);
                    break;
                }
                break;
            case 2:
                if (A(t11, i10)) {
                    o0.Q(t10, jW, o0.A(t11, jW));
                    o0(t10, i10);
                    break;
                }
                break;
            case 3:
                if (A(t11, i10)) {
                    o0.Q(t10, jW, o0.A(t11, jW));
                    o0(t10, i10);
                    break;
                }
                break;
            case 4:
                if (A(t11, i10)) {
                    o0.P(t10, jW, o0.z(t11, jW));
                    o0(t10, i10);
                    break;
                }
                break;
            case 5:
                if (A(t11, i10)) {
                    o0.Q(t10, jW, o0.A(t11, jW));
                    o0(t10, i10);
                    break;
                }
                break;
            case 6:
                if (A(t11, i10)) {
                    o0.P(t10, jW, o0.z(t11, jW));
                    o0(t10, i10);
                    break;
                }
                break;
            case 7:
                if (A(t11, i10)) {
                    o0.H(t10, jW, o0.r(t11, jW));
                    o0(t10, i10);
                    break;
                }
                break;
            case 8:
                if (A(t11, i10)) {
                    o0.R(t10, jW, o0.C(t11, jW));
                    o0(t10, i10);
                    break;
                }
                break;
            case 9:
                N(t10, t11, i10);
                break;
            case 10:
                if (A(t11, i10)) {
                    o0.R(t10, jW, o0.C(t11, jW));
                    o0(t10, i10);
                    break;
                }
                break;
            case 11:
                if (A(t11, i10)) {
                    o0.P(t10, jW, o0.z(t11, jW));
                    o0(t10, i10);
                    break;
                }
                break;
            case 12:
                if (A(t11, i10)) {
                    o0.P(t10, jW, o0.z(t11, jW));
                    o0(t10, i10);
                    break;
                }
                break;
            case 13:
                if (A(t11, i10)) {
                    o0.P(t10, jW, o0.z(t11, jW));
                    o0(t10, i10);
                    break;
                }
                break;
            case 14:
                if (A(t11, i10)) {
                    o0.Q(t10, jW, o0.A(t11, jW));
                    o0(t10, i10);
                    break;
                }
                break;
            case 15:
                if (A(t11, i10)) {
                    o0.P(t10, jW, o0.z(t11, jW));
                    o0(t10, i10);
                    break;
                }
                break;
            case 16:
                if (A(t11, i10)) {
                    o0.Q(t10, jW, o0.A(t11, jW));
                    o0(t10, i10);
                    break;
                }
                break;
            case 17:
                N(t10, t11, i10);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case l3.f93325e /* 32 */:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f89141n.b(t10, t11, jW);
                break;
            case 50:
                h0.F(this.f89144q, t10, t11, jW);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (I(t11, iV, i10)) {
                    o0.R(t10, jW, o0.C(t11, jW));
                    p0(t10, iV, i10);
                    break;
                }
                break;
            case 60:
                O(t10, t11, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (I(t11, iV, i10)) {
                    o0.R(t10, jW, o0.C(t11, jW));
                    p0(t10, iV, i10);
                    break;
                }
                break;
            case 68:
                O(t10, t11, i10);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object Q(T t10, int i10) {
        f0 f0VarV = v(i10);
        long jW = W(u0(i10));
        if (!A(t10, i10)) {
            return f0VarV.d();
        }
        Object object = f89127s.getObject(t10, jW);
        if (G(object)) {
            return object;
        }
        Object objD = f0VarV.d();
        if (object != null) {
            f0VarV.a(objD, object);
        }
        return objD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object R(T t10, int i10, int i11) {
        f0 f0VarV = v(i11);
        if (!I(t10, i10, i11)) {
            return f0VarV.d();
        }
        Object object = f89127s.getObject(t10, W(u0(i11)));
        if (G(object)) {
            return object;
        }
        Object objD = f0VarV.d();
        if (object != null) {
            f0VarV.a(objD, object);
        }
        return objD;
    }

    static <T> U<T> T(j0 j0Var, W w10, E e10, l0<?, ?> l0Var, AbstractC11445p<?> abstractC11445p, L l10) {
        C11447s[] c11447sArrE = j0Var.e();
        if (c11447sArrE.length == 0) {
            int length = c11447sArrE.length;
            int[] iArr = new int[length * 3];
            Object[] objArr = new Object[length * 2];
            if (c11447sArrE.length <= 0) {
                int[] iArrD = j0Var.d();
                if (iArrD == null) {
                    iArrD = f89126r;
                }
                if (c11447sArrE.length <= 0) {
                    int[] iArr2 = f89126r;
                    int[] iArr3 = f89126r;
                    int[] iArr4 = new int[iArrD.length + iArr2.length + iArr3.length];
                    System.arraycopy(iArrD, 0, iArr4, 0, iArrD.length);
                    System.arraycopy(iArr2, 0, iArr4, iArrD.length, iArr2.length);
                    System.arraycopy(iArr3, 0, iArr4, iArrD.length + iArr2.length, iArr3.length);
                    return new U<>(iArr, objArr, 0, 0, j0Var.b(), j0Var.c(), true, iArr4, iArrD.length, iArrD.length + iArr2.length, w10, e10, l0Var, abstractC11445p, l10);
                }
                C11447s c11447s = c11447sArrE[0];
                throw null;
            }
            C11447s c11447s2 = c11447sArrE[0];
            throw null;
        }
        C11447s c11447s3 = c11447sArrE[0];
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0375  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <T> com.google.crypto.tink.shaded.protobuf.U<T> U(com.google.crypto.tink.shaded.protobuf.d0 r33, com.google.crypto.tink.shaded.protobuf.W r34, com.google.crypto.tink.shaded.protobuf.E r35, com.google.crypto.tink.shaded.protobuf.l0<?, ?> r36, com.google.crypto.tink.shaded.protobuf.AbstractC11445p<?> r37, com.google.crypto.tink.shaded.protobuf.L r38) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.U.U(com.google.crypto.tink.shaded.protobuf.d0, com.google.crypto.tink.shaded.protobuf.W, com.google.crypto.tink.shaded.protobuf.E, com.google.crypto.tink.shaded.protobuf.l0, com.google.crypto.tink.shaded.protobuf.p, com.google.crypto.tink.shaded.protobuf.L):com.google.crypto.tink.shaded.protobuf.U");
    }

    private static <T> boolean X(T t10, long j10) {
        return ((Boolean) o0.C(t10, j10)).booleanValue();
    }

    private static <T> double Y(T t10, long j10) {
        return ((Double) o0.C(t10, j10)).doubleValue();
    }

    private static <T> float Z(T t10, long j10) {
        return ((Float) o0.C(t10, j10)).floatValue();
    }

    private static <T> int a0(T t10, long j10) {
        return ((Integer) o0.C(t10, j10)).intValue();
    }

    private static <T> long b0(T t10, long j10) {
        return ((Long) o0.C(t10, j10)).longValue();
    }

    private boolean k(T t10, T t11, int i10) {
        if (A(t10, i10) == A(t11, i10)) {
            return true;
        }
        return false;
    }

    private <E> void k0(Object obj, int i10, e0 e0Var, f0<E> f0Var, C11444o c11444o) throws IOException {
        e0Var.N(this.f89141n.c(obj, W(i10)), f0Var, c11444o);
    }

    private static <T> boolean l(T t10, long j10) {
        return o0.r(t10, j10);
    }

    private void l0(Object obj, int i10, e0 e0Var) throws IOException {
        if (z(i10)) {
            o0.R(obj, W(i10), e0Var.I());
        } else if (this.f89134g) {
            o0.R(obj, W(i10), e0Var.z());
        } else {
            o0.R(obj, W(i10), e0Var.o());
        }
    }

    private static void m(Object obj) {
        if (G(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private void m0(Object obj, int i10, e0 e0Var) throws IOException {
        if (z(i10)) {
            e0Var.n(this.f89141n.c(obj, W(i10)));
        } else {
            e0Var.B(this.f89141n.c(obj, W(i10)));
        }
    }

    private <K, V> int n(byte[] bArr, int i10, int i11, J.a<K, V> aVar, Map<K, V> map, C11434e.b bVar) throws IOException {
        int iJ = C11434e.J(bArr, i10, bVar);
        int i12 = bVar.f89174a;
        if (i12 >= 0 && i12 <= i11 - iJ) {
            throw null;
        }
        throw InvalidProtocolBufferException.m();
    }

    private static Field n0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static <T> double o(T t10, long j10) {
        return o0.x(t10, j10);
    }

    private void o0(T t10, int i10) {
        int iI0 = i0(i10);
        long j10 = 1048575 & iI0;
        if (j10 == 1048575) {
            return;
        }
        o0.P(t10, j10, (1 << (iI0 >>> 20)) | o0.z(t10, j10));
    }

    private boolean p(T t10, T t11, int i10) {
        int iU0 = u0(i10);
        long jW = W(iU0);
        switch (t0(iU0)) {
            case 0:
                if (!k(t10, t11, i10) || Double.doubleToLongBits(o0.x(t10, jW)) != Double.doubleToLongBits(o0.x(t11, jW))) {
                }
                break;
            case 1:
                if (!k(t10, t11, i10) || Float.floatToIntBits(o0.y(t10, jW)) != Float.floatToIntBits(o0.y(t11, jW))) {
                }
                break;
            case 2:
                if (!k(t10, t11, i10) || o0.A(t10, jW) != o0.A(t11, jW)) {
                }
                break;
            case 3:
                if (!k(t10, t11, i10) || o0.A(t10, jW) != o0.A(t11, jW)) {
                }
                break;
            case 4:
                if (!k(t10, t11, i10) || o0.z(t10, jW) != o0.z(t11, jW)) {
                }
                break;
            case 5:
                if (!k(t10, t11, i10) || o0.A(t10, jW) != o0.A(t11, jW)) {
                }
                break;
            case 6:
                if (!k(t10, t11, i10) || o0.z(t10, jW) != o0.z(t11, jW)) {
                }
                break;
            case 7:
                if (!k(t10, t11, i10) || o0.r(t10, jW) != o0.r(t11, jW)) {
                }
                break;
            case 8:
                if (!k(t10, t11, i10) || !h0.I(o0.C(t10, jW), o0.C(t11, jW))) {
                }
                break;
            case 9:
                if (!k(t10, t11, i10) || !h0.I(o0.C(t10, jW), o0.C(t11, jW))) {
                }
                break;
            case 10:
                if (!k(t10, t11, i10) || !h0.I(o0.C(t10, jW), o0.C(t11, jW))) {
                }
                break;
            case 11:
                if (!k(t10, t11, i10) || o0.z(t10, jW) != o0.z(t11, jW)) {
                }
                break;
            case 12:
                if (!k(t10, t11, i10) || o0.z(t10, jW) != o0.z(t11, jW)) {
                }
                break;
            case 13:
                if (!k(t10, t11, i10) || o0.z(t10, jW) != o0.z(t11, jW)) {
                }
                break;
            case 14:
                if (!k(t10, t11, i10) || o0.A(t10, jW) != o0.A(t11, jW)) {
                }
                break;
            case 15:
                if (!k(t10, t11, i10) || o0.z(t10, jW) != o0.z(t11, jW)) {
                }
                break;
            case 16:
                if (!k(t10, t11, i10) || o0.A(t10, jW) != o0.A(t11, jW)) {
                }
                break;
            case 17:
                if (!k(t10, t11, i10) || !h0.I(o0.C(t10, jW), o0.C(t11, jW))) {
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!H(t10, t11, i10) || !h0.I(o0.C(t10, jW), o0.C(t11, jW))) {
                }
                break;
        }
        return true;
    }

    private void p0(T t10, int i10, int i11) {
        o0.P(t10, i0(i11) & 1048575, i10);
    }

    private <UT, UB> UB q(Object obj, int i10, UB ub2, l0<UT, UB> l0Var, Object obj2) {
        C11454z.e eVarT;
        int iV = V(i10);
        Object objC = o0.C(obj, W(u0(i10)));
        if (objC == null || (eVarT = t(i10)) == null) {
            return ub2;
        }
        return (UB) r(i10, iV, this.f89144q.c(objC), eVarT, ub2, l0Var, obj2);
    }

    private static <T> float s(T t10, long j10) {
        return o0.y(t10, j10);
    }

    private <UT, UB> int x(l0<UT, UB> l0Var, T t10) {
        return l0Var.h(l0Var.g(t10));
    }

    private static <T> int y(T t10, long j10) {
        return o0.z(t10, j10);
    }

    private <UT, UB> void z0(l0<UT, UB> l0Var, T t10, r0 r0Var) throws IOException {
        l0Var.t(l0Var.g(t10), r0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public void a(T t10, T t11) {
        m(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.f89128a.length; i10 += 3) {
            P(t10, t11, i10);
        }
        h0.G(this.f89142o, t10, t11);
        if (this.f89133f) {
            h0.E(this.f89143p, t10, t11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    @Override // com.google.crypto.tink.shaded.protobuf.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(T r8) {
        /*
            r7 = this;
            boolean r0 = G(r8)
            if (r0 != 0) goto L8
            goto L8e
        L8:
            boolean r0 = r8 instanceof com.google.crypto.tink.shaded.protobuf.AbstractC11452x
            if (r0 == 0) goto L18
            r0 = r8
            com.google.crypto.tink.shaded.protobuf.x r0 = (com.google.crypto.tink.shaded.protobuf.AbstractC11452x) r0
            r0.s()
            r0.r()
            r0.J()
        L18:
            int[] r0 = r7.f89128a
            int r0 = r0.length
            r1 = 0
        L1c:
            if (r1 >= r0) goto L80
            int r2 = r7.u0(r1)
            long r3 = W(r2)
            int r2 = t0(r2)
            r5 = 9
            if (r2 == r5) goto L6a
            r5 = 60
            if (r2 == r5) goto L52
            r5 = 68
            if (r2 == r5) goto L52
            switch(r2) {
                case 17: goto L6a;
                case 18: goto L4c;
                case 19: goto L4c;
                case 20: goto L4c;
                case 21: goto L4c;
                case 22: goto L4c;
                case 23: goto L4c;
                case 24: goto L4c;
                case 25: goto L4c;
                case 26: goto L4c;
                case 27: goto L4c;
                case 28: goto L4c;
                case 29: goto L4c;
                case 30: goto L4c;
                case 31: goto L4c;
                case 32: goto L4c;
                case 33: goto L4c;
                case 34: goto L4c;
                case 35: goto L4c;
                case 36: goto L4c;
                case 37: goto L4c;
                case 38: goto L4c;
                case 39: goto L4c;
                case 40: goto L4c;
                case 41: goto L4c;
                case 42: goto L4c;
                case 43: goto L4c;
                case 44: goto L4c;
                case 45: goto L4c;
                case 46: goto L4c;
                case 47: goto L4c;
                case 48: goto L4c;
                case 49: goto L4c;
                case 50: goto L3a;
                default: goto L39;
            }
        L39:
            goto L7d
        L3a:
            sun.misc.Unsafe r2 = com.google.crypto.tink.shaded.protobuf.U.f89127s
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L7d
            com.google.crypto.tink.shaded.protobuf.L r6 = r7.f89144q
            java.lang.Object r5 = r6.f(r5)
            r2.putObject(r8, r3, r5)
            goto L7d
        L4c:
            com.google.crypto.tink.shaded.protobuf.E r2 = r7.f89141n
            r2.a(r8, r3)
            goto L7d
        L52:
            int r2 = r7.V(r1)
            boolean r2 = r7.I(r8, r2, r1)
            if (r2 == 0) goto L7d
            com.google.crypto.tink.shaded.protobuf.f0 r2 = r7.v(r1)
            sun.misc.Unsafe r5 = com.google.crypto.tink.shaded.protobuf.U.f89127s
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.e(r3)
            goto L7d
        L6a:
            boolean r2 = r7.A(r8, r1)
            if (r2 == 0) goto L7d
            com.google.crypto.tink.shaded.protobuf.f0 r2 = r7.v(r1)
            sun.misc.Unsafe r5 = com.google.crypto.tink.shaded.protobuf.U.f89127s
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.e(r3)
        L7d:
            int r1 = r1 + 3
            goto L1c
        L80:
            com.google.crypto.tink.shaded.protobuf.l0<?, ?> r0 = r7.f89142o
            r0.j(r8)
            boolean r0 = r7.f89133f
            if (r0 == 0) goto L8e
            com.google.crypto.tink.shaded.protobuf.p<?> r0 = r7.f89143p
            r0.f(r8)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.U.e(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    @Override // com.google.crypto.tink.shaded.protobuf.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(T r15) {
        /*
            r14 = this;
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 0
            r3 = r0
            r2 = r1
            r4 = r2
        L7:
            int r5 = r14.f89138k
            r6 = 1
            if (r2 >= r5) goto L9b
            int[] r5 = r14.f89137j
            r9 = r5[r2]
            int r5 = r14.V(r9)
            int r13 = r14.u0(r9)
            int[] r7 = r14.f89128a
            int r8 = r9 + 2
            r7 = r7[r8]
            r8 = r7 & r0
            int r7 = r7 >>> 20
            int r12 = r6 << r7
            if (r8 == r3) goto L32
            if (r8 == r0) goto L2f
            sun.misc.Unsafe r3 = com.google.crypto.tink.shaded.protobuf.U.f89127s
            long r6 = (long) r8
            int r4 = r3.getInt(r15, r6)
        L2f:
            r11 = r4
            r10 = r8
            goto L34
        L32:
            r10 = r3
            r11 = r4
        L34:
            boolean r3 = J(r13)
            r7 = r14
            r8 = r15
            if (r3 == 0) goto L43
            boolean r15 = r7.B(r8, r9, r10, r11, r12)
            if (r15 != 0) goto L43
            return r1
        L43:
            int r15 = t0(r13)
            r3 = 9
            if (r15 == r3) goto L83
            r3 = 17
            if (r15 == r3) goto L83
            r3 = 27
            if (r15 == r3) goto L7c
            r3 = 60
            if (r15 == r3) goto L6b
            r3 = 68
            if (r15 == r3) goto L6b
            r3 = 49
            if (r15 == r3) goto L7c
            r3 = 50
            if (r15 == r3) goto L64
            goto L94
        L64:
            boolean r15 = r14.F(r8, r13, r9)
            if (r15 != 0) goto L94
            return r1
        L6b:
            boolean r15 = r14.I(r8, r5, r9)
            if (r15 == 0) goto L94
            com.google.crypto.tink.shaded.protobuf.f0 r15 = r14.v(r9)
            boolean r15 = C(r8, r13, r15)
            if (r15 != 0) goto L94
            return r1
        L7c:
            boolean r15 = r14.E(r8, r13, r9)
            if (r15 != 0) goto L94
            return r1
        L83:
            boolean r15 = r7.B(r8, r9, r10, r11, r12)
            if (r15 == 0) goto L94
            com.google.crypto.tink.shaded.protobuf.f0 r15 = r14.v(r9)
            boolean r15 = C(r8, r13, r15)
            if (r15 != 0) goto L94
            return r1
        L94:
            int r2 = r2 + 1
            r15 = r8
            r3 = r10
            r4 = r11
            goto L7
        L9b:
            r7 = r14
            r8 = r15
            boolean r15 = r7.f89133f
            if (r15 == 0) goto Lae
            com.google.crypto.tink.shaded.protobuf.p<?> r15 = r7.f89143p
            com.google.crypto.tink.shaded.protobuf.t r15 = r15.c(r8)
            boolean r15 = r15.o()
            if (r15 != 0) goto Lae
            return r1
        Lae:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.U.f(java.lang.Object):boolean");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public void i(T t10, e0 e0Var, C11444o c11444o) throws IOException {
        c11444o.getClass();
        m(t10);
        L(this.f89142o, this.f89143p, t10, e0Var, c11444o);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public void j(T t10, r0 r0Var) throws IOException {
        if (r0Var.t() == r0.a.DESCENDING) {
            w0(t10, r0Var);
        } else {
            v0(t10, r0Var);
        }
    }
}
