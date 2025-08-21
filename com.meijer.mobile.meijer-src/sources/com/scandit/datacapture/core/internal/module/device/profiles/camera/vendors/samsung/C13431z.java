package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

/* renamed from: com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung.z, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13431z extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final C13431z f125490d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f125491e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f125492f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f125493g;

    static {
        C13431z c13431z = new C13431z();
        f125490d = c13431z;
        f125491e = "sm-n920.*";
        f125492f = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(c13431z.f125176a, false, 0.0f, true, false, 0, 111);
        f125493g = true;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f125492f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125491e;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean i() {
        return f125493g;
    }
}
