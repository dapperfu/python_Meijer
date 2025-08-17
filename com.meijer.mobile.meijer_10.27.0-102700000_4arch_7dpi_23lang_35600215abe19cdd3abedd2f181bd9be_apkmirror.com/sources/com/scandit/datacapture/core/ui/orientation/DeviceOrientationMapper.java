package com.scandit.datacapture.core.ui.orientation;

import android.content.Context;
import android.view.WindowManager;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.extensions.ContextExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.ui.orientation.InternalDeviceOrientationMapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/scandit/datacapture/core/ui/orientation/DeviceOrientationMapper;", "", "<init>", "()V", "", "rotation", "Lcom/scandit/datacapture/core/ui/orientation/DeviceOrientation;", "mapRotationToOrientation", "(I)Lcom/scandit/datacapture/core/ui/orientation/DeviceOrientation;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@Mockable
/* loaded from: classes11.dex */
public final class DeviceOrientationMapper {
    public final DeviceOrientation mapRotationToOrientation(int rotation) {
        InternalDeviceOrientationMapper internalDeviceOrientationMapper = InternalDeviceOrientationMapper.INSTANCE;
        Context applicationContext = AppAndroidEnvironment.INSTANCE.getApplicationContext();
        Object systemService = applicationContext.getSystemService("window");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return internalDeviceOrientationMapper.getDeviceOrientation(internalDeviceOrientationMapper.getDeviceNaturalOrientation(ContextExtensionsKt.getOrientation(applicationContext), ((WindowManager) systemService).getDefaultDisplay().getRotation()), rotation);
    }
}
