package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.custom;

import android.hardware.Camera;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.e;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.f;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a extends e {

    /* renamed from: c, reason: collision with root package name */
    public static final a f125224c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f125225d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f125226e;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final f a() {
        return f125226e;
    }

    static {
        a aVar = new a();
        f125224c = aVar;
        f125225d = "carbon mobile 5";
        f125226e = f.a(aVar.f125176a, false, -1.0f, false, false, 0, 115);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.j(camParams, "camParams");
        camParams.set("sharpness", 0);
        camParams.set("mce", "disable");
        camParams.set("contrast", 0);
        e.a(camParams, Math.max(f125226e.f125181d, -1.0f));
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125225d;
    }
}
