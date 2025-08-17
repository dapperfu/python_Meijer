package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.jg0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C8448jg0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    final Iterator f75504a;

    /* renamed from: b, reason: collision with root package name */
    Collection f75505b = null;

    /* renamed from: c, reason: collision with root package name */
    Iterator f75506c = EnumC8771mh0.INSTANCE;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ AbstractC9838wg0 f75507d;

    C8448jg0(AbstractC9838wg0 abstractC9838wg0) {
        this.f75507d = abstractC9838wg0;
        this.f75504a = abstractC9838wg0.f79517d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f75504a.hasNext() || this.f75506c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f75506c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f75504a.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f75505b = collection;
            this.f75506c = collection.iterator();
        }
        return this.f75506c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f75506c.remove();
        Collection collection = this.f75505b;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f75504a.remove();
        }
        AbstractC9838wg0 abstractC9838wg0 = this.f75507d;
        abstractC9838wg0.f79518e--;
    }
}
