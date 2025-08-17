package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.zg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
abstract class AbstractC10159zg0 implements InterfaceC6627Ch0 {

    /* renamed from: a, reason: collision with root package name */
    private transient Set f80459a;

    /* renamed from: b, reason: collision with root package name */
    private transient Collection f80460b;

    /* renamed from: c, reason: collision with root package name */
    private transient Map f80461c;

    AbstractC10159zg0() {
    }

    abstract Collection b();

    abstract Iterator c();

    abstract Map d();

    abstract Set e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC6627Ch0) {
            return zzs().equals(((InterfaceC6627Ch0) obj).zzs());
        }
        return false;
    }

    public final Set f() {
        Set set = this.f80459a;
        if (set != null) {
            return set;
        }
        Set setE = e();
        this.f80459a = setE;
        return setE;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6627Ch0
    public final Collection zzr() {
        Collection collection = this.f80460b;
        if (collection != null) {
            return collection;
        }
        Collection collectionB = b();
        this.f80460b = collectionB;
        return collectionB;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6627Ch0
    public final Map zzs() {
        Map map = this.f80461c;
        if (map != null) {
            return map;
        }
        Map mapD = d();
        this.f80461c = mapD;
        return mapD;
    }

    public final int hashCode() {
        return zzs().hashCode();
    }

    public final String toString() {
        return zzs().toString();
    }
}
