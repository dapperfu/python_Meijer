package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.hb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8351hb0 {

    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static final C8351hb0 f75588b = new C8351hb0();

    /* renamed from: a, reason: collision with root package name */
    private Context f75589a;

    private C8351hb0() {
    }

    public static C8351hb0 b() {
        return f75588b;
    }

    public final Context a() {
        return this.f75589a;
    }

    public final void c(Context context) {
        this.f75589a = context != null ? context.getApplicationContext() : null;
    }
}
