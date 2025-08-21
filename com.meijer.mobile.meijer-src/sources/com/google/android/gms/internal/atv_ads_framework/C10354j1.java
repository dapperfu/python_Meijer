package com.google.android.gms.internal.atv_ads_framework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.j1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10354j1 extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    private static final C10354j1 f81857b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f81858a;

    private C10354j1() {
        this.f81858a = true;
    }

    public final void b() {
        this.f81858a = false;
    }

    public final boolean d() {
        return this.f81858a;
    }

    static {
        C10354j1 c10354j1 = new C10354j1();
        f81857b = c10354j1;
        c10354j1.f81858a = false;
    }

    private C10354j1(Map map) {
        super(map);
        this.f81858a = true;
    }

    private static int f(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof M0) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = S0.f81715d;
        int length = bArr.length;
        int iB = S0.b(length, bArr, 0, length);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    private final void g() {
        if (!this.f81858a) {
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

    public final C10354j1 a() {
        if (isEmpty()) {
            return new C10354j1();
        }
        return new C10354j1(this);
    }

    public final void c(C10354j1 c10354j1) {
        g();
        if (!c10354j1.isEmpty()) {
            putAll(c10354j1);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        super.clear();
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
        int iF = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f(entry.getValue()) ^ f(entry.getKey());
        }
        return iF;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        g();
        byte[] bArr = S0.f81715d;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        g();
        for (Object obj : map.keySet()) {
            byte[] bArr = S0.f81715d;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        g();
        return super.remove(obj);
    }
}
