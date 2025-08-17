package com.scandit.datacapture.core.internal.module.device.profiles.camera.standard;

import android.hardware.Camera;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.e;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public class b extends e {

    /* renamed from: c, reason: collision with root package name */
    public final String f124234c = "scandit-phase_af|scandit-phase_af-initial_trigger";

    /* renamed from: d, reason: collision with root package name */
    public final f f124235d = f.a(this.f124224a, false, 0.0f, false, false, 0, 125);

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public f a() {
        return this.f124235d;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.j(camParams, "camParams");
        camParams.set("phase-af", "on");
        camParams.set("dynamic-range-control", "on");
        e.a(camParams, Math.max(a().f124229d, -1.0f));
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public String g() {
        return this.f124234c;
    }
}
