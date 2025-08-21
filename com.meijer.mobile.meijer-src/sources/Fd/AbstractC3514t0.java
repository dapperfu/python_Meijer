package Fd;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: Fd.t0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC3514t0 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private transient Set f10307a;

    /* renamed from: b, reason: collision with root package name */
    private transient Collection f10308b;

    abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f10307a;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.f10307a = setA;
        return setA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f10308b;
        if (collection != null) {
            return collection;
        }
        C3503s0 c3503s0 = new C3503s0(this);
        this.f10308b = c3503s0;
        return c3503s0;
    }

    AbstractC3514t0() {
    }
}
