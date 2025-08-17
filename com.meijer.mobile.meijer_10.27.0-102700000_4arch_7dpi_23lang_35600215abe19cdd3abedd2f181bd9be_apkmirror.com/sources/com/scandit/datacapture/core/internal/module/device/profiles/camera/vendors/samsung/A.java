package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

/* loaded from: classes11.dex */
public final class A extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.b {

    /* renamed from: e, reason: collision with root package name */
    public static final A f124389e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f124390f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f124391g;

    static {
        A a10 = new A();
        f124389e = a10;
        f124390f = "sm-n950.*";
        f124391g = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(a10.f124235d, false, 0.0f, false, false, 0, 125);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.b, com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f124391g;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.b, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f124390f;
    }
}
