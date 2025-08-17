package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.cA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7655cA {

    /* renamed from: c, reason: collision with root package name */
    private static final String f73133c = Integer.toString(0, 36);

    /* renamed from: d, reason: collision with root package name */
    private static final String f73134d = Integer.toString(1, 36);

    /* renamed from: a, reason: collision with root package name */
    public final String f73135a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73136b;

    public C7655cA(String str, int i10) {
        this.f73135a = str;
        this.f73136b = i10;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(f73133c, this.f73135a);
        bundle.putInt(f73134d, this.f73136b);
        return bundle;
    }
}
