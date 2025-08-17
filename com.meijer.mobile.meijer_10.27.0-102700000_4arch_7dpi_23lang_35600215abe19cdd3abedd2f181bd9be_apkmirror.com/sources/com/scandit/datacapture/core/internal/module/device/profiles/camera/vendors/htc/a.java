package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.htc;

import com.scandit.datacapture.core.internal.module.device.profiles.camera.f;

/* loaded from: classes11.dex */
public final class a extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f124329d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f124330e;

    /* renamed from: f, reason: collision with root package name */
    public static final f f124331f;

    static {
        a aVar = new a();
        f124329d = aVar;
        f124330e = "htc one x";
        f124331f = f.a(aVar.f124224a, true, 0.0f, false, false, 0, 122);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final f a() {
        return f124331f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f124330e;
    }
}
