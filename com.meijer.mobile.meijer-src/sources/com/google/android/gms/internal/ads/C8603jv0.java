package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.jv0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8603jv0 extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    private static final C8603jv0 f76374b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f76375a;

    private C8603jv0() {
        this.f76375a = true;
    }

    public static C8603jv0 a() {
        return f76374b;
    }

    public final void c() {
        this.f76375a = false;
    }

    public final boolean f() {
        return this.f76375a;
    }

    static {
        C8603jv0 c8603jv0 = new C8603jv0();
        f76374b = c8603jv0;
        c8603jv0.f76375a = false;
    }

    private C8603jv0(Map map) {
        super(map);
        this.f76375a = true;
    }

    private static int g(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof Ku0) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = Tu0.f71313b;
        int length = bArr.length;
        int iB = Tu0.b(length, bArr, 0, length);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    private final void i() {
        if (!this.f76375a) {
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

    public final C8603jv0 b() {
        if (isEmpty()) {
            return new C8603jv0();
        }
        return new C8603jv0(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        super.clear();
    }

    public final void d(C8603jv0 c8603jv0) {
        i();
        if (!c8603jv0.isEmpty()) {
            putAll(c8603jv0);
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
        byte[] bArr = Tu0.f71313b;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        i();
        for (Object obj : map.keySet()) {
            byte[] bArr = Tu0.f71313b;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        i();
        return super.remove(obj);
    }
}
