package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.sonim;

import com.scandit.datacapture.core.internal.module.device.profiles.camera.f;

/* loaded from: classes12.dex */
public final class c extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final c f125506d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f125507e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f125508f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f125509g;

    static {
        c cVar = new c();
        f125506d = cVar;
        f125507e = "xp8800";
        f125508f = f.a(cVar.f125176a, false, 0.0f, false, true, 0, 95);
        f125509g = true;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final f a() {
        return f125508f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125507e;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean i() {
        return f125509g;
    }
}
