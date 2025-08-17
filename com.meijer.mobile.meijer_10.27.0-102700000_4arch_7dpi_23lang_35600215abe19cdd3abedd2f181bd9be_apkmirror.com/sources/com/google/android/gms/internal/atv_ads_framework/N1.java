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
    private final int f80848a;

    /* renamed from: b, reason: collision with root package name */
    private List f80849b = Collections.EMPTY_LIST;

    /* renamed from: c, reason: collision with root package name */
    private Map f80850c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f80851d;

    /* renamed from: e, reason: collision with root package name */
    private volatile L1 f80852e;

    /* renamed from: f, reason: collision with root package name */
    private Map f80853f;

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
            return this.f80850c.equals(n12.f80850c);
        }
        return true;
    }

    public final boolean k() {
        return this.f80851d;
    }

    private final int n(Comparable comparable) {
        int size = this.f80849b.size();
        int i10 = size - 1;
        int i11 = 0;
        if (i10 >= 0) {
            int iCompareTo = comparable.compareTo(((H1) this.f80849b.get(i10)).a());
            if (iCompareTo > 0) {
                return -(size + 1);
            }
            if (iCompareTo == 0) {
                return i10;
            }
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int iCompareTo2 = comparable.compareTo(((H1) this.f80849b.get(i12)).a());
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
        if (this.f80851d) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f80851d) {
            return;
        }
        this.f80850c = this.f80850c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f80850c);
        this.f80853f = this.f80853f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f80853f);
        this.f80851d = true;
    }

    public final int b() {
        return this.f80849b.size();
    }

    public final Iterable c() {
        return this.f80850c.isEmpty() ? G1.a() : this.f80850c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return n(comparable) >= 0 || this.f80850c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f80852e == null) {
            this.f80852e = new L1(this, null);
        }
        return this.f80852e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iN = n(comparable);
        return iN >= 0 ? ((H1) this.f80849b.get(iN)).getValue() : this.f80850c.get(comparable);
    }

    public final Map.Entry h(int i10) {
        return (Map.Entry) this.f80849b.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f80849b.size() + this.f80850c.size();
    }

    /* synthetic */ N1(int i10, M1 m12) {
        this.f80848a = i10;
        Map map = Collections.EMPTY_MAP;
        this.f80850c = map;
        this.f80853f = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(int i10) {
        s();
        Object value = ((H1) this.f80849b.remove(i10)).getValue();
        if (!this.f80850c.isEmpty()) {
            Iterator it = r().entrySet().iterator();
            List list = this.f80849b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new H1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap r() {
        s();
        if (this.f80850c.isEmpty() && !(this.f80850c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f80850c = treeMap;
            this.f80853f = treeMap.descendingMap();
        }
        return (SortedMap) this.f80850c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        s();
        if (!this.f80849b.isEmpty()) {
            this.f80849b.clear();
        }
        if (!this.f80850c.isEmpty()) {
            this.f80850c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        s();
        int iN = n(comparable);
        if (iN >= 0) {
            return ((H1) this.f80849b.get(iN)).setValue(obj);
        }
        s();
        if (this.f80849b.isEmpty() && !(this.f80849b instanceof ArrayList)) {
            this.f80849b = new ArrayList(this.f80848a);
        }
        int i10 = -(iN + 1);
        if (i10 >= this.f80848a) {
            return r().put(comparable, obj);
        }
        int size = this.f80849b.size();
        int i11 = this.f80848a;
        if (size == i11) {
            H1 h12 = (H1) this.f80849b.remove(i11 - 1);
            r().put(h12.a(), h12.getValue());
        }
        this.f80849b.add(i10, new H1(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iB = b();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            iHashCode += ((H1) this.f80849b.get(i10)).hashCode();
        }
        if (this.f80850c.size() > 0) {
            return iHashCode + this.f80850c.hashCode();
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
        if (this.f80850c.isEmpty()) {
            return null;
        }
        return this.f80850c.remove(comparable);
    }
}
