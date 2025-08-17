package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

/* renamed from: com.google.android.gms.internal.ads.tF0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9481tF0 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f78527a = new SparseBooleanArray();

    /* renamed from: b, reason: collision with root package name */
    private boolean f78528b;

    public final C9481tF0 a(int i10) {
        C8086gC.f(!this.f78528b);
        this.f78527a.append(i10, true);
        return this;
    }

    public final C9483tG0 b() {
        C8086gC.f(!this.f78528b);
        this.f78528b = true;
        return new C9483tG0(this.f78527a, null);
    }
}
