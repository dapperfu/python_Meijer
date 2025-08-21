package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class E5 extends LinkedHashMap {

    /* renamed from: b, reason: collision with root package name */
    private static final E5 f82597b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f82598a;

    private E5() {
        this.f82598a = true;
    }

    public static E5 a() {
        return f82597b;
    }

    public final void d() {
        this.f82598a = false;
    }

    public final boolean f() {
        return this.f82598a;
    }

    static {
        E5 e52 = new E5();
        f82597b = e52;
        e52.f82598a = false;
    }

    private E5(Map map) {
        super(map);
        this.f82598a = true;
    }

    private static int g(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC10557i5) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = C10611o5.f83156b;
        int length = bArr.length;
        int iC = C10611o5.c(length, bArr, 0, length);
        if (iC == 0) {
            return 1;
        }
        return iC;
    }

    private final void i() {
        if (!this.f82598a) {
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

    public final void b(E5 e52) {
        i();
        if (!e52.isEmpty()) {
            putAll(e52);
        }
    }

    public final E5 c() {
        if (isEmpty()) {
            return new E5();
        }
        return new E5(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
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
        byte[] bArr = C10611o5.f83156b;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        i();
        for (Object obj : map.keySet()) {
            byte[] bArr = C10611o5.f83156b;
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
