package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes6.dex */
final class Jv0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Uv0 f68832a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f68833b = 0;

    static boolean j(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Uv0 w() {
        return f68832a;
    }

    static {
        int i10 = C10207yv0.f81149d;
        f68832a = new Wv0();
    }

    static void A(Uv0 uv0, Object obj, Object obj2) {
        Gu0 gu0 = (Gu0) obj;
        Vv0 vv0E = gu0.zzt;
        Vv0 vv0 = ((Gu0) obj2).zzt;
        if (!Vv0.c().equals(vv0)) {
            if (Vv0.c().equals(vv0E)) {
                vv0E = Vv0.e(vv0E, vv0);
            } else {
                vv0E.d(vv0);
            }
        }
        gu0.zzt = vv0E;
    }

    public static void B(int i10, List list, InterfaceC8605jw0 interfaceC8605jw0, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC8605jw0.zzc(i10, list, z10);
    }

    public static void C(int i10, List list, InterfaceC8605jw0 interfaceC8605jw0) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC8605jw0.zze(i10, list);
    }

    public static void D(int i10, List list, InterfaceC8605jw0 interfaceC8605jw0, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC8605jw0.zzg(i10, list, z10);
    }

    public static void E(int i10, List list, InterfaceC8605jw0 interfaceC8605jw0, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC8605jw0.zzj(i10, list, z10);
    }

    public static void F(int i10, List list, InterfaceC8605jw0 interfaceC8605jw0, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC8605jw0.zzl(i10, list, z10);
    }

    public static void G(int i10, List list, InterfaceC8605jw0 interfaceC8605jw0, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC8605jw0.zzn(i10, list, z10);
    }

    public static void H(int i10, List list, InterfaceC8605jw0 interfaceC8605jw0, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC8605jw0.zzp(i10, list, z10);
    }

    public static void I(int i10, List list, InterfaceC8605jw0 interfaceC8605jw0, Hv0 hv0) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((C8815lu0) interfaceC8605jw0).a(i10, list.get(i11), hv0);
        }
    }

    public static void J(int i10, List list, InterfaceC8605jw0 interfaceC8605jw0, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC8605jw0.zzs(i10, list, z10);
    }

    public static void a(int i10, List list, InterfaceC8605jw0 interfaceC8605jw0, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC8605jw0.zzu(i10, list, z10);
    }

    public static void b(int i10, List list, InterfaceC8605jw0 interfaceC8605jw0, Hv0 hv0) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            ((C8815lu0) interfaceC8605jw0).b(i10, list.get(i11), hv0);
        }
    }

    public static void c(int i10, List list, InterfaceC8605jw0 interfaceC8605jw0, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC8605jw0.zzy(i10, list, z10);
    }

    public static void d(int i10, List list, InterfaceC8605jw0 interfaceC8605jw0, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC8605jw0.zzA(i10, list, z10);
    }

    public static void e(int i10, List list, InterfaceC8605jw0 interfaceC8605jw0, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC8605jw0.zzC(i10, list, z10);
    }

    public static void f(int i10, List list, InterfaceC8605jw0 interfaceC8605jw0, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC8605jw0.zzE(i10, list, z10);
    }

    public static void g(int i10, List list, InterfaceC8605jw0 interfaceC8605jw0) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC8605jw0.zzH(i10, list);
    }

    public static void h(int i10, List list, InterfaceC8605jw0 interfaceC8605jw0, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC8605jw0.zzJ(i10, list, z10);
    }

    public static void i(int i10, List list, InterfaceC8605jw0 interfaceC8605jw0, boolean z10) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC8605jw0.zzL(i10, list, z10);
    }

    static int r(int i10, Object obj, Hv0 hv0) {
        int i11 = i10 << 3;
        if (!(obj instanceof C7644av0)) {
            return AbstractC8708ku0.e(i11) + AbstractC8708ku0.b((InterfaceC9245pv0) obj, hv0);
        }
        int iE = AbstractC8708ku0.e(i11);
        int iA = ((C7644av0) obj).a();
        return iE + AbstractC8708ku0.e(iA) + iA;
    }

    static Object x(Object obj, int i10, List list, Mu0 mu0, Object obj2, Uv0 uv0) {
        if (mu0 == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!mu0.zza(iIntValue)) {
                    obj2 = y(obj, i10, iIntValue, obj2, uv0);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = (Integer) list.get(i12);
            int iIntValue2 = num.intValue();
            if (mu0.zza(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                obj2 = y(obj, i10, iIntValue2, obj2, uv0);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return obj2;
    }

    static Object y(Object obj, int i10, int i11, Object obj2, Uv0 uv0) {
        if (obj2 == null) {
            obj2 = uv0.a(obj);
        }
        uv0.h(obj2, i10, i11);
        return obj2;
    }

    static void z(AbstractC9456ru0 abstractC9456ru0, Object obj, Object obj2) {
        if (((Cu0) obj2).zza.f79989a.isEmpty()) {
            return;
        }
        throw null;
    }

    static int k(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Hu0) {
            Hu0 hu0 = (Hu0) list;
            int iF = 0;
            while (i10 < size) {
                iF += AbstractC8708ku0.f(hu0.e(i10));
                i10++;
            }
            return iF;
        }
        int iF2 = 0;
        while (i10 < size) {
            iF2 += AbstractC8708ku0.f(((Integer) list.get(i10)).intValue());
            i10++;
        }
        return iF2;
    }

    static int l(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC8708ku0.e(i10 << 3) + 4);
    }

    static int m(List list) {
        return list.size() * 4;
    }

    static int n(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC8708ku0.e(i10 << 3) + 8);
    }

    static int o(List list) {
        return list.size() * 8;
    }

    static int p(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Hu0) {
            Hu0 hu0 = (Hu0) list;
            int iF = 0;
            while (i10 < size) {
                iF += AbstractC8708ku0.f(hu0.e(i10));
                i10++;
            }
            return iF;
        }
        int iF2 = 0;
        while (i10 < size) {
            iF2 += AbstractC8708ku0.f(((Integer) list.get(i10)).intValue());
            i10++;
        }
        return iF2;
    }

    static int q(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8070ev0) {
            C8070ev0 c8070ev0 = (C8070ev0) list;
            int iF = 0;
            while (i10 < size) {
                iF += AbstractC8708ku0.f(c8070ev0.e(i10));
                i10++;
            }
            return iF;
        }
        int iF2 = 0;
        while (i10 < size) {
            iF2 += AbstractC8708ku0.f(((Long) list.get(i10)).longValue());
            i10++;
        }
        return iF2;
    }

    static int s(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Hu0) {
            Hu0 hu0 = (Hu0) list;
            int iE = 0;
            while (i10 < size) {
                int iE2 = hu0.e(i10);
                iE += AbstractC8708ku0.e((iE2 >> 31) ^ (iE2 + iE2));
                i10++;
            }
            return iE;
        }
        int iE3 = 0;
        while (i10 < size) {
            int iIntValue = ((Integer) list.get(i10)).intValue();
            iE3 += AbstractC8708ku0.e((iIntValue >> 31) ^ (iIntValue + iIntValue));
            i10++;
        }
        return iE3;
    }

    static int t(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8070ev0) {
            C8070ev0 c8070ev0 = (C8070ev0) list;
            int iF = 0;
            while (i10 < size) {
                long jE = c8070ev0.e(i10);
                iF += AbstractC8708ku0.f((jE >> 63) ^ (jE + jE));
                i10++;
            }
            return iF;
        }
        int iF2 = 0;
        while (i10 < size) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iF2 += AbstractC8708ku0.f((jLongValue >> 63) ^ (jLongValue + jLongValue));
            i10++;
        }
        return iF2;
    }

    static int u(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Hu0) {
            Hu0 hu0 = (Hu0) list;
            int iE = 0;
            while (i10 < size) {
                iE += AbstractC8708ku0.e(hu0.e(i10));
                i10++;
            }
            return iE;
        }
        int iE2 = 0;
        while (i10 < size) {
            iE2 += AbstractC8708ku0.e(((Integer) list.get(i10)).intValue());
            i10++;
        }
        return iE2;
    }

    static int v(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C8070ev0) {
            C8070ev0 c8070ev0 = (C8070ev0) list;
            int iF = 0;
            while (i10 < size) {
                iF += AbstractC8708ku0.f(c8070ev0.e(i10));
                i10++;
            }
            return iF;
        }
        int iF2 = 0;
        while (i10 < size) {
            iF2 += AbstractC8708ku0.f(((Long) list.get(i10)).longValue());
            i10++;
        }
        return iF2;
    }
}
