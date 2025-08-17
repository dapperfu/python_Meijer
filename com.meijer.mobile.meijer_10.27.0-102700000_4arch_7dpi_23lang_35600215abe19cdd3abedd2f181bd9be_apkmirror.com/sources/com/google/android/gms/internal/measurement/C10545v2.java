package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.v2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10545v2 {
    public static boolean d(InterfaceC10498q interfaceC10498q) {
        if (interfaceC10498q == null) {
            return false;
        }
        Double dZzd = interfaceC10498q.zzd();
        return !dZzd.isNaN() && dZzd.doubleValue() >= 0.0d && dZzd.equals(Double.valueOf(Math.floor(dZzd.doubleValue())));
    }

    public static N e(String str) {
        N nA = null;
        if (str != null && !str.isEmpty()) {
            nA = N.a(Integer.parseInt(str));
        }
        if (nA != null) {
            return nA;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static Object j(InterfaceC10498q interfaceC10498q) {
        if (InterfaceC10498q.f82343j3.equals(interfaceC10498q)) {
            return null;
        }
        if (InterfaceC10498q.f82342i3.equals(interfaceC10498q)) {
            return "";
        }
        if (interfaceC10498q instanceof C10471n) {
            return k((C10471n) interfaceC10498q);
        }
        if (!(interfaceC10498q instanceof C10399f)) {
            return !interfaceC10498q.zzd().isNaN() ? interfaceC10498q.zzd() : interfaceC10498q.zzc();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C10399f) interfaceC10498q).iterator();
        while (it.hasNext()) {
            Object objJ = j((InterfaceC10498q) it.next());
            if (objJ != null) {
                arrayList.add(objJ);
            }
        }
        return arrayList;
    }

    public static Map k(C10471n c10471n) {
        HashMap map = new HashMap();
        for (String str : c10471n.b()) {
            Object objJ = j(c10471n.W(str));
            if (objJ != null) {
                map.put(str, objJ);
            }
        }
        return map;
    }

    public static int l(U1 u12) {
        int iG = g(u12.h("runtime.counter").zzd().doubleValue() + 1.0d);
        if (iG > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        u12.e("runtime.counter", new C10435j(Double.valueOf(iG)));
        return iG;
    }

    public static void a(String str, int i10, List list) {
        if (list.size() == i10) {
        } else {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static void b(String str, int i10, List list) {
        if (list.size() >= i10) {
        } else {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static void c(String str, int i10, List list) {
        if (list.size() <= i10) {
        } else {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static boolean f(InterfaceC10498q interfaceC10498q, InterfaceC10498q interfaceC10498q2) {
        if (!interfaceC10498q.getClass().equals(interfaceC10498q2.getClass())) {
            return false;
        }
        if ((interfaceC10498q instanceof C10542v) || (interfaceC10498q instanceof C10480o)) {
            return true;
        }
        if (interfaceC10498q instanceof C10435j) {
            if (Double.isNaN(interfaceC10498q.zzd().doubleValue()) || Double.isNaN(interfaceC10498q2.zzd().doubleValue())) {
                return false;
            }
            return interfaceC10498q.zzd().equals(interfaceC10498q2.zzd());
        }
        if (interfaceC10498q instanceof C10533u) {
            return interfaceC10498q.zzc().equals(interfaceC10498q2.zzc());
        }
        if (interfaceC10498q instanceof C10408g) {
            return interfaceC10498q.zze().equals(interfaceC10498q2.zze());
        }
        if (interfaceC10498q != interfaceC10498q2) {
            return false;
        }
        return true;
    }

    public static int g(double d10) {
        int i10;
        if (!Double.isNaN(d10) && !Double.isInfinite(d10) && d10 != 0.0d) {
            if (d10 > 0.0d) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            return (int) ((i10 * Math.floor(Math.abs(d10))) % 4.294967296E9d);
        }
        return 0;
    }

    public static long h(double d10) {
        return g(d10) & 4294967295L;
    }

    public static double i(double d10) {
        int i10;
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (!Double.isInfinite(d10) && d10 != 0.0d && d10 != 0.0d) {
            if (d10 > 0.0d) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            return i10 * Math.floor(Math.abs(d10));
        }
        return d10;
    }
}
