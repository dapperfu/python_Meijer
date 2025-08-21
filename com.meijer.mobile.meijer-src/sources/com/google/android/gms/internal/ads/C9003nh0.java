package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.nh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9003nh0 extends AbstractC8684ki0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f77960a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f77961b;

    C9003nh0(Object obj) {
        this.f77960a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f77961b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f77961b) {
            throw new NoSuchElementException();
        }
        this.f77961b = true;
        return this.f77960a;
    }
}
