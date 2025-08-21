package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.google;

import android.hardware.Camera;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class b extends com.scandit.datacapture.core.internal.module.device.profiles.camera.e {

    /* renamed from: c, reason: collision with root package name */
    public static final b f125239c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f125240d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f125241e;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.j(camParams, "camParams");
        com.scandit.datacapture.core.internal.module.device.profiles.camera.e.a(camParams, Math.max(f125241e.f125181d, -1.0f));
        camParams.setPreviewSize(Math.max(camParams.getPreviewSize().width, camParams.getPreviewSize().height), Math.min(camParams.getPreviewSize().width, camParams.getPreviewSize().height));
    }

    static {
        b bVar = new b();
        f125239c = bVar;
        f125240d = "glass 2";
        f125241e = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(bVar.f125176a, false, 0.0f, false, false, 0, 121);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125240d;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f125241e;
    }
}
