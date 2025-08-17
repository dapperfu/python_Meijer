package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class W2 {
    public static InterfaceC10498q a(Object obj) {
        if (obj == null) {
            return InterfaceC10498q.f82343j3;
        }
        if (obj instanceof String) {
            return new C10533u((String) obj);
        }
        if (obj instanceof Double) {
            return new C10435j((Double) obj);
        }
        if (obj instanceof Long) {
            return new C10435j(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C10435j(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C10408g((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C10399f c10399f = new C10399f();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c10399f.p(c10399f.m(), a(it.next()));
            }
            return c10399f;
        }
        C10471n c10471n = new C10471n();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            InterfaceC10498q interfaceC10498qA = a(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                c10471n.e((String) string, interfaceC10498qA);
            }
        }
        return c10471n;
    }

    public static InterfaceC10498q b(C3 c32) {
        if (c32 == null) {
            return InterfaceC10498q.f82342i3;
        }
        int iN = c32.N() - 1;
        if (iN == 1) {
            return c32.G() ? new C10533u(c32.H()) : InterfaceC10498q.f82349p3;
        }
        if (iN == 2) {
            return c32.K() ? new C10435j(Double.valueOf(c32.L())) : new C10435j(null);
        }
        if (iN == 3) {
            return c32.I() ? new C10408g(Boolean.valueOf(c32.J())) : new C10408g(null);
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
