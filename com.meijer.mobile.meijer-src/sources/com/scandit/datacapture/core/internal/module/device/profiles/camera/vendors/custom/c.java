package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.custom;

import android.hardware.Camera;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.e;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class c extends e {

    /* renamed from: c, reason: collision with root package name */
    public static final c f125230c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final String f125231d = "m100";

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.j(camParams, "camParams");
        e.a(camParams, Math.max(this.f125176a.f125181d, -1.0f));
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125231d;
    }
}
