package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes6.dex */
public final class FB {

    /* renamed from: b, reason: collision with root package name */
    private static final String f66759b = Integer.toString(0, 36);

    /* renamed from: a, reason: collision with root package name */
    public final String f66760a;

    public FB(String str) {
        this.f66760a = str;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString(f66759b, this.f66760a);
        return bundle;
    }
}
