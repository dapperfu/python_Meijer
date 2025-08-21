package com.google.android.gms.common.util;

import android.content.Context;
import com.fullstory.FS;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f65791a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th2) {
        try {
            com.google.android.gms.common.internal.r.l(context);
            com.google.android.gms.common.internal.r.l(th2);
            return false;
        } catch (Exception e10) {
            FS.log_e("CrashUtils", "Error adding exception to DropBox!", e10);
            return false;
        }
    }
}
