package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.sony;

import com.scandit.datacapture.core.internal.module.device.profiles.camera.f;

/* loaded from: classes11.dex */
public final class a extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f124558d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f124559e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f124560f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f124561g;

    static {
        a aVar = new a();
        f124558d = aVar;
        f124559e = "501so|e6603|e6653|so-01h|sov32|e5803|e5823|so-02h|e6853|so-03h|e6833|e6883|e6633|e6683";
        f124560f = f.a(aVar.f124224a, false, 0.0f, false, false, 0, 121);
        f124561g = true;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final f a() {
        return f124560f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f124559e;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean i() {
        return f124561g;
    }
}
