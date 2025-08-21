package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

/* loaded from: classes12.dex */
public final class P extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.b {

    /* renamed from: e, reason: collision with root package name */
    public static final P f125382e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f125383f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f125384g;

    static {
        P p10 = new P();
        f125382e = p10;
        f125383f = "sm-g955.*";
        f125384g = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(p10.f125187d, false, 0.0f, true, false, 0, 111);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.b, com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f125384g;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.b, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125383f;
    }
}
