package qf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import of.C16041i;

/* loaded from: classes7.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f157223a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final int f157224b;

    /* renamed from: c, reason: collision with root package name */
    private final int f157225c;

    public synchronized Map<String, String> a() {
        return Collections.unmodifiableMap(new HashMap(this.f157223a));
    }

    public synchronized boolean d(String str, String str2) {
        String strB = b(str);
        if (this.f157223a.size() >= this.f157224b && !this.f157223a.containsKey(strB)) {
            lf.g.f().k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f157224b);
            return false;
        }
        String strC = c(str2, this.f157225c);
        if (C16041i.z(this.f157223a.get(strB), strC)) {
            return false;
        }
        Map<String, String> map = this.f157223a;
        if (str2 == null) {
            strC = "";
        }
        map.put(strB, strC);
        return true;
    }

    public synchronized void e(Map<String, String> map) {
        try {
            int i10 = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String strB = b(entry.getKey());
                if (this.f157223a.size() < this.f157224b || this.f157223a.containsKey(strB)) {
                    String value = entry.getValue();
                    this.f157223a.put(strB, value == null ? "" : c(value, this.f157225c));
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                lf.g.f().k("Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f157224b);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.f157225c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    public static String c(String str, int i10) {
        if (str == null) {
            return str;
        }
        String strTrim = str.trim();
        return strTrim.length() > i10 ? strTrim.substring(0, i10) : strTrim;
    }

    public e(int i10, int i11) {
        this.f157224b = i10;
        this.f157225c = i11;
    }
}
