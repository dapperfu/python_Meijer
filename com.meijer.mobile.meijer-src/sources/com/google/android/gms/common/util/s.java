package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.fullstory.FS;
import sd.C17067f;

/* loaded from: classes4.dex */
public final class s {
    public static boolean a(Context context, int i10) throws PackageManager.NameNotFoundException {
        if (!b(context, i10, "com.google.android.gms")) {
            return false;
        }
        try {
            return id.j.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            if (!Log.isLoggable("UidVerifier", 3)) {
                return false;
            }
            FS.log_d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
            return false;
        }
    }

    @TargetApi(19)
    public static boolean b(Context context, int i10, String str) {
        return C17067f.a(context).h(i10, str);
    }
}
