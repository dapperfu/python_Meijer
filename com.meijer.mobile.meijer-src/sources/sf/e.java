package sf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import qf.C16649i;

/* loaded from: classes8.dex */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f160338a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final int f160339b;

    /* renamed from: c, reason: collision with root package name */
    private final int f160340c;

    public synchronized Map<String, String> a() {
        return Collections.unmodifiableMap(new HashMap(this.f160338a));
    }

    public synchronized boolean d(String str, String str2) {
        String strB = b(str);
        if (this.f160338a.size() >= this.f160339b && !this.f160338a.containsKey(strB)) {
            nf.g.f().k("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f160339b);
            return false;
        }
        String strC = c(str2, this.f160340c);
        if (C16649i.z(this.f160338a.get(strB), strC)) {
            return false;
        }
        Map<String, String> map = this.f160338a;
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
                if (this.f160338a.size() < this.f160339b || this.f160338a.containsKey(strB)) {
                    String value = entry.getValue();
                    this.f160338a.put(strB, value == null ? "" : c(value, this.f160340c));
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                nf.g.f().k("Ignored " + i10 + " entries when adding custom keys. Maximum allowable: " + this.f160339b);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private String b(String str) {
        if (str != null) {
            return c(str, this.f160340c);
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
        this.f160339b = i10;
        this.f160340c = i11;
    }
}
