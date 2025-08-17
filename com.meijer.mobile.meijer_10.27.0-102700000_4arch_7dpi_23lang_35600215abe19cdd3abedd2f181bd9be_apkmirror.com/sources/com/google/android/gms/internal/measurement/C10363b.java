package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10363b {

    /* renamed from: d, reason: collision with root package name */
    private static final Ce.O f82126d = Ce.O.B("_syn", "_err", "_el");

    /* renamed from: a, reason: collision with root package name */
    private String f82127a;

    /* renamed from: b, reason: collision with root package name */
    private final long f82128b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f82129c;

    public final long a() {
        return this.f82128b;
    }

    public final String b() {
        return this.f82127a;
    }

    public final void c(String str) {
        this.f82127a = str;
    }

    public final Map f() {
        return this.f82129c;
    }

    public static Object h(String str, Object obj, Object obj2) {
        if (f82126d.contains(str) && (obj2 instanceof Double)) {
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
            this.f82129c.remove(str);
        } else {
            Map map = this.f82129c;
            map.put(str, h(str, map.get(str), obj));
        }
    }

    public final Object e(String str) {
        Map map = this.f82129c;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10363b)) {
            return false;
        }
        C10363b c10363b = (C10363b) obj;
        if (this.f82128b == c10363b.f82128b && this.f82127a.equals(c10363b.f82127a)) {
            return this.f82129c.equals(c10363b.f82129c);
        }
        return false;
    }

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final C10363b clone() {
        return new C10363b(this.f82127a, this.f82128b, new HashMap(this.f82129c));
    }

    public final int hashCode() {
        int iHashCode = this.f82127a.hashCode() * 31;
        long j10 = this.f82128b;
        return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f82129c.hashCode();
    }

    public final String toString() {
        String str = this.f82127a;
        String string = this.f82129c.toString();
        int length = String.valueOf(str).length();
        long j10 = this.f82128b;
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

    public C10363b(String str, long j10, Map map) {
        this.f82127a = str;
        this.f82128b = j10;
        HashMap map2 = new HashMap();
        this.f82129c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }
}
