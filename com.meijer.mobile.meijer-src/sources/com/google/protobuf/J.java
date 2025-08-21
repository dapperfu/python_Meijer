package com.google.protobuf;

import com.google.protobuf.C11663y;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public final class J<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b, reason: collision with root package name */
    private static final J<?, ?> f91290b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f91291a;

    private J() {
        this.f91291a = true;
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
        this.f91291a = false;
    }

    static {
        J<?, ?> j10 = new J<>();
        f91290b = j10;
        j10.k();
    }

    private static int b(Object obj) {
        if (obj instanceof byte[]) {
            return C11663y.d((byte[]) obj);
        }
        if (obj instanceof C11663y.c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static <K, V> J<K, V> d() {
        return (J<K, V>) f91290b;
    }

    private static boolean g(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && i(this, (Map) obj);
    }

    public boolean j() {
        return this.f91291a;
    }

    private J(Map<K, V> map) {
        super(map);
        this.f91291a = true;
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
            C11663y.a(obj);
            C11663y.a(map.get(obj));
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

    public void n(J<K, V> j10) {
        f();
        if (!j10.isEmpty()) {
            putAll(j10);
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        f();
        C11663y.a(k10);
        C11663y.a(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        f();
        c(map);
        super.putAll(map);
    }

    public J<K, V> q() {
        if (isEmpty()) {
            return new J<>();
        }
        return new J<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        f();
        return (V) super.remove(obj);
    }
}
