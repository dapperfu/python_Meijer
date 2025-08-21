package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.yb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10167yb0 {

    /* renamed from: a, reason: collision with root package name */
    private static UiModeManager f81098a;

    public static EnumC7077Ma0 a() {
        UiModeManager uiModeManager = f81098a;
        if (uiModeManager == null) {
            return EnumC7077Ma0.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? EnumC7077Ma0.OTHER : EnumC7077Ma0.CTV : EnumC7077Ma0.MOBILE;
    }

    public static void b(Context context) {
        if (context != null) {
            f81098a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
