package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.gg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8254gg0 extends AbstractC10072xh0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8467ig0 f75208a;

    @Override // com.google.android.gms.internal.ads.AbstractC10072xh0
    final Map a() {
        return this.f75208a;
    }

    C8254gg0(C8467ig0 c8467ig0) {
        this.f75208a = c8467ig0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC10072xh0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return C6750Cg0.a(this.f75208a.f75834c.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C8361hg0(this.f75208a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        C8467ig0 c8467ig0 = this.f75208a;
        AbstractC9963wg0.p(c8467ig0.f75835d, entry.getKey());
        return true;
    }
}
