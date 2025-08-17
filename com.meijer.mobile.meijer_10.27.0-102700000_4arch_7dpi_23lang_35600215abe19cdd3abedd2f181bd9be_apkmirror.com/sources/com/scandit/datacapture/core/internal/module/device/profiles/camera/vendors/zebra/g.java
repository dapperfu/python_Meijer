package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.zebra;

import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;

/* loaded from: classes11.dex */
public final class g extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final g f124581d = new g();

    /* renamed from: e, reason: collision with root package name */
    public static final String f124582e = "TC52.*";

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f124583f = true;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f124584g = true;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final NativeFocusStrategy e() {
        return NativeFocusStrategy.FORCE_RETRIGGER;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f124582e;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean i() {
        return f124584g;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean j() {
        return f124583f;
    }
}
