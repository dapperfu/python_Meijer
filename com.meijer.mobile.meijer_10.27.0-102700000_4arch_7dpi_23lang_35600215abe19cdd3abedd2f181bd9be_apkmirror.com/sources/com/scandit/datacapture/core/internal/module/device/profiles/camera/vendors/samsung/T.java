package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

/* loaded from: classes11.dex */
public final class T extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final T f124437d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f124438e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f124439f;

    static {
        T t10 = new T();
        f124437d = t10;
        f124438e = "gt-p1000";
        f124439f = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(t10.f124224a, true, 0.0f, false, false, 0, 122);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f124439f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f124438e;
    }
}
