package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.gg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8129gg0 extends AbstractC9947xh0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8342ig0 f74368a;

    @Override // com.google.android.gms.internal.ads.AbstractC9947xh0
    final Map a() {
        return this.f74368a;
    }

    C8129gg0(C8342ig0 c8342ig0) {
        this.f74368a = c8342ig0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9947xh0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return C6625Cg0.a(this.f74368a.f74994c.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C8236hg0(this.f74368a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        C8342ig0 c8342ig0 = this.f74368a;
        AbstractC9838wg0.p(c8342ig0.f74995d, entry.getKey());
        return true;
    }
}
