package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.kg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8555kg0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    Map.Entry f75696a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Iterator f75697b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C8662lg0 f75698c;

    C8555kg0(C8662lg0 c8662lg0, Iterator it) {
        this.f75697b = it;
        this.f75698c = c8662lg0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f75697b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f75697b.next();
        this.f75696a = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        C6657Df0.m(this.f75696a != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f75696a.getValue();
        this.f75697b.remove();
        this.f75698c.f76623b.f79518e -= collection.size();
        collection.clear();
        this.f75696a = null;
    }
}
