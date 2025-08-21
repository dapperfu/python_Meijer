package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.kg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8680kg0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    Map.Entry f76536a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Iterator f76537b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C8787lg0 f76538c;

    C8680kg0(C8787lg0 c8787lg0, Iterator it) {
        this.f76537b = it;
        this.f76538c = c8787lg0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f76537b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f76537b.next();
        this.f76536a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        C6782Df0.m(this.f76536a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f76536a.getValue();
        this.f76537b.remove();
        this.f76538c.f77463b.f80358e -= collection.size();
        collection.clear();
        this.f76536a = null;
    }
}
