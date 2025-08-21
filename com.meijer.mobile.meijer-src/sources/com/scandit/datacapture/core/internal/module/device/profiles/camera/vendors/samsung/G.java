package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;

/* loaded from: classes12.dex */
public final class G extends com.scandit.datacapture.core.internal.module.device.profiles.camera.e {

    /* renamed from: c, reason: collision with root package name */
    public static final G f125358c = new G();

    /* renamed from: d, reason: collision with root package name */
    public static final String f125359d = "sm-s901.*|sm-s906.*|sm-s908";

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean j() {
        return true;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final NativeFocusStrategy e() {
        return NativeFocusStrategy.CONTINUOUS_UNTIL_NO_SCAN;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125359d;
    }
}
