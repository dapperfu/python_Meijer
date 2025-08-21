package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.content.Context;
import android.content.SharedPreferences;
import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public abstract class c1 {
    public static SharedPreferences a(Context context, BarcodeCount mode) {
        Intrinsics.j(context, "context");
        Intrinsics.j(mode, "mode");
        SharedPreferences sharedPreferences = context.getSharedPreferences("barcode_count_toolbar_preferences_key", 0);
        Intrinsics.g(sharedPreferences);
        Intrinsics.j(mode, "mode");
        Intrinsics.j(sharedPreferences, "sharedPreferences");
        if (!sharedPreferences.contains("barcode_count_toolbar_audio_feedback_key")) {
            sharedPreferences.edit().putBoolean("barcode_count_toolbar_audio_feedback_key", mode.getFeedback().getSuccess().getSound() != null).apply();
        }
        if (!sharedPreferences.contains("barcode_count_toolbar_haptic_feedback_key")) {
            sharedPreferences.edit().putBoolean("barcode_count_toolbar_haptic_feedback_key", mode.getFeedback().getSuccess().getVibration() != null).apply();
        }
        Intrinsics.i(sharedPreferences, "also(...)");
        return sharedPreferences;
    }
}
