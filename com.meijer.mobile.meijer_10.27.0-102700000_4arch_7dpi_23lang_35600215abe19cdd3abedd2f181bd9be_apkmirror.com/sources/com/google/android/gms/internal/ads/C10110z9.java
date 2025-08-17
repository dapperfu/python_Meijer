package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.z9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10110z9 {
    public static final String a(Context context, String str, boolean z10) {
        try {
            P8 p8B0 = Q8.b0();
            p8B0.v(str);
            p8B0.u("1.671910402");
            p8B0.w(context.getPackageName());
            p8B0.x(System.currentTimeMillis() / 1000);
            try {
                p8B0.y(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
                p8B0.y(-1L);
            }
            W8 w8A = C8294i9.a(((Q8) p8B0.p()).j(), null);
            w8A.x(5);
            w8A.w(2);
            return Base64.encodeToString(((X8) w8A.p()).j(), 11);
        } catch (UnsupportedEncodingException | GeneralSecurityException unused2) {
            return Integer.toString(7);
        }
    }
}
