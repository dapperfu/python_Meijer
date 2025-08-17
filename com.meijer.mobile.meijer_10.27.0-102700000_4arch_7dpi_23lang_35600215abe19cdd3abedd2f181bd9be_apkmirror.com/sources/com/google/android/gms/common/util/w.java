package com.google.android.gms.common.util;

import android.os.StrictMode;

/* loaded from: classes4.dex */
final class w {
    static StrictMode.VmPolicy.Builder a(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }
}
