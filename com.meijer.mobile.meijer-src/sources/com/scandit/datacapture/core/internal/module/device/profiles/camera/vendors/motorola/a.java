package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.motorola;

import android.hardware.Camera;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.e;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a extends e {

    /* renamed from: c, reason: collision with root package name */
    public static final a f125321c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f125322d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f125323e;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final f a() {
        return f125323e;
    }

    static {
        a aVar = new a();
        f125321c = aVar;
        f125322d = "moto g \\(4\\)|motog3";
        f125323e = f.a(aVar.f125176a, false, 0.0f, false, false, 0, 125);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.j(camParams, "camParams");
        camParams.set("sharpness", "0");
        e.a(camParams, Math.max(f125323e.f125181d, -1.0f));
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125322d;
    }
}
