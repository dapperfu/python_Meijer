package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.zg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC10284zg0 implements InterfaceC6752Ch0 {

    /* renamed from: a, reason: collision with root package name */
    private transient Set f81299a;

    /* renamed from: b, reason: collision with root package name */
    private transient Collection f81300b;

    /* renamed from: c, reason: collision with root package name */
    private transient Map f81301c;

    AbstractC10284zg0() {
    }

    abstract Collection b();

    abstract Iterator c();

    abstract Map d();

    abstract Set e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC6752Ch0) {
            return zzs().equals(((InterfaceC6752Ch0) obj).zzs());
        }
        return false;
    }

    public final Set f() {
        Set set = this.f81299a;
        if (set != null) {
            return set;
        }
        Set setE = e();
        this.f81299a = setE;
        return setE;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6752Ch0
    public final Collection zzr() {
        Collection collection = this.f81300b;
        if (collection != null) {
            return collection;
        }
        Collection collectionB = b();
        this.f81300b = collectionB;
        return collectionB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6752Ch0
    public final Map zzs() {
        Map map = this.f81301c;
        if (map != null) {
            return map;
        }
        Map mapD = d();
        this.f81301c = mapD;
        return mapD;
    }

    public final int hashCode() {
        return zzs().hashCode();
    }

    public final String toString() {
        return zzs().toString();
    }
}
