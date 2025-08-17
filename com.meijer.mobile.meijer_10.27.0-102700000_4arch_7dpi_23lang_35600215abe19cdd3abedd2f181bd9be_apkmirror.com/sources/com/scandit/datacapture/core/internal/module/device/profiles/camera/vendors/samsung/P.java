package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

/* loaded from: classes11.dex */
public final class P extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.b {

    /* renamed from: e, reason: collision with root package name */
    public static final P f124430e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f124431f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f124432g;

    static {
        P p10 = new P();
        f124430e = p10;
        f124431f = "sm-g955.*";
        f124432g = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(p10.f124235d, false, 0.0f, true, false, 0, 111);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.b, com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f124432g;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.b, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f124431f;
    }
}
