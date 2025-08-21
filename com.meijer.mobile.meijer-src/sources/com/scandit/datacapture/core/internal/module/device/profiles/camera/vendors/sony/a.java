package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.sony;

import com.scandit.datacapture.core.internal.module.device.profiles.camera.f;

/* loaded from: classes12.dex */
public final class a extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f125510d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f125511e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f125512f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f125513g;

    static {
        a aVar = new a();
        f125510d = aVar;
        f125511e = "501so|e6603|e6653|so-01h|sov32|e5803|e5823|so-02h|e6853|so-03h|e6833|e6883|e6633|e6683";
        f125512f = f.a(aVar.f125176a, false, 0.0f, false, false, 0, 121);
        f125513g = true;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final f a() {
        return f125512f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125511e;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean i() {
        return f125513g;
    }
}
