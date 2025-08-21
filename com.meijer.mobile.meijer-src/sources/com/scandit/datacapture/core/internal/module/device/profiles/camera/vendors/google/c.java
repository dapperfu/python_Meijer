package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.google;

import android.hardware.Camera;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class c extends com.scandit.datacapture.core.internal.module.device.profiles.camera.e {

    /* renamed from: c, reason: collision with root package name */
    public static final c f125242c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f125243d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f125244e;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f125244e;
    }

    static {
        c cVar = new c();
        f125242c = cVar;
        f125243d = "glass 2 \\(oem\\)";
        f125244e = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(cVar.f125176a, false, 0.0f, false, false, 0, 121);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.j(camParams, "camParams");
        com.scandit.datacapture.core.internal.module.device.profiles.camera.e.a(camParams, -1.5f);
        camParams.setPreviewSize(Math.max(camParams.getPreviewSize().width, camParams.getPreviewSize().height), Math.min(camParams.getPreviewSize().width, camParams.getPreviewSize().height));
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125243d;
    }
}
