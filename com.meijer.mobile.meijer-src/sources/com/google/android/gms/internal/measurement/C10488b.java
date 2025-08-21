package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10488b {

    /* renamed from: d, reason: collision with root package name */
    private static final Ee.O f82966d = Ee.O.B("_syn", "_err", "_el");

    /* renamed from: a, reason: collision with root package name */
    private String f82967a;

    /* renamed from: b, reason: collision with root package name */
    private final long f82968b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f82969c;

    public final long a() {
        return this.f82968b;
    }

    public final String b() {
        return this.f82967a;
    }

    public final void c(String str) {
        this.f82967a = str;
    }

    public final Map f() {
        return this.f82969c;
    }

    public static Object h(String str, Object obj, Object obj2) {
        if (f82966d.contains(str) && (obj2 instanceof Double)) {
            return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
        }
        if (str.startsWith("_")) {
            if (!(obj instanceof String) && obj != null) {
                return obj;
            }
        } else if (!(obj instanceof Double)) {
            if (obj instanceof Long) {
                return Long.valueOf(Math.round(((Double) obj2).doubleValue()));
            }
            if (obj instanceof String) {
                return obj2.toString();
            }
        }
        return obj2;
    }

    public final void d(String str, Object obj) {
        if (obj == null) {
            this.f82969c.remove(str);
        } else {
            Map map = this.f82969c;
            map.put(str, h(str, map.get(str), obj));
        }
    }

    public final Object e(String str) {
        Map map = this.f82969c;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10488b)) {
            return false;
        }
        C10488b c10488b = (C10488b) obj;
        if (this.f82968b == c10488b.f82968b && this.f82967a.equals(c10488b.f82967a)) {
            return this.f82969c.equals(c10488b.f82969c);
        }
        return false;
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final C10488b clone() {
        return new C10488b(this.f82967a, this.f82968b, new HashMap(this.f82969c));
    }

    public final int hashCode() {
        int iHashCode = this.f82967a.hashCode() * 31;
        long j10 = this.f82968b;
        return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f82969c.hashCode();
    }

    public final String toString() {
        String str = this.f82967a;
        String string = this.f82969c.toString();
        int length = String.valueOf(str).length();
        long j10 = this.f82968b;
        StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(j10).length() + 9 + string.length() + 1);
        sb2.append("Event{name='");
        sb2.append(str);
        sb2.append("', timestamp=");
        sb2.append(j10);
        sb2.append(", params=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }

    public C10488b(String str, long j10, Map map) {
        this.f82967a = str;
        this.f82968b = j10;
        HashMap map2 = new HashMap();
        this.f82969c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }
}
