package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class W2 {
    public static InterfaceC10623q a(Object obj) {
        if (obj == null) {
            return InterfaceC10623q.f83183j3;
        }
        if (obj instanceof String) {
            return new C10658u((String) obj);
        }
        if (obj instanceof Double) {
            return new C10560j((Double) obj);
        }
        if (obj instanceof Long) {
            return new C10560j(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C10560j(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C10533g((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C10524f c10524f = new C10524f();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c10524f.p(c10524f.m(), a(it.next()));
            }
            return c10524f;
        }
        C10596n c10596n = new C10596n();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            InterfaceC10623q interfaceC10623qA = a(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                c10596n.e((String) string, interfaceC10623qA);
            }
        }
        return c10596n;
    }

    public static InterfaceC10623q b(C3 c32) {
        if (c32 == null) {
            return InterfaceC10623q.f83182i3;
        }
        int iN = c32.N() - 1;
        if (iN == 1) {
            return c32.G() ? new C10658u(c32.H()) : InterfaceC10623q.f83189p3;
        }
        if (iN == 2) {
            return c32.K() ? new C10560j(Double.valueOf(c32.L())) : new C10560j(null);
        }
        if (iN == 3) {
            return c32.I() ? new C10533g(Boolean.valueOf(c32.J())) : new C10533g(null);
        }
        if (iN != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listE = c32.E();
        ArrayList arrayList = new ArrayList();
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(b((C3) it.next()));
        }
        return new r(c32.F(), arrayList);
    }
}
