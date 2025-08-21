package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Ah0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC6684Ah0 extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    private transient Set f65997a;

    /* renamed from: b, reason: collision with root package name */
    private transient Collection f65998b;

    abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f65997a;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.f65997a = setA;
        return setA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f65998b;
        if (collection != null) {
            return collection;
        }
        C10286zh0 c10286zh0 = new C10286zh0(this);
        this.f65998b = c10286zh0;
        return c10286zh0;
    }

    AbstractC6684Ah0() {
    }
}
