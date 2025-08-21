package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.google;

import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;

/* loaded from: classes12.dex */
public final class k extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final k f125264d = new k();

    /* renamed from: e, reason: collision with root package name */
    public static final String f125265e = "Pixel 8 Pro";

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final NativeFocusStrategy e() {
        return NativeFocusStrategy.FORCE_CONTINUOUS;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125265e;
    }
}
