package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.huawei;

/* loaded from: classes11.dex */
public final class a extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f124332d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f124333e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f124334f;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean h() {
        return true;
    }

    static {
        a aVar = new a();
        f124332d = aVar;
        f124333e = "mha-l29|mha-l09|mha-al00|mha-tl00";
        f124334f = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(aVar.f124224a, false, 0.0f, true, false, 0, 111);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f124334f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f124333e;
    }
}
