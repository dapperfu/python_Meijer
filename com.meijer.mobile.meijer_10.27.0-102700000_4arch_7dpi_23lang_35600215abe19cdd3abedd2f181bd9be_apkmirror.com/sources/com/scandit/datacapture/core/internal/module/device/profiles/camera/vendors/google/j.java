package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.google;

import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;

/* loaded from: classes11.dex */
public final class j extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final j f124310d = new j();

    /* renamed from: e, reason: collision with root package name */
    public static final String f124311e = "Pixel 8";

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final NativeFocusStrategy e() {
        return NativeFocusStrategy.FORCE_CONTINUOUS;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f124311e;
    }
}
