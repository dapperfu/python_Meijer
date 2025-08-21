package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.google;

/* loaded from: classes12.dex */
public final class d extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final d f125245d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f125246e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f125247f;

    static {
        d dVar = new d();
        f125245d = dVar;
        f125246e = "nexus 4";
        f125247f = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(dVar.f125176a, false, 0.0f, true, false, 0, 111);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f125247f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125246e;
    }
}
