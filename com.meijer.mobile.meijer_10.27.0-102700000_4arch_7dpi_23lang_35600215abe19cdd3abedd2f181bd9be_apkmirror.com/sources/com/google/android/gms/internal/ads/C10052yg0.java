package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.yg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10052yg0 extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC10159zg0 f80264a;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f80264a.zze();
    }

    C10052yg0(AbstractC10159zg0 abstractC10159zg0) {
        this.f80264a = abstractC10159zg0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f80264a.zzp();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Iterator it = this.f80264a.zzs().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f80264a.c();
    }
}
