package com.google.android.gms.internal.vision;

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

/* loaded from: classes6.dex */
class S1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final int f85310a;

    /* renamed from: b, reason: collision with root package name */
    private List<X1> f85311b;

    /* renamed from: c, reason: collision with root package name */
    private Map<K, V> f85312c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f85313d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Z1 f85314e;

    /* renamed from: f, reason: collision with root package name */
    private Map<K, V> f85315f;

    /* renamed from: g, reason: collision with root package name */
    private volatile T1 f85316g;

    private S1(int i10) {
        this.f85310a = i10;
        this.f85311b = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f85312c = map;
        this.f85315f = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S1)) {
            return super.equals(obj);
        }
        S1 s12 = (S1) obj;
        int size = size();
        if (size != s12.size()) {
            return false;
        }
        int iK = k();
        if (iK != s12.k()) {
            return entrySet().equals(s12.entrySet());
        }
        for (int i10 = 0; i10 < iK; i10++) {
            if (!i(i10).equals(s12.i(i10))) {
                return false;
            }
        }
        if (iK != size) {
            return this.f85312c.equals(s12.f85312c);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int a(K r5) {
        /*
            r4 = this;
            java.util.List<com.google.android.gms.internal.vision.X1> r0 = r4.f85311b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L25
            java.util.List<com.google.android.gms.internal.vision.X1> r2 = r4.f85311b
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.vision.X1 r2 = (com.google.android.gms.internal.vision.X1) r2
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
            java.util.List<com.google.android.gms.internal.vision.X1> r3 = r4.f85311b
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.vision.X1 r3 = (com.google.android.gms.internal.vision.X1) r3
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.S1.a(java.lang.Comparable):int");
    }

    static <FieldDescriptorType extends I0<FieldDescriptorType>> S1<FieldDescriptorType, Object> b(int i10) {
        return new R1(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        if (this.f85313d) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f85312c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f85314e == null) {
            this.f85314e = new Z1(this, null);
        }
        return this.f85314e;
    }

    public void f() {
        if (this.f85313d) {
            return;
        }
        this.f85312c = this.f85312c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f85312c);
        this.f85315f = this.f85315f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f85315f);
        this.f85313d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? (V) this.f85311b.get(iA).getValue() : this.f85312c.get(comparable);
    }

    public final Map.Entry<K, V> i(int i10) {
        return this.f85311b.get(i10);
    }

    public final boolean j() {
        return this.f85313d;
    }

    public final int k() {
        return this.f85311b.size();
    }

    public final Iterable<Map.Entry<K, V>> r() {
        return this.f85312c.isEmpty() ? W1.a() : this.f85312c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f85311b.size() + this.f85312c.size();
    }

    final Set<Map.Entry<K, V>> t() {
        if (this.f85316g == null) {
            this.f85316g = new T1(this, null);
        }
        return this.f85316g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V n(int i10) {
        v();
        V v10 = (V) this.f85311b.remove(i10).getValue();
        if (!this.f85312c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = w().entrySet().iterator();
            this.f85311b.add(new X1(this, it.next()));
            it.remove();
        }
        return v10;
    }

    private final SortedMap<K, V> w() {
        v();
        if (this.f85312c.isEmpty() && !(this.f85312c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f85312c = treeMap;
            this.f85315f = treeMap.descendingMap();
        }
        return (SortedMap) this.f85312c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        v();
        if (!this.f85311b.isEmpty()) {
            this.f85311b.clear();
        }
        if (!this.f85312c.isEmpty()) {
            this.f85312c.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final V put(K k10, V v10) {
        v();
        int iA = a(k10);
        if (iA >= 0) {
            return (V) this.f85311b.get(iA).setValue(v10);
        }
        v();
        if (this.f85311b.isEmpty() && !(this.f85311b instanceof ArrayList)) {
            this.f85311b = new ArrayList(this.f85310a);
        }
        int i10 = -(iA + 1);
        if (i10 >= this.f85310a) {
            return w().put(k10, v10);
        }
        int size = this.f85311b.size();
        int i11 = this.f85310a;
        if (size == i11) {
            X1 x1Remove = this.f85311b.remove(i11 - 1);
            w().put((Comparable) x1Remove.getKey(), x1Remove.getValue());
        }
        this.f85311b.add(i10, new X1(this, k10, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iK = k();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iK; i10++) {
            iHashCode += this.f85311b.get(i10).hashCode();
        }
        if (this.f85312c.size() > 0) {
            return iHashCode + this.f85312c.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        v();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return n(iA);
        }
        if (this.f85312c.isEmpty()) {
            return null;
        }
        return this.f85312c.remove(comparable);
    }

    /* synthetic */ S1(int i10, R1 r12) {
        this(i10);
    }
}
