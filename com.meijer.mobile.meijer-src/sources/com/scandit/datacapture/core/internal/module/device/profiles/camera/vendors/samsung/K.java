package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

/* loaded from: classes12.dex */
public final class K extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final K f125370d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f125371e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f125372f;

    static {
        K k10 = new K();
        f125370d = k10;
        f125371e = "sm-g920.*|scv31|404sc|sm-g890a";
        f125372f = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(k10.f125176a, false, -1.0f, false, false, 0, 119);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f125372f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125371e;
    }
}
