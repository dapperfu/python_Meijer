package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* loaded from: classes6.dex */
final class X5 {

    /* renamed from: a, reason: collision with root package name */
    private static final AbstractC10415g6 f82096a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f82097b = 0;

    public static AbstractC10415g6 a() {
        return f82096a;
    }

    static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static {
        int i10 = S5.f81982d;
        f82096a = new C10433i6();
    }

    static int E(int i10, Object obj, V5 v52) {
        int i11 = i10 << 3;
        if (!(obj instanceof C10530t5)) {
            return K4.G(i11) + K4.d((K5) obj, v52);
        }
        int iG = K4.G(i11);
        int iB = ((C10530t5) obj).b();
        return iG + K4.G(iB) + iB;
    }

    static void c(Q4 q42, Object obj, Object obj2) {
        if (((AbstractC10369b5) obj2).zzb.f82005a.isEmpty()) {
            return;
        }
        throw null;
    }

    static void d(AbstractC10415g6 abstractC10415g6, Object obj, Object obj2) {
        AbstractC10396e5 abstractC10396e5 = (AbstractC10396e5) obj;
        C10424h6 c10424h6C = abstractC10396e5.zzc;
        C10424h6 c10424h6 = ((AbstractC10396e5) obj2).zzc;
        if (!C10424h6.a().equals(c10424h6)) {
            if (C10424h6.a().equals(c10424h6C)) {
                c10424h6C = C10424h6.c(c10424h6C, c10424h6);
            } else {
                c10424h6C.l(c10424h6);
            }
        }
        abstractC10396e5.zzc = c10424h6C;
    }

    static Object e(Object obj, int i10, int i11, Object obj2, AbstractC10415g6 abstractC10415g6) {
        if (obj2 == null) {
            obj2 = abstractC10415g6.a(obj);
        }
        ((C10424h6) obj2).k(i10 << 3, Long.valueOf(i11));
        return obj2;
    }

    public static void f(int i10, List list, InterfaceC10531t6 interfaceC10531t6, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10531t6.zzC(i10, list, z10);
    }

    public static void g(int i10, List list, InterfaceC10531t6 interfaceC10531t6, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10531t6.zzB(i10, list, z10);
    }

    public static void h(int i10, List list, InterfaceC10531t6 interfaceC10531t6, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10531t6.zzy(i10, list, z10);
    }

    public static void i(int i10, List list, InterfaceC10531t6 interfaceC10531t6, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10531t6.zzz(i10, list, z10);
    }

    public static void j(int i10, List list, InterfaceC10531t6 interfaceC10531t6, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10531t6.zzL(i10, list, z10);
    }

    public static void k(int i10, List list, InterfaceC10531t6 interfaceC10531t6, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10531t6.zzA(i10, list, z10);
    }

    public static void l(int i10, List list, InterfaceC10531t6 interfaceC10531t6, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10531t6.zzJ(i10, list, z10);
    }

    public static void m(int i10, List list, InterfaceC10531t6 interfaceC10531t6, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10531t6.zzw(i10, list, z10);
    }

    public static void n(int i10, List list, InterfaceC10531t6 interfaceC10531t6, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10531t6.zzH(i10, list, z10);
    }

    public static void o(int i10, List list, InterfaceC10531t6 interfaceC10531t6, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10531t6.zzK(i10, list, z10);
    }

    public static void p(int i10, List list, InterfaceC10531t6 interfaceC10531t6, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10531t6.zzx(i10, list, z10);
    }

    public static void q(int i10, List list, InterfaceC10531t6 interfaceC10531t6, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10531t6.zzI(i10, list, z10);
    }

    public static void r(int i10, List list, InterfaceC10531t6 interfaceC10531t6, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10531t6.zzD(i10, list, z10);
    }

    public static void s(int i10, List list, InterfaceC10531t6 interfaceC10531t6, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC10531t6.zzE(i10, list, z10);
    }

    static int A(List list) {
        return list.size() * 4;
    }

    static int B(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (K4.G(i10 << 3) + 4);
    }

    static int C(List list) {
        return list.size() * 8;
    }

    static int D(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (K4.G(i10 << 3) + 8);
    }

    static int t(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C10575y5) {
            C10575y5 c10575y5 = (C10575y5) list;
            int iA = 0;
            while (i10 < size) {
                iA += K4.a(c10575y5.zzc(i10));
                i10++;
            }
            return iA;
        }
        int iA2 = 0;
        while (i10 < size) {
            iA2 += K4.a(((Long) list.get(i10)).longValue());
            i10++;
        }
        return iA2;
    }

    static int u(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C10575y5) {
            C10575y5 c10575y5 = (C10575y5) list;
            int iA = 0;
            while (i10 < size) {
                iA += K4.a(c10575y5.zzc(i10));
                i10++;
            }
            return iA;
        }
        int iA2 = 0;
        while (i10 < size) {
            iA2 += K4.a(((Long) list.get(i10)).longValue());
            i10++;
        }
        return iA2;
    }

    static int v(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C10575y5) {
            C10575y5 c10575y5 = (C10575y5) list;
            int iA = 0;
            while (i10 < size) {
                long jZzc = c10575y5.zzc(i10);
                iA += K4.a((jZzc >> 63) ^ (jZzc + jZzc));
                i10++;
            }
            return iA;
        }
        int iA2 = 0;
        while (i10 < size) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iA2 += K4.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
            i10++;
        }
        return iA2;
    }

    static int w(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C10405f5) {
            C10405f5 c10405f5 = (C10405f5) list;
            int iA = 0;
            while (i10 < size) {
                iA += K4.a(c10405f5.f(i10));
                i10++;
            }
            return iA;
        }
        int iA2 = 0;
        while (i10 < size) {
            iA2 += K4.a(((Integer) list.get(i10)).intValue());
            i10++;
        }
        return iA2;
    }

    static int x(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C10405f5) {
            C10405f5 c10405f5 = (C10405f5) list;
            int iA = 0;
            while (i10 < size) {
                iA += K4.a(c10405f5.f(i10));
                i10++;
            }
            return iA;
        }
        int iA2 = 0;
        while (i10 < size) {
            iA2 += K4.a(((Integer) list.get(i10)).intValue());
            i10++;
        }
        return iA2;
    }

    static int y(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C10405f5) {
            C10405f5 c10405f5 = (C10405f5) list;
            int iG = 0;
            while (i10 < size) {
                iG += K4.G(c10405f5.f(i10));
                i10++;
            }
            return iG;
        }
        int iG2 = 0;
        while (i10 < size) {
            iG2 += K4.G(((Integer) list.get(i10)).intValue());
            i10++;
        }
        return iG2;
    }

    static int z(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C10405f5) {
            C10405f5 c10405f5 = (C10405f5) list;
            int iG = 0;
            while (i10 < size) {
                int iF = c10405f5.f(i10);
                iG += K4.G((iF >> 31) ^ (iF + iF));
                i10++;
            }
            return iG;
        }
        int iG2 = 0;
        while (i10 < size) {
            int iIntValue = ((Integer) list.get(i10)).intValue();
            iG2 += K4.G((iIntValue >> 31) ^ (iIntValue + iIntValue));
            i10++;
        }
        return iG2;
    }
}
