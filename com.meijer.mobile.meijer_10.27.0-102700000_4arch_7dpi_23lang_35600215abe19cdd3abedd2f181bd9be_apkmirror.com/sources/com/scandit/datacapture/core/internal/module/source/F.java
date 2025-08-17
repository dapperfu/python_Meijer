package com.scandit.datacapture.core.internal.module.source;

import android.hardware.camera2.CameraManager;
import com.scandit.datacapture.core.internal.module.source.api2.C13344q;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes11.dex */
public final class F {
    public static final InterfaceC13374x a(F f10, NativeCameraApi nativeCameraApi) {
        f10.getClass();
        int i10 = E.f124778a[nativeCameraApi.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                CameraManager cameraManager = (CameraManager) AppAndroidEnvironment.INSTANCE.getApplicationContext().getSystemService(CameraManager.class);
                if (cameraManager != null) {
                    return new C13344q(cameraManager);
                }
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        return new C13367p();
    }
}
