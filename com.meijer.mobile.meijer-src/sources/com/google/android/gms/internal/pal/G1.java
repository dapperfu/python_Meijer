package com.google.android.gms.internal.pal;

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
class G1 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private final int f83454a;

    /* renamed from: b, reason: collision with root package name */
    private List f83455b = Collections.EMPTY_LIST;

    /* renamed from: c, reason: collision with root package name */
    private Map f83456c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f83457d;

    /* renamed from: e, reason: collision with root package name */
    private volatile E1 f83458e;

    /* renamed from: f, reason: collision with root package name */
    private Map f83459f;

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G1)) {
            return super.equals(obj);
        }
        G1 g12 = (G1) obj;
        int size = size();
        if (size != g12.size()) {
            return false;
        }
        int iB = b();
        if (iB != g12.b()) {
            return entrySet().equals(g12.entrySet());
        }
        for (int i10 = 0; i10 < iB; i10++) {
            if (!h(i10).equals(g12.h(i10))) {
                return false;
            }
        }
        if (iB != size) {
            return this.f83456c.equals(g12.f83456c);
        }
        return true;
    }

    public final boolean k() {
        return this.f83457d;
    }

    private final int n(Comparable comparable) {
        int size = this.f83455b.size();
        int i10 = size - 1;
        int i11 = 0;
        if (i10 >= 0) {
            int iCompareTo = comparable.compareTo(((C11118z1) this.f83455b.get(i10)).a());
            if (iCompareTo > 0) {
                return -(size + 1);
            }
            if (iCompareTo == 0) {
                return i10;
            }
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) / 2;
            int iCompareTo2 = comparable.compareTo(((C11118z1) this.f83455b.get(i12)).a());
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
        if (this.f83457d) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f83457d) {
            return;
        }
        this.f83456c = this.f83456c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f83456c);
        this.f83459f = this.f83459f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f83459f);
        this.f83457d = true;
    }

    public final int b() {
        return this.f83455b.size();
    }

    public final Iterable c() {
        return this.f83456c.isEmpty() ? C11102y1.a() : this.f83456c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return n(comparable) >= 0 || this.f83456c.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f83458e == null) {
            this.f83458e = new E1(this, null);
        }
        return this.f83458e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iN = n(comparable);
        return iN >= 0 ? ((C11118z1) this.f83455b.get(iN)).getValue() : this.f83456c.get(comparable);
    }

    public final Map.Entry h(int i10) {
        return (Map.Entry) this.f83455b.get(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f83455b.size() + this.f83456c.size();
    }

    /* synthetic */ G1(int i10, F1 f12) {
        this.f83454a = i10;
        Map map = Collections.EMPTY_MAP;
        this.f83456c = map;
        this.f83459f = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q(int i10) {
        s();
        Object value = ((C11118z1) this.f83455b.remove(i10)).getValue();
        if (!this.f83456c.isEmpty()) {
            Iterator it = r().entrySet().iterator();
            List list = this.f83455b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C11118z1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return value;
    }

    private final SortedMap r() {
        s();
        if (this.f83456c.isEmpty() && !(this.f83456c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f83456c = treeMap;
            this.f83459f = treeMap.descendingMap();
        }
        return (SortedMap) this.f83456c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        s();
        if (!this.f83455b.isEmpty()) {
            this.f83455b.clear();
        }
        if (!this.f83456c.isEmpty()) {
            this.f83456c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        s();
        int iN = n(comparable);
        if (iN >= 0) {
            return ((C11118z1) this.f83455b.get(iN)).setValue(obj);
        }
        s();
        if (this.f83455b.isEmpty() && !(this.f83455b instanceof ArrayList)) {
            this.f83455b = new ArrayList(this.f83454a);
        }
        int i10 = -(iN + 1);
        if (i10 >= this.f83454a) {
            return r().put(comparable, obj);
        }
        int size = this.f83455b.size();
        int i11 = this.f83454a;
        if (size == i11) {
            C11118z1 c11118z1 = (C11118z1) this.f83455b.remove(i11 - 1);
            r().put(c11118z1.a(), c11118z1.getValue());
        }
        this.f83455b.add(i10, new C11118z1(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iB = b();
        int iHashCode = 0;
        for (int i10 = 0; i10 < iB; i10++) {
            iHashCode += ((C11118z1) this.f83455b.get(i10)).hashCode();
        }
        if (this.f83456c.size() > 0) {
            return iHashCode + this.f83456c.hashCode();
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
        if (this.f83456c.isEmpty()) {
            return null;
        }
        return this.f83456c.remove(comparable);
    }
}
