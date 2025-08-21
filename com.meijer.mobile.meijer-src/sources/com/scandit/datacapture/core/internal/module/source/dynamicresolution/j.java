package com.scandit.datacapture.core.internal.module.source.dynamicresolution;

import android.content.Context;
import com.scandit.datacapture.core.internal.module.source.NativeCameraSettingsDefaults;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.common.async.MainThreadHelper;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final MainThreadHelper f126008a = new MainThreadHelper();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f126009b = NativeCameraSettingsDefaults.dynamicResolutionLogging();

    public static void a(String message) {
        Intrinsics.j(message, "message");
        if (f126009b) {
            com.scandit.datacapture.core.internal.module.utils.i.a("Dynamic resolution - " + message);
        }
    }

    public static void b(String message) {
        Context context = AppAndroidEnvironment.INSTANCE.getApplicationContext();
        Intrinsics.j(message, "message");
        Intrinsics.j(context, "context");
        if (f126009b) {
            f126008a.runOnMainThread(new i(context, message));
        }
        a(message);
    }
}
