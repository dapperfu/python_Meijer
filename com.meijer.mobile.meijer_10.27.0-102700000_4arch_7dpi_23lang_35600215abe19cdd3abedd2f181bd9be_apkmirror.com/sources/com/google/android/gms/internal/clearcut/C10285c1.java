package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.c1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10285c1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f81399a = C();

    /* renamed from: b, reason: collision with root package name */
    private static final AbstractC10329r1<?, ?> f81400b = w(false);

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC10329r1<?, ?> f81401c = w(true);

    /* renamed from: d, reason: collision with root package name */
    private static final AbstractC10329r1<?, ?> f81402d = new C10335t1();

    public static AbstractC10329r1<?, ?> A() {
        return f81401c;
    }

    public static AbstractC10329r1<?, ?> B() {
        return f81402d;
    }

    private static Class<?> C() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
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

    static int E(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C10296g0)) {
            int iC0 = 0;
            while (i10 < size) {
                iC0 += zzbn.C0(list.get(i10).intValue());
                i10++;
            }
            return iC0;
        }
        C10296g0 c10296g0 = (C10296g0) list;
        int iC02 = 0;
        while (i10 < size) {
            iC02 += zzbn.C0(c10296g0.getInt(i10));
            i10++;
        }
        return iC02;
    }

    public static void F(int i10, List<Long> list, M1 m12, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m12.zzn(i10, list, z10);
    }

    static int G(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C10296g0)) {
            int iD0 = 0;
            while (i10 < size) {
                iD0 += zzbn.D0(list.get(i10).intValue());
                i10++;
            }
            return iD0;
        }
        C10296g0 c10296g0 = (C10296g0) list;
        int iD02 = 0;
        while (i10 < size) {
            iD02 += zzbn.D0(c10296g0.getInt(i10));
            i10++;
        }
        return iD02;
    }

    public static void H(int i10, List<Long> list, M1 m12, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m12.v(i10, list, z10);
    }

    public static void I(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC10293f0.class.isAssignableFrom(cls) && (cls2 = f81399a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static int J(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C10296g0)) {
            int iE0 = 0;
            while (i10 < size) {
                iE0 += zzbn.E0(list.get(i10).intValue());
                i10++;
            }
            return iE0;
        }
        C10296g0 c10296g0 = (C10296g0) list;
        int iE02 = 0;
        while (i10 < size) {
            iE02 += zzbn.E0(c10296g0.getInt(i10));
            i10++;
        }
        return iE02;
    }

    public static void K(int i10, List<Long> list, M1 m12, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m12.zzl(i10, list, z10);
    }

    static int L(List<?> list) {
        return list.size() << 2;
    }

    public static void M(int i10, List<Integer> list, M1 m12, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m12.f(i10, list, z10);
    }

    static int N(List<?> list) {
        return list.size() << 3;
    }

    public static void O(int i10, List<Integer> list, M1 m12, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m12.zzj(i10, list, z10);
    }

    static int P(List<?> list) {
        return list.size();
    }

    public static void Q(int i10, List<Integer> list, M1 m12, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m12.a(i10, list, z10);
    }

    public static void R(int i10, List<Integer> list, M1 m12, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m12.i(i10, list, z10);
    }

    public static void S(int i10, List<Integer> list, M1 m12, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m12.d(i10, list, z10);
    }

    public static void T(int i10, List<Integer> list, M1 m12, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m12.u(i10, list, z10);
    }

    public static void U(int i10, List<Boolean> list, M1 m12, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m12.b(i10, list, z10);
    }

    static int V(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return a(list) + (list.size() * zzbn.B0(i10));
    }

    static int W(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return j(list) + (size * zzbn.B0(i10));
    }

    static int X(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return q(list) + (size * zzbn.B0(i10));
    }

    static int Y(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return v(list) + (size * zzbn.B0(i10));
    }

    static int Z(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return E(list) + (size * zzbn.B0(i10));
    }

    static int a(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C10346x0)) {
            int iE0 = 0;
            while (i10 < size) {
                iE0 += zzbn.e0(list.get(i10).longValue());
                i10++;
            }
            return iE0;
        }
        C10346x0 c10346x0 = (C10346x0) list;
        int iE02 = 0;
        while (i10 < size) {
            iE02 += zzbn.e0(c10346x0.e(i10));
            i10++;
        }
        return iE02;
    }

    static int a0(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return G(list) + (size * zzbn.B0(i10));
    }

    private static <UT, UB> UB b(int i10, int i11, UB ub2, AbstractC10329r1<UT, UB> abstractC10329r1) {
        if (ub2 == null) {
            ub2 = abstractC10329r1.f();
        }
        abstractC10329r1.a(ub2, i10, i11);
        return ub2;
    }

    static int b0(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return J(list) + (size * zzbn.B0(i10));
    }

    static <UT, UB> UB c(int i10, List<Integer> list, InterfaceC10305j0<?> interfaceC10305j0, UB ub2, AbstractC10329r1<UT, UB> abstractC10329r1) {
        if (interfaceC10305j0 == null) {
            return ub2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (interfaceC10305j0.zzb(iIntValue) == null) {
                    ub2 = (UB) b(i10, iIntValue, ub2, abstractC10329r1);
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
            if (interfaceC10305j0.zzb(iIntValue2) != null) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                ub2 = (UB) b(i10, iIntValue2, ub2, abstractC10329r1);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return ub2;
    }

    static int c0(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbn.t0(i10, 0);
    }

    public static void d(int i10, List<String> list, M1 m12) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m12.t(i10, list);
    }

    static int d0(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbn.k0(i10, 0L);
    }

    public static void e(int i10, List<?> list, M1 m12, InterfaceC10279a1 interfaceC10279a1) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m12.z(i10, list, interfaceC10279a1);
    }

    static int e0(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbn.Q(i10, true);
    }

    public static void f(int i10, List<Double> list, M1 m12, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m12.zzg(i10, list, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <T, FT extends Z<FT>> void g(S<FT> s10, T t10, T t11) {
        W<T> wB = s10.b(t11);
        if (wB.b()) {
            return;
        }
        s10.e(t10).h(wB);
    }

    static <T> void h(E0 e02, T t10, T t11, long j10) {
        C10350y1.i(t10, j10, e02.zzb(C10350y1.M(t10, j10), C10350y1.M(t11, j10)));
    }

    static <T, UT, UB> void i(AbstractC10329r1<UT, UB> abstractC10329r1, T t10, T t11) {
        abstractC10329r1.g(t10, abstractC10329r1.i(abstractC10329r1.k(t10), abstractC10329r1.k(t11)));
    }

    static int j(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C10346x0)) {
            int iH0 = 0;
            while (i10 < size) {
                iH0 += zzbn.h0(list.get(i10).longValue());
                i10++;
            }
            return iH0;
        }
        C10346x0 c10346x0 = (C10346x0) list;
        int iH02 = 0;
        while (i10 < size) {
            iH02 += zzbn.h0(c10346x0.e(i10));
            i10++;
        }
        return iH02;
    }

    public static void k(int i10, List<A> list, M1 m12) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m12.q(i10, list);
    }

    public static void l(int i10, List<?> list, M1 m12, InterfaceC10279a1 interfaceC10279a1) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m12.y(i10, list, interfaceC10279a1);
    }

    public static void m(int i10, List<Float> list, M1 m12, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m12.x(i10, list, z10);
    }

    static int n(int i10, Object obj, InterfaceC10279a1 interfaceC10279a1) {
        return obj instanceof C10326q0 ? zzbn.d(i10, (C10326q0) obj) : zzbn.B(i10, (J0) obj, interfaceC10279a1);
    }

    static int o(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iB0 = zzbn.B0(i10) * size;
        if (!(list instanceof InterfaceC10331s0)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                iB0 += obj instanceof A ? zzbn.D((A) obj) : zzbn.q0((String) obj);
                i11++;
            }
            return iB0;
        }
        InterfaceC10331s0 interfaceC10331s0 = (InterfaceC10331s0) list;
        while (i11 < size) {
            Object objC = interfaceC10331s0.c(i11);
            iB0 += objC instanceof A ? zzbn.D((A) objC) : zzbn.q0((String) objC);
            i11++;
        }
        return iB0;
    }

    static int p(int i10, List<?> list, InterfaceC10279a1 interfaceC10279a1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = zzbn.B0(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iB0 += obj instanceof C10326q0 ? zzbn.e((C10326q0) obj) : zzbn.E((J0) obj, interfaceC10279a1);
        }
        return iB0;
    }

    static int q(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C10346x0)) {
            int iL0 = 0;
            while (i10 < size) {
                iL0 += zzbn.l0(list.get(i10).longValue());
                i10++;
            }
            return iL0;
        }
        C10346x0 c10346x0 = (C10346x0) list;
        int iL02 = 0;
        while (i10 < size) {
            iL02 += zzbn.l0(c10346x0.e(i10));
            i10++;
        }
        return iL02;
    }

    public static void r(int i10, List<Long> list, M1 m12, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m12.zzc(i10, list, z10);
    }

    public static boolean s(int i10, int i11, int i12) {
        if (i11 < 40) {
            return true;
        }
        long j10 = i11 - i10;
        long j11 = i12;
        return j10 + 10 <= ((2 * j11) + 3) + ((j11 + 3) * 3);
    }

    static int t(int i10, List<A> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iB0 = size * zzbn.B0(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iB0 += zzbn.D(list.get(i11));
        }
        return iB0;
    }

    static int u(int i10, List<J0> list, InterfaceC10279a1 interfaceC10279a1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iP += zzbn.P(i10, list.get(i11), interfaceC10279a1);
        }
        return iP;
    }

    static int v(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C10296g0)) {
            int iH0 = 0;
            while (i10 < size) {
                iH0 += zzbn.H0(list.get(i10).intValue());
                i10++;
            }
            return iH0;
        }
        C10296g0 c10296g0 = (C10296g0) list;
        int iH02 = 0;
        while (i10 < size) {
            iH02 += zzbn.H0(c10296g0.getInt(i10));
            i10++;
        }
        return iH02;
    }

    private static AbstractC10329r1<?, ?> w(boolean z10) {
        try {
            Class<?> clsD = D();
            if (clsD == null) {
                return null;
            }
            return (AbstractC10329r1) clsD.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void x(int i10, List<Long> list, M1 m12, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        m12.w(i10, list, z10);
    }

    static boolean y(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static AbstractC10329r1<?, ?> z() {
        return f81400b;
    }
}
