package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

/* renamed from: com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung.z, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13298z extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final C13298z f124538d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f124539e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f124540f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f124541g;

    static {
        C13298z c13298z = new C13298z();
        f124538d = c13298z;
        f124539e = "sm-n920.*";
        f124540f = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(c13298z.f124224a, false, 0.0f, true, false, 0, 111);
        f124541g = true;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f124540f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f124539e;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean i() {
        return f124541g;
    }
}
