package Fd;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class T extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Z f9554a;

    T(Z z10) {
        this.f9554a = z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f9554a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Map mapT = this.f9554a.t();
        if (mapT != null) {
            return mapT.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int I10 = this.f9554a.I(entry.getKey());
            if (I10 != -1 && r.a(Z.r(this.f9554a, I10), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Z z10 = this.f9554a;
        Map mapT = z10.t();
        return mapT != null ? mapT.entrySet().iterator() : new Q(z10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Map mapT = this.f9554a.t();
        if (mapT != null) {
            return mapT.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Z z10 = this.f9554a;
        if (z10.D()) {
            return false;
        }
        int iH = z10.H();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Z z11 = this.f9554a;
        int iB = C3292a0.b(key, value, iH, Z.q(z11), z11.a(), z11.b(), z11.c());
        if (iB == -1) {
            return false;
        }
        this.f9554a.B(iB, iH);
        Z z12 = this.f9554a;
        z12.f9711f--;
        this.f9554a.y();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9554a.size();
    }
}
