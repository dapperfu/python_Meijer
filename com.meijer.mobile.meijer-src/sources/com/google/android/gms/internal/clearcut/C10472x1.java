package com.google.android.gms.internal.clearcut;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.clearcut.x1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10472x1 implements Iterator<String> {

    /* renamed from: a, reason: collision with root package name */
    private Iterator<String> f82446a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C10466v1 f82447b;

    C10472x1(C10466v1 c10466v1) {
        this.f82447b = c10466v1;
        this.f82446a = c10466v1.f82420a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f82446a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.f82446a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
