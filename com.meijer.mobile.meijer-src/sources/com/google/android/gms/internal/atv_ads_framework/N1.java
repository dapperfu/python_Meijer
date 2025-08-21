package com.google.android.gms.internal.atv_ads_framework;

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
class N1 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private final int f81688a;

    /* renamed from: b, reason: collision with root package name */
    private List f81689b = Collections.EMPTY_LIST;

    /* renamed from: c, reason: collision with root package name */
    private Map f81690c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f81691d;

    /* renamed from: e, reason: collision with root package name */
    private volatile L1 f81692e;

    /* renamed from: f, reason: collision with root package name */
    private Map f81693f;

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N1)) {
            return super.equals(obj);
        }
        N1 n12 = (N1) obj;
        int size = size();
        if (size != n12.size()) {
            return false;
        }
        int iB = b();
        if (iB != n12.b()) {
            return entrySet().equals(n12.entrySet());
        }
        for (int i10 = 0; i10 < iB; i10++) {
            if (!h(i10).equals(n12.h(i10))) {
                return false;
            }
        }
        if (iB != size) {
            return this.f81690c.equals(n12.f81690c);
        }
        return true;
    }

    public final boolean k() {
        return this.f81691d;
    }

    private final int n(Comparable comparable) {
        int size = this.f81689b.size();
        int i10 = size - 1;
        int i11 = 0;
        if (i10 >= 0) {
            int iCompareTo = comparable.compareTo(((H1) this.f81689b.get(i10)).a());
            if (iCompareTo > 0) {
                return -(size + 1);
            }
            if (iCompareTo == 0) {
                return i10;
            }
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int iCompareTo2 = comparable.compareTo(((H1) this.f81689b.get(i12)).a());
            if (iCompareTo2 < 0) {
                i10 = i12 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i12;
                }
                i11 = i12 + 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        if (this.f81691d) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f81691d) {
            return;
        }
        this.f81690c = this.f81690c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f81690c);
        this.f81693f = this.f81693f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f81693f);
        this.f81691d = true;
    }

    public final int b() {
        return this.f81689b.size();
    }

    public final Iterable c() {
        return this.f81690c.isEmpty() ? G1.a() : this.f81690c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return n(comparable) >= 0 || this.f81690c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f81692e == null) {
            this.f81692e = new L1(this, null);
        }
        return this.f81692e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iN = n(comparable);
        return iN >= 0 ? ((H1) this.f81689b.get(iN)).getValue() : this.f81690c.get(comparable);
    }

    public final Map.Entry h(int i10) {
        return (Map.Entry) this.f81689b.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f81689b.size() + this.f81690c.size();
    }

    /* synthetic */ N1(int i10, M1 m12) {
        this.f81688a = i10;
        Map map = Collections.EMPTY_MAP;
        this.f81690c = map;
        this.f81693f = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(int i10) {
        s();
        Object value = ((H1) this.f81689b.remove(i10)).getValue();
        if (!this.f81690c.isEmpty()) {
            Iterator it = r().entrySet().iterator();
            List list = this.f81689b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new H1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap r() {
        s();
        if (this.f81690c.isEmpty() && !(this.f81690c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f81690c = treeMap;
            this.f81693f = treeMap.descendingMap();
        }
        return (SortedMap) this.f81690c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        s();
        if (!this.f81689b.isEmpty()) {
            this.f81689b.clear();
        }
        if (!this.f81690c.isEmpty()) {
            this.f81690c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        s();
        int iN = n(comparable);
        if (iN >= 0) {
            return ((H1) this.f81689b.get(iN)).setValue(obj);
        }
        s();
        if (this.f81689b.isEmpty() && !(this.f81689b instanceof ArrayList)) {
            this.f81689b = new ArrayList(this.f81688a);
        }
        int i10 = -(iN + 1);
        if (i10 >= this.f81688a) {
            return r().put(comparable, obj);
        }
        int size = this.f81689b.size();
        int i11 = this.f81688a;
        if (size == i11) {
            H1 h12 = (H1) this.f81689b.remove(i11 - 1);
            r().put(h12.a(), h12.getValue());
        }
        this.f81689b.add(i10, new H1(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iB = b();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            iHashCode += ((H1) this.f81689b.get(i10)).hashCode();
        }
        if (this.f81690c.size() > 0) {
            return iHashCode + this.f81690c.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        s();
        Comparable comparable = (Comparable) obj;
        int iN = n(comparable);
        if (iN >= 0) {
            return q(iN);
        }
        if (this.f81690c.isEmpty()) {
            return null;
        }
        return this.f81690c.remove(comparable);
    }
}
