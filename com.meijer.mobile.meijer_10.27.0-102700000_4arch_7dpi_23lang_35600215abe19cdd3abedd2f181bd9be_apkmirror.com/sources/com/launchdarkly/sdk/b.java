package com.launchdarkly.sdk;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final b f91289a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, LDValue> f91290b;

    b() {
        this(null);
    }

    LDValue c(String str) {
        for (b bVar = this; bVar != null; bVar = bVar.f91289a) {
            LDValue lDValue = bVar.f91290b.get(str);
            if (lDValue != null) {
                if (lDValue.k()) {
                    return null;
                }
                return lDValue;
            }
        }
        return null;
    }

    b(b bVar) {
        this.f91289a = bVar;
        this.f91290b = new HashMap();
    }

    private void b(Map<String, LDValue> map) {
        b bVar = this.f91289a;
        if (bVar != null) {
            bVar.b(map);
        }
        for (Map.Entry<String, LDValue> entry : this.f91290b.entrySet()) {
            String key = entry.getKey();
            LDValue value = entry.getValue();
            if (value.k()) {
                map.remove(key);
            } else {
                map.put(key, value);
            }
        }
    }

    Map<String, LDValue> a() {
        if (this.f91289a == null) {
            return this.f91290b;
        }
        HashMap map = new HashMap();
        b(map);
        return map;
    }

    void d(String str, LDValue lDValue) {
        this.f91290b.put(str, lDValue);
    }

    void e(String str) {
        if (this.f91289a == null) {
            this.f91290b.remove(str);
        } else {
            this.f91290b.put(str, LDValue.u());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            return a().equals(((b) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return a().hashCode();
    }
}
