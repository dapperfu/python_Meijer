package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.ue0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9745ue0 {
    @SuppressLint({"RestrictedApi"})
    public static InterfaceC9638te0 a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new C9852ve0(new C7052Le0(context));
    }
}
