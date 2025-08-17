package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

/* loaded from: classes11.dex */
public final class I extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final I f124411d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f124412e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f124413f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f124414g;

    static {
        I i10 = new I();
        f124411d = i10;
        f124412e = "gt-i9500|gt-i9502|gt-i9505|sc-04e|sch-i545|sch-i959|sch-r970|sgh-i337|sgh-m919|shv-e300k|shv-e300s|sph-l720";
        f124413f = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(i10.f124224a, false, -1.0f, false, false, 0, 119);
        f124414g = true;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f124413f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f124412e;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean i() {
        return f124414g;
    }
}
