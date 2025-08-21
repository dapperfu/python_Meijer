package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.panasonic;

import com.scandit.datacapture.core.internal.module.device.profiles.camera.e;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.f;

/* loaded from: classes12.dex */
public final class a extends e {

    /* renamed from: c, reason: collision with root package name */
    public static final a f125337c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f125338d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f125339e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f125340f;

    static {
        a aVar = new a();
        f125337c = aVar;
        f125338d = "fz-n1";
        f125339e = f.a(aVar.f125176a, false, 0.0f, false, false, 0, 125);
        f125340f = true;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final f a() {
        return f125339e;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125338d;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean i() {
        return f125340f;
    }
}
