package com.google.protobuf;

import com.google.protobuf.AbstractC11646g;
import com.google.protobuf.C11663y;
import com.google.protobuf.I;
import com.google.protobuf.r0;
import com.google.protobuf.s0;
import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes8.dex */
final class T<T> implements f0<T> {

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f91295r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    private static final Unsafe f91296s = p0.D();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f91297a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f91298b;

    /* renamed from: c, reason: collision with root package name */
    private final int f91299c;

    /* renamed from: d, reason: collision with root package name */
    private final int f91300d;

    /* renamed from: e, reason: collision with root package name */
    private final P f91301e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f91302f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f91303g;

    /* renamed from: h, reason: collision with root package name */
    private final a0 f91304h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f91305i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f91306j;

    /* renamed from: k, reason: collision with root package name */
    private final int f91307k;

    /* renamed from: l, reason: collision with root package name */
    private final int f91308l;

    /* renamed from: m, reason: collision with root package name */
    private final V f91309m;

    /* renamed from: n, reason: collision with root package name */
    private final F f91310n;

    /* renamed from: o, reason: collision with root package name */
    private final l0<?, ?> f91311o;

    /* renamed from: p, reason: collision with root package name */
    private final AbstractC11654o<?> f91312p;

    /* renamed from: q, reason: collision with root package name */
    private final K f91313q;

    private static boolean F(int i10) {
        return (i10 & 268435456) != 0;
    }

    private static long S(int i10) {
        return i10 & 1048575;
    }

    private static int k0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    private static boolean w(int i10) {
        return (i10 & 536870912) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.protobuf.f0] */
    private boolean B(T t10, int i10, int i11) {
        Map<?, ?> mapE = this.f91313q.e(p0.C(t10, S(i10)));
        if (mapE.isEmpty()) {
            return true;
        }
        if (this.f91313q.b(s(i11)).f91286c.a() != r0.c.MESSAGE) {
            return true;
        }
        ?? C10 = 0;
        for (Object obj : mapE.values()) {
            C10 = C10;
            if (C10 == 0) {
                C10 = b0.a().c(obj.getClass());
            }
            if (!C10.f(obj)) {
                return false;
            }
        }
        return true;
    }

    private static boolean C(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC11661w) {
            return ((AbstractC11661w) obj).N();
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
    private <UT, UB, ET extends com.google.protobuf.C11657s.b<ET>> void H(com.google.protobuf.l0<UT, UB> r18, com.google.protobuf.AbstractC11654o<ET> r19, T r20, com.google.protobuf.e0 r21, com.google.protobuf.C11653n r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.T.H(com.google.protobuf.l0, com.google.protobuf.o, java.lang.Object, com.google.protobuf.e0, com.google.protobuf.n):void");
    }

    static <T> T<T> O(Class<T> cls, N n10, V v10, F f10, l0<?, ?> l0Var, AbstractC11654o<?> abstractC11654o, K k10) {
        return n10 instanceof d0 ? Q((d0) n10, v10, f10, l0Var, abstractC11654o, k10) : P((j0) n10, v10, f10, l0Var, abstractC11654o, k10);
    }

    private int R(int i10) {
        return this.f91297a[i10];
    }

    private int Y(int i10) {
        if (i10 < this.f91299c || i10 > this.f91300d) {
            return -1;
        }
        return h0(i10, 0);
    }

    private int Z(int i10) {
        return this.f91297a[i10 + 2];
    }

    private <E> void a0(Object obj, long j10, e0 e0Var, f0<E> f0Var, C11653n c11653n) throws IOException {
        e0Var.J(this.f91310n.e(obj, j10), f0Var, c11653n);
    }

    private int h0(int i10, int i11) {
        int length = (this.f91297a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int iR = R(i13);
            if (i10 == iR) {
                return i13;
            }
            if (i10 < iR) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    private void i0(T t10, int i10, Object obj) {
        f91296s.putObject(t10, S(l0(i10)), obj);
        f0(t10, i10);
    }

    private void j0(T t10, int i10, int i11, Object obj) {
        f91296s.putObject(t10, S(l0(i11)), obj);
        g0(t10, i10, i11);
    }

    private int l0(int i10) {
        return this.f91297a[i10 + 1];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m0(T r19, com.google.protobuf.s0 r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.T.m0(java.lang.Object, com.google.protobuf.s0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void n0(T r11, com.google.protobuf.s0 r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.T.n0(java.lang.Object, com.google.protobuf.s0):void");
    }

    private <K, V> void o0(s0 s0Var, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            s0Var.O(i10, this.f91313q.b(s(i11)), this.f91313q.e(obj));
        }
    }

    private <K, V, UT, UB> UB p(int i10, int i11, Map<K, V> map, C11663y.e eVar, UB ub2, l0<UT, UB> l0Var, Object obj) {
        I.a<?, ?> aVarB = this.f91313q.b(s(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = l0Var.f(obj);
                }
                AbstractC11646g.h hVarP = AbstractC11646g.p(I.b(aVarB, next.getKey(), next.getValue()));
                try {
                    I.e(hVarP.b(), aVarB, next.getKey(), next.getValue());
                    l0Var.d(ub2, i11, hVarP.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private void p0(int i10, Object obj, s0 s0Var) throws IOException {
        if (obj instanceof String) {
            s0Var.e(i10, (String) obj);
        } else {
            s0Var.L(i10, (AbstractC11646g) obj);
        }
    }

    private C11663y.e r(int i10) {
        return (C11663y.e) this.f91298b[((i10 / 3) * 2) + 1];
    }

    private Object s(int i10) {
        return this.f91298b[(i10 / 3) * 2];
    }

    private f0 t(int i10) {
        int i11 = (i10 / 3) * 2;
        f0 f0Var = (f0) this.f91298b[i11];
        if (f0Var != null) {
            return f0Var;
        }
        f0<T> f0VarC = b0.a().c((Class) this.f91298b[i11 + 1]);
        this.f91298b[i11] = f0VarC;
        return f0VarC;
    }

    @Override // com.google.protobuf.f0
    public int b(T t10) {
        int i10;
        int iF;
        int length = this.f91297a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iL0 = l0(i12);
            int iR = R(i12);
            long jS = S(iL0);
            int iHashCode = 37;
            switch (k0(iL0)) {
                case 0:
                    i10 = i11 * 53;
                    iF = C11663y.f(Double.doubleToLongBits(p0.x(t10, jS)));
                    i11 = i10 + iF;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iF = Float.floatToIntBits(p0.y(t10, jS));
                    i11 = i10 + iF;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iF = C11663y.f(p0.A(t10, jS));
                    i11 = i10 + iF;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iF = C11663y.f(p0.A(t10, jS));
                    i11 = i10 + iF;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iF = p0.z(t10, jS);
                    i11 = i10 + iF;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iF = C11663y.f(p0.A(t10, jS));
                    i11 = i10 + iF;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iF = p0.z(t10, jS);
                    i11 = i10 + iF;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iF = C11663y.c(p0.r(t10, jS));
                    i11 = i10 + iF;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iF = ((String) p0.C(t10, jS)).hashCode();
                    i11 = i10 + iF;
                    break;
                case 9:
                    Object objC = p0.C(t10, jS);
                    if (objC != null) {
                        iHashCode = objC.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iF = p0.C(t10, jS).hashCode();
                    i11 = i10 + iF;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iF = p0.z(t10, jS);
                    i11 = i10 + iF;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iF = p0.z(t10, jS);
                    i11 = i10 + iF;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iF = p0.z(t10, jS);
                    i11 = i10 + iF;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iF = C11663y.f(p0.A(t10, jS));
                    i11 = i10 + iF;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iF = p0.z(t10, jS);
                    i11 = i10 + iF;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iF = C11663y.f(p0.A(t10, jS));
                    i11 = i10 + iF;
                    break;
                case 17:
                    Object objC2 = p0.C(t10, jS);
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
                    iF = p0.C(t10, jS).hashCode();
                    i11 = i10 + iF;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iF = p0.C(t10, jS).hashCode();
                    i11 = i10 + iF;
                    break;
                case 51:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = C11663y.f(Double.doubleToLongBits(U(t10, jS)));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = Float.floatToIntBits(V(t10, jS));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = C11663y.f(X(t10, jS));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = C11663y.f(X(t10, jS));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = W(t10, jS);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = C11663y.f(X(t10, jS));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = W(t10, jS);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = C11663y.c(T(t10, jS));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = ((String) p0.C(t10, jS)).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = p0.C(t10, jS).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = p0.C(t10, jS).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = W(t10, jS);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = W(t10, jS);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = W(t10, jS);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = C11663y.f(X(t10, jS));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = W(t10, jS);
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = C11663y.f(X(t10, jS));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = p0.C(t10, jS).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i11 * 53) + this.f91311o.g(t10).hashCode();
        return this.f91302f ? (iHashCode2 * 53) + this.f91312p.c(t10).hashCode() : iHashCode2;
    }

    @Override // com.google.protobuf.f0
    public boolean c(T t10, T t11) {
        int length = this.f91297a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!n(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.f91311o.g(t10).equals(this.f91311o.g(t11))) {
            return false;
        }
        if (this.f91302f) {
            return this.f91312p.c(t10).equals(this.f91312p.c(t11));
        }
        return true;
    }

    @Override // com.google.protobuf.f0
    public T d() {
        return (T) this.f91309m.a(this.f91301e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.protobuf.f0
    public int g(T t10) {
        int i10;
        int i11;
        int iQ;
        int iX;
        int i12;
        int iT;
        int iV;
        T<T> t11 = this;
        T t12 = t10;
        Unsafe unsafe = f91296s;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        while (i14 < t11.f91297a.length) {
            int iL0 = t11.l0(i14);
            int iK0 = k0(iL0);
            int iR = t11.R(i14);
            int i18 = t11.f91297a[i14 + 2];
            int i19 = i18 & i13;
            if (iK0 <= 17) {
                if (i19 != i17) {
                    i15 = i19 == i13 ? 0 : unsafe.getInt(t12, i19);
                    i17 = i19;
                }
                i10 = 1 << (i18 >>> 20);
            } else {
                i10 = 0;
            }
            int i20 = i16;
            long jS = S(iL0);
            if (iK0 < EnumC11658t.f91517O.a() || iK0 > EnumC11658t.f91530b0.a()) {
                i19 = 0;
            }
            switch (iK0) {
                case 0:
                    if (t11.y(t12, i14, i17, i15, i10)) {
                        i11 = CodedOutputStream.i(iR, 0.0d);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 1:
                    if (t11.y(t12, i14, i17, i15, i10)) {
                        iQ = CodedOutputStream.q(iR, 0.0f);
                        i16 = i20 + iQ;
                        t11 = this;
                        t12 = t10;
                        break;
                    }
                    t11 = this;
                    t12 = t10;
                    i16 = i20;
                    break;
                case 2:
                    if (t11.y(t12, i14, i17, i15, i10)) {
                        iX = CodedOutputStream.x(iR, unsafe.getLong(t12, jS));
                        i16 = i20 + iX;
                        t11 = this;
                        break;
                    }
                    t11 = this;
                    i16 = i20;
                    break;
                case 3:
                    if (t11.y(t12, i14, i17, i15, i10)) {
                        iX = CodedOutputStream.W(iR, unsafe.getLong(t12, jS));
                        i16 = i20 + iX;
                        t11 = this;
                        break;
                    }
                    t11 = this;
                    i16 = i20;
                    break;
                case 4:
                    if (t11.y(t12, i14, i17, i15, i10)) {
                        iX = CodedOutputStream.v(iR, unsafe.getInt(t12, jS));
                        i16 = i20 + iX;
                        t11 = this;
                        break;
                    }
                    t11 = this;
                    i16 = i20;
                    break;
                case 5:
                    if (t11.y(t12, i14, i17, i15, i10)) {
                        iQ = CodedOutputStream.o(iR, 0L);
                        i16 = i20 + iQ;
                        t11 = this;
                        t12 = t10;
                        break;
                    }
                    t11 = this;
                    t12 = t10;
                    i16 = i20;
                    break;
                case 6:
                    if (t11.y(t12, i14, i17, i15, i10)) {
                        iQ = CodedOutputStream.m(iR, 0);
                        i16 = i20 + iQ;
                        t11 = this;
                        t12 = t10;
                        break;
                    }
                    t11 = this;
                    t12 = t10;
                    i16 = i20;
                    break;
                case 7:
                    if (t11.y(t12, i14, i17, i15, i10)) {
                        iQ = CodedOutputStream.d(iR, true);
                        i16 = i20 + iQ;
                        t11 = this;
                        t12 = t10;
                        break;
                    }
                    t11 = this;
                    t12 = t10;
                    i16 = i20;
                    break;
                case 8:
                    if (t11.y(t12, i14, i17, i15, i10)) {
                        Object object = unsafe.getObject(t12, jS);
                        iX = object instanceof AbstractC11646g ? CodedOutputStream.g(iR, (AbstractC11646g) object) : CodedOutputStream.R(iR, (String) object);
                        i16 = i20 + iX;
                        t11 = this;
                        break;
                    }
                    t11 = this;
                    i16 = i20;
                    break;
                case 9:
                    if (t11.y(t12, i14, i17, i15, i10)) {
                        i11 = h0.o(iR, unsafe.getObject(t12, jS), t11.t(i14));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 10:
                    if (t11.y(t12, i14, i17, i15, i10)) {
                        iX = CodedOutputStream.g(iR, (AbstractC11646g) unsafe.getObject(t12, jS));
                        i16 = i20 + iX;
                        t11 = this;
                        break;
                    }
                    t11 = this;
                    i16 = i20;
                    break;
                case 11:
                    if (t11.y(t12, i14, i17, i15, i10)) {
                        iX = CodedOutputStream.U(iR, unsafe.getInt(t12, jS));
                        i16 = i20 + iX;
                        t11 = this;
                        break;
                    }
                    t11 = this;
                    i16 = i20;
                    break;
                case 12:
                    if (t11.y(t12, i14, i17, i15, i10)) {
                        iX = CodedOutputStream.k(iR, unsafe.getInt(t12, jS));
                        i16 = i20 + iX;
                        t11 = this;
                        break;
                    }
                    t11 = this;
                    i16 = i20;
                    break;
                case 13:
                    if (t11.y(t12, i14, i17, i15, i10)) {
                        iQ = CodedOutputStream.J(iR, 0);
                        i16 = i20 + iQ;
                        t11 = this;
                        t12 = t10;
                        break;
                    }
                    t11 = this;
                    t12 = t10;
                    i16 = i20;
                    break;
                case 14:
                    if (t11.y(t12, i14, i17, i15, i10)) {
                        iQ = CodedOutputStream.L(iR, 0L);
                        i16 = i20 + iQ;
                        t11 = this;
                        t12 = t10;
                        break;
                    }
                    t11 = this;
                    t12 = t10;
                    i16 = i20;
                    break;
                case 15:
                    if (t11.y(t12, i14, i17, i15, i10)) {
                        iX = CodedOutputStream.N(iR, unsafe.getInt(t12, jS));
                        i16 = i20 + iX;
                        t11 = this;
                        break;
                    }
                    t11 = this;
                    i16 = i20;
                    break;
                case 16:
                    if (t11.y(t12, i14, i17, i15, i10)) {
                        iX = CodedOutputStream.P(iR, unsafe.getLong(t12, jS));
                        i16 = i20 + iX;
                        t11 = this;
                        break;
                    }
                    t11 = this;
                    i16 = i20;
                    break;
                case 17:
                    if (t11.y(t12, i14, i17, i15, i10)) {
                        i11 = CodedOutputStream.s(iR, (P) unsafe.getObject(t12, jS), t11.t(i14));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 18:
                    i11 = h0.h(iR, (List) unsafe.getObject(t12, jS), false);
                    i16 = i20 + i11;
                    break;
                case 19:
                    i11 = h0.f(iR, (List) unsafe.getObject(t12, jS), false);
                    i16 = i20 + i11;
                    break;
                case 20:
                    i11 = h0.m(iR, (List) unsafe.getObject(t12, jS), false);
                    i16 = i20 + i11;
                    break;
                case 21:
                    i11 = h0.x(iR, (List) unsafe.getObject(t12, jS), false);
                    i16 = i20 + i11;
                    break;
                case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                    i11 = h0.k(iR, (List) unsafe.getObject(t12, jS), false);
                    i16 = i20 + i11;
                    break;
                case 23:
                    i11 = h0.h(iR, (List) unsafe.getObject(t12, jS), false);
                    i16 = i20 + i11;
                    break;
                case 24:
                    i11 = h0.f(iR, (List) unsafe.getObject(t12, jS), false);
                    i16 = i20 + i11;
                    break;
                case 25:
                    i11 = h0.a(iR, (List) unsafe.getObject(t12, jS), false);
                    i16 = i20 + i11;
                    break;
                case 26:
                    i11 = h0.u(iR, (List) unsafe.getObject(t12, jS));
                    i16 = i20 + i11;
                    break;
                case 27:
                    i11 = h0.p(iR, (List) unsafe.getObject(t12, jS), t11.t(i14));
                    i16 = i20 + i11;
                    break;
                case 28:
                    i11 = h0.c(iR, (List) unsafe.getObject(t12, jS));
                    i16 = i20 + i11;
                    break;
                case 29:
                    i11 = h0.v(iR, (List) unsafe.getObject(t12, jS), false);
                    i16 = i20 + i11;
                    break;
                case 30:
                    i11 = h0.d(iR, (List) unsafe.getObject(t12, jS), false);
                    i16 = i20 + i11;
                    break;
                case 31:
                    i11 = h0.f(iR, (List) unsafe.getObject(t12, jS), false);
                    i16 = i20 + i11;
                    break;
                case l3.f93325e /* 32 */:
                    i11 = h0.h(iR, (List) unsafe.getObject(t12, jS), false);
                    i16 = i20 + i11;
                    break;
                case 33:
                    i11 = h0.q(iR, (List) unsafe.getObject(t12, jS), false);
                    i16 = i20 + i11;
                    break;
                case 34:
                    i11 = h0.s(iR, (List) unsafe.getObject(t12, jS), false);
                    i16 = i20 + i11;
                    break;
                case 35:
                    i12 = h0.i((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f91305i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 36:
                    i12 = h0.g((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f91305i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 37:
                    i12 = h0.n((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f91305i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 38:
                    i12 = h0.y((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f91305i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 39:
                    i12 = h0.l((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f91305i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 40:
                    i12 = h0.i((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f91305i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 41:
                    i12 = h0.g((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f91305i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 42:
                    i12 = h0.b((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f91305i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 43:
                    i12 = h0.w((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f91305i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 44:
                    i12 = h0.e((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f91305i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 45:
                    i12 = h0.g((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f91305i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 46:
                    i12 = h0.i((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f91305i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 47:
                    i12 = h0.r((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f91305i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 48:
                    i12 = h0.t((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f91305i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iT = CodedOutputStream.T(iR);
                        iV = CodedOutputStream.V(i12);
                        i16 = i20 + iT + iV + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 49:
                    i11 = h0.j(iR, (List) unsafe.getObject(t12, jS), t11.t(i14));
                    i16 = i20 + i11;
                    break;
                case 50:
                    i11 = t11.f91313q.g(iR, unsafe.getObject(t12, jS), t11.s(i14));
                    i16 = i20 + i11;
                    break;
                case 51:
                    if (t11.E(t12, iR, i14)) {
                        i11 = CodedOutputStream.i(iR, 0.0d);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 52:
                    if (t11.E(t12, iR, i14)) {
                        i11 = CodedOutputStream.q(iR, 0.0f);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 53:
                    if (t11.E(t12, iR, i14)) {
                        i11 = CodedOutputStream.x(iR, X(t12, jS));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 54:
                    if (t11.E(t12, iR, i14)) {
                        i11 = CodedOutputStream.W(iR, X(t12, jS));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 55:
                    if (t11.E(t12, iR, i14)) {
                        i11 = CodedOutputStream.v(iR, W(t12, jS));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 56:
                    if (t11.E(t12, iR, i14)) {
                        i11 = CodedOutputStream.o(iR, 0L);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 57:
                    if (t11.E(t12, iR, i14)) {
                        i11 = CodedOutputStream.m(iR, 0);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 58:
                    if (t11.E(t12, iR, i14)) {
                        i11 = CodedOutputStream.d(iR, true);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 59:
                    if (t11.E(t12, iR, i14)) {
                        Object object2 = unsafe.getObject(t12, jS);
                        i11 = object2 instanceof AbstractC11646g ? CodedOutputStream.g(iR, (AbstractC11646g) object2) : CodedOutputStream.R(iR, (String) object2);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 60:
                    if (t11.E(t12, iR, i14)) {
                        i11 = h0.o(iR, unsafe.getObject(t12, jS), t11.t(i14));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 61:
                    if (t11.E(t12, iR, i14)) {
                        i11 = CodedOutputStream.g(iR, (AbstractC11646g) unsafe.getObject(t12, jS));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 62:
                    if (t11.E(t12, iR, i14)) {
                        i11 = CodedOutputStream.U(iR, W(t12, jS));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 63:
                    if (t11.E(t12, iR, i14)) {
                        i11 = CodedOutputStream.k(iR, W(t12, jS));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 64:
                    if (t11.E(t12, iR, i14)) {
                        i11 = CodedOutputStream.J(iR, 0);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 65:
                    if (t11.E(t12, iR, i14)) {
                        i11 = CodedOutputStream.L(iR, 0L);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 66:
                    if (t11.E(t12, iR, i14)) {
                        i11 = CodedOutputStream.N(iR, W(t12, jS));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 67:
                    if (t11.E(t12, iR, i14)) {
                        i11 = CodedOutputStream.P(iR, X(t12, jS));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 68:
                    if (t11.E(t12, iR, i14)) {
                        i11 = CodedOutputStream.s(iR, (P) unsafe.getObject(t12, jS), t11.t(i14));
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
        int iU = i16 + t11.u(t11.f91311o, t12);
        return t11.f91302f ? iU + t11.f91312p.c(t12).l() : iU;
    }

    private T(int[] iArr, Object[] objArr, int i10, int i11, P p10, a0 a0Var, boolean z10, int[] iArr2, int i12, int i13, V v10, F f10, l0<?, ?> l0Var, AbstractC11654o<?> abstractC11654o, K k10) {
        boolean z11;
        this.f91297a = iArr;
        this.f91298b = objArr;
        this.f91299c = i10;
        this.f91300d = i11;
        this.f91303g = p10 instanceof AbstractC11661w;
        this.f91304h = a0Var;
        if (abstractC11654o != null && abstractC11654o.e(p10)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f91302f = z11;
        this.f91305i = z10;
        this.f91306j = iArr2;
        this.f91307k = i12;
        this.f91308l = i13;
        this.f91309m = v10;
        this.f91310n = f10;
        this.f91311o = l0Var;
        this.f91312p = abstractC11654o;
        this.f91301e = p10;
        this.f91313q = k10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean A(Object obj, int i10, int i11) {
        List list = (List) p0.C(obj, S(i10));
        if (list.isEmpty()) {
            return true;
        }
        f0 f0VarT = t(i11);
        for (int i12 = 0; i12 < list.size(); i12++) {
            if (!f0VarT.f(list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    private boolean D(T t10, T t11, int i10) {
        long jZ = Z(i10) & 1048575;
        if (p0.z(t10, jZ) == p0.z(t11, jZ)) {
            return true;
        }
        return false;
    }

    private boolean E(T t10, int i10, int i11) {
        if (p0.z(t10, Z(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private static <T> long G(T t10, long j10) {
        return p0.A(t10, j10);
    }

    private final <K, V> void I(Object obj, int i10, Object obj2, C11653n c11653n, e0 e0Var) throws IOException {
        long jS = S(l0(i10));
        Object objC = p0.C(obj, jS);
        if (objC == null) {
            objC = this.f91313q.d(obj2);
            p0.R(obj, jS, objC);
        } else if (this.f91313q.h(objC)) {
            Object objD = this.f91313q.d(obj2);
            this.f91313q.a(objD, objC);
            p0.R(obj, jS, objD);
            objC = objD;
        }
        e0Var.M(this.f91313q.c(objC), this.f91313q.b(obj2), c11653n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void J(T t10, T t11, int i10) {
        if (!x(t11, i10)) {
            return;
        }
        long jS = S(l0(i10));
        Unsafe unsafe = f91296s;
        Object object = unsafe.getObject(t11, jS);
        if (object != null) {
            f0 f0VarT = t(i10);
            if (!x(t10, i10)) {
                if (!C(object)) {
                    unsafe.putObject(t10, jS, object);
                } else {
                    Object objD = f0VarT.d();
                    f0VarT.a(objD, object);
                    unsafe.putObject(t10, jS, objD);
                }
                f0(t10, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, jS);
            if (!C(object2)) {
                Object objD2 = f0VarT.d();
                f0VarT.a(objD2, object2);
                unsafe.putObject(t10, jS, objD2);
                object2 = objD2;
            }
            f0VarT.a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + R(i10) + " is present but null: " + t11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void K(T t10, T t11, int i10) {
        int iR = R(i10);
        if (!E(t11, iR, i10)) {
            return;
        }
        long jS = S(l0(i10));
        Unsafe unsafe = f91296s;
        Object object = unsafe.getObject(t11, jS);
        if (object != null) {
            f0 f0VarT = t(i10);
            if (!E(t10, iR, i10)) {
                if (!C(object)) {
                    unsafe.putObject(t10, jS, object);
                } else {
                    Object objD = f0VarT.d();
                    f0VarT.a(objD, object);
                    unsafe.putObject(t10, jS, objD);
                }
                g0(t10, iR, i10);
                return;
            }
            Object object2 = unsafe.getObject(t10, jS);
            if (!C(object2)) {
                Object objD2 = f0VarT.d();
                f0VarT.a(objD2, object2);
                unsafe.putObject(t10, jS, objD2);
                object2 = objD2;
            }
            f0VarT.a(object2, object);
            return;
        }
        throw new IllegalStateException("Source subfield " + R(i10) + " is present but null: " + t11);
    }

    private void L(T t10, T t11, int i10) {
        int iL0 = l0(i10);
        long jS = S(iL0);
        int iR = R(i10);
        switch (k0(iL0)) {
            case 0:
                if (x(t11, i10)) {
                    p0.N(t10, jS, p0.x(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 1:
                if (x(t11, i10)) {
                    p0.O(t10, jS, p0.y(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 2:
                if (x(t11, i10)) {
                    p0.Q(t10, jS, p0.A(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 3:
                if (x(t11, i10)) {
                    p0.Q(t10, jS, p0.A(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 4:
                if (x(t11, i10)) {
                    p0.P(t10, jS, p0.z(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 5:
                if (x(t11, i10)) {
                    p0.Q(t10, jS, p0.A(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 6:
                if (x(t11, i10)) {
                    p0.P(t10, jS, p0.z(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 7:
                if (x(t11, i10)) {
                    p0.H(t10, jS, p0.r(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 8:
                if (x(t11, i10)) {
                    p0.R(t10, jS, p0.C(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 9:
                J(t10, t11, i10);
                break;
            case 10:
                if (x(t11, i10)) {
                    p0.R(t10, jS, p0.C(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 11:
                if (x(t11, i10)) {
                    p0.P(t10, jS, p0.z(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 12:
                if (x(t11, i10)) {
                    p0.P(t10, jS, p0.z(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 13:
                if (x(t11, i10)) {
                    p0.P(t10, jS, p0.z(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 14:
                if (x(t11, i10)) {
                    p0.Q(t10, jS, p0.A(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 15:
                if (x(t11, i10)) {
                    p0.P(t10, jS, p0.z(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 16:
                if (x(t11, i10)) {
                    p0.Q(t10, jS, p0.A(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 17:
                J(t10, t11, i10);
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
                this.f91310n.d(t10, t11, jS);
                break;
            case 50:
                h0.F(this.f91313q, t10, t11, jS);
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
                if (E(t11, iR, i10)) {
                    p0.R(t10, jS, p0.C(t11, jS));
                    g0(t10, iR, i10);
                    break;
                }
                break;
            case 60:
                K(t10, t11, i10);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (E(t11, iR, i10)) {
                    p0.R(t10, jS, p0.C(t11, jS));
                    g0(t10, iR, i10);
                    break;
                }
                break;
            case 68:
                K(t10, t11, i10);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object M(T t10, int i10) {
        f0 f0VarT = t(i10);
        long jS = S(l0(i10));
        if (!x(t10, i10)) {
            return f0VarT.d();
        }
        Object object = f91296s.getObject(t10, jS);
        if (C(object)) {
            return object;
        }
        Object objD = f0VarT.d();
        if (object != null) {
            f0VarT.a(objD, object);
        }
        return objD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Object N(T t10, int i10, int i11) {
        f0 f0VarT = t(i11);
        if (!E(t10, i10, i11)) {
            return f0VarT.d();
        }
        Object object = f91296s.getObject(t10, S(l0(i11)));
        if (C(object)) {
            return object;
        }
        Object objD = f0VarT.d();
        if (object != null) {
            f0VarT.a(objD, object);
        }
        return objD;
    }

    static <T> T<T> P(j0 j0Var, V v10, F f10, l0<?, ?> l0Var, AbstractC11654o<?> abstractC11654o, K k10) {
        r[] rVarArrE = j0Var.e();
        if (rVarArrE.length == 0) {
            int length = rVarArrE.length;
            int[] iArr = new int[length * 3];
            Object[] objArr = new Object[length * 2];
            if (rVarArrE.length <= 0) {
                int[] iArrD = j0Var.d();
                if (iArrD == null) {
                    iArrD = f91295r;
                }
                if (rVarArrE.length <= 0) {
                    int[] iArr2 = f91295r;
                    int[] iArr3 = f91295r;
                    int[] iArr4 = new int[iArrD.length + iArr2.length + iArr3.length];
                    System.arraycopy(iArrD, 0, iArr4, 0, iArrD.length);
                    System.arraycopy(iArr2, 0, iArr4, iArrD.length, iArr2.length);
                    System.arraycopy(iArr3, 0, iArr4, iArrD.length + iArr2.length, iArr3.length);
                    return new T<>(iArr, objArr, 0, 0, j0Var.b(), j0Var.c(), true, iArr4, iArrD.length, iArrD.length + iArr2.length, v10, f10, l0Var, abstractC11654o, k10);
                }
                r rVar = rVarArrE[0];
                throw null;
            }
            r rVar2 = rVarArrE[0];
            throw null;
        }
        r rVar3 = rVarArrE[0];
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
    static <T> com.google.protobuf.T<T> Q(com.google.protobuf.d0 r33, com.google.protobuf.V r34, com.google.protobuf.F r35, com.google.protobuf.l0<?, ?> r36, com.google.protobuf.AbstractC11654o<?> r37, com.google.protobuf.K r38) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.T.Q(com.google.protobuf.d0, com.google.protobuf.V, com.google.protobuf.F, com.google.protobuf.l0, com.google.protobuf.o, com.google.protobuf.K):com.google.protobuf.T");
    }

    private static <T> boolean T(T t10, long j10) {
        return ((Boolean) p0.C(t10, j10)).booleanValue();
    }

    private static <T> double U(T t10, long j10) {
        return ((Double) p0.C(t10, j10)).doubleValue();
    }

    private static <T> float V(T t10, long j10) {
        return ((Float) p0.C(t10, j10)).floatValue();
    }

    private static <T> int W(T t10, long j10) {
        return ((Integer) p0.C(t10, j10)).intValue();
    }

    private static <T> long X(T t10, long j10) {
        return ((Long) p0.C(t10, j10)).longValue();
    }

    private <E> void b0(Object obj, int i10, e0 e0Var, f0<E> f0Var, C11653n c11653n) throws IOException {
        e0Var.K(this.f91310n.e(obj, S(i10)), f0Var, c11653n);
    }

    private void c0(Object obj, int i10, e0 e0Var) throws IOException {
        if (w(i10)) {
            p0.R(obj, S(i10), e0Var.I());
        } else if (this.f91303g) {
            p0.R(obj, S(i10), e0Var.z());
        } else {
            p0.R(obj, S(i10), e0Var.o());
        }
    }

    private void d0(Object obj, int i10, e0 e0Var) throws IOException {
        if (w(i10)) {
            e0Var.n(this.f91310n.e(obj, S(i10)));
        } else {
            e0Var.B(this.f91310n.e(obj, S(i10)));
        }
    }

    private static Field e0(Class<?> cls, String str) {
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

    private void f0(T t10, int i10) {
        int iZ = Z(i10);
        long j10 = 1048575 & iZ;
        if (j10 == 1048575) {
            return;
        }
        p0.P(t10, j10, (1 << (iZ >>> 20)) | p0.z(t10, j10));
    }

    private void g0(T t10, int i10, int i11) {
        p0.P(t10, Z(i11) & 1048575, i10);
    }

    private boolean j(T t10, T t11, int i10) {
        if (x(t10, i10) == x(t11, i10)) {
            return true;
        }
        return false;
    }

    private static <T> boolean k(T t10, long j10) {
        return p0.r(t10, j10);
    }

    private static void l(Object obj) {
        if (C(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private static <T> double m(T t10, long j10) {
        return p0.x(t10, j10);
    }

    private boolean n(T t10, T t11, int i10) {
        int iL0 = l0(i10);
        long jS = S(iL0);
        switch (k0(iL0)) {
            case 0:
                if (!j(t10, t11, i10) || Double.doubleToLongBits(p0.x(t10, jS)) != Double.doubleToLongBits(p0.x(t11, jS))) {
                }
                break;
            case 1:
                if (!j(t10, t11, i10) || Float.floatToIntBits(p0.y(t10, jS)) != Float.floatToIntBits(p0.y(t11, jS))) {
                }
                break;
            case 2:
                if (!j(t10, t11, i10) || p0.A(t10, jS) != p0.A(t11, jS)) {
                }
                break;
            case 3:
                if (!j(t10, t11, i10) || p0.A(t10, jS) != p0.A(t11, jS)) {
                }
                break;
            case 4:
                if (!j(t10, t11, i10) || p0.z(t10, jS) != p0.z(t11, jS)) {
                }
                break;
            case 5:
                if (!j(t10, t11, i10) || p0.A(t10, jS) != p0.A(t11, jS)) {
                }
                break;
            case 6:
                if (!j(t10, t11, i10) || p0.z(t10, jS) != p0.z(t11, jS)) {
                }
                break;
            case 7:
                if (!j(t10, t11, i10) || p0.r(t10, jS) != p0.r(t11, jS)) {
                }
                break;
            case 8:
                if (!j(t10, t11, i10) || !h0.I(p0.C(t10, jS), p0.C(t11, jS))) {
                }
                break;
            case 9:
                if (!j(t10, t11, i10) || !h0.I(p0.C(t10, jS), p0.C(t11, jS))) {
                }
                break;
            case 10:
                if (!j(t10, t11, i10) || !h0.I(p0.C(t10, jS), p0.C(t11, jS))) {
                }
                break;
            case 11:
                if (!j(t10, t11, i10) || p0.z(t10, jS) != p0.z(t11, jS)) {
                }
                break;
            case 12:
                if (!j(t10, t11, i10) || p0.z(t10, jS) != p0.z(t11, jS)) {
                }
                break;
            case 13:
                if (!j(t10, t11, i10) || p0.z(t10, jS) != p0.z(t11, jS)) {
                }
                break;
            case 14:
                if (!j(t10, t11, i10) || p0.A(t10, jS) != p0.A(t11, jS)) {
                }
                break;
            case 15:
                if (!j(t10, t11, i10) || p0.z(t10, jS) != p0.z(t11, jS)) {
                }
                break;
            case 16:
                if (!j(t10, t11, i10) || p0.A(t10, jS) != p0.A(t11, jS)) {
                }
                break;
            case 17:
                if (!j(t10, t11, i10) || !h0.I(p0.C(t10, jS), p0.C(t11, jS))) {
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
                if (!D(t10, t11, i10) || !h0.I(p0.C(t10, jS), p0.C(t11, jS))) {
                }
                break;
        }
        return true;
    }

    private <UT, UB> UB o(Object obj, int i10, UB ub2, l0<UT, UB> l0Var, Object obj2) {
        C11663y.e eVarR;
        int iR = R(i10);
        Object objC = p0.C(obj, S(l0(i10)));
        if (objC == null || (eVarR = r(i10)) == null) {
            return ub2;
        }
        return (UB) p(i10, iR, this.f91313q.c(objC), eVarR, ub2, l0Var, obj2);
    }

    private static <T> float q(T t10, long j10) {
        return p0.y(t10, j10);
    }

    private <UT, UB> void q0(l0<UT, UB> l0Var, T t10, s0 s0Var) throws IOException {
        l0Var.t(l0Var.g(t10), s0Var);
    }

    private <UT, UB> int u(l0<UT, UB> l0Var, T t10) {
        return l0Var.h(l0Var.g(t10));
    }

    private static <T> int v(T t10, long j10) {
        return p0.z(t10, j10);
    }

    private boolean x(T t10, int i10) {
        boolean zEquals;
        int iZ = Z(i10);
        long j10 = 1048575 & iZ;
        if (j10 == 1048575) {
            int iL0 = l0(i10);
            long jS = S(iL0);
            switch (k0(iL0)) {
                case 0:
                    if (Double.doubleToRawLongBits(p0.x(t10, jS)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(p0.y(t10, jS)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (p0.A(t10, jS) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (p0.A(t10, jS) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (p0.z(t10, jS) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (p0.A(t10, jS) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (p0.z(t10, jS) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return p0.r(t10, jS);
                case 8:
                    Object objC = p0.C(t10, jS);
                    if (objC instanceof String) {
                        zEquals = ((String) objC).isEmpty();
                        break;
                    } else if (objC instanceof AbstractC11646g) {
                        zEquals = AbstractC11646g.f91343b.equals(objC);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (p0.C(t10, jS) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    zEquals = AbstractC11646g.f91343b.equals(p0.C(t10, jS));
                    break;
                case 11:
                    if (p0.z(t10, jS) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (p0.z(t10, jS) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (p0.z(t10, jS) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (p0.A(t10, jS) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (p0.z(t10, jS) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (p0.A(t10, jS) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (p0.C(t10, jS) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
            return !zEquals;
        }
        if ((p0.z(t10, j10) & (1 << (iZ >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    private boolean y(T t10, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return x(t10, i10);
        }
        if ((i12 & i13) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean z(Object obj, int i10, f0 f0Var) {
        return f0Var.f(p0.C(obj, S(i10)));
    }

    @Override // com.google.protobuf.f0
    public void a(T t10, T t11) {
        l(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.f91297a.length; i10 += 3) {
            L(t10, t11, i10);
        }
        h0.G(this.f91311o, t10, t11);
        if (this.f91302f) {
            h0.E(this.f91312p, t10, t11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    @Override // com.google.protobuf.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(T r8) {
        /*
            r7 = this;
            boolean r0 = C(r8)
            if (r0 != 0) goto L8
            goto L8e
        L8:
            boolean r0 = r8 instanceof com.google.protobuf.AbstractC11661w
            if (r0 == 0) goto L18
            r0 = r8
            com.google.protobuf.w r0 = (com.google.protobuf.AbstractC11661w) r0
            r0.y()
            r0.x()
            r0.P()
        L18:
            int[] r0 = r7.f91297a
            int r0 = r0.length
            r1 = 0
        L1c:
            if (r1 >= r0) goto L80
            int r2 = r7.l0(r1)
            long r3 = S(r2)
            int r2 = k0(r2)
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
            sun.misc.Unsafe r2 = com.google.protobuf.T.f91296s
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L7d
            com.google.protobuf.K r6 = r7.f91313q
            java.lang.Object r5 = r6.f(r5)
            r2.putObject(r8, r3, r5)
            goto L7d
        L4c:
            com.google.protobuf.F r2 = r7.f91310n
            r2.c(r8, r3)
            goto L7d
        L52:
            int r2 = r7.R(r1)
            boolean r2 = r7.E(r8, r2, r1)
            if (r2 == 0) goto L7d
            com.google.protobuf.f0 r2 = r7.t(r1)
            sun.misc.Unsafe r5 = com.google.protobuf.T.f91296s
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.e(r3)
            goto L7d
        L6a:
            boolean r2 = r7.x(r8, r1)
            if (r2 == 0) goto L7d
            com.google.protobuf.f0 r2 = r7.t(r1)
            sun.misc.Unsafe r5 = com.google.protobuf.T.f91296s
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.e(r3)
        L7d:
            int r1 = r1 + 3
            goto L1c
        L80:
            com.google.protobuf.l0<?, ?> r0 = r7.f91311o
            r0.j(r8)
            boolean r0 = r7.f91302f
            if (r0 == 0) goto L8e
            com.google.protobuf.o<?> r0 = r7.f91312p
            r0.f(r8)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.T.e(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    @Override // com.google.protobuf.f0
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
            int r5 = r14.f91307k
            r6 = 1
            if (r2 >= r5) goto L9b
            int[] r5 = r14.f91306j
            r9 = r5[r2]
            int r5 = r14.R(r9)
            int r13 = r14.l0(r9)
            int[] r7 = r14.f91297a
            int r8 = r9 + 2
            r7 = r7[r8]
            r8 = r7 & r0
            int r7 = r7 >>> 20
            int r12 = r6 << r7
            if (r8 == r3) goto L32
            if (r8 == r0) goto L2f
            sun.misc.Unsafe r3 = com.google.protobuf.T.f91296s
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
            boolean r3 = F(r13)
            r7 = r14
            r8 = r15
            if (r3 == 0) goto L43
            boolean r15 = r7.y(r8, r9, r10, r11, r12)
            if (r15 != 0) goto L43
            return r1
        L43:
            int r15 = k0(r13)
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
            boolean r15 = r14.B(r8, r13, r9)
            if (r15 != 0) goto L94
            return r1
        L6b:
            boolean r15 = r14.E(r8, r5, r9)
            if (r15 == 0) goto L94
            com.google.protobuf.f0 r15 = r14.t(r9)
            boolean r15 = z(r8, r13, r15)
            if (r15 != 0) goto L94
            return r1
        L7c:
            boolean r15 = r14.A(r8, r13, r9)
            if (r15 != 0) goto L94
            return r1
        L83:
            boolean r15 = r7.y(r8, r9, r10, r11, r12)
            if (r15 == 0) goto L94
            com.google.protobuf.f0 r15 = r14.t(r9)
            boolean r15 = z(r8, r13, r15)
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
            boolean r15 = r7.f91302f
            if (r15 == 0) goto Lae
            com.google.protobuf.o<?> r15 = r7.f91312p
            com.google.protobuf.s r15 = r15.c(r8)
            boolean r15 = r15.p()
            if (r15 != 0) goto Lae
            return r1
        Lae:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.T.f(java.lang.Object):boolean");
    }

    @Override // com.google.protobuf.f0
    public void h(T t10, s0 s0Var) throws IOException {
        if (s0Var.t() == s0.a.DESCENDING) {
            n0(t10, s0Var);
        } else {
            m0(t10, s0Var);
        }
    }

    @Override // com.google.protobuf.f0
    public void i(T t10, e0 e0Var, C11653n c11653n) throws IOException {
        c11653n.getClass();
        l(t10);
        H(this.f91311o, this.f91312p, t10, e0Var, c11653n);
    }
}
