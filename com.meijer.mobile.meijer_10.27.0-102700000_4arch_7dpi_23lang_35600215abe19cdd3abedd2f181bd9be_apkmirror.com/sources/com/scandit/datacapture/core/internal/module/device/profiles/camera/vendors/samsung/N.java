package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

import android.hardware.Camera;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class N extends com.scandit.datacapture.core.internal.module.device.profiles.camera.e {

    /* renamed from: c, reason: collision with root package name */
    public static final N f124425c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f124426d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f124427e;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f124427e;
    }

    static {
        N n10 = new N();
        f124425c = n10;
        f124426d = "sm-g891a";
        f124427e = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(n10.f124224a, false, 0.0f, true, false, 0, 109);
        com.scandit.datacapture.core.internal.module.device.profiles.camera.a aVar = n10.f124225b;
        String focusModeContinuousVideo = aVar.f124220b;
        String focusModeAuto = aVar.f124221c;
        Intrinsics.j("object-tracking-picture", "focusModeContinuousPicture");
        Intrinsics.j(focusModeContinuousVideo, "focusModeContinuousVideo");
        Intrinsics.j(focusModeAuto, "focusModeAuto");
        Intrinsics.j("object-tracking-picture", "focusModeContinuousPicture");
        Intrinsics.j(focusModeContinuousVideo, "focusModeContinuousVideo");
        Intrinsics.j(focusModeAuto, "focusModeAuto");
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.j(camParams, "camParams");
        camParams.set("phase-af", "on");
        camParams.set("dynamic-range-control", "on");
        camParams.set("slow_ae", "on");
        camParams.set("sw-vdis", "off");
        camParams.set("sharpness", "0");
        camParams.set("video_recording_gamma", "on");
        camParams.set("denoise", "denoise-off");
        camParams.set("zsl", "off");
        com.scandit.datacapture.core.internal.module.device.profiles.camera.e.a(camParams, Math.max(f124427e.f124229d, -1.0f));
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f124426d;
    }
}
