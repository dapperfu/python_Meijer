package com.google.protobuf;

import com.google.protobuf.C11532s;
import com.google.protobuf.C11538y;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes7.dex */
final class h0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f90531a = B();

    /* renamed from: b, reason: collision with root package name */
    private static final l0<?, ?> f90532b = C();

    /* renamed from: c, reason: collision with root package name */
    private static final l0<?, ?> f90533c = new n0();

    private static l0<?, ?> C() {
        try {
            Class<?> clsD = D();
            if (clsD == null) {
                return null;
            }
            return (l0) clsD.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    static <UT, UB> UB A(Object obj, int i10, List<Integer> list, C11538y.e eVar, UB ub2, l0<UT, UB> l0Var) {
        if (eVar == null) {
            return ub2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!eVar.a(iIntValue)) {
                    ub2 = (UB) J(obj, i10, iIntValue, ub2, l0Var);
                    it.remove();
                }
            }
            return ub2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = list.get(i12);
            int iIntValue2 = num.intValue();
            if (eVar.a(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                ub2 = (UB) J(obj, i10, iIntValue2, ub2, l0Var);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return ub2;
    }

    private static Class<?> B() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void H(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC11536w.class.isAssignableFrom(cls) && (cls2 = f90531a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    static boolean I(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static <UT, UB> UB J(Object obj, int i10, int i11, UB ub2, l0<UT, UB> l0Var) {
        if (ub2 == null) {
            ub2 = l0Var.f(obj);
        }
        l0Var.e(ub2, i10, i11);
        return ub2;
    }

    public static l0<?, ?> K() {
        return f90532b;
    }

    public static l0<?, ?> L() {
        return f90533c;
    }

    public static void M(int i10, List<Boolean> list, s0 s0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.A(i10, list, z10);
    }

    public static void N(int i10, List<AbstractC11521g> list, s0 s0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.I(i10, list);
    }

    public static void O(int i10, List<Double> list, s0 s0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.G(i10, list, z10);
    }

    public static void P(int i10, List<Integer> list, s0 s0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.n(i10, list, z10);
    }

    public static void Q(int i10, List<Integer> list, s0 s0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.j(i10, list, z10);
    }

    public static void R(int i10, List<Long> list, s0 s0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.y(i10, list, z10);
    }

    public static void S(int i10, List<Float> list, s0 s0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.a(i10, list, z10);
    }

    public static void T(int i10, List<?> list, s0 s0Var, f0 f0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.M(i10, list, f0Var);
    }

    public static void U(int i10, List<Integer> list, s0 s0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.g(i10, list, z10);
    }

    public static void V(int i10, List<Long> list, s0 s0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.F(i10, list, z10);
    }

    public static void W(int i10, List<?> list, s0 s0Var, f0 f0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.J(i10, list, f0Var);
    }

    public static void X(int i10, List<Integer> list, s0 s0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.z(i10, list, z10);
    }

    public static void Y(int i10, List<Long> list, s0 s0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.q(i10, list, z10);
    }

    public static void Z(int i10, List<Integer> list, s0 s0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.D(i10, list, z10);
    }

    public static void a0(int i10, List<Long> list, s0 s0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.l(i10, list, z10);
    }

    public static void b0(int i10, List<String> list, s0 s0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.d(i10, list);
    }

    public static void c0(int i10, List<Integer> list, s0 s0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.k(i10, list, z10);
    }

    public static void d0(int i10, List<Long> list, s0 s0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        s0Var.r(i10, list, z10);
    }

    static int o(int i10, Object obj, f0 f0Var) {
        return obj instanceof C ? CodedOutputStream.A(i10, (C) obj) : CodedOutputStream.F(i10, (P) obj, f0Var);
    }

    static <UT, UB> UB z(Object obj, int i10, List<Integer> list, C11538y.d<?> dVar, UB ub2, l0<UT, UB> l0Var) {
        if (dVar == null) {
            return ub2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (dVar.a(iIntValue) == null) {
                    ub2 = (UB) J(obj, i10, iIntValue, ub2, l0Var);
                    it.remove();
                }
            }
            return ub2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = list.get(i12);
            int iIntValue2 = num.intValue();
            if (dVar.a(iIntValue2) != null) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                ub2 = (UB) J(obj, i10, iIntValue2, ub2, l0Var);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return ub2;
    }

    static <T, FT extends C11532s.b<FT>> void E(AbstractC11529o<FT> abstractC11529o, T t10, T t11) {
        C11532s<T> c11532sC = abstractC11529o.c(t11);
        if (!c11532sC.n()) {
            abstractC11529o.d(t10).v(c11532sC);
        }
    }

    static <T> void F(K k10, T t10, T t11, long j10) {
        p0.R(t10, j10, k10.a(p0.C(t10, j10), p0.C(t11, j10)));
    }

    static <T, UT, UB> void G(l0<UT, UB> l0Var, T t10, T t11) {
        l0Var.p(t10, l0Var.k(l0Var.g(t10), l0Var.g(t11)));
    }

    static int a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return CodedOutputStream.T(i10) + CodedOutputStream.C(size);
        }
        return size * CodedOutputStream.d(i10, true);
    }

    static int b(List<?> list) {
        return list.size();
    }

    static int c(int i10, List<AbstractC11521g> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = size * CodedOutputStream.T(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iT += CodedOutputStream.h(list.get(i11));
        }
        return iT;
    }

    static int d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        if (z10) {
            return CodedOutputStream.T(i10) + CodedOutputStream.C(iE);
        }
        return iE + (size * CodedOutputStream.T(i10));
    }

    static int e(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C11537x) {
            C11537x c11537x = (C11537x) list;
            int iL = 0;
            while (i10 < size) {
                iL += CodedOutputStream.l(c11537x.getInt(i10));
                i10++;
            }
            return iL;
        }
        int iL2 = 0;
        while (i10 < size) {
            iL2 += CodedOutputStream.l(list.get(i10).intValue());
            i10++;
        }
        return iL2;
    }

    static int f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return CodedOutputStream.T(i10) + CodedOutputStream.C(size * 4);
        }
        return size * CodedOutputStream.m(i10, 0);
    }

    static int g(List<?> list) {
        return list.size() * 4;
    }

    static int h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (z10) {
            return CodedOutputStream.T(i10) + CodedOutputStream.C(size * 8);
        }
        return size * CodedOutputStream.o(i10, 0L);
    }

    static int i(List<?> list) {
        return list.size() * 8;
    }

    static int j(int i10, List<P> list, f0 f0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iS += CodedOutputStream.s(i10, list.get(i11), f0Var);
        }
        return iS;
    }

    static int k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        if (z10) {
            return CodedOutputStream.T(i10) + CodedOutputStream.C(iL);
        }
        return iL + (size * CodedOutputStream.T(i10));
    }

    static int l(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C11537x) {
            C11537x c11537x = (C11537x) list;
            int iW = 0;
            while (i10 < size) {
                iW += CodedOutputStream.w(c11537x.getInt(i10));
                i10++;
            }
            return iW;
        }
        int iW2 = 0;
        while (i10 < size) {
            iW2 += CodedOutputStream.w(list.get(i10).intValue());
            i10++;
        }
        return iW2;
    }

    static int m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        if (z10) {
            return CodedOutputStream.T(i10) + CodedOutputStream.C(iN);
        }
        return iN + (list.size() * CodedOutputStream.T(i10));
    }

    static int n(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            G g10 = (G) list;
            int iY = 0;
            while (i10 < size) {
                iY += CodedOutputStream.y(g10.n(i10));
                i10++;
            }
            return iY;
        }
        int iY2 = 0;
        while (i10 < size) {
            iY2 += CodedOutputStream.y(list.get(i10).longValue());
            i10++;
        }
        return iY2;
    }

    static int p(int i10, List<?> list, f0 f0Var) {
        int iH;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = CodedOutputStream.T(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof C) {
                iH = CodedOutputStream.B((C) obj);
            } else {
                iH = CodedOutputStream.H((P) obj, f0Var);
            }
            iT += iH;
        }
        return iT;
    }

    static int q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        if (z10) {
            return CodedOutputStream.T(i10) + CodedOutputStream.C(iR);
        }
        return iR + (size * CodedOutputStream.T(i10));
    }

    static int r(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C11537x) {
            C11537x c11537x = (C11537x) list;
            int iO = 0;
            while (i10 < size) {
                iO += CodedOutputStream.O(c11537x.getInt(i10));
                i10++;
            }
            return iO;
        }
        int iO2 = 0;
        while (i10 < size) {
            iO2 += CodedOutputStream.O(list.get(i10).intValue());
            i10++;
        }
        return iO2;
    }

    static int s(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        if (z10) {
            return CodedOutputStream.T(i10) + CodedOutputStream.C(iT);
        }
        return iT + (size * CodedOutputStream.T(i10));
    }

    static int t(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            G g10 = (G) list;
            int iQ = 0;
            while (i10 < size) {
                iQ += CodedOutputStream.Q(g10.n(i10));
                i10++;
            }
            return iQ;
        }
        int iQ2 = 0;
        while (i10 < size) {
            iQ2 += CodedOutputStream.Q(list.get(i10).longValue());
            i10++;
        }
        return iQ2;
    }

    static int u(int i10, List<?> list) {
        int iS;
        int iS2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iT = CodedOutputStream.T(i10) * size;
        if (list instanceof E) {
            E e10 = (E) list;
            while (i11 < size) {
                Object objC = e10.c(i11);
                if (objC instanceof AbstractC11521g) {
                    iS2 = CodedOutputStream.h((AbstractC11521g) objC);
                } else {
                    iS2 = CodedOutputStream.S((String) objC);
                }
                iT += iS2;
                i11++;
            }
            return iT;
        }
        while (i11 < size) {
            Object obj = list.get(i11);
            if (obj instanceof AbstractC11521g) {
                iS = CodedOutputStream.h((AbstractC11521g) obj);
            } else {
                iS = CodedOutputStream.S((String) obj);
            }
            iT += iS;
            i11++;
        }
        return iT;
    }

    static int v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        if (z10) {
            return CodedOutputStream.T(i10) + CodedOutputStream.C(iW);
        }
        return iW + (size * CodedOutputStream.T(i10));
    }

    static int w(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C11537x) {
            C11537x c11537x = (C11537x) list;
            int iV = 0;
            while (i10 < size) {
                iV += CodedOutputStream.V(c11537x.getInt(i10));
                i10++;
            }
            return iV;
        }
        int iV2 = 0;
        while (i10 < size) {
            iV2 += CodedOutputStream.V(list.get(i10).intValue());
            i10++;
        }
        return iV2;
    }

    static int x(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        if (z10) {
            return CodedOutputStream.T(i10) + CodedOutputStream.C(iY);
        }
        return iY + (size * CodedOutputStream.T(i10));
    }

    static int y(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            G g10 = (G) list;
            int iX = 0;
            while (i10 < size) {
                iX += CodedOutputStream.X(g10.n(i10));
                i10++;
            }
            return iX;
        }
        int iX2 = 0;
        while (i10 < size) {
            iX2 += CodedOutputStream.X(list.get(i10).longValue());
            i10++;
        }
        return iX2;
    }
}
