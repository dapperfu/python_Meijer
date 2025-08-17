package com.google.android.gms.internal.atv_ads_framework;

import java.io.IOException;
import java.util.List;

/* loaded from: classes6.dex */
final class C1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Class f80744a;

    /* renamed from: b, reason: collision with root package name */
    private static final Q1 f80745b;

    /* renamed from: c, reason: collision with root package name */
    private static final Q1 f80746c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f80747d = 0;

    static {
        Class<?> cls;
        Class<?> cls2;
        Q1 q12 = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f80744a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                q12 = (Q1) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f80745b = q12;
        f80746c = new S1();
    }

    public static Q1 T() {
        return f80745b;
    }

    public static Q1 U() {
        return f80746c;
    }

    static boolean u(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int I(int i10, Object obj, InterfaceC10276z1 interfaceC10276z1) {
        if (!(obj instanceof U0)) {
            return AbstractC10269x0.y(i10 << 3) + AbstractC10269x0.w((InterfaceC10247p1) obj, interfaceC10276z1);
        }
        int i11 = AbstractC10269x0.f81074d;
        int iA = ((U0) obj).a();
        return AbstractC10269x0.y(i10 << 3) + AbstractC10269x0.y(iA) + iA;
    }

    public static void b(Class cls) {
        Class cls2;
        if (!K0.class.isAssignableFrom(cls) && (cls2 = f80744a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void c(int i10, List list, i2 i2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        i2Var.zzc(i10, list, z10);
    }

    public static void d(int i10, List list, i2 i2Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        i2Var.zze(i10, list);
    }

    public static void e(int i10, List list, i2 i2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        i2Var.zzg(i10, list, z10);
    }

    public static void f(int i10, List list, i2 i2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        i2Var.b(i10, list, z10);
    }

    public static void g(int i10, List list, i2 i2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        i2Var.d(i10, list, z10);
    }

    public static void h(int i10, List list, i2 i2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        i2Var.a(i10, list, z10);
    }

    public static void i(int i10, List list, i2 i2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        i2Var.n(i10, list, z10);
    }

    public static void j(int i10, List list, i2 i2Var, InterfaceC10276z1 interfaceC10276z1) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((C10272y0) i2Var).j(i10, list.get(i11), interfaceC10276z1);
        }
    }

    public static void k(int i10, List list, i2 i2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        i2Var.e(i10, list, z10);
    }

    public static void l(int i10, List list, i2 i2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        i2Var.g(i10, list, z10);
    }

    public static void m(int i10, List list, i2 i2Var, InterfaceC10276z1 interfaceC10276z1) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((C10272y0) i2Var).o(i10, list.get(i11), interfaceC10276z1);
        }
    }

    public static void n(int i10, List list, i2 i2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        i2Var.zzw(i10, list, z10);
    }

    public static void o(int i10, List list, i2 i2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        i2Var.zzy(i10, list, z10);
    }

    public static void p(int i10, List list, i2 i2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        i2Var.zzA(i10, list, z10);
    }

    public static void q(int i10, List list, i2 i2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        i2Var.zzC(i10, list, z10);
    }

    public static void r(int i10, List list, i2 i2Var) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        i2Var.h(i10, list);
    }

    public static void s(int i10, List list, i2 i2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        i2Var.p(i10, list, z10);
    }

    public static void t(int i10, List list, i2 i2Var, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        i2Var.zzI(i10, list, z10);
    }

    static int A(List list) {
        return list.size() * 4;
    }

    static int B(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC10269x0.y(i10 << 3) + 8);
    }

    static int C(List list) {
        return list.size() * 8;
    }

    static int D(int i10, List list, InterfaceC10276z1 interfaceC10276z1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iU += AbstractC10269x0.u(i10, (InterfaceC10247p1) list.get(i11), interfaceC10276z1);
        }
        return iU;
    }

    static int E(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return F(list) + (size * AbstractC10269x0.y(i10 << 3));
    }

    static int F(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof L0) {
            L0 l02 = (L0) list;
            int iV = 0;
            while (i10 < size) {
                iV += AbstractC10269x0.v(l02.a(i10));
                i10++;
            }
            return iV;
        }
        int iV2 = 0;
        while (i10 < size) {
            iV2 += AbstractC10269x0.v(((Integer) list.get(i10)).intValue());
            i10++;
        }
        return iV2;
    }

    static int G(int i10, List list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        return H(list) + (list.size() * AbstractC10269x0.y(i10 << 3));
    }

    static int H(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C10214e1) {
            C10214e1 c10214e1 = (C10214e1) list;
            int iZ = 0;
            while (i10 < size) {
                iZ += AbstractC10269x0.z(c10214e1.a(i10));
                i10++;
            }
            return iZ;
        }
        int iZ2 = 0;
        while (i10 < size) {
            iZ2 += AbstractC10269x0.z(((Long) list.get(i10)).longValue());
            i10++;
        }
        return iZ2;
    }

    static int J(int i10, List list, InterfaceC10276z1 interfaceC10276z1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = AbstractC10269x0.y(i10 << 3) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj instanceof U0) {
                int iA = ((U0) obj).a();
                iY += AbstractC10269x0.y(iA) + iA;
            } else {
                iY += AbstractC10269x0.w((InterfaceC10247p1) obj, interfaceC10276z1);
            }
        }
        return iY;
    }

    static int K(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return L(list) + (size * AbstractC10269x0.y(i10 << 3));
    }

    static int L(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof L0) {
            L0 l02 = (L0) list;
            int iY = 0;
            while (i10 < size) {
                int iA = l02.a(i10);
                iY += AbstractC10269x0.y((iA >> 31) ^ (iA + iA));
                i10++;
            }
            return iY;
        }
        int iY2 = 0;
        while (i10 < size) {
            int iIntValue = ((Integer) list.get(i10)).intValue();
            iY2 += AbstractC10269x0.y((iIntValue >> 31) ^ (iIntValue + iIntValue));
            i10++;
        }
        return iY2;
    }

    static int M(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return N(list) + (size * AbstractC10269x0.y(i10 << 3));
    }

    static int N(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C10214e1) {
            C10214e1 c10214e1 = (C10214e1) list;
            int iZ = 0;
            while (i10 < size) {
                long jA = c10214e1.a(i10);
                iZ += AbstractC10269x0.z((jA >> 63) ^ (jA + jA));
                i10++;
            }
            return iZ;
        }
        int iZ2 = 0;
        while (i10 < size) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iZ2 += AbstractC10269x0.z((jLongValue >> 63) ^ (jLongValue + jLongValue));
            i10++;
        }
        return iZ2;
    }

    static int O(int i10, List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z10 = list instanceof W0;
        int iY = AbstractC10269x0.y(i10 << 3) * size;
        if (z10) {
            W0 w02 = (W0) list;
            while (i11 < size) {
                Object objZze = w02.zze(i11);
                if (objZze instanceof AbstractC10249q0) {
                    int iF = ((AbstractC10249q0) objZze).f();
                    iY += AbstractC10269x0.y(iF) + iF;
                } else {
                    iY += AbstractC10269x0.x((String) objZze);
                }
                i11++;
            }
            return iY;
        }
        while (i11 < size) {
            Object obj = list.get(i11);
            if (obj instanceof AbstractC10249q0) {
                int iF2 = ((AbstractC10249q0) obj).f();
                iY += AbstractC10269x0.y(iF2) + iF2;
            } else {
                iY += AbstractC10269x0.x((String) obj);
            }
            i11++;
        }
        return iY;
    }

    static int P(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Q(list) + (size * AbstractC10269x0.y(i10 << 3));
    }

    static int Q(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof L0) {
            L0 l02 = (L0) list;
            int iY = 0;
            while (i10 < size) {
                iY += AbstractC10269x0.y(l02.a(i10));
                i10++;
            }
            return iY;
        }
        int iY2 = 0;
        while (i10 < size) {
            iY2 += AbstractC10269x0.y(((Integer) list.get(i10)).intValue());
            i10++;
        }
        return iY2;
    }

    static int R(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return S(list) + (size * AbstractC10269x0.y(i10 << 3));
    }

    static int S(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C10214e1) {
            C10214e1 c10214e1 = (C10214e1) list;
            int iZ = 0;
            while (i10 < size) {
                iZ += AbstractC10269x0.z(c10214e1.a(i10));
                i10++;
            }
            return iZ;
        }
        int iZ2 = 0;
        while (i10 < size) {
            iZ2 += AbstractC10269x0.z(((Long) list.get(i10)).longValue());
            i10++;
        }
        return iZ2;
    }

    static void a(Q1 q12, Object obj, Object obj2) {
        q12.f(obj, q12.d(q12.c(obj), q12.c(obj2)));
    }

    static int v(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC10269x0.y(i10 << 3) + 1);
    }

    static int w(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = size * AbstractC10269x0.y(i10 << 3);
        for (int i11 = 0; i11 < list.size(); i11++) {
            int iF = ((AbstractC10249q0) list.get(i11)).f();
            iY += AbstractC10269x0.y(iF) + iF;
        }
        return iY;
    }

    static int x(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return y(list) + (size * AbstractC10269x0.y(i10 << 3));
    }

    static int y(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof L0) {
            L0 l02 = (L0) list;
            int iV = 0;
            while (i10 < size) {
                iV += AbstractC10269x0.v(l02.a(i10));
                i10++;
            }
            return iV;
        }
        int iV2 = 0;
        while (i10 < size) {
            iV2 += AbstractC10269x0.v(((Integer) list.get(i10)).intValue());
            i10++;
        }
        return iV2;
    }

    static int z(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC10269x0.y(i10 << 3) + 4);
    }
}
