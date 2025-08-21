package com.google.android.gms.internal.clearcut;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.clearcut.d1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C10413d1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final int f82247a;

    /* renamed from: b, reason: collision with root package name */
    private List<C10434k1> f82248b;

    /* renamed from: c, reason: collision with root package name */
    private Map<K, V> f82249c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f82250d;

    /* renamed from: e, reason: collision with root package name */
    private volatile C10440m1 f82251e;

    /* renamed from: f, reason: collision with root package name */
    private Map<K, V> f82252f;

    /* renamed from: g, reason: collision with root package name */
    private volatile C10422g1 f82253g;

    private C10413d1(int i10) {
        this.f82247a = i10;
        this.f82248b = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f82249c = map;
        this.f82252f = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int b(K r5) {
        /*
            r4 = this;
            java.util.List<com.google.android.gms.internal.clearcut.k1> r0 = r4.f82248b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L25
            java.util.List<com.google.android.gms.internal.clearcut.k1> r2 = r4.f82248b
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.clearcut.k1 r2 = (com.google.android.gms.internal.clearcut.C10434k1) r2
            java.lang.Object r2 = r2.getKey()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L22
            int r0 = r0 + 1
        L20:
            int r5 = -r0
            return r5
        L22:
            if (r2 != 0) goto L25
            return r1
        L25:
            r0 = 0
        L26:
            if (r0 > r1) goto L49
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List<com.google.android.gms.internal.clearcut.k1> r3 = r4.f82248b
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.clearcut.k1 r3 = (com.google.android.gms.internal.clearcut.C10434k1) r3
            java.lang.Object r3 = r3.getKey()
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L43
            int r1 = r2 + (-1)
            goto L26
        L43:
            if (r3 <= 0) goto L48
            int r0 = r2 + 1
            goto L26
        L48:
            return r2
        L49:
            int r0 = r0 + 1
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10413d1.b(java.lang.Comparable):int");
    }

    static <FieldDescriptorType extends Z<FieldDescriptorType>> C10413d1<FieldDescriptorType, Object> g(int i10) {
        return new C10416e1(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V i(int i10) {
        t();
        V v10 = (V) this.f82248b.remove(i10).getValue();
        if (!this.f82249c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = v().entrySet().iterator();
            this.f82248b.add(new C10434k1(this, it.next()));
            it.remove();
        }
        return v10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        if (this.f82250d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> v() {
        t();
        if (this.f82249c.isEmpty() && !(this.f82249c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f82249c = treeMap;
            this.f82252f = treeMap.descendingMap();
        }
        return (SortedMap) this.f82249c;
    }

    public final boolean a() {
        return this.f82250d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        t();
        if (!this.f82248b.isEmpty()) {
            this.f82248b.clear();
        }
        if (this.f82249c.isEmpty()) {
            return;
        }
        this.f82249c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.f82249c.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final V put(K k10, V v10) {
        t();
        int iB = b(k10);
        if (iB >= 0) {
            return (V) this.f82248b.get(iB).setValue(v10);
        }
        t();
        if (this.f82248b.isEmpty() && !(this.f82248b instanceof ArrayList)) {
            this.f82248b = new ArrayList(this.f82247a);
        }
        int i10 = -(iB + 1);
        if (i10 >= this.f82247a) {
            return v().put(k10, v10);
        }
        int size = this.f82248b.size();
        int i11 = this.f82247a;
        if (size == i11) {
            C10434k1 c10434k1Remove = this.f82248b.remove(i11 - 1);
            v().put((Comparable) c10434k1Remove.getKey(), c10434k1Remove.getValue());
        }
        this.f82248b.add(i10, new C10434k1(this, k10, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f82251e == null) {
            this.f82251e = new C10440m1(this, null);
        }
        return this.f82251e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10413d1)) {
            return super.equals(obj);
        }
        C10413d1 c10413d1 = (C10413d1) obj;
        int size = size();
        if (size != c10413d1.size()) {
            return false;
        }
        int iQ = q();
        if (iQ != c10413d1.q()) {
            return entrySet().equals(c10413d1.entrySet());
        }
        for (int i10 = 0; i10 < iQ; i10++) {
            if (!h(i10).equals(c10413d1.h(i10))) {
                return false;
            }
        }
        if (iQ != size) {
            return this.f82249c.equals(c10413d1.f82249c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iB = b(comparable);
        return iB >= 0 ? (V) this.f82248b.get(iB).getValue() : this.f82249c.get(comparable);
    }

    public final Map.Entry<K, V> h(int i10) {
        return this.f82248b.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iQ = q();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iQ; i10++) {
            iHashCode += this.f82248b.get(i10).hashCode();
        }
        return this.f82249c.size() > 0 ? iHashCode + this.f82249c.hashCode() : iHashCode;
    }

    public final int q() {
        return this.f82248b.size();
    }

    public final Iterable<Map.Entry<K, V>> r() {
        return this.f82249c.isEmpty() ? C10425h1.a() : this.f82249c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        t();
        Comparable comparable = (Comparable) obj;
        int iB = b(comparable);
        if (iB >= 0) {
            return i(iB);
        }
        if (this.f82249c.isEmpty()) {
            return null;
        }
        return this.f82249c.remove(comparable);
    }

    final Set<Map.Entry<K, V>> s() {
        if (this.f82253g == null) {
            this.f82253g = new C10422g1(this, null);
        }
        return this.f82253g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f82248b.size() + this.f82249c.size();
    }

    public void w() {
        if (this.f82250d) {
            return;
        }
        this.f82249c = this.f82249c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f82249c);
        this.f82252f = this.f82252f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f82252f);
        this.f82250d = true;
    }

    /* synthetic */ C10413d1(int i10, C10416e1 c10416e1) {
        this(i10);
    }
}
