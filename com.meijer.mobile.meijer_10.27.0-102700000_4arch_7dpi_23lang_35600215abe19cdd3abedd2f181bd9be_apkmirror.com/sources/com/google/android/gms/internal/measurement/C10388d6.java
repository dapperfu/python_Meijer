package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.d6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C10388d6 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f82154a;

    /* renamed from: b, reason: collision with root package name */
    private int f82155b;

    /* renamed from: c, reason: collision with root package name */
    private Map f82156c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f82157d;

    /* renamed from: e, reason: collision with root package name */
    private volatile C10379c6 f82158e;

    /* renamed from: f, reason: collision with root package name */
    private Map f82159f;

    private C10388d6() {
        Map map = Collections.EMPTY_MAP;
        this.f82156c = map;
        this.f82159f = map;
    }

    public final boolean b() {
        return this.f82157d;
    }

    public final int c() {
        return this.f82155b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10388d6)) {
            return super.equals(obj);
        }
        C10388d6 c10388d6 = (C10388d6) obj;
        int size = size();
        if (size != c10388d6.size()) {
            return false;
        }
        int i10 = this.f82155b;
        if (i10 != c10388d6.f82155b) {
            return entrySet().equals(c10388d6.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!d(i11).equals(c10388d6.d(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f82156c.equals(c10388d6.f82156c);
        }
        return true;
    }

    final /* synthetic */ Object[] j() {
        return this.f82154a;
    }

    final /* synthetic */ int k() {
        return this.f82155b;
    }

    final /* synthetic */ Map n() {
        return this.f82156c;
    }

    private final int r(Comparable comparable) {
        int i10 = this.f82155b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((C10361a6) this.f82154a[i11]).a());
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((C10361a6) this.f82154a[i13]).a());
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
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void i() {
        if (this.f82157d) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f82157d) {
            return;
        }
        this.f82156c = this.f82156c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f82156c);
        this.f82159f = this.f82159f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f82159f);
        this.f82157d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return r(comparable) >= 0 || this.f82156c.containsKey(comparable);
    }

    public final Map.Entry d(int i10) {
        if (i10 < this.f82155b) {
            return (C10361a6) this.f82154a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f82158e == null) {
            this.f82158e = new C10379c6(this, null);
        }
        return this.f82158e;
    }

    public final Iterable f() {
        return this.f82156c.isEmpty() ? Collections.EMPTY_SET : this.f82156c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iR = r(comparable);
        return iR >= 0 ? ((C10361a6) this.f82154a[iR]).getValue() : this.f82156c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f82155b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f82154a[i11].hashCode();
        }
        return this.f82156c.size() > 0 ? iHashCode + this.f82156c.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f82155b + this.f82156c.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final Object h(int i10) {
        i();
        Object value = ((C10361a6) this.f82154a[i10]).getValue();
        Object[] objArr = this.f82154a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f82155b - i10) - 1);
        this.f82155b--;
        if (!this.f82156c.isEmpty()) {
            Iterator it = v().entrySet().iterator();
            Object[] objArr2 = this.f82154a;
            int i11 = this.f82155b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new C10361a6(this, (Comparable) entry.getKey(), entry.getValue());
            this.f82155b++;
            it.remove();
        }
        return value;
    }

    private final SortedMap v() {
        i();
        if (this.f82156c.isEmpty() && !(this.f82156c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f82156c = treeMap;
            this.f82159f = treeMap.descendingMap();
        }
        return (SortedMap) this.f82156c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        if (this.f82155b != 0) {
            this.f82154a = null;
            this.f82155b = 0;
        }
        if (!this.f82156c.isEmpty()) {
            this.f82156c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        i();
        int iR = r(comparable);
        if (iR >= 0) {
            return ((C10361a6) this.f82154a[iR]).setValue(obj);
        }
        i();
        if (this.f82154a == null) {
            this.f82154a = new Object[16];
        }
        int i10 = -(iR + 1);
        if (i10 >= 16) {
            return v().put(comparable, obj);
        }
        if (this.f82155b == 16) {
            C10361a6 c10361a6 = (C10361a6) this.f82154a[15];
            this.f82155b = 15;
            v().put(c10361a6.a(), c10361a6.getValue());
        }
        Object[] objArr = this.f82154a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f82154a[i10] = new C10361a6(this, comparable, obj);
        this.f82155b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        i();
        Comparable comparable = (Comparable) obj;
        int iR = r(comparable);
        if (iR >= 0) {
            return h(iR);
        }
        if (this.f82156c.isEmpty()) {
            return null;
        }
        return this.f82156c.remove(comparable);
    }

    /* synthetic */ C10388d6(byte[] bArr) {
        Map map = Collections.EMPTY_MAP;
        this.f82156c = map;
        this.f82159f = map;
    }
}
