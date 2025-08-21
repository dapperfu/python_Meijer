package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

import android.hardware.Camera;
import android.util.Range;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class J extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final J f125367d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f125368e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f125369f;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f125369f;
    }

    static {
        J j10 = new J();
        f125367d = j10;
        f125368e = "(sm-g900|gt-i9600|sm-g870|sm-g800).*";
        f125369f = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(j10.f125176a, false, 0.0f, true, false, 0, 107);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final Range a(Range[] frameRateRanges, float f10) {
        Intrinsics.j(frameRateRanges, "frameRateRanges");
        return com.scandit.datacapture.core.internal.module.source.N.a(frameRateRanges, f10);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125368e;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.j(camParams, "camParams");
        super.a(camParams);
        camParams.set("slow_ae", "off");
        camParams.set("sw-vdis", "off");
        camParams.set("dynamic-range-control", "on");
        camParams.set("phase-af", "on");
        com.scandit.datacapture.core.internal.module.device.profiles.camera.e.a(camParams, Math.max(f125369f.f125181d, -1.0f));
    }
}
