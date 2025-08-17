package Dd;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: Dd.t0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC3292t0 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private transient Set f6274a;

    /* renamed from: b, reason: collision with root package name */
    private transient Collection f6275b;

    abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f6274a;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.f6274a = setA;
        return setA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f6275b;
        if (collection != null) {
            return collection;
        }
        C3281s0 c3281s0 = new C3281s0(this);
        this.f6275b = c3281s0;
        return c3281s0;
    }

    AbstractC3292t0() {
    }
}
