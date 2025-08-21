package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

/* loaded from: classes12.dex */
public final class T extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final T f125389d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f125390e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f125391f;

    static {
        T t10 = new T();
        f125389d = t10;
        f125390e = "gt-p1000";
        f125391f = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(t10.f125176a, true, 0.0f, false, false, 0, 122);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f125391f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125390e;
    }
}
