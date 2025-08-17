package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CaptureRequest;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class e0 {
    public static void a(CaptureRequest.Key key, String str, int i10, m0 m0Var, CaptureRequest.Key key2) {
        Intrinsics.i(key, str);
        m0Var.a(key2, Integer.valueOf(i10));
    }
}
