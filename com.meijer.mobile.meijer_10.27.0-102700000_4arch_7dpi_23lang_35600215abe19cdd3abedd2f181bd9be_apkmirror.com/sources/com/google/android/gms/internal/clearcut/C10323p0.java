package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.clearcut.p0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10323p0<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: a, reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f81539a;

    public C10323p0(Iterator<Map.Entry<K, Object>> it) {
        this.f81539a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f81539a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f81539a.next();
        return next.getValue() instanceof C10314m0 ? new C10320o0(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f81539a.remove();
    }
}
