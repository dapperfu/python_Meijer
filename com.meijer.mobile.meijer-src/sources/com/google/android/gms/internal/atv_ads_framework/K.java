package com.google.android.gms.internal.atv_ads_framework;

import java.util.NoSuchElementException;

/* loaded from: classes6.dex */
final class K extends W {

    /* renamed from: a, reason: collision with root package name */
    boolean f81678a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f81679b;

    K(Object obj) {
        this.f81679b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f81678a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f81678a) {
            throw new NoSuchElementException();
        }
        this.f81678a = true;
        return this.f81679b;
    }
}
