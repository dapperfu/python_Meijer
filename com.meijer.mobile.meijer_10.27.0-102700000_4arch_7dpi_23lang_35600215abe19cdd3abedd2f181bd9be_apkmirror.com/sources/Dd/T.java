package Dd;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class T extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Z f5521a;

    T(Z z10) {
        this.f5521a = z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f5521a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapV = this.f5521a.v();
        if (mapV != null) {
            return mapV.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int I10 = this.f5521a.I(entry.getKey());
            if (I10 != -1 && r.a(Z.r(this.f5521a, I10), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Z z10 = this.f5521a;
        Map mapV = z10.v();
        return mapV != null ? mapV.entrySet().iterator() : new Q(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapV = this.f5521a.v();
        if (mapV != null) {
            return mapV.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Z z10 = this.f5521a;
        if (z10.D()) {
            return false;
        }
        int iH = z10.H();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Z z11 = this.f5521a;
        int iB = C3070a0.b(key, value, iH, Z.q(z11), z11.a(), z11.b(), z11.c());
        if (iB == -1) {
            return false;
        }
        this.f5521a.C(iB, iH);
        Z z12 = this.f5521a;
        z12.f5678f--;
        this.f5521a.A();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f5521a.size();
    }
}
