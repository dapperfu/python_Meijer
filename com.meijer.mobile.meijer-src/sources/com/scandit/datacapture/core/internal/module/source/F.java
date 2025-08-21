package com.scandit.datacapture.core.internal.module.source;

import android.hardware.camera2.CameraManager;
import com.scandit.datacapture.core.internal.module.source.api2.C13477q;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes12.dex */
public final class F {
    public static final InterfaceC13507x a(F f10, NativeCameraApi nativeCameraApi) {
        f10.getClass();
        int i10 = E.f125730a[nativeCameraApi.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                CameraManager cameraManager = (CameraManager) AppAndroidEnvironment.INSTANCE.getApplicationContext().getSystemService(CameraManager.class);
                if (cameraManager != null) {
                    return new C13477q(cameraManager);
                }
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        return new C13500p();
    }
}
