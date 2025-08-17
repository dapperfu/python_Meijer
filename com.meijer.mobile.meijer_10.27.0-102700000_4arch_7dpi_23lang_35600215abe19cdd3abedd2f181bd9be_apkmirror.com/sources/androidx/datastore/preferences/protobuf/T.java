package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC5941g;
import androidx.datastore.preferences.protobuf.C5958y;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.r0;
import com.medallia.digital.mobilesdk.l3;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class T<T> implements f0<T> {

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f54183r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    private static final Unsafe f54184s = o0.A();

    /* renamed from: a, reason: collision with root package name */
    private final int[] f54185a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f54186b;

    /* renamed from: c, reason: collision with root package name */
    private final int f54187c;

    /* renamed from: d, reason: collision with root package name */
    private final int f54188d;

    /* renamed from: e, reason: collision with root package name */
    private final P f54189e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f54190f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f54191g;

    /* renamed from: h, reason: collision with root package name */
    private final a0 f54192h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f54193i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f54194j;

    /* renamed from: k, reason: collision with root package name */
    private final int f54195k;

    /* renamed from: l, reason: collision with root package name */
    private final int f54196l;

    /* renamed from: m, reason: collision with root package name */
    private final V f54197m;

    /* renamed from: n, reason: collision with root package name */
    private final D f54198n;

    /* renamed from: o, reason: collision with root package name */
    private final l0<?, ?> f54199o;

    /* renamed from: p, reason: collision with root package name */
    private final AbstractC5949o<?> f54200p;

    /* renamed from: q, reason: collision with root package name */
    private final K f54201q;

    private static boolean F(int i10) {
        return (i10 & 268435456) != 0;
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
    static <T> androidx.datastore.preferences.protobuf.T<T> Q(androidx.datastore.preferences.protobuf.d0 r33, androidx.datastore.preferences.protobuf.V r34, androidx.datastore.preferences.protobuf.D r35, androidx.datastore.preferences.protobuf.l0<?, ?> r36, androidx.datastore.preferences.protobuf.AbstractC5949o<?> r37, androidx.datastore.preferences.protobuf.K r38) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.Q(androidx.datastore.preferences.protobuf.d0, androidx.datastore.preferences.protobuf.V, androidx.datastore.preferences.protobuf.D, androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.o, androidx.datastore.preferences.protobuf.K):androidx.datastore.preferences.protobuf.T");
    }

    private static long S(int i10) {
        return i10 & 1048575;
    }

    private static int k0(int i10) {
        return (i10 & 267386880) >>> 20;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m0(T r19, androidx.datastore.preferences.protobuf.r0 r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.m0(java.lang.Object, androidx.datastore.preferences.protobuf.r0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void n0(T r11, androidx.datastore.preferences.protobuf.r0 r12) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.n0(java.lang.Object, androidx.datastore.preferences.protobuf.r0):void");
    }

    private static boolean w(int i10) {
        return (i10 & 536870912) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.datastore.preferences.protobuf.f0] */
    private boolean B(T t10, int i10, int i11) {
        Map<?, ?> mapE = this.f54201q.e(o0.z(t10, S(i10)));
        if (mapE.isEmpty()) {
            return true;
        }
        if (this.f54201q.b(s(i11)).f54174c.a() != q0.c.MESSAGE) {
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
        if (obj instanceof AbstractC5956w) {
            return ((AbstractC5956w) obj).H();
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
    private <UT, UB, ET extends androidx.datastore.preferences.protobuf.C5952s.b<ET>> void H(androidx.datastore.preferences.protobuf.l0<UT, UB> r18, androidx.datastore.preferences.protobuf.AbstractC5949o<ET> r19, T r20, androidx.datastore.preferences.protobuf.e0 r21, androidx.datastore.preferences.protobuf.C5948n r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 2040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.H(androidx.datastore.preferences.protobuf.l0, androidx.datastore.preferences.protobuf.o, java.lang.Object, androidx.datastore.preferences.protobuf.e0, androidx.datastore.preferences.protobuf.n):void");
    }

    static <T> T<T> O(Class<T> cls, N n10, V v10, D d10, l0<?, ?> l0Var, AbstractC5949o<?> abstractC5949o, K k10) {
        return n10 instanceof d0 ? Q((d0) n10, v10, d10, l0Var, abstractC5949o, k10) : P((j0) n10, v10, d10, l0Var, abstractC5949o, k10);
    }

    private int R(int i10) {
        return this.f54185a[i10];
    }

    private int Y(int i10) {
        if (i10 < this.f54187c || i10 > this.f54188d) {
            return -1;
        }
        return h0(i10, 0);
    }

    private int Z(int i10) {
        return this.f54185a[i10 + 2];
    }

    private <E> void a0(Object obj, long j10, e0 e0Var, f0<E> f0Var, C5948n c5948n) throws IOException {
        e0Var.P(this.f54198n.c(obj, j10), f0Var, c5948n);
    }

    private int h0(int i10, int i11) {
        int length = (this.f54185a.length / 3) - 1;
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
        f54184s.putObject(t10, S(l0(i10)), obj);
        f0(t10, i10);
    }

    private void j0(T t10, int i10, int i11, Object obj) {
        f54184s.putObject(t10, S(l0(i11)), obj);
        g0(t10, i10, i11);
    }

    private int l0(int i10) {
        return this.f54185a[i10 + 1];
    }

    private <K, V> void o0(r0 r0Var, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            r0Var.M(i10, this.f54201q.b(s(i11)), this.f54201q.e(obj));
        }
    }

    private <K, V, UT, UB> UB p(int i10, int i11, Map<K, V> map, C5958y.e eVar, UB ub2, l0<UT, UB> l0Var, Object obj) {
        I.a<?, ?> aVarB = this.f54201q.b(s(i10));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    ub2 = l0Var.f(obj);
                }
                AbstractC5941g.h hVarQ = AbstractC5941g.q(I.b(aVarB, next.getKey(), next.getValue()));
                try {
                    I.e(hVarQ.b(), aVarB, next.getKey(), next.getValue());
                    l0Var.d(ub2, i11, hVarQ.a());
                    it.remove();
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }
        return ub2;
    }

    private void p0(int i10, Object obj, r0 r0Var) throws IOException {
        if (obj instanceof String) {
            r0Var.e(i10, (String) obj);
        } else {
            r0Var.K(i10, (AbstractC5941g) obj);
        }
    }

    private C5958y.e r(int i10) {
        return (C5958y.e) this.f54186b[((i10 / 3) * 2) + 1];
    }

    private Object s(int i10) {
        return this.f54186b[(i10 / 3) * 2];
    }

    private f0 t(int i10) {
        int i11 = (i10 / 3) * 2;
        f0 f0Var = (f0) this.f54186b[i11];
        if (f0Var != null) {
            return f0Var;
        }
        f0<T> f0VarC = b0.a().c((Class) this.f54186b[i11 + 1]);
        this.f54186b[i11] = f0VarC;
        return f0VarC;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public int b(T t10) {
        int i10;
        int iF;
        int length = this.f54185a.length;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12 += 3) {
            int iL0 = l0(i12);
            int iR = R(i12);
            long jS = S(iL0);
            int iHashCode = 37;
            switch (k0(iL0)) {
                case 0:
                    i10 = i11 * 53;
                    iF = C5958y.f(Double.doubleToLongBits(o0.u(t10, jS)));
                    i11 = i10 + iF;
                    break;
                case 1:
                    i10 = i11 * 53;
                    iF = Float.floatToIntBits(o0.v(t10, jS));
                    i11 = i10 + iF;
                    break;
                case 2:
                    i10 = i11 * 53;
                    iF = C5958y.f(o0.x(t10, jS));
                    i11 = i10 + iF;
                    break;
                case 3:
                    i10 = i11 * 53;
                    iF = C5958y.f(o0.x(t10, jS));
                    i11 = i10 + iF;
                    break;
                case 4:
                    i10 = i11 * 53;
                    iF = o0.w(t10, jS);
                    i11 = i10 + iF;
                    break;
                case 5:
                    i10 = i11 * 53;
                    iF = C5958y.f(o0.x(t10, jS));
                    i11 = i10 + iF;
                    break;
                case 6:
                    i10 = i11 * 53;
                    iF = o0.w(t10, jS);
                    i11 = i10 + iF;
                    break;
                case 7:
                    i10 = i11 * 53;
                    iF = C5958y.c(o0.p(t10, jS));
                    i11 = i10 + iF;
                    break;
                case 8:
                    i10 = i11 * 53;
                    iF = ((String) o0.z(t10, jS)).hashCode();
                    i11 = i10 + iF;
                    break;
                case 9:
                    Object objZ = o0.z(t10, jS);
                    if (objZ != null) {
                        iHashCode = objZ.hashCode();
                    }
                    i11 = (i11 * 53) + iHashCode;
                    break;
                case 10:
                    i10 = i11 * 53;
                    iF = o0.z(t10, jS).hashCode();
                    i11 = i10 + iF;
                    break;
                case 11:
                    i10 = i11 * 53;
                    iF = o0.w(t10, jS);
                    i11 = i10 + iF;
                    break;
                case 12:
                    i10 = i11 * 53;
                    iF = o0.w(t10, jS);
                    i11 = i10 + iF;
                    break;
                case 13:
                    i10 = i11 * 53;
                    iF = o0.w(t10, jS);
                    i11 = i10 + iF;
                    break;
                case 14:
                    i10 = i11 * 53;
                    iF = C5958y.f(o0.x(t10, jS));
                    i11 = i10 + iF;
                    break;
                case 15:
                    i10 = i11 * 53;
                    iF = o0.w(t10, jS);
                    i11 = i10 + iF;
                    break;
                case 16:
                    i10 = i11 * 53;
                    iF = C5958y.f(o0.x(t10, jS));
                    i11 = i10 + iF;
                    break;
                case 17:
                    Object objZ2 = o0.z(t10, jS);
                    if (objZ2 != null) {
                        iHashCode = objZ2.hashCode();
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
                case l3.f92486e /* 32 */:
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
                    iF = o0.z(t10, jS).hashCode();
                    i11 = i10 + iF;
                    break;
                case 50:
                    i10 = i11 * 53;
                    iF = o0.z(t10, jS).hashCode();
                    i11 = i10 + iF;
                    break;
                case 51:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = C5958y.f(Double.doubleToLongBits(U(t10, jS)));
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
                        iF = C5958y.f(X(t10, jS));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = C5958y.f(X(t10, jS));
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
                        iF = C5958y.f(X(t10, jS));
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
                        iF = C5958y.c(T(t10, jS));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = ((String) o0.z(t10, jS)).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = o0.z(t10, jS).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = o0.z(t10, jS).hashCode();
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
                        iF = C5958y.f(X(t10, jS));
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
                        iF = C5958y.f(X(t10, jS));
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (E(t10, iR, i12)) {
                        i10 = i11 * 53;
                        iF = o0.z(t10, jS).hashCode();
                        i11 = i10 + iF;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int iHashCode2 = (i11 * 53) + this.f54199o.g(t10).hashCode();
        return this.f54190f ? (iHashCode2 * 53) + this.f54200p.c(t10).hashCode() : iHashCode2;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public boolean c(T t10, T t11) {
        int length = this.f54185a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            if (!n(t10, t11, i10)) {
                return false;
            }
        }
        if (!this.f54199o.g(t10).equals(this.f54199o.g(t11))) {
            return false;
        }
        if (this.f54190f) {
            return this.f54200p.c(t10).equals(this.f54200p.c(t11));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public T d() {
        return (T) this.f54197m.a(this.f54189e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.datastore.preferences.protobuf.f0
    public int g(T t10) {
        int i10;
        int i11;
        int iQ;
        int iX;
        int i12;
        int iU;
        int iW;
        T<T> t11 = this;
        T t12 = t10;
        Unsafe unsafe = f54184s;
        int i13 = 1048575;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1048575;
        while (i14 < t11.f54185a.length) {
            int iL0 = t11.l0(i14);
            int iK0 = k0(iL0);
            int iR = t11.R(i14);
            int i18 = t11.f54185a[i14 + 2];
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
            if (iK0 < EnumC5953t.f54404O.a() || iK0 > EnumC5953t.f54417b0.a()) {
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
                        iX = CodedOutputStream.X(iR, unsafe.getLong(t12, jS));
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
                        iX = object instanceof AbstractC5941g ? CodedOutputStream.g(iR, (AbstractC5941g) object) : CodedOutputStream.S(iR, (String) object);
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
                        iX = CodedOutputStream.g(iR, (AbstractC5941g) unsafe.getObject(t12, jS));
                        i16 = i20 + iX;
                        t11 = this;
                        break;
                    }
                    t11 = this;
                    i16 = i20;
                    break;
                case 11:
                    if (t11.y(t12, i14, i17, i15, i10)) {
                        iX = CodedOutputStream.V(iR, unsafe.getInt(t12, jS));
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
                        iQ = CodedOutputStream.K(iR, 0);
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
                        iQ = CodedOutputStream.M(iR, 0L);
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
                        iX = CodedOutputStream.O(iR, unsafe.getInt(t12, jS));
                        i16 = i20 + iX;
                        t11 = this;
                        break;
                    }
                    t11 = this;
                    i16 = i20;
                    break;
                case 16:
                    if (t11.y(t12, i14, i17, i15, i10)) {
                        iX = CodedOutputStream.Q(iR, unsafe.getLong(t12, jS));
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
                case l3.f92486e /* 32 */:
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
                        if (t11.f54193i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i12);
                        i16 = i20 + iU + iW + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 36:
                    i12 = h0.g((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f54193i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i12);
                        i16 = i20 + iU + iW + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 37:
                    i12 = h0.n((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f54193i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i12);
                        i16 = i20 + iU + iW + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 38:
                    i12 = h0.y((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f54193i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i12);
                        i16 = i20 + iU + iW + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 39:
                    i12 = h0.l((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f54193i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i12);
                        i16 = i20 + iU + iW + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 40:
                    i12 = h0.i((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f54193i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i12);
                        i16 = i20 + iU + iW + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 41:
                    i12 = h0.g((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f54193i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i12);
                        i16 = i20 + iU + iW + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 42:
                    i12 = h0.b((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f54193i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i12);
                        i16 = i20 + iU + iW + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 43:
                    i12 = h0.w((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f54193i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i12);
                        i16 = i20 + iU + iW + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 44:
                    i12 = h0.e((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f54193i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i12);
                        i16 = i20 + iU + iW + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 45:
                    i12 = h0.g((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f54193i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i12);
                        i16 = i20 + iU + iW + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 46:
                    i12 = h0.i((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f54193i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i12);
                        i16 = i20 + iU + iW + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 47:
                    i12 = h0.r((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f54193i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i12);
                        i16 = i20 + iU + iW + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 48:
                    i12 = h0.t((List) unsafe.getObject(t12, jS));
                    if (i12 > 0) {
                        if (t11.f54193i) {
                            unsafe.putInt(t12, i19, i12);
                        }
                        iU = CodedOutputStream.U(iR);
                        iW = CodedOutputStream.W(i12);
                        i16 = i20 + iU + iW + i12;
                        break;
                    }
                    i16 = i20;
                    break;
                case 49:
                    i11 = h0.j(iR, (List) unsafe.getObject(t12, jS), t11.t(i14));
                    i16 = i20 + i11;
                    break;
                case 50:
                    i11 = t11.f54201q.g(iR, unsafe.getObject(t12, jS), t11.s(i14));
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
                        i11 = CodedOutputStream.X(iR, X(t12, jS));
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
                        i11 = object2 instanceof AbstractC5941g ? CodedOutputStream.g(iR, (AbstractC5941g) object2) : CodedOutputStream.S(iR, (String) object2);
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
                        i11 = CodedOutputStream.g(iR, (AbstractC5941g) unsafe.getObject(t12, jS));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 62:
                    if (t11.E(t12, iR, i14)) {
                        i11 = CodedOutputStream.V(iR, W(t12, jS));
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
                        i11 = CodedOutputStream.K(iR, 0);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 65:
                    if (t11.E(t12, iR, i14)) {
                        i11 = CodedOutputStream.M(iR, 0L);
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 66:
                    if (t11.E(t12, iR, i14)) {
                        i11 = CodedOutputStream.O(iR, W(t12, jS));
                        i16 = i20 + i11;
                        break;
                    }
                    i16 = i20;
                    break;
                case 67:
                    if (t11.E(t12, iR, i14)) {
                        i11 = CodedOutputStream.Q(iR, X(t12, jS));
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
        int iU2 = i16 + t11.u(t11.f54199o, t12);
        return t11.f54190f ? iU2 + t11.f54200p.c(t12).l() : iU2;
    }

    private T(int[] iArr, Object[] objArr, int i10, int i11, P p10, a0 a0Var, boolean z10, int[] iArr2, int i12, int i13, V v10, D d10, l0<?, ?> l0Var, AbstractC5949o<?> abstractC5949o, K k10) {
        boolean z11;
        this.f54185a = iArr;
        this.f54186b = objArr;
        this.f54187c = i10;
        this.f54188d = i11;
        this.f54191g = p10 instanceof AbstractC5956w;
        this.f54192h = a0Var;
        if (abstractC5949o != null && abstractC5949o.e(p10)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f54190f = z11;
        this.f54193i = z10;
        this.f54194j = iArr2;
        this.f54195k = i12;
        this.f54196l = i13;
        this.f54197m = v10;
        this.f54198n = d10;
        this.f54199o = l0Var;
        this.f54200p = abstractC5949o;
        this.f54189e = p10;
        this.f54201q = k10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean A(Object obj, int i10, int i11) {
        List list = (List) o0.z(obj, S(i10));
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
        if (o0.w(t10, jZ) == o0.w(t11, jZ)) {
            return true;
        }
        return false;
    }

    private boolean E(T t10, int i10, int i11) {
        if (o0.w(t10, Z(i11) & 1048575) == i10) {
            return true;
        }
        return false;
    }

    private static <T> long G(T t10, long j10) {
        return o0.x(t10, j10);
    }

    private final <K, V> void I(Object obj, int i10, Object obj2, C5948n c5948n, e0 e0Var) throws IOException {
        long jS = S(l0(i10));
        Object objZ = o0.z(obj, jS);
        if (objZ == null) {
            objZ = this.f54201q.d(obj2);
            o0.O(obj, jS, objZ);
        } else if (this.f54201q.h(objZ)) {
            Object objD = this.f54201q.d(obj2);
            this.f54201q.a(objD, objZ);
            o0.O(obj, jS, objD);
            objZ = objD;
        }
        e0Var.N(this.f54201q.c(objZ), this.f54201q.b(obj2), c5948n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void J(T t10, T t11, int i10) {
        if (!x(t11, i10)) {
            return;
        }
        long jS = S(l0(i10));
        Unsafe unsafe = f54184s;
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
        Unsafe unsafe = f54184s;
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
                    o0.K(t10, jS, o0.u(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 1:
                if (x(t11, i10)) {
                    o0.L(t10, jS, o0.v(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 2:
                if (x(t11, i10)) {
                    o0.N(t10, jS, o0.x(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 3:
                if (x(t11, i10)) {
                    o0.N(t10, jS, o0.x(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 4:
                if (x(t11, i10)) {
                    o0.M(t10, jS, o0.w(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 5:
                if (x(t11, i10)) {
                    o0.N(t10, jS, o0.x(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 6:
                if (x(t11, i10)) {
                    o0.M(t10, jS, o0.w(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 7:
                if (x(t11, i10)) {
                    o0.E(t10, jS, o0.p(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 8:
                if (x(t11, i10)) {
                    o0.O(t10, jS, o0.z(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 9:
                J(t10, t11, i10);
                break;
            case 10:
                if (x(t11, i10)) {
                    o0.O(t10, jS, o0.z(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 11:
                if (x(t11, i10)) {
                    o0.M(t10, jS, o0.w(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 12:
                if (x(t11, i10)) {
                    o0.M(t10, jS, o0.w(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 13:
                if (x(t11, i10)) {
                    o0.M(t10, jS, o0.w(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 14:
                if (x(t11, i10)) {
                    o0.N(t10, jS, o0.x(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 15:
                if (x(t11, i10)) {
                    o0.M(t10, jS, o0.w(t11, jS));
                    f0(t10, i10);
                    break;
                }
                break;
            case 16:
                if (x(t11, i10)) {
                    o0.N(t10, jS, o0.x(t11, jS));
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
            case l3.f92486e /* 32 */:
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
                this.f54198n.b(t10, t11, jS);
                break;
            case 50:
                h0.F(this.f54201q, t10, t11, jS);
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
                    o0.O(t10, jS, o0.z(t11, jS));
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
                    o0.O(t10, jS, o0.z(t11, jS));
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
        Object object = f54184s.getObject(t10, jS);
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
        Object object = f54184s.getObject(t10, S(l0(i11)));
        if (C(object)) {
            return object;
        }
        Object objD = f0VarT.d();
        if (object != null) {
            f0VarT.a(objD, object);
        }
        return objD;
    }

    static <T> T<T> P(j0 j0Var, V v10, D d10, l0<?, ?> l0Var, AbstractC5949o<?> abstractC5949o, K k10) {
        r[] rVarArrE = j0Var.e();
        if (rVarArrE.length == 0) {
            int length = rVarArrE.length;
            int[] iArr = new int[length * 3];
            Object[] objArr = new Object[length * 2];
            if (rVarArrE.length <= 0) {
                int[] iArrD = j0Var.d();
                if (iArrD == null) {
                    iArrD = f54183r;
                }
                if (rVarArrE.length <= 0) {
                    int[] iArr2 = f54183r;
                    int[] iArr3 = f54183r;
                    int[] iArr4 = new int[iArrD.length + iArr2.length + iArr3.length];
                    System.arraycopy(iArrD, 0, iArr4, 0, iArrD.length);
                    System.arraycopy(iArr2, 0, iArr4, iArrD.length, iArr2.length);
                    System.arraycopy(iArr3, 0, iArr4, iArrD.length + iArr2.length, iArr3.length);
                    return new T<>(iArr, objArr, 0, 0, j0Var.b(), j0Var.c(), true, iArr4, iArrD.length, iArrD.length + iArr2.length, v10, d10, l0Var, abstractC5949o, k10);
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

    private static <T> boolean T(T t10, long j10) {
        return ((Boolean) o0.z(t10, j10)).booleanValue();
    }

    private static <T> double U(T t10, long j10) {
        return ((Double) o0.z(t10, j10)).doubleValue();
    }

    private static <T> float V(T t10, long j10) {
        return ((Float) o0.z(t10, j10)).floatValue();
    }

    private static <T> int W(T t10, long j10) {
        return ((Integer) o0.z(t10, j10)).intValue();
    }

    private static <T> long X(T t10, long j10) {
        return ((Long) o0.z(t10, j10)).longValue();
    }

    private <E> void b0(Object obj, int i10, e0 e0Var, f0<E> f0Var, C5948n c5948n) throws IOException {
        e0Var.K(this.f54198n.c(obj, S(i10)), f0Var, c5948n);
    }

    private void c0(Object obj, int i10, e0 e0Var) throws IOException {
        if (w(i10)) {
            o0.O(obj, S(i10), e0Var.I());
        } else if (this.f54191g) {
            o0.O(obj, S(i10), e0Var.z());
        } else {
            o0.O(obj, S(i10), e0Var.o());
        }
    }

    private void d0(Object obj, int i10, e0 e0Var) throws IOException {
        if (w(i10)) {
            e0Var.n(this.f54198n.c(obj, S(i10)));
        } else {
            e0Var.B(this.f54198n.c(obj, S(i10)));
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
        o0.M(t10, j10, (1 << (iZ >>> 20)) | o0.w(t10, j10));
    }

    private void g0(T t10, int i10, int i11) {
        o0.M(t10, Z(i11) & 1048575, i10);
    }

    private boolean j(T t10, T t11, int i10) {
        if (x(t10, i10) == x(t11, i10)) {
            return true;
        }
        return false;
    }

    private static <T> boolean k(T t10, long j10) {
        return o0.p(t10, j10);
    }

    private static void l(Object obj) {
        if (C(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    private static <T> double m(T t10, long j10) {
        return o0.u(t10, j10);
    }

    private boolean n(T t10, T t11, int i10) {
        int iL0 = l0(i10);
        long jS = S(iL0);
        switch (k0(iL0)) {
            case 0:
                if (!j(t10, t11, i10) || Double.doubleToLongBits(o0.u(t10, jS)) != Double.doubleToLongBits(o0.u(t11, jS))) {
                }
                break;
            case 1:
                if (!j(t10, t11, i10) || Float.floatToIntBits(o0.v(t10, jS)) != Float.floatToIntBits(o0.v(t11, jS))) {
                }
                break;
            case 2:
                if (!j(t10, t11, i10) || o0.x(t10, jS) != o0.x(t11, jS)) {
                }
                break;
            case 3:
                if (!j(t10, t11, i10) || o0.x(t10, jS) != o0.x(t11, jS)) {
                }
                break;
            case 4:
                if (!j(t10, t11, i10) || o0.w(t10, jS) != o0.w(t11, jS)) {
                }
                break;
            case 5:
                if (!j(t10, t11, i10) || o0.x(t10, jS) != o0.x(t11, jS)) {
                }
                break;
            case 6:
                if (!j(t10, t11, i10) || o0.w(t10, jS) != o0.w(t11, jS)) {
                }
                break;
            case 7:
                if (!j(t10, t11, i10) || o0.p(t10, jS) != o0.p(t11, jS)) {
                }
                break;
            case 8:
                if (!j(t10, t11, i10) || !h0.I(o0.z(t10, jS), o0.z(t11, jS))) {
                }
                break;
            case 9:
                if (!j(t10, t11, i10) || !h0.I(o0.z(t10, jS), o0.z(t11, jS))) {
                }
                break;
            case 10:
                if (!j(t10, t11, i10) || !h0.I(o0.z(t10, jS), o0.z(t11, jS))) {
                }
                break;
            case 11:
                if (!j(t10, t11, i10) || o0.w(t10, jS) != o0.w(t11, jS)) {
                }
                break;
            case 12:
                if (!j(t10, t11, i10) || o0.w(t10, jS) != o0.w(t11, jS)) {
                }
                break;
            case 13:
                if (!j(t10, t11, i10) || o0.w(t10, jS) != o0.w(t11, jS)) {
                }
                break;
            case 14:
                if (!j(t10, t11, i10) || o0.x(t10, jS) != o0.x(t11, jS)) {
                }
                break;
            case 15:
                if (!j(t10, t11, i10) || o0.w(t10, jS) != o0.w(t11, jS)) {
                }
                break;
            case 16:
                if (!j(t10, t11, i10) || o0.x(t10, jS) != o0.x(t11, jS)) {
                }
                break;
            case 17:
                if (!j(t10, t11, i10) || !h0.I(o0.z(t10, jS), o0.z(t11, jS))) {
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
                if (!D(t10, t11, i10) || !h0.I(o0.z(t10, jS), o0.z(t11, jS))) {
                }
                break;
        }
        return true;
    }

    private <UT, UB> UB o(Object obj, int i10, UB ub2, l0<UT, UB> l0Var, Object obj2) {
        C5958y.e eVarR;
        int iR = R(i10);
        Object objZ = o0.z(obj, S(l0(i10)));
        if (objZ == null || (eVarR = r(i10)) == null) {
            return ub2;
        }
        return (UB) p(i10, iR, this.f54201q.c(objZ), eVarR, ub2, l0Var, obj2);
    }

    private static <T> float q(T t10, long j10) {
        return o0.v(t10, j10);
    }

    private <UT, UB> void q0(l0<UT, UB> l0Var, T t10, r0 r0Var) throws IOException {
        l0Var.t(l0Var.g(t10), r0Var);
    }

    private <UT, UB> int u(l0<UT, UB> l0Var, T t10) {
        return l0Var.h(l0Var.g(t10));
    }

    private static <T> int v(T t10, long j10) {
        return o0.w(t10, j10);
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
                    if (Double.doubleToRawLongBits(o0.u(t10, jS)) == 0) {
                        return false;
                    }
                    return true;
                case 1:
                    if (Float.floatToRawIntBits(o0.v(t10, jS)) == 0) {
                        return false;
                    }
                    return true;
                case 2:
                    if (o0.x(t10, jS) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (o0.x(t10, jS) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (o0.w(t10, jS) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (o0.x(t10, jS) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (o0.w(t10, jS) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return o0.p(t10, jS);
                case 8:
                    Object objZ = o0.z(t10, jS);
                    if (objZ instanceof String) {
                        zEquals = ((String) objZ).isEmpty();
                        break;
                    } else if (objZ instanceof AbstractC5941g) {
                        zEquals = AbstractC5941g.f54232b.equals(objZ);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (o0.z(t10, jS) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    zEquals = AbstractC5941g.f54232b.equals(o0.z(t10, jS));
                    break;
                case 11:
                    if (o0.w(t10, jS) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (o0.w(t10, jS) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (o0.w(t10, jS) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (o0.x(t10, jS) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (o0.w(t10, jS) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (o0.x(t10, jS) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (o0.z(t10, jS) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
            return !zEquals;
        }
        if ((o0.w(t10, j10) & (1 << (iZ >>> 20))) == 0) {
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
        return f0Var.f(o0.z(obj, S(i10)));
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void a(T t10, T t11) {
        l(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.f54185a.length; i10 += 3) {
            L(t10, t11, i10);
        }
        h0.G(this.f54199o, t10, t11);
        if (this.f54190f) {
            h0.E(this.f54200p, t10, t11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    @Override // androidx.datastore.preferences.protobuf.f0
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
            boolean r0 = r8 instanceof androidx.datastore.preferences.protobuf.AbstractC5956w
            if (r0 == 0) goto L18
            r0 = r8
            androidx.datastore.preferences.protobuf.w r0 = (androidx.datastore.preferences.protobuf.AbstractC5956w) r0
            r0.t()
            r0.s()
            r0.J()
        L18:
            int[] r0 = r7.f54185a
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
            sun.misc.Unsafe r2 = androidx.datastore.preferences.protobuf.T.f54184s
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L7d
            androidx.datastore.preferences.protobuf.K r6 = r7.f54201q
            java.lang.Object r5 = r6.f(r5)
            r2.putObject(r8, r3, r5)
            goto L7d
        L4c:
            androidx.datastore.preferences.protobuf.D r2 = r7.f54198n
            r2.a(r8, r3)
            goto L7d
        L52:
            int r2 = r7.R(r1)
            boolean r2 = r7.E(r8, r2, r1)
            if (r2 == 0) goto L7d
            androidx.datastore.preferences.protobuf.f0 r2 = r7.t(r1)
            sun.misc.Unsafe r5 = androidx.datastore.preferences.protobuf.T.f54184s
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.e(r3)
            goto L7d
        L6a:
            boolean r2 = r7.x(r8, r1)
            if (r2 == 0) goto L7d
            androidx.datastore.preferences.protobuf.f0 r2 = r7.t(r1)
            sun.misc.Unsafe r5 = androidx.datastore.preferences.protobuf.T.f54184s
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.e(r3)
        L7d:
            int r1 = r1 + 3
            goto L1c
        L80:
            androidx.datastore.preferences.protobuf.l0<?, ?> r0 = r7.f54199o
            r0.j(r8)
            boolean r0 = r7.f54190f
            if (r0 == 0) goto L8e
            androidx.datastore.preferences.protobuf.o<?> r0 = r7.f54200p
            r0.f(r8)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.e(java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    @Override // androidx.datastore.preferences.protobuf.f0
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
            int r5 = r14.f54195k
            r6 = 1
            if (r2 >= r5) goto L9b
            int[] r5 = r14.f54194j
            r9 = r5[r2]
            int r5 = r14.R(r9)
            int r13 = r14.l0(r9)
            int[] r7 = r14.f54185a
            int r8 = r9 + 2
            r7 = r7[r8]
            r8 = r7 & r0
            int r7 = r7 >>> 20
            int r12 = r6 << r7
            if (r8 == r3) goto L32
            if (r8 == r0) goto L2f
            sun.misc.Unsafe r3 = androidx.datastore.preferences.protobuf.T.f54184s
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
            androidx.datastore.preferences.protobuf.f0 r15 = r14.t(r9)
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
            androidx.datastore.preferences.protobuf.f0 r15 = r14.t(r9)
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
            boolean r15 = r7.f54190f
            if (r15 == 0) goto Lae
            androidx.datastore.preferences.protobuf.o<?> r15 = r7.f54200p
            androidx.datastore.preferences.protobuf.s r15 = r15.c(r8)
            boolean r15 = r15.p()
            if (r15 != 0) goto Lae
            return r1
        Lae:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.T.f(java.lang.Object):boolean");
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void h(T t10, e0 e0Var, C5948n c5948n) throws IOException {
        c5948n.getClass();
        l(t10);
        H(this.f54199o, this.f54200p, t10, e0Var, c5948n);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void i(T t10, r0 r0Var) throws IOException {
        if (r0Var.t() == r0.a.DESCENDING) {
            n0(t10, r0Var);
        } else {
            m0(t10, r0Var);
        }
    }
}
