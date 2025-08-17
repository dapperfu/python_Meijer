package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.hb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8226hb0 {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static final C8226hb0 f74748b = new C8226hb0();

    /* renamed from: a, reason: collision with root package name */
    private Context f74749a;

    private C8226hb0() {
    }

    public static C8226hb0 b() {
        return f74748b;
    }

    public final Context a() {
        return this.f74749a;
    }

    public final void c(Context context) {
        this.f74749a = context != null ? context.getApplicationContext() : null;
    }
}
