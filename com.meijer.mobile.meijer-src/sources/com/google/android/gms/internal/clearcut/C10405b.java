package com.google.android.gms.internal.clearcut;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.UserManager;

/* renamed from: com.google.android.gms.internal.clearcut.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C10405b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile UserManager f82220a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f82221b = !b();

    private C10405b() {
    }

    public static boolean a(Context context) {
        return b() && !c(context);
    }

    private static boolean b() {
        return true;
    }

    @TargetApi(24)
    private static boolean c(Context context) {
        boolean z10 = f82221b;
        if (z10) {
            return z10;
        }
        UserManager userManager = f82220a;
        if (userManager == null) {
            synchronized (C10405b.class) {
                try {
                    userManager = f82220a;
                    if (userManager == null) {
                        UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                        f82220a = userManager2;
                        if (userManager2 == null) {
                            f82221b = true;
                            return true;
                        }
                        userManager = userManager2;
                    }
                } finally {
                }
            }
        }
        boolean zIsUserUnlocked = userManager.isUserUnlocked();
        f82221b = zIsUserUnlocked;
        if (zIsUserUnlocked) {
            f82220a = null;
        }
        return zIsUserUnlocked;
    }
}
