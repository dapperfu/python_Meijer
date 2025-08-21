package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.cA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7780cA {

    /* renamed from: c, reason: collision with root package name */
    private static final String f73973c = Integer.toString(0, 36);

    /* renamed from: d, reason: collision with root package name */
    private static final String f73974d = Integer.toString(1, 36);

    /* renamed from: a, reason: collision with root package name */
    public final String f73975a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73976b;

    public C7780cA(String str, int i10) {
        this.f73975a = str;
        this.f73976b = i10;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(f73973c, this.f73975a);
        bundle.putInt(f73974d, this.f73976b);
        return bundle;
    }
}
