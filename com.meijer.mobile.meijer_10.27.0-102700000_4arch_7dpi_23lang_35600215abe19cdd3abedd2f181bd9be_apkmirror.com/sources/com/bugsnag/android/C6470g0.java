package com.bugsnag.android;

import android.app.ActivityManager;
import android.content.Context;

/* renamed from: com.bugsnag.android.g0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class C6470g0 {

    /* renamed from: a, reason: collision with root package name */
    private final ActivityManager f63436a;

    Boolean b() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfoA = a();
            if (runningAppProcessInfoA != null) {
                return Boolean.valueOf(runningAppProcessInfoA.importance <= 125);
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    private ActivityManager.RunningAppProcessInfo a() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        ActivityManager.getMyMemoryState(runningAppProcessInfo);
        return runningAppProcessInfo;
    }

    C6470g0(Context context) {
        this.f63436a = C6504y.a(context);
    }
}
