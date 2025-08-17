package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.motorola;

import android.hardware.Camera;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.e;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a extends e {

    /* renamed from: c, reason: collision with root package name */
    public static final a f124369c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f124370d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f124371e;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final f a() {
        return f124371e;
    }

    static {
        a aVar = new a();
        f124369c = aVar;
        f124370d = "moto g \\(4\\)|motog3";
        f124371e = f.a(aVar.f124224a, false, 0.0f, false, false, 0, 125);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.j(camParams, "camParams");
        camParams.set("sharpness", "0");
        e.a(camParams, Math.max(f124371e.f124229d, -1.0f));
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f124370d;
    }
}
