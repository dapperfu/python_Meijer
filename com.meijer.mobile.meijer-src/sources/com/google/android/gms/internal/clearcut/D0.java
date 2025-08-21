package com.google.android.gms.internal.clearcut;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public final class D0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b, reason: collision with root package name */
    private static final D0 f81947b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f81948a;

    static {
        D0 d02 = new D0();
        f81947b = d02;
        d02.f81948a = false;
    }

    private D0() {
        this.f81948a = true;
    }

    public static <K, V> D0<K, V> c() {
        return f81947b;
    }

    private final void f() {
        if (!this.f81948a) {
            throw new UnsupportedOperationException();
        }
    }

    private static int g(Object obj) {
        if (obj instanceof byte[]) {
            return C10424h0.b((byte[]) obj);
        }
        if (obj instanceof InterfaceC10427i0) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public final boolean a() {
        return this.f81948a;
    }

    public final void b(D0<K, V> d02) {
        f();
        if (d02.isEmpty()) {
            return;
        }
        putAll(d02);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        super.clear();
    }

    public final D0<K, V> d() {
        return isEmpty() ? new D0<>() : new D0<>(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005c A[RETURN] */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.util.Map
            r1 = 0
            if (r0 == 0) goto L5d
            java.util.Map r7 = (java.util.Map) r7
            r0 = 1
            if (r6 == r7) goto L59
            int r2 = r6.size()
            int r3 = r7.size()
            if (r2 == r3) goto L16
        L14:
            r7 = r1
            goto L5a
        L16:
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L59
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            boolean r4 = r7.containsKey(r4)
            if (r4 != 0) goto L35
            goto L14
        L35:
            java.lang.Object r4 = r3.getValue()
            java.lang.Object r3 = r3.getKey()
            java.lang.Object r3 = r7.get(r3)
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L52
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L52
            byte[] r4 = (byte[]) r4
            byte[] r3 = (byte[]) r3
            boolean r3 = java.util.Arrays.equals(r4, r3)
            goto L56
        L52:
            boolean r3 = r4.equals(r3)
        L56:
            if (r3 != 0) goto L1e
            goto L14
        L59:
            r7 = r0
        L5a:
            if (r7 == 0) goto L5d
            return r0
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.D0.equals(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iG = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iG += g(entry.getValue()) ^ g(entry.getKey());
        }
        return iG;
    }

    public final void i() {
        this.f81948a = false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        f();
        C10424h0.a(k10);
        C10424h0.a(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        f();
        for (K k10 : map.keySet()) {
            C10424h0.a(k10);
            C10424h0.a(map.get(k10));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        f();
        return (V) super.remove(obj);
    }

    private D0(Map<K, V> map) {
        super(map);
        this.f81948a = true;
    }
}
