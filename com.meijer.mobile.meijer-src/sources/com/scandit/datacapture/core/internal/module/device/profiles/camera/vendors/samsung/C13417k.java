package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

/* renamed from: com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung.k, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13417k extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.b {

    /* renamed from: e, reason: collision with root package name */
    public static final C13417k f125446e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f125447f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f125448g;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean h() {
        return true;
    }

    static {
        C13417k c13417k = new C13417k();
        f125446e = c13417k;
        f125447f = "(sm-a530|sm-a730).*";
        f125448g = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(c13417k.f125187d, false, 0.0f, false, false, 0, 125);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.b, com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f125448g;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.b, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125447f;
    }
}
