package com.google.android.gms.internal.atv_ads_framework;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
final class K extends W {

    /* renamed from: a, reason: collision with root package name */
    boolean f80838a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f80839b;

    K(Object obj) {
        this.f80839b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f80838a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f80838a) {
            throw new NoSuchElementException();
        }
        this.f80838a = true;
        return this.f80839b;
    }
}
