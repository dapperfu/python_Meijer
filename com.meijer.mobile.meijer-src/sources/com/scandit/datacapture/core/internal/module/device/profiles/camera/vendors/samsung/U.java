package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

import android.hardware.Camera;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class U extends com.scandit.datacapture.core.internal.module.device.profiles.camera.e {

    /* renamed from: c, reason: collision with root package name */
    public static final U f125392c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f125393d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f125394e;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f125394e;
    }

    static {
        U u10 = new U();
        f125392c = u10;
        f125393d = "sm-t320.*";
        f125394e = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(u10.f125176a, false, -1.0f, false, false, 0, 115);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.j(camParams, "camParams");
        camParams.set("sharpness", 0);
        camParams.set("mce", "disable");
        camParams.set("contrast", 0);
        com.scandit.datacapture.core.internal.module.device.profiles.camera.e.a(camParams, Math.max(f125394e.f125181d, -1.0f));
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125393d;
    }
}
