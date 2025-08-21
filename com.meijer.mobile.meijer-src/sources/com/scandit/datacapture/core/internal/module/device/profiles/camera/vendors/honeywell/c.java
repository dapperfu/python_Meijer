package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.honeywell;

import com.scandit.datacapture.core.internal.module.device.profiles.camera.f;

/* loaded from: classes12.dex */
public final class c extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final c f125274d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f125275e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f125276f;

    static {
        c cVar = new c();
        f125274d = cVar;
        f125275e = "ct40";
        f125276f = f.a(cVar.f125176a, false, 0.0f, false, true, 0, 95);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final f a() {
        return f125276f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125275e;
    }
}
