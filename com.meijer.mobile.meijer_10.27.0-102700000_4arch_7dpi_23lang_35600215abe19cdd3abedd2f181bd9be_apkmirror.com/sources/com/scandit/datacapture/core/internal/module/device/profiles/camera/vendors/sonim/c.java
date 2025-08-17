package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.sonim;

import com.scandit.datacapture.core.internal.module.device.profiles.camera.f;

/* loaded from: classes11.dex */
public final class c extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final c f124554d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f124555e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f124556f;

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f124557g;

    static {
        c cVar = new c();
        f124554d = cVar;
        f124555e = "xp8800";
        f124556f = f.a(cVar.f124224a, false, 0.0f, false, true, 0, 95);
        f124557g = true;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final f a() {
        return f124556f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f124555e;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean i() {
        return f124557g;
    }
}
