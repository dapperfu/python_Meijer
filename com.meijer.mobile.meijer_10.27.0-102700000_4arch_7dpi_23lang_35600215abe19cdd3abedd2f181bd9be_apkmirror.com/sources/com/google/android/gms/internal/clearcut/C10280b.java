package com.google.android.gms.internal.clearcut;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.UserManager;

/* renamed from: com.google.android.gms.internal.clearcut.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C10280b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile UserManager f81380a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile boolean f81381b = !b();

    private C10280b() {
    }

    public static boolean a(Context context) {
        return b() && !c(context);
    }

    private static boolean b() {
        return true;
    }

    @TargetApi(24)
    private static boolean c(Context context) {
        boolean z10 = f81381b;
        if (z10) {
            return z10;
        }
        UserManager userManager = f81380a;
        if (userManager == null) {
            synchronized (C10280b.class) {
                try {
                    userManager = f81380a;
                    if (userManager == null) {
                        UserManager userManager2 = (UserManager) context.getSystemService(UserManager.class);
                        f81380a = userManager2;
                        if (userManager2 == null) {
                            f81381b = true;
                            return true;
                        }
                        userManager = userManager2;
                    }
                } finally {
                }
            }
        }
        boolean zIsUserUnlocked = userManager.isUserUnlocked();
        f81381b = zIsUserUnlocked;
        if (zIsUserUnlocked) {
            f81380a = null;
        }
        return zIsUserUnlocked;
    }
}
