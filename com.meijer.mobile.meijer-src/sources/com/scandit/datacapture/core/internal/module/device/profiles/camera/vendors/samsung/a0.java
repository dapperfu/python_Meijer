package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

import android.hardware.Camera;
import android.util.Range;
import com.scandit.datacapture.core.internal.module.source.NativeCameraApi;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a0 extends com.scandit.datacapture.core.internal.module.device.profiles.camera.e {

    /* renamed from: c, reason: collision with root package name */
    public static final a0 f125412c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f125413d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f125414e;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f125414e;
    }

    static {
        a0 a0Var = new a0();
        f125412c = a0Var;
        f125413d = "(sm-g388|sm-g389).*";
        f125414e = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(a0Var.f125176a, false, -2.0f, true, false, 0, 103);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final Range a(Range[] frameRateRanges, float f10) {
        Intrinsics.j(frameRateRanges, "frameRateRanges");
        return com.scandit.datacapture.core.internal.module.source.N.a(frameRateRanges, f10);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125413d;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final NativeCameraApi k() {
        return NativeCameraApi.CAMERA2;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.j(camParams, "camParams");
        camParams.set("slow_ae", "off");
        camParams.set("sw-vdis", "off");
        camParams.set("dynamic-range-control", "on");
        camParams.set("phase-af", "on");
        com.scandit.datacapture.core.internal.module.device.profiles.camera.e.a(camParams, -1.0f);
    }
}
