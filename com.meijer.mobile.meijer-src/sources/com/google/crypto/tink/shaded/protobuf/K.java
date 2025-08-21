package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C11454z;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public final class K<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b, reason: collision with root package name */
    private static final K<?, ?> f89121b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f89122a;

    private K() {
        this.f89122a = true;
    }

    static <K, V> boolean i(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !g(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public void k() {
        this.f89122a = false;
    }

    static {
        K<?, ?> k10 = new K<>();
        f89121b = k10;
        k10.k();
    }

    private static int b(Object obj) {
        if (obj instanceof byte[]) {
            return C11454z.d((byte[]) obj);
        }
        if (obj instanceof C11454z.c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static <K, V> K<K, V> d() {
        return (K<K, V>) f89121b;
    }

    private static boolean g(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && i(this, (Map) obj);
    }

    public boolean j() {
        return this.f89122a;
    }

    private K(Map<K, V> map) {
        super(map);
        this.f89122a = true;
    }

    static <K, V> int a(Map<K, V> map) {
        int iB = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            iB += b(entry.getValue()) ^ b(entry.getKey());
        }
        return iB;
    }

    private static void c(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            C11454z.a(obj);
            C11454z.a(map.get(obj));
        }
    }

    private void f() {
        if (j()) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        f();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public void n(K<K, V> k10) {
        f();
        if (!k10.isEmpty()) {
            putAll(k10);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        f();
        C11454z.a(k10);
        C11454z.a(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        f();
        c(map);
        super.putAll(map);
    }

    public K<K, V> q() {
        if (isEmpty()) {
            return new K<>();
        }
        return new K<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        f();
        return (V) super.remove(obj);
    }
}
