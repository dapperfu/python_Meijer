package com.google.android.gms.internal.clearcut;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.clearcut.x1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10347x1 implements Iterator<String> {

    /* renamed from: a, reason: collision with root package name */
    private Iterator<String> f81606a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C10341v1 f81607b;

    C10347x1(C10341v1 c10341v1) {
        this.f81607b = c10341v1;
        this.f81606a = c10341v1.f81580a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f81606a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f81606a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
