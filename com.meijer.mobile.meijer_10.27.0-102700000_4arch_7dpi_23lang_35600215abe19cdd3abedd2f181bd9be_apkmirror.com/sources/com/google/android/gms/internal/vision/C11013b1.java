package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.b1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11013b1<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: a, reason: collision with root package name */
    private Iterator<Map.Entry<K, Object>> f84515a;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f84515a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.f84515a.next();
        return next.getValue() instanceof C11009a1 ? new C11017c1(next) : next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f84515a.remove();
    }

    public C11013b1(Iterator<Map.Entry<K, Object>> it) {
        this.f84515a = it;
    }
}
