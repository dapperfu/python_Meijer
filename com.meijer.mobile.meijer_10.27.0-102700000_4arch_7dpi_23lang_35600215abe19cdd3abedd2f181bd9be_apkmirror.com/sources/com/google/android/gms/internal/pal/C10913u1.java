package com.google.android.gms.internal.pal;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.pal.u1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10913u1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f84063a;

    /* renamed from: b, reason: collision with root package name */
    private static final J1 f84064b;

    /* renamed from: c, reason: collision with root package name */
    private static final J1 f84065c;

    /* renamed from: d, reason: collision with root package name */
    private static final J1 f84066d;

    private static J1 C(boolean z10) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (J1) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z10));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static J1 a() {
        return f84065c;
    }

    public static J1 b() {
        return f84066d;
    }

    public static J1 b0() {
        return f84064b;
    }

    static boolean z(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f84063a = cls;
        f84064b = C(false);
        f84065c = C(true);
        f84066d = new L1();
    }

    static int Q(int i10, Object obj, InterfaceC10881s1 interfaceC10881s1) {
        if (!(obj instanceof L0)) {
            return AbstractC10753k0.a(i10 << 3) + AbstractC10753k0.B((InterfaceC10690g1) obj, interfaceC10881s1);
        }
        int iA = AbstractC10753k0.a(i10 << 3);
        int iA2 = ((L0) obj).a();
        return iA + AbstractC10753k0.a(iA2) + iA2;
    }

    static Object c(int i10, List list, G0 g02, Object obj, J1 j12) {
        if (g02 == null) {
            return obj;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!g02.zza(iIntValue)) {
                    obj = d(i10, iIntValue, obj, j12);
                    it.remove();
                }
            }
            return obj;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) list.get(i12);
            int iIntValue2 = num.intValue();
            if (g02.zza(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj = d(i10, iIntValue2, obj, j12);
            }
        }
        if (i11 == size) {
            return obj;
        }
        list.subList(i11, size).clear();
        return obj;
    }

    static Object d(int i10, int i11, Object obj, J1 j12) {
        if (obj == null) {
            obj = j12.f();
        }
        j12.l(obj, i10, i11);
        return obj;
    }

    public static void g(Class cls) {
        Class cls2;
        if (!B0.class.isAssignableFrom(cls) && (cls2 = f84063a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void h(int i10, List list, InterfaceC10624c2 interfaceC10624c2, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10624c2.zzc(i10, list, z10);
    }

    public static void i(int i10, List list, InterfaceC10624c2 interfaceC10624c2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10624c2.zze(i10, list);
    }

    public static void j(int i10, List list, InterfaceC10624c2 interfaceC10624c2, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10624c2.zzg(i10, list, z10);
    }

    public static void k(int i10, List list, InterfaceC10624c2 interfaceC10624c2, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10624c2.zzj(i10, list, z10);
    }

    public static void l(int i10, List list, InterfaceC10624c2 interfaceC10624c2, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10624c2.zzl(i10, list, z10);
    }

    public static void m(int i10, List list, InterfaceC10624c2 interfaceC10624c2, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10624c2.zzn(i10, list, z10);
    }

    public static void n(int i10, List list, InterfaceC10624c2 interfaceC10624c2, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10624c2.zzp(i10, list, z10);
    }

    public static void o(int i10, List list, InterfaceC10624c2 interfaceC10624c2, InterfaceC10881s1 interfaceC10881s1) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((C10769l0) interfaceC10624c2).e(i10, list.get(i11), interfaceC10881s1);
        }
    }

    public static void p(int i10, List list, InterfaceC10624c2 interfaceC10624c2, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10624c2.zzs(i10, list, z10);
    }

    public static void q(int i10, List list, InterfaceC10624c2 interfaceC10624c2, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10624c2.zzu(i10, list, z10);
    }

    public static void r(int i10, List list, InterfaceC10624c2 interfaceC10624c2, InterfaceC10881s1 interfaceC10881s1) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((C10769l0) interfaceC10624c2).b(i10, list.get(i11), interfaceC10881s1);
        }
    }

    public static void s(int i10, List list, InterfaceC10624c2 interfaceC10624c2, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10624c2.zzx(i10, list, z10);
    }

    public static void t(int i10, List list, InterfaceC10624c2 interfaceC10624c2, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10624c2.zzz(i10, list, z10);
    }

    public static void u(int i10, List list, InterfaceC10624c2 interfaceC10624c2, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10624c2.zzB(i10, list, z10);
    }

    public static void v(int i10, List list, InterfaceC10624c2 interfaceC10624c2, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10624c2.zzD(i10, list, z10);
    }

    public static void w(int i10, List list, InterfaceC10624c2 interfaceC10624c2) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10624c2.zzG(i10, list);
    }

    public static void x(int i10, List list, InterfaceC10624c2 interfaceC10624c2, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10624c2.zzI(i10, list, z10);
    }

    public static void y(int i10, List list, InterfaceC10624c2 interfaceC10624c2, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10624c2.zzK(i10, list, z10);
    }

    static int A(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC10753k0.a(i10 << 3) + 1);
    }

    static void B(C10606b1 c10606b1, Object obj, Object obj2, long j10) {
        T1.x(obj, j10, C10606b1.c(T1.k(obj, j10), T1.k(obj2, j10)));
    }

    static int D(List list) {
        return list.size();
    }

    static int E(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iD = size * AbstractC10753k0.D(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iD += AbstractC10753k0.x((AbstractC10605b0) list.get(i11));
        }
        return iD;
    }

    static int F(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return G(list) + (size * AbstractC10753k0.D(i10));
    }

    static int G(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof D0) {
            D0 d02 = (D0) list;
            int iZ = 0;
            while (i10 < size) {
                iZ += AbstractC10753k0.z(d02.a(i10));
                i10++;
            }
            return iZ;
        }
        int iZ2 = 0;
        while (i10 < size) {
            iZ2 += AbstractC10753k0.z(((Integer) list.get(i10)).intValue());
            i10++;
        }
        return iZ2;
    }

    static int H(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC10753k0.a(i10 << 3) + 4);
    }

    static int I(List list) {
        return list.size() * 4;
    }

    static int J(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC10753k0.a(i10 << 3) + 8);
    }

    static int K(List list) {
        return list.size() * 8;
    }

    static int L(int i10, List list, InterfaceC10881s1 interfaceC10881s1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iY += AbstractC10753k0.y(i10, (InterfaceC10690g1) list.get(i11), interfaceC10881s1);
        }
        return iY;
    }

    static int M(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * AbstractC10753k0.D(i10));
    }

    static int N(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof D0) {
            D0 d02 = (D0) list;
            int iZ = 0;
            while (i10 < size) {
                iZ += AbstractC10753k0.z(d02.a(i10));
                i10++;
            }
            return iZ;
        }
        int iZ2 = 0;
        while (i10 < size) {
            iZ2 += AbstractC10753k0.z(((Integer) list.get(i10)).intValue());
            i10++;
        }
        return iZ2;
    }

    static int O(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return P(list) + (list.size() * AbstractC10753k0.D(i10));
    }

    static int P(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof U0) {
            U0 u02 = (U0) list;
            int iB = 0;
            while (i10 < size) {
                iB += AbstractC10753k0.b(u02.a(i10));
                i10++;
            }
            return iB;
        }
        int iB2 = 0;
        while (i10 < size) {
            iB2 += AbstractC10753k0.b(((Long) list.get(i10)).longValue());
            i10++;
        }
        return iB2;
    }

    static int R(int i10, List list, InterfaceC10881s1 interfaceC10881s1) {
        int iB;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iD = AbstractC10753k0.D(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof L0) {
                iB = AbstractC10753k0.A((L0) obj);
            } else {
                iB = AbstractC10753k0.B((InterfaceC10690g1) obj, interfaceC10881s1);
            }
            iD += iB;
        }
        return iD;
    }

    static int S(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return T(list) + (size * AbstractC10753k0.D(i10));
    }

    static int T(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof D0) {
            D0 d02 = (D0) list;
            int iA = 0;
            while (i10 < size) {
                int iA2 = d02.a(i10);
                iA += AbstractC10753k0.a((iA2 >> 31) ^ (iA2 + iA2));
                i10++;
            }
            return iA;
        }
        int iA3 = 0;
        while (i10 < size) {
            int iIntValue = ((Integer) list.get(i10)).intValue();
            iA3 += AbstractC10753k0.a((iIntValue >> 31) ^ (iIntValue + iIntValue));
            i10++;
        }
        return iA3;
    }

    static int U(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return V(list) + (size * AbstractC10753k0.D(i10));
    }

    static int V(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof U0) {
            U0 u02 = (U0) list;
            int iB = 0;
            while (i10 < size) {
                long jA = u02.a(i10);
                iB += AbstractC10753k0.b((jA >> 63) ^ (jA + jA));
                i10++;
            }
            return iB;
        }
        int iB2 = 0;
        while (i10 < size) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iB2 += AbstractC10753k0.b((jLongValue >> 63) ^ (jLongValue + jLongValue));
            i10++;
        }
        return iB2;
    }

    static int W(int i10, List list) {
        int iC;
        int iC2;
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iD = AbstractC10753k0.D(i10) * size;
        if (list instanceof N0) {
            N0 n02 = (N0) list;
            while (i11 < size) {
                Object objZzf = n02.zzf(i11);
                if (objZzf instanceof AbstractC10605b0) {
                    iC2 = AbstractC10753k0.x((AbstractC10605b0) objZzf);
                } else {
                    iC2 = AbstractC10753k0.C((String) objZzf);
                }
                iD += iC2;
                i11++;
            }
            return iD;
        }
        while (i11 < size) {
            Object obj = list.get(i11);
            if (obj instanceof AbstractC10605b0) {
                iC = AbstractC10753k0.x((AbstractC10605b0) obj);
            } else {
                iC = AbstractC10753k0.C((String) obj);
            }
            iD += iC;
            i11++;
        }
        return iD;
    }

    static int X(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Y(list) + (size * AbstractC10753k0.D(i10));
    }

    static int Y(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof D0) {
            D0 d02 = (D0) list;
            int iA = 0;
            while (i10 < size) {
                iA += AbstractC10753k0.a(d02.a(i10));
                i10++;
            }
            return iA;
        }
        int iA2 = 0;
        while (i10 < size) {
            iA2 += AbstractC10753k0.a(((Integer) list.get(i10)).intValue());
            i10++;
        }
        return iA2;
    }

    static int Z(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return a0(list) + (size * AbstractC10753k0.D(i10));
    }

    static int a0(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof U0) {
            U0 u02 = (U0) list;
            int iB = 0;
            while (i10 < size) {
                iB += AbstractC10753k0.b(u02.a(i10));
                i10++;
            }
            return iB;
        }
        int iB2 = 0;
        while (i10 < size) {
            iB2 += AbstractC10753k0.b(((Long) list.get(i10)).longValue());
            i10++;
        }
        return iB2;
    }

    static void e(AbstractC10849q0 abstractC10849q0, Object obj, Object obj2) {
        abstractC10849q0.a(obj2);
        throw null;
    }

    static void f(J1 j12, Object obj, Object obj2) {
        j12.o(obj, j12.e(j12.d(obj), j12.d(obj2)));
    }
}
