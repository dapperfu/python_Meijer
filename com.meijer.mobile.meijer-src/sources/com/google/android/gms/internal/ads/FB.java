package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class FB {

    /* renamed from: b, reason: collision with root package name */
    private static final String f67599b = Integer.toString(0, 36);

    /* renamed from: a, reason: collision with root package name */
    public final String f67600a;

    public FB(String str) {
        this.f67600a = str;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(f67599b, this.f67600a);
        return bundle;
    }
}
