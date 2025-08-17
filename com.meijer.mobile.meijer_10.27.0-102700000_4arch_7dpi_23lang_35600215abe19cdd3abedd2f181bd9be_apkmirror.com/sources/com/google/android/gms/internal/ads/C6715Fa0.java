package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Fa0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6715Fa0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f66830a;

    final boolean b() {
        return this.f66830a;
    }

    final void a(Context context) {
        C6649Db0.c(context, "Application Context cannot be null");
        if (this.f66830a) {
            return;
        }
        this.f66830a = true;
        C8545kb0.b().c(context);
        C7586bb0.i().d(context);
        C10042yb0.b(context);
        C10149zb0.d(context);
        C6615Cb0.a(context);
        C8226hb0.b().c(context);
        C7479ab0.a().c(context);
        C8759mb0.a().e(context);
    }
}
