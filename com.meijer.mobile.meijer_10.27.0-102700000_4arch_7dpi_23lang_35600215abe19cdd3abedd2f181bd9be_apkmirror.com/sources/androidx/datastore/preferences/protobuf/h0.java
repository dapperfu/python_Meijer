package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5952s;
import androidx.datastore.preferences.protobuf.C5958y;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
final class h0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class<?> f54267a = B();

    /* renamed from: b, reason: collision with root package name */
    private static final l0<?, ?> f54268b = C();

    /* renamed from: c, reason: collision with root package name */
    private static final l0<?, ?> f54269c = new n0();

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

    static <UT, UB> UB A(Object obj, int i10, List<Integer> list, C5958y.e eVar, UB ub2, l0<UT, UB> l0Var) {
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
        if (b0.f54215d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        if (b0.f54215d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void H(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC5956w.class.isAssignableFrom(cls) && !b0.f54215d && (cls2 = f54267a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
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
        return f54268b;
    }

    public static l0<?, ?> L() {
        return f54269c;
    }

    public static void M(int i10, List<Boolean> list, r0 r0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.A(i10, list, z10);
    }

    public static void N(int i10, List<AbstractC5941g> list, r0 r0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.I(i10, list);
    }

    public static void O(int i10, List<Double> list, r0 r0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.G(i10, list, z10);
    }

    public static void P(int i10, List<Integer> list, r0 r0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.n(i10, list, z10);
    }

    public static void Q(int i10, List<Integer> list, r0 r0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.j(i10, list, z10);
    }

    public static void R(int i10, List<Long> list, r0 r0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.y(i10, list, z10);
    }

    public static void S(int i10, List<Float> list, r0 r0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.a(i10, list, z10);
    }

    public static void T(int i10, List<?> list, r0 r0Var, f0 f0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.J(i10, list, f0Var);
    }

    public static void U(int i10, List<Integer> list, r0 r0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.g(i10, list, z10);
    }

    public static void V(int i10, List<Long> list, r0 r0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.F(i10, list, z10);
    }

    public static void W(int i10, List<?> list, r0 r0Var, f0 f0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.O(i10, list, f0Var);
    }

    public static void X(int i10, List<Integer> list, r0 r0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.z(i10, list, z10);
    }

    public static void Y(int i10, List<Long> list, r0 r0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.q(i10, list, z10);
    }

    public static void Z(int i10, List<Integer> list, r0 r0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.D(i10, list, z10);
    }

    public static void a0(int i10, List<Long> list, r0 r0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.l(i10, list, z10);
    }

    public static void b0(int i10, List<String> list, r0 r0Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.d(i10, list);
    }

    public static void c0(int i10, List<Integer> list, r0 r0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.k(i10, list, z10);
    }

    public static void d0(int i10, List<Long> list, r0 r0Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.r(i10, list, z10);
    }

    static int o(int i10, Object obj, f0 f0Var) {
        return obj instanceof B ? CodedOutputStream.A(i10, (B) obj) : CodedOutputStream.F(i10, (P) obj, f0Var);
    }

    static <UT, UB> UB z(Object obj, int i10, List<Integer> list, C5958y.d<?> dVar, UB ub2, l0<UT, UB> l0Var) {
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

    static <T, FT extends C5952s.b<FT>> void E(AbstractC5949o<FT> abstractC5949o, T t10, T t11) {
        C5952s<T> c5952sC = abstractC5949o.c(t11);
        if (!c5952sC.n()) {
            abstractC5949o.d(t10).v(c5952sC);
        }
    }

    static <T> void F(K k10, T t10, T t11, long j10) {
        o0.O(t10, j10, k10.a(o0.z(t10, j10), o0.z(t11, j10)));
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
            return CodedOutputStream.U(i10) + CodedOutputStream.C(size);
        }
        return size * CodedOutputStream.d(i10, true);
    }

    static int b(List<?> list) {
        return list.size();
    }

    static int c(int i10, List<AbstractC5941g> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = size * CodedOutputStream.U(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iU += CodedOutputStream.h(list.get(i11));
        }
        return iU;
    }

    static int d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(iE);
        }
        return iE + (size * CodedOutputStream.U(i10));
    }

    static int e(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5957x) {
            C5957x c5957x = (C5957x) list;
            int iL = 0;
            while (i10 < size) {
                iL += CodedOutputStream.l(c5957x.getInt(i10));
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
            return CodedOutputStream.U(i10) + CodedOutputStream.C(size * 4);
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
            return CodedOutputStream.U(i10) + CodedOutputStream.C(size * 8);
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
            return CodedOutputStream.U(i10) + CodedOutputStream.C(iL);
        }
        return iL + (size * CodedOutputStream.U(i10));
    }

    static int l(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5957x) {
            C5957x c5957x = (C5957x) list;
            int iW = 0;
            while (i10 < size) {
                iW += CodedOutputStream.w(c5957x.getInt(i10));
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
            return CodedOutputStream.U(i10) + CodedOutputStream.C(iN);
        }
        return iN + (list.size() * CodedOutputStream.U(i10));
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
        int iU = CodedOutputStream.U(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof B) {
                iH = CodedOutputStream.B((B) obj);
            } else {
                iH = CodedOutputStream.H((P) obj, f0Var);
            }
            iU += iH;
        }
        return iU;
    }

    static int q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(iR);
        }
        return iR + (size * CodedOutputStream.U(i10));
    }

    static int r(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5957x) {
            C5957x c5957x = (C5957x) list;
            int iP = 0;
            while (i10 < size) {
                iP += CodedOutputStream.P(c5957x.getInt(i10));
                i10++;
            }
            return iP;
        }
        int iP2 = 0;
        while (i10 < size) {
            iP2 += CodedOutputStream.P(list.get(i10).intValue());
            i10++;
        }
        return iP2;
    }

    static int s(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(iT);
        }
        return iT + (size * CodedOutputStream.U(i10));
    }

    static int t(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            G g10 = (G) list;
            int iR = 0;
            while (i10 < size) {
                iR += CodedOutputStream.R(g10.n(i10));
                i10++;
            }
            return iR;
        }
        int iR2 = 0;
        while (i10 < size) {
            iR2 += CodedOutputStream.R(list.get(i10).longValue());
            i10++;
        }
        return iR2;
    }

    static int u(int i10, List<?> list) {
        int iT;
        int iT2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iU = CodedOutputStream.U(i10) * size;
        if (list instanceof C) {
            C c10 = (C) list;
            while (i11 < size) {
                Object objC = c10.c(i11);
                if (objC instanceof AbstractC5941g) {
                    iT2 = CodedOutputStream.h((AbstractC5941g) objC);
                } else {
                    iT2 = CodedOutputStream.T((String) objC);
                }
                iU += iT2;
                i11++;
            }
            return iU;
        }
        while (i11 < size) {
            Object obj = list.get(i11);
            if (obj instanceof AbstractC5941g) {
                iT = CodedOutputStream.h((AbstractC5941g) obj);
            } else {
                iT = CodedOutputStream.T((String) obj);
            }
            iU += iT;
            i11++;
        }
        return iU;
    }

    static int v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(iW);
        }
        return iW + (size * CodedOutputStream.U(i10));
    }

    static int w(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C5957x) {
            C5957x c5957x = (C5957x) list;
            int iW = 0;
            while (i10 < size) {
                iW += CodedOutputStream.W(c5957x.getInt(i10));
                i10++;
            }
            return iW;
        }
        int iW2 = 0;
        while (i10 < size) {
            iW2 += CodedOutputStream.W(list.get(i10).intValue());
            i10++;
        }
        return iW2;
    }

    static int x(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        if (z10) {
            return CodedOutputStream.U(i10) + CodedOutputStream.C(iY);
        }
        return iY + (size * CodedOutputStream.U(i10));
    }

    static int y(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof G) {
            G g10 = (G) list;
            int iY = 0;
            while (i10 < size) {
                iY += CodedOutputStream.Y(g10.n(i10));
                i10++;
            }
            return iY;
        }
        int iY2 = 0;
        while (i10 < size) {
            iY2 += CodedOutputStream.Y(list.get(i10).longValue());
            i10++;
        }
        return iY2;
    }
}
