package androidx.media3.extractor.flv;

import d3.D;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import x3.C18008m;

/* loaded from: classes.dex */
final class c extends TagPayloadReader {

    /* renamed from: b, reason: collision with root package name */
    private long f57309b;

    /* renamed from: c, reason: collision with root package name */
    private long[] f57310c;

    /* renamed from: d, reason: collision with root package name */
    private long[] f57311d;

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean b(D d10) {
        return true;
    }

    public c() {
        super(new C18008m());
        this.f57309b = -9223372036854775807L;
        this.f57310c = new long[0];
        this.f57311d = new long[0];
    }

    private static Object h(D d10, int i10) {
        if (i10 == 0) {
            return j(d10);
        }
        if (i10 == 1) {
            return g(d10);
        }
        if (i10 == 2) {
            return n(d10);
        }
        if (i10 == 3) {
            return l(d10);
        }
        if (i10 == 8) {
            return k(d10);
        }
        if (i10 == 10) {
            return m(d10);
        }
        if (i10 != 11) {
            return null;
        }
        return i(d10);
    }

    private static Date i(D d10) {
        Date date = new Date((long) j(d10).doubleValue());
        d10.X(2);
        return date;
    }

    private static HashMap<String, Object> l(D d10) {
        HashMap<String, Object> map = new HashMap<>();
        while (true) {
            String strN = n(d10);
            int iO = o(d10);
            if (iO == 9) {
                return map;
            }
            Object objH = h(d10, iO);
            if (objH != null) {
                map.put(strN, objH);
            }
        }
    }

    public long d() {
        return this.f57309b;
    }

    public long[] e() {
        return this.f57311d;
    }

    public long[] f() {
        return this.f57310c;
    }

    private static Boolean g(D d10) {
        boolean z10 = true;
        if (d10.H() != 1) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    private static Double j(D d10) {
        return Double.valueOf(Double.longBitsToDouble(d10.A()));
    }

    private static HashMap<String, Object> k(D d10) {
        int iL = d10.L();
        HashMap<String, Object> map = new HashMap<>(iL);
        for (int i10 = 0; i10 < iL; i10++) {
            String strN = n(d10);
            Object objH = h(d10, o(d10));
            if (objH != null) {
                map.put(strN, objH);
            }
        }
        return map;
    }

    private static ArrayList<Object> m(D d10) {
        int iL = d10.L();
        ArrayList<Object> arrayList = new ArrayList<>(iL);
        for (int i10 = 0; i10 < iL; i10++) {
            Object objH = h(d10, o(d10));
            if (objH != null) {
                arrayList.add(objH);
            }
        }
        return arrayList;
    }

    private static String n(D d10) {
        int iP = d10.P();
        int iF = d10.f();
        d10.X(iP);
        return new String(d10.e(), iF, iP);
    }

    private static int o(D d10) {
        return d10.H();
    }

    @Override // androidx.media3.extractor.flv.TagPayloadReader
    protected boolean c(D d10, long j10) {
        if (o(d10) != 2 || !"onMetaData".equals(n(d10)) || d10.a() == 0 || o(d10) != 8) {
            return false;
        }
        HashMap<String, Object> mapK = k(d10);
        Object obj = mapK.get("duration");
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (dDoubleValue > 0.0d) {
                this.f57309b = (long) (dDoubleValue * 1000000.0d);
            }
        }
        Object obj2 = mapK.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.f57310c = new long[size];
                this.f57311d = new long[size];
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj5 = list.get(i10);
                    Object obj6 = list2.get(i10);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.f57310c[i10] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.f57311d[i10] = ((Double) obj5).longValue();
                    } else {
                        this.f57310c = new long[0];
                        this.f57311d = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }
}
