package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
final class A1 extends B1 {

    /* renamed from: b, reason: collision with root package name */
    private long f65042b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f65043c;

    /* renamed from: d, reason: collision with root package name */
    private long[] f65044d;

    @Override // com.google.android.gms.internal.ads.B1
    protected final boolean a(GQ gq2) {
        return true;
    }

    public final long d() {
        return this.f65042b;
    }

    public final long[] e() {
        return this.f65044d;
    }

    public final long[] f() {
        return this.f65043c;
    }

    public A1() {
        super(new C8595l0());
        this.f65042b = -9223372036854775807L;
        this.f65043c = new long[0];
        this.f65044d = new long[0];
    }

    private static Object h(GQ gq2, int i10) {
        if (i10 == 0) {
            return g(gq2);
        }
        if (i10 == 1) {
            return Boolean.valueOf(gq2.C() == 1);
        }
        if (i10 == 2) {
            return i(gq2);
        }
        if (i10 != 3) {
            if (i10 == 8) {
                return j(gq2);
            }
            if (i10 != 10) {
                if (i10 != 11) {
                    return null;
                }
                Date date = new Date((long) g(gq2).doubleValue());
                gq2.m(2);
                return date;
            }
            int iF = gq2.F();
            ArrayList arrayList = new ArrayList(iF);
            for (int i11 = 0; i11 < iF; i11++) {
                Object objH = h(gq2, gq2.C());
                if (objH != null) {
                    arrayList.add(objH);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strI = i(gq2);
            int iC = gq2.C();
            if (iC == 9) {
                return map;
            }
            Object objH2 = h(gq2, iC);
            if (objH2 != null) {
                map.put(strI, objH2);
            }
        }
    }

    private static Double g(GQ gq2) {
        return Double.valueOf(Double.longBitsToDouble(gq2.J()));
    }

    private static String i(GQ gq2) {
        int iG = gq2.G();
        int iT = gq2.t();
        gq2.m(iG);
        return new String(gq2.n(), iT, iG);
    }

    private static HashMap j(GQ gq2) {
        int iF = gq2.F();
        HashMap map = new HashMap(iF);
        for (int i10 = 0; i10 < iF; i10++) {
            String strI = i(gq2);
            Object objH = h(gq2, gq2.C());
            if (objH != null) {
                map.put(strI, objH);
            }
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.B1
    protected final boolean b(GQ gq2, long j10) {
        if (gq2.C() == 2 && "onMetaData".equals(i(gq2)) && gq2.r() != 0 && gq2.C() == 8) {
            HashMap mapJ = j(gq2);
            Object obj = mapJ.get("duration");
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                if (dDoubleValue > 0.0d) {
                    this.f65042b = (long) (dDoubleValue * 1000000.0d);
                }
            }
            Object obj2 = mapJ.get("keyframes");
            if (obj2 instanceof Map) {
                Map map = (Map) obj2;
                Object obj3 = map.get("filepositions");
                Object obj4 = map.get("times");
                if ((obj3 instanceof List) && (obj4 instanceof List)) {
                    List list = (List) obj3;
                    List list2 = (List) obj4;
                    int size = list2.size();
                    this.f65043c = new long[size];
                    this.f65044d = new long[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        Object obj5 = list.get(i10);
                        Object obj6 = list2.get(i10);
                        if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                            this.f65043c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                            this.f65044d[i10] = ((Double) obj5).longValue();
                        } else {
                            this.f65043c = new long[0];
                            this.f65044d = new long[0];
                            break;
                        }
                    }
                }
            }
        }
        return false;
    }
}
