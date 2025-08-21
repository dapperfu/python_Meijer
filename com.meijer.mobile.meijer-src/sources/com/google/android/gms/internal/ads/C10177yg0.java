package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.yg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10177yg0 extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC10284zg0 f81104a;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f81104a.zze();
    }

    C10177yg0(AbstractC10284zg0 abstractC10284zg0) {
        this.f81104a = abstractC10284zg0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f81104a.zzp();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Iterator it = this.f81104a.zzs().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f81104a.c();
    }
}
