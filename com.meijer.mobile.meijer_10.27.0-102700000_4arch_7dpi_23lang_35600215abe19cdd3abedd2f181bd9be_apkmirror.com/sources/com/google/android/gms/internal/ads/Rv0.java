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
    private Object[] f69959a;

    /* renamed from: b, reason: collision with root package name */
    private int f69960b;

    /* renamed from: c, reason: collision with root package name */
    private Map f69961c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f69962d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Pv0 f69963e;

    /* renamed from: f, reason: collision with root package name */
    private Map f69964f;

    private Rv0() {
        Map map = Collections.EMPTY_MAP;
        this.f69961c = map;
        this.f69964f = map;
    }

    public final int c() {
        return this.f69960b;
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
        int i10 = this.f69960b;
        if (i10 != rv0.f69960b) {
            return entrySet().equals(rv0.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!h(i11).equals(rv0.h(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f69961c.equals(rv0.f69961c);
        }
        return true;
    }

    public final boolean k() {
        return this.f69962d;
    }

    private final int q(Comparable comparable) {
        int i10 = this.f69960b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((Lv0) this.f69959a[i11]).a());
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((Lv0) this.f69959a[i13]).a());
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
    public final void v() {
        if (this.f69962d) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f69962d) {
            return;
        }
        this.f69961c = this.f69961c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f69961c);
        this.f69964f = this.f69964f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f69964f);
        this.f69962d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return q(comparable) >= 0 || this.f69961c.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f69961c.isEmpty() ? Collections.EMPTY_SET : this.f69961c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f69963e == null) {
            this.f69963e = new Pv0(this, null);
        }
        return this.f69963e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iQ = q(comparable);
        return iQ >= 0 ? ((Lv0) this.f69959a[iQ]).getValue() : this.f69961c.get(comparable);
    }

    public final Map.Entry h(int i10) {
        if (i10 < this.f69960b) {
            return (Lv0) this.f69959a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f69960b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f69959a[i11].hashCode();
        }
        return this.f69961c.size() > 0 ? iHashCode + this.f69961c.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f69960b + this.f69961c.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(int i10) {
        v();
        Object value = ((Lv0) this.f69959a[i10]).getValue();
        Object[] objArr = this.f69959a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f69960b - i10) - 1);
        this.f69960b--;
        if (!this.f69961c.isEmpty()) {
            Iterator it = s().entrySet().iterator();
            Object[] objArr2 = this.f69959a;
            int i11 = this.f69960b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new Lv0(this, (Comparable) entry.getKey(), entry.getValue());
            this.f69960b++;
            it.remove();
        }
        return value;
    }

    private final SortedMap s() {
        v();
        if (this.f69961c.isEmpty() && !(this.f69961c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f69961c = treeMap;
            this.f69964f = treeMap.descendingMap();
        }
        return (SortedMap) this.f69961c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        v();
        if (this.f69960b != 0) {
            this.f69959a = null;
            this.f69960b = 0;
        }
        if (!this.f69961c.isEmpty()) {
            this.f69961c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        v();
        int iQ = q(comparable);
        if (iQ >= 0) {
            return ((Lv0) this.f69959a[iQ]).setValue(obj);
        }
        v();
        if (this.f69959a == null) {
            this.f69959a = new Object[16];
        }
        int i10 = -(iQ + 1);
        if (i10 >= 16) {
            return s().put(comparable, obj);
        }
        if (this.f69960b == 16) {
            Lv0 lv0 = (Lv0) this.f69959a[15];
            this.f69960b = 15;
            s().put(lv0.a(), lv0.getValue());
        }
        Object[] objArr = this.f69959a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f69959a[i10] = new Lv0(this, comparable, obj);
        this.f69960b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        v();
        Comparable comparable = (Comparable) obj;
        int iQ = q(comparable);
        if (iQ >= 0) {
            return r(iQ);
        }
        if (this.f69961c.isEmpty()) {
            return null;
        }
        return this.f69961c.remove(comparable);
    }

    /* synthetic */ Rv0(Qv0 qv0) {
        Map map = Collections.EMPTY_MAP;
        this.f69961c = map;
        this.f69964f = map;
    }
}
