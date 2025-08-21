package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.jg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C8573jg0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f76344a;

    /* renamed from: b, reason: collision with root package name */
    Collection f76345b = null;

    /* renamed from: c, reason: collision with root package name */
    Iterator f76346c = EnumC8896mh0.INSTANCE;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC9963wg0 f76347d;

    C8573jg0(AbstractC9963wg0 abstractC9963wg0) {
        this.f76347d = abstractC9963wg0;
        this.f76344a = abstractC9963wg0.f80357d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f76344a.hasNext() || this.f76346c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f76346c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f76344a.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f76345b = collection;
            this.f76346c = collection.iterator();
        }
        return this.f76346c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f76346c.remove();
        Collection collection = this.f76345b;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f76344a.remove();
        }
        AbstractC9963wg0 abstractC9963wg0 = this.f76347d;
        abstractC9963wg0.f80358e--;
    }
}
