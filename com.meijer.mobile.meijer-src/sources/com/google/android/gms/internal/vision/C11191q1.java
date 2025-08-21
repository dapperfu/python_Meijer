package com.google.android.gms.internal.vision;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.vision.q1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11191q1<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b, reason: collision with root package name */
    private static final C11191q1 f85477b;

    /* renamed from: a, reason: collision with root package name */
    private boolean f85478a;

    private C11191q1() {
        this.f85478a = true;
    }

    public final void f() {
        this.f85478a = false;
    }

    static {
        C11191q1 c11191q1 = new C11191q1();
        f85477b = c11191q1;
        c11191q1.f85478a = false;
    }

    private static int a(Object obj) {
        if (obj instanceof byte[]) {
            return S0.j((byte[]) obj);
        }
        if (obj instanceof R0) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static <K, V> C11191q1<K, V> b() {
        return f85477b;
    }

    private final void i() {
        if (!this.f85478a) {
            throw new UnsupportedOperationException();
        }
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C11191q1.equals(java.lang.Object):boolean");
    }

    public final boolean g() {
        return this.f85478a;
    }

    private C11191q1(Map<K, V> map) {
        super(map);
        this.f85478a = true;
    }

    public final void c(C11191q1<K, V> c11191q1) {
        i();
        if (!c11191q1.isEmpty()) {
            putAll(c11191q1);
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        super.clear();
    }

    public final C11191q1<K, V> d() {
        if (isEmpty()) {
            return new C11191q1<>();
        }
        return new C11191q1<>(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iA = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iA += a(entry.getValue()) ^ a(entry.getKey());
        }
        return iA;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k10, V v10) {
        i();
        S0.d(k10);
        S0.d(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        i();
        for (K k10 : map.keySet()) {
            S0.d(k10);
            S0.d(map.get(k10));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        i();
        return (V) super.remove(obj);
    }
}
