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
class C10288d1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a, reason: collision with root package name */
    private final int f81407a;

    /* renamed from: b, reason: collision with root package name */
    private List<C10309k1> f81408b;

    /* renamed from: c, reason: collision with root package name */
    private Map<K, V> f81409c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f81410d;

    /* renamed from: e, reason: collision with root package name */
    private volatile C10315m1 f81411e;

    /* renamed from: f, reason: collision with root package name */
    private Map<K, V> f81412f;

    /* renamed from: g, reason: collision with root package name */
    private volatile C10297g1 f81413g;

    private C10288d1(int i10) {
        this.f81407a = i10;
        this.f81408b = Collections.EMPTY_LIST;
        Map<K, V> map = Collections.EMPTY_MAP;
        this.f81409c = map;
        this.f81412f = map;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int b(K r5) {
        /*
            r4 = this;
            java.util.List<com.google.android.gms.internal.clearcut.k1> r0 = r4.f81408b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L25
            java.util.List<com.google.android.gms.internal.clearcut.k1> r2 = r4.f81408b
            java.lang.Object r2 = r2.get(r1)
            com.google.android.gms.internal.clearcut.k1 r2 = (com.google.android.gms.internal.clearcut.C10309k1) r2
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
            java.util.List<com.google.android.gms.internal.clearcut.k1> r3 = r4.f81408b
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.clearcut.k1 r3 = (com.google.android.gms.internal.clearcut.C10309k1) r3
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C10288d1.b(java.lang.Comparable):int");
    }

    static <FieldDescriptorType extends Z<FieldDescriptorType>> C10288d1<FieldDescriptorType, Object> g(int i10) {
        return new C10291e1(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V i(int i10) {
        v();
        V v10 = (V) this.f81408b.remove(i10).getValue();
        if (!this.f81409c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = w().entrySet().iterator();
            this.f81408b.add(new C10309k1(this, it.next()));
            it.remove();
        }
        return v10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        if (this.f81410d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> w() {
        v();
        if (this.f81409c.isEmpty() && !(this.f81409c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f81409c = treeMap;
            this.f81412f = treeMap.descendingMap();
        }
        return (SortedMap) this.f81409c;
    }

    public final boolean a() {
        return this.f81410d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        v();
        if (!this.f81408b.isEmpty()) {
            this.f81408b.clear();
        }
        if (this.f81409c.isEmpty()) {
            return;
        }
        this.f81409c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return b(comparable) >= 0 || this.f81409c.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final V put(K k10, V v10) {
        v();
        int iB = b(k10);
        if (iB >= 0) {
            return (V) this.f81408b.get(iB).setValue(v10);
        }
        v();
        if (this.f81408b.isEmpty() && !(this.f81408b instanceof ArrayList)) {
            this.f81408b = new ArrayList(this.f81407a);
        }
        int i10 = -(iB + 1);
        if (i10 >= this.f81407a) {
            return w().put(k10, v10);
        }
        int size = this.f81408b.size();
        int i11 = this.f81407a;
        if (size == i11) {
            C10309k1 c10309k1Remove = this.f81408b.remove(i11 - 1);
            w().put((Comparable) c10309k1Remove.getKey(), c10309k1Remove.getValue());
        }
        this.f81408b.add(i10, new C10309k1(this, k10, v10));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f81411e == null) {
            this.f81411e = new C10315m1(this, null);
        }
        return this.f81411e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10288d1)) {
            return super.equals(obj);
        }
        C10288d1 c10288d1 = (C10288d1) obj;
        int size = size();
        if (size != c10288d1.size()) {
            return false;
        }
        int iQ = q();
        if (iQ != c10288d1.q()) {
            return entrySet().equals(c10288d1.entrySet());
        }
        for (int i10 = 0; i10 < iQ; i10++) {
            if (!h(i10).equals(c10288d1.h(i10))) {
                return false;
            }
        }
        if (iQ != size) {
            return this.f81409c.equals(c10288d1.f81409c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iB = b(comparable);
        return iB >= 0 ? (V) this.f81408b.get(iB).getValue() : this.f81409c.get(comparable);
    }

    public final Map.Entry<K, V> h(int i10) {
        return this.f81408b.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iQ = q();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iQ; i10++) {
            iHashCode += this.f81408b.get(i10).hashCode();
        }
        return this.f81409c.size() > 0 ? iHashCode + this.f81409c.hashCode() : iHashCode;
    }

    public final int q() {
        return this.f81408b.size();
    }

    public final Iterable<Map.Entry<K, V>> r() {
        return this.f81409c.isEmpty() ? C10300h1.a() : this.f81409c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        v();
        Comparable comparable = (Comparable) obj;
        int iB = b(comparable);
        if (iB >= 0) {
            return i(iB);
        }
        if (this.f81409c.isEmpty()) {
            return null;
        }
        return this.f81409c.remove(comparable);
    }

    final Set<Map.Entry<K, V>> s() {
        if (this.f81413g == null) {
            this.f81413g = new C10297g1(this, null);
        }
        return this.f81413g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f81408b.size() + this.f81409c.size();
    }

    public void x() {
        if (this.f81410d) {
            return;
        }
        this.f81409c = this.f81409c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f81409c);
        this.f81412f = this.f81412f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f81412f);
        this.f81410d = true;
    }

    /* synthetic */ C10288d1(int i10, C10291e1 c10291e1) {
        this(i10);
    }
}
