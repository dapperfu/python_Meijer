package com.scandit.datacapture.core.internal.module.device.profiles.camera;

import android.hardware.Camera;
import android.util.Range;
import com.google.android.gms.common.api.a;
import com.scandit.datacapture.core.internal.module.source.NativeCameraApi;
import com.scandit.datacapture.core.internal.module.source.NativeFocusStrategy;
import com.scandit.datacapture.core.source.CameraSettings;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.RegexOption;

/* loaded from: classes11.dex */
public abstract class e implements CameraProfile {

    /* renamed from: a, reason: collision with root package name */
    public final f f124224a = new f(false, true, true, 0.0f, false, false, -1);

    /* renamed from: b, reason: collision with root package name */
    public final a f124225b = new a("continuous-picture", "continuous-video", CameraSettings.FOCUS_STRATEGY_AUTO);

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public void a(Camera.Parameters camParams) {
        Intrinsics.j(camParams, "camParams");
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public int b() {
        return a.e.API_PRIORITY_OTHER;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public boolean c() {
        return false;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public boolean d() {
        return false;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public boolean f() {
        return true;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public boolean h() {
        return false;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public boolean i() {
        return false;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public Range a(Range[] frameRateRanges, float f10) {
        Intrinsics.j(frameRateRanges, "frameRateRanges");
        return null;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public Range b(Range[] frameRateRanges, float f10) {
        Intrinsics.j(frameRateRanges, "frameRateRanges");
        return null;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean a(String model) {
        Intrinsics.j(model, "model");
        return new Regex(g(), RegexOption.f147463c).j(model);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public NativeFocusStrategy e() {
        return b.a();
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public boolean j() {
        return b.c();
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public NativeCameraApi k() {
        return b.b();
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public f a() {
        return this.f124224a;
    }

    public static void a(Camera.Parameters camParams, float f10) {
        Intrinsics.j(camParams, "camParams");
        float exposureCompensationStep = camParams.getExposureCompensationStep();
        camParams.setExposureCompensation(Math.min(camParams.getMaxExposureCompensation(), Math.max(camParams.getMinExposureCompensation(), Math.round(f10 / exposureCompensationStep))));
    }
}
