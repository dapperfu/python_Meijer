package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.yb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10042yb0 {

    /* renamed from: a, reason: collision with root package name */
    private static UiModeManager f80258a;

    public static EnumC6952Ma0 a() {
        UiModeManager uiModeManager = f80258a;
        if (uiModeManager == null) {
            return EnumC6952Ma0.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? EnumC6952Ma0.OTHER : EnumC6952Ma0.CTV : EnumC6952Ma0.MOBILE;
    }

    public static void b(Context context) {
        if (context != null) {
            f80258a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
