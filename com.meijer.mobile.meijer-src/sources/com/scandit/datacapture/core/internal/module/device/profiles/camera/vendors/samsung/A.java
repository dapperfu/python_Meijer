package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

/* loaded from: classes12.dex */
public final class A extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.b {

    /* renamed from: e, reason: collision with root package name */
    public static final A f125341e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f125342f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f125343g;

    static {
        A a10 = new A();
        f125341e = a10;
        f125342f = "sm-n950.*";
        f125343g = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(a10.f125187d, false, 0.0f, false, false, 0, 125);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.b, com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f125343g;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.b, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125342f;
    }
}
