package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

/* loaded from: classes12.dex */
public final class I extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final I f125363d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f125364e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f125365f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f125366g;

    static {
        I i10 = new I();
        f125363d = i10;
        f125364e = "gt-i9500|gt-i9502|gt-i9505|sc-04e|sch-i545|sch-i959|sch-r970|sgh-i337|sgh-m919|shv-e300k|shv-e300s|sph-l720";
        f125365f = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(i10.f125176a, false, -1.0f, false, false, 0, 119);
        f125366g = true;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f125365f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125364e;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean i() {
        return f125366g;
    }
}
