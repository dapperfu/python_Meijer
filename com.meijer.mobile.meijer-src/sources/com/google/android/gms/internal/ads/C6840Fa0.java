package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Fa0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6840Fa0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f67670a;

    final boolean b() {
        return this.f67670a;
    }

    final void a(Context context) {
        C6774Db0.c(context, "Application Context cannot be null");
        if (this.f67670a) {
            return;
        }
        this.f67670a = true;
        C8670kb0.b().c(context);
        C7711bb0.i().d(context);
        C10167yb0.b(context);
        C10274zb0.d(context);
        C6740Cb0.a(context);
        C8351hb0.b().c(context);
        C7604ab0.a().c(context);
        C8884mb0.a().e(context);
    }
}
