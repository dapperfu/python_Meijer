package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class P1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f84441a = F();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC11030f2<?, ?> f84442b = g(false);

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC11030f2<?, ?> f84443c = g(true);

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC11030f2<?, ?> f84444d = new C11034g2();

    private static AbstractC11030f2<?, ?> g(boolean z10) {
        try {
            Class<?> clsJ = J();
            if (clsJ == null) {
                return null;
            }
            return (AbstractC11030f2) clsJ.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static AbstractC11030f2<?, ?> B() {
        return f84444d;
    }

    public static void C(int i10, List<Long> list, C2 c22, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c22.zzc(i10, list, z10);
    }

    private static Class<?> F() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void G(int i10, List<Long> list, C2 c22, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c22.w(i10, list, z10);
    }

    private static Class<?> J() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void K(int i10, List<Long> list, C2 c22, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c22.zzn(i10, list, z10);
    }

    public static void N(int i10, List<Long> list, C2 c22, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c22.v(i10, list, z10);
    }

    public static void Q(int i10, List<Long> list, C2 c22, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c22.zzl(i10, list, z10);
    }

    public static void T(int i10, List<Integer> list, C2 c22, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c22.f(i10, list, z10);
    }

    public static void W(int i10, List<Integer> list, C2 c22, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c22.zzj(i10, list, z10);
    }

    public static void Z(int i10, List<Integer> list, C2 c22, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c22.a(i10, list, z10);
    }

    static int a(int i10, Object obj, O1 o12) {
        return obj instanceof C11025e1 ? zzii.c(i10, (C11025e1) obj) : zzii.F(i10, (InterfaceC11083w1) obj, o12);
    }

    public static void a0(int i10, List<Integer> list, C2 c22, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c22.i(i10, list, z10);
    }

    public static void b0(int i10, List<Integer> list, C2 c22, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c22.d(i10, list, z10);
    }

    public static void c0(int i10, List<Integer> list, C2 c22, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c22.u(i10, list, z10);
    }

    public static void d0(int i10, List<Boolean> list, C2 c22, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c22.b(i10, list, z10);
    }

    public static AbstractC11030f2<?, ?> f() {
        return f84442b;
    }

    static <UT, UB> UB h(int i10, int i11, UB ub2, AbstractC11030f2<UT, UB> abstractC11030f2) {
        if (ub2 == null) {
            ub2 = abstractC11030f2.a();
        }
        abstractC11030f2.b(ub2, i10, i11);
        return ub2;
    }

    static <UT, UB> UB i(int i10, List<Integer> list, T0 t02, UB ub2, AbstractC11030f2<UT, UB> abstractC11030f2) {
        if (t02 == null) {
            return ub2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!t02.zza(iIntValue)) {
                    ub2 = (UB) h(i10, iIntValue, ub2, abstractC11030f2);
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
            if (t02.zza(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                ub2 = (UB) h(i10, iIntValue2, ub2, abstractC11030f2);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return ub2;
    }

    public static void j(int i10, List<String> list, C2 c22) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c22.t(i10, list);
    }

    public static void k(int i10, List<?> list, C2 c22, O1 o12) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c22.C(i10, list, o12);
    }

    public static void l(int i10, List<Double> list, C2 c22, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c22.zzg(i10, list, z10);
    }

    public static void p(Class<?> cls) {
        Class<?> cls2;
        if (!O0.class.isAssignableFrom(cls) && (cls2 = f84441a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean q(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static AbstractC11030f2<?, ?> v() {
        return f84443c;
    }

    public static void w(int i10, List<AbstractC11036h0> list, C2 c22) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c22.q(i10, list);
    }

    public static void x(int i10, List<?> list, C2 c22, O1 o12) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c22.z(i10, list, o12);
    }

    public static void y(int i10, List<Float> list, C2 c22, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        c22.x(i10, list, z10);
    }

    static int A(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C11045j1) {
            C11045j1 c11045j1 = (C11045j1) list;
            int iN0 = 0;
            while (i10 < size) {
                iN0 += zzii.n0(c11045j1.f(i10));
                i10++;
            }
            return iN0;
        }
        int iN02 = 0;
        while (i10 < size) {
            iN02 += zzii.n0(list.get(i10).longValue());
            i10++;
        }
        return iN02;
    }

    static int D(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * zzii.g0(i10));
    }

    static int E(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Q0) {
            Q0 q02 = (Q0) list;
            int iB0 = 0;
            while (i10 < size) {
                iB0 += zzii.B0(q02.e(i10));
                i10++;
            }
            return iB0;
        }
        int iB02 = 0;
        while (i10 < size) {
            iB02 += zzii.B0(list.get(i10).intValue());
            i10++;
        }
        return iB02;
    }

    static int H(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return I(list) + (size * zzii.g0(i10));
    }

    static int I(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Q0) {
            Q0 q02 = (Q0) list;
            int iK0 = 0;
            while (i10 < size) {
                iK0 += zzii.k0(q02.e(i10));
                i10++;
            }
            return iK0;
        }
        int iK02 = 0;
        while (i10 < size) {
            iK02 += zzii.k0(list.get(i10).intValue());
            i10++;
        }
        return iK02;
    }

    static int L(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return M(list) + (size * zzii.g0(i10));
    }

    static int M(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Q0) {
            Q0 q02 = (Q0) list;
            int iO0 = 0;
            while (i10 < size) {
                iO0 += zzii.o0(q02.e(i10));
                i10++;
            }
            return iO0;
        }
        int iO02 = 0;
        while (i10 < size) {
            iO02 += zzii.o0(list.get(i10).intValue());
            i10++;
        }
        return iO02;
    }

    static int O(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return P(list) + (size * zzii.g0(i10));
    }

    static int P(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Q0) {
            Q0 q02 = (Q0) list;
            int iS0 = 0;
            while (i10 < size) {
                iS0 += zzii.s0(q02.e(i10));
                i10++;
            }
            return iS0;
        }
        int iS02 = 0;
        while (i10 < size) {
            iS02 += zzii.s0(list.get(i10).intValue());
            i10++;
        }
        return iS02;
    }

    static int R(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzii.x0(i10, 0);
    }

    static int S(List<?> list) {
        return list.size() << 2;
    }

    static int U(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzii.q0(i10, 0L);
    }

    static int V(List<?> list) {
        return list.size() << 3;
    }

    static int X(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzii.H(i10, true);
    }

    static int Y(List<?> list) {
        return list.size();
    }

    static int b(int i10, List<?> list) {
        int iK;
        int iK2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iG0 = zzii.g0(i10) * size;
        if (list instanceof InterfaceC11033g1) {
            InterfaceC11033g1 interfaceC11033g1 = (InterfaceC11033g1) list;
            while (i11 < size) {
                Object objZzb = interfaceC11033g1.zzb(i11);
                if (objZzb instanceof AbstractC11036h0) {
                    iK2 = zzii.I((AbstractC11036h0) objZzb);
                } else {
                    iK2 = zzii.K((String) objZzb);
                }
                iG0 += iK2;
                i11++;
            }
            return iG0;
        }
        while (i11 < size) {
            Object obj = list.get(i11);
            if (obj instanceof AbstractC11036h0) {
                iK = zzii.I((AbstractC11036h0) obj);
            } else {
                iK = zzii.K((String) obj);
            }
            iG0 += iK;
            i11++;
        }
        return iG0;
    }

    static int c(int i10, List<?> list, O1 o12) {
        int iE;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iG0 = zzii.g0(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof C11025e1) {
                iE = zzii.d((C11025e1) obj);
            } else {
                iE = zzii.e((InterfaceC11083w1) obj, o12);
            }
            iG0 += iE;
        }
        return iG0;
    }

    static int d(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return e(list) + (list.size() * zzii.g0(i10));
    }

    static int e(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C11045j1) {
            C11045j1 c11045j1 = (C11045j1) list;
            int iD0 = 0;
            while (i10 < size) {
                iD0 += zzii.d0(c11045j1.f(i10));
                i10++;
            }
            return iD0;
        }
        int iD02 = 0;
        while (i10 < size) {
            iD02 += zzii.d0(list.get(i10).longValue());
            i10++;
        }
        return iD02;
    }

    static <T, FT extends I0<FT>> void m(C0<FT> c02, T t10, T t11) {
        G0<T> g0B = c02.b(t11);
        if (!g0B.f84300a.isEmpty()) {
            c02.f(t10).f(g0B);
        }
    }

    static <T> void n(InterfaceC11074t1 interfaceC11074t1, T t10, T t11, long j10) {
        l2.j(t10, j10, interfaceC11074t1.b(l2.F(t10, j10), l2.F(t11, j10)));
    }

    static <T, UT, UB> void o(AbstractC11030f2<UT, UB> abstractC11030f2, T t10, T t11) {
        abstractC11030f2.e(t10, abstractC11030f2.i(abstractC11030f2.f(t10), abstractC11030f2.f(t11)));
    }

    static int r(int i10, List<AbstractC11036h0> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iG0 = size * zzii.g0(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iG0 += zzii.I(list.get(i11));
        }
        return iG0;
    }

    static int s(int i10, List<InterfaceC11083w1> list, O1 o12) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iU += zzii.U(i10, list.get(i11), o12);
        }
        return iU;
    }

    static int t(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return u(list) + (size * zzii.g0(i10));
    }

    static int u(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C11045j1) {
            C11045j1 c11045j1 = (C11045j1) list;
            int iI0 = 0;
            while (i10 < size) {
                iI0 += zzii.i0(c11045j1.f(i10));
                i10++;
            }
            return iI0;
        }
        int iI02 = 0;
        while (i10 < size) {
            iI02 += zzii.i0(list.get(i10).longValue());
            i10++;
        }
        return iI02;
    }

    static int z(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return A(list) + (size * zzii.g0(i10));
    }
}
