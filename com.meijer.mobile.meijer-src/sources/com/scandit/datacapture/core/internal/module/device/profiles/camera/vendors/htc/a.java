package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.htc;

import com.scandit.datacapture.core.internal.module.device.profiles.camera.f;

/* loaded from: classes12.dex */
public final class a extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f125281d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f125282e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f125283f;

    static {
        a aVar = new a();
        f125281d = aVar;
        f125282e = "htc one x";
        f125283f = f.a(aVar.f125176a, true, 0.0f, false, false, 0, 122);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final f a() {
        return f125283f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125282e;
    }
}
