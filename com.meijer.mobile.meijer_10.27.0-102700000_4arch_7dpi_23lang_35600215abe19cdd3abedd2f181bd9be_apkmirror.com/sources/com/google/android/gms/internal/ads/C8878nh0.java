package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.nh0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8878nh0 extends AbstractC8559ki0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f77120a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f77121b;

    C8878nh0(Object obj) {
        this.f77120a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f77121b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f77121b) {
            throw new NoSuchElementException();
        }
        this.f77121b = true;
        return this.f77120a;
    }
}
