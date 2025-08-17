package com.google.android.gms.internal.pal;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class Z0 extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    private static final Z0 f82982b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f82983a;

    private Z0() {
        this.f82983a = true;
    }

    public static Z0 a() {
        return f82982b;
    }

    public final void c() {
        this.f82983a = false;
    }

    public final boolean f() {
        return this.f82983a;
    }

    static {
        Z0 z02 = new Z0();
        f82982b = z02;
        z02.f82983a = false;
    }

    private Z0(Map map) {
        super(map);
        this.f82983a = true;
    }

    private static int g(Object obj) {
        if (obj instanceof byte[]) {
            return J0.b((byte[]) obj);
        }
        if (obj instanceof E0) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private final void i() {
        if (!this.f82983a) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final Z0 b() {
        if (isEmpty()) {
            return new Z0();
        }
        return new Z0(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        super.clear();
    }

    public final void d(Z0 z02) {
        i();
        if (!z02.isEmpty()) {
            putAll(z02);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int iG = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iG += g(entry.getValue()) ^ g(entry.getKey());
        }
        return iG;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        i();
        J0.e(obj);
        J0.e(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        i();
        for (Object obj : map.keySet()) {
            J0.e(obj);
            J0.e(map.get(obj));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        i();
        return super.remove(obj);
    }
}
