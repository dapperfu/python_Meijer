package com.scandit.datacapture.core.internal.sdk.source.api2;

import android.hardware.camera2.CameraManager;
import com.scandit.datacapture.core.internal.module.source.api2.k0;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/source/api2/CameraApi2;", "", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Lcom/scandit/datacapture/core/internal/sdk/source/api2/CameraApi2InfoProvider;", "infoProvider", "(Landroid/hardware/camera2/CameraManager;)Lcom/scandit/datacapture/core/internal/sdk/source/api2/CameraApi2InfoProvider;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class CameraApi2 {
    public static final CameraApi2 INSTANCE = new CameraApi2();

    /* renamed from: a, reason: collision with root package name */
    private static final CameraManager f125513a;

    static {
        Object systemService = AppAndroidEnvironment.INSTANCE.getApplicationContext().getSystemService("camera");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        f125513a = (CameraManager) systemService;
    }

    public static /* synthetic */ CameraApi2InfoProvider infoProvider$default(CameraApi2 cameraApi2, CameraManager cameraManager, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            cameraManager = f125513a;
        }
        return cameraApi2.infoProvider(cameraManager);
    }

    public final CameraApi2InfoProvider infoProvider(CameraManager cameraManager) {
        Intrinsics.j(cameraManager, "cameraManager");
        return new k0(cameraManager);
    }

    private CameraApi2() {
    }
}
