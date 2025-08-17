package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.google;

/* loaded from: classes11.dex */
public final class d extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final d f124293d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f124294e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f124295f;

    static {
        d dVar = new d();
        f124293d = dVar;
        f124294e = "nexus 4";
        f124295f = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(dVar.f124224a, false, 0.0f, true, false, 0, 111);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f124295f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f124294e;
    }
}
