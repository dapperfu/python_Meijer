package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

import android.hardware.Camera;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung.n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13420n extends com.scandit.datacapture.core.internal.module.device.profiles.camera.e {

    /* renamed from: c, reason: collision with root package name */
    public static final C13420n f125455c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f125456d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f125457e;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f125457e;
    }

    static {
        C13420n c13420n = new C13420n();
        f125455c = c13420n;
        f125456d = "sm-t365.*";
        f125457e = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(c13420n.f125176a, false, 0.0f, true, false, 0, 111);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.j(camParams, "camParams");
        camParams.set("slow_ae", "on");
        camParams.set("sw-vdis", "off");
        camParams.set("sharpness", "0");
        camParams.set("video_recording_gamma", "on");
        camParams.set("denoise", "denoise-off");
        camParams.set("zsl", "off");
        com.scandit.datacapture.core.internal.module.device.profiles.camera.e.a(camParams, Math.max(f125457e.f125181d, -1.0f));
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125456d;
    }
}
