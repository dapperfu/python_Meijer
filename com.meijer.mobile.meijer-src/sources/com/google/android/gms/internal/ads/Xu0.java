package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class Xu0 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private final Iterator f72279a;

    public Xu0(Iterator it) {
        this.f72279a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f72279a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f72279a.next();
        return entry.getValue() instanceof Zu0 ? new Wu0(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f72279a.remove();
    }
}
