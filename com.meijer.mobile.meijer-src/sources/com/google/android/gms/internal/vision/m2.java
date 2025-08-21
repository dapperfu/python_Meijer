package com.google.android.gms.internal.vision;

import java.util.Iterator;

/* loaded from: classes6.dex */
final class m2 implements Iterator<String> {

    /* renamed from: a, reason: collision with root package name */
    private Iterator<String> f85433a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ j2 f85434b;

    m2(j2 j2Var) {
        this.f85434b = j2Var;
        this.f85433a = j2Var.f85403a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f85433a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f85433a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
