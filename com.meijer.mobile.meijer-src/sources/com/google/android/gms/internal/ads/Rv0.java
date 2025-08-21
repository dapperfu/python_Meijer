package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes6.dex */
class Rv0 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f70799a;

    /* renamed from: b, reason: collision with root package name */
    private int f70800b;

    /* renamed from: c, reason: collision with root package name */
    private Map f70801c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f70802d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Pv0 f70803e;

    /* renamed from: f, reason: collision with root package name */
    private Map f70804f;

    private Rv0() {
        Map map = Collections.EMPTY_MAP;
        this.f70801c = map;
        this.f70804f = map;
    }

    public final int c() {
        return this.f70800b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rv0)) {
            return super.equals(obj);
        }
        Rv0 rv0 = (Rv0) obj;
        int size = size();
        if (size != rv0.size()) {
            return false;
        }
        int i10 = this.f70800b;
        if (i10 != rv0.f70800b) {
            return entrySet().equals(rv0.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!h(i11).equals(rv0.h(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f70801c.equals(rv0.f70801c);
        }
        return true;
    }

    public final boolean k() {
        return this.f70802d;
    }

    private final int q(Comparable comparable) {
        int i10 = this.f70800b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((Lv0) this.f70799a[i11]).a());
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((Lv0) this.f70799a[i13]).a());
            if (iCompareTo2 < 0) {
                i11 = i13 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        if (this.f70802d) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f70802d) {
            return;
        }
        this.f70801c = this.f70801c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f70801c);
        this.f70804f = this.f70804f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f70804f);
        this.f70802d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return q(comparable) >= 0 || this.f70801c.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f70801c.isEmpty() ? Collections.EMPTY_SET : this.f70801c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f70803e == null) {
            this.f70803e = new Pv0(this, null);
        }
        return this.f70803e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iQ = q(comparable);
        return iQ >= 0 ? ((Lv0) this.f70799a[iQ]).getValue() : this.f70801c.get(comparable);
    }

    public final Map.Entry h(int i10) {
        if (i10 < this.f70800b) {
            return (Lv0) this.f70799a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f70800b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f70799a[i11].hashCode();
        }
        return this.f70801c.size() > 0 ? iHashCode + this.f70801c.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f70800b + this.f70801c.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(int i10) {
        t();
        Object value = ((Lv0) this.f70799a[i10]).getValue();
        Object[] objArr = this.f70799a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f70800b - i10) - 1);
        this.f70800b--;
        if (!this.f70801c.isEmpty()) {
            Iterator it = s().entrySet().iterator();
            Object[] objArr2 = this.f70799a;
            int i11 = this.f70800b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new Lv0(this, (Comparable) entry.getKey(), entry.getValue());
            this.f70800b++;
            it.remove();
        }
        return value;
    }

    private final SortedMap s() {
        t();
        if (this.f70801c.isEmpty() && !(this.f70801c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f70801c = treeMap;
            this.f70804f = treeMap.descendingMap();
        }
        return (SortedMap) this.f70801c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        t();
        if (this.f70800b != 0) {
            this.f70799a = null;
            this.f70800b = 0;
        }
        if (!this.f70801c.isEmpty()) {
            this.f70801c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        t();
        int iQ = q(comparable);
        if (iQ >= 0) {
            return ((Lv0) this.f70799a[iQ]).setValue(obj);
        }
        t();
        if (this.f70799a == null) {
            this.f70799a = new Object[16];
        }
        int i10 = -(iQ + 1);
        if (i10 >= 16) {
            return s().put(comparable, obj);
        }
        if (this.f70800b == 16) {
            Lv0 lv0 = (Lv0) this.f70799a[15];
            this.f70800b = 15;
            s().put(lv0.a(), lv0.getValue());
        }
        Object[] objArr = this.f70799a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f70799a[i10] = new Lv0(this, comparable, obj);
        this.f70800b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        t();
        Comparable comparable = (Comparable) obj;
        int iQ = q(comparable);
        if (iQ >= 0) {
            return r(iQ);
        }
        if (this.f70801c.isEmpty()) {
            return null;
        }
        return this.f70801c.remove(comparable);
    }

    /* synthetic */ Rv0(Qv0 qv0) {
        Map map = Collections.EMPTY_MAP;
        this.f70801c = map;
        this.f70804f = map;
    }
}
