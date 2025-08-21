package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

import android.hardware.Camera;
import android.util.Range;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class D extends com.scandit.datacapture.core.internal.module.device.profiles.camera.e {

    /* renamed from: c, reason: collision with root package name */
    public static final D f125351c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f125352d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f125353e;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f125353e;
    }

    static {
        D d10 = new D();
        f125351c = d10;
        f125352d = "i9000.*";
        f125353e = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(d10.f125176a, false, -1.0f, true, false, 0, 103);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final Range a(Range[] frameRateRanges, float f10) {
        Intrinsics.j(frameRateRanges, "frameRateRanges");
        return com.scandit.datacapture.core.internal.module.source.N.a(frameRateRanges, f10);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125352d;
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
