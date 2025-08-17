package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.r5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10512r5 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    private final Iterator f82362a;

    public C10512r5(Iterator it) {
        this.f82362a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f82362a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f82362a.next();
        return entry.getValue() instanceof C10521s5 ? new C10504q5(entry, null) : entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f82362a.remove();
    }
}
