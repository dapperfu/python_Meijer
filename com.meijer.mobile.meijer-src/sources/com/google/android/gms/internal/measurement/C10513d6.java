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
class C10513d6 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private Object[] f82994a;

    /* renamed from: b, reason: collision with root package name */
    private int f82995b;

    /* renamed from: c, reason: collision with root package name */
    private Map f82996c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f82997d;

    /* renamed from: e, reason: collision with root package name */
    private volatile C10504c6 f82998e;

    /* renamed from: f, reason: collision with root package name */
    private Map f82999f;

    private C10513d6() {
        Map map = Collections.EMPTY_MAP;
        this.f82996c = map;
        this.f82999f = map;
    }

    public final boolean b() {
        return this.f82997d;
    }

    public final int c() {
        return this.f82995b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10513d6)) {
            return super.equals(obj);
        }
        C10513d6 c10513d6 = (C10513d6) obj;
        int size = size();
        if (size != c10513d6.size()) {
            return false;
        }
        int i10 = this.f82995b;
        if (i10 != c10513d6.f82995b) {
            return entrySet().equals(c10513d6.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!d(i11).equals(c10513d6.d(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f82996c.equals(c10513d6.f82996c);
        }
        return true;
    }

    final /* synthetic */ Object[] j() {
        return this.f82994a;
    }

    final /* synthetic */ int k() {
        return this.f82995b;
    }

    final /* synthetic */ Map n() {
        return this.f82996c;
    }

    private final int r(Comparable comparable) {
        int i10 = this.f82995b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((C10486a6) this.f82994a[i11]).a());
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((C10486a6) this.f82994a[i13]).a());
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
        if (this.f82997d) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f82997d) {
            return;
        }
        this.f82996c = this.f82996c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f82996c);
        this.f82999f = this.f82999f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f82999f);
        this.f82997d = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return r(comparable) >= 0 || this.f82996c.containsKey(comparable);
    }

    public final Map.Entry d(int i10) {
        if (i10 < this.f82995b) {
            return (C10486a6) this.f82994a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f82998e == null) {
            this.f82998e = new C10504c6(this, null);
        }
        return this.f82998e;
    }

    public final Iterable f() {
        return this.f82996c.isEmpty() ? Collections.EMPTY_SET : this.f82996c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iR = r(comparable);
        return iR >= 0 ? ((C10486a6) this.f82994a[iR]).getValue() : this.f82996c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f82995b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f82994a[i11].hashCode();
        }
        return this.f82996c.size() > 0 ? iHashCode + this.f82996c.hashCode() : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f82995b + this.f82996c.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final Object h(int i10) {
        i();
        Object value = ((C10486a6) this.f82994a[i10]).getValue();
        Object[] objArr = this.f82994a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f82995b - i10) - 1);
        this.f82995b--;
        if (!this.f82996c.isEmpty()) {
            Iterator it = t().entrySet().iterator();
            Object[] objArr2 = this.f82994a;
            int i11 = this.f82995b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new C10486a6(this, (Comparable) entry.getKey(), entry.getValue());
            this.f82995b++;
            it.remove();
        }
        return value;
    }

    private final SortedMap t() {
        i();
        if (this.f82996c.isEmpty() && !(this.f82996c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f82996c = treeMap;
            this.f82999f = treeMap.descendingMap();
        }
        return (SortedMap) this.f82996c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        i();
        if (this.f82995b != 0) {
            this.f82994a = null;
            this.f82995b = 0;
        }
        if (!this.f82996c.isEmpty()) {
            this.f82996c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        i();
        int iR = r(comparable);
        if (iR >= 0) {
            return ((C10486a6) this.f82994a[iR]).setValue(obj);
        }
        i();
        if (this.f82994a == null) {
            this.f82994a = new Object[16];
        }
        int i10 = -(iR + 1);
        if (i10 >= 16) {
            return t().put(comparable, obj);
        }
        if (this.f82995b == 16) {
            C10486a6 c10486a6 = (C10486a6) this.f82994a[15];
            this.f82995b = 15;
            t().put(c10486a6.a(), c10486a6.getValue());
        }
        Object[] objArr = this.f82994a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f82994a[i10] = new C10486a6(this, comparable, obj);
        this.f82995b++;
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
        if (this.f82996c.isEmpty()) {
            return null;
        }
        return this.f82996c.remove(comparable);
    }

    /* synthetic */ C10513d6(byte[] bArr) {
        Map map = Collections.EMPTY_MAP;
        this.f82996c = map;
        this.f82999f = map;
    }
}
