package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.p0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10448p0<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: a, reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f82379a;

    public C10448p0(Iterator<Map.Entry<K, Object>> it) {
        this.f82379a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f82379a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f82379a.next();
        return next.getValue() instanceof C10439m0 ? new C10445o0(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f82379a.remove();
    }
}
