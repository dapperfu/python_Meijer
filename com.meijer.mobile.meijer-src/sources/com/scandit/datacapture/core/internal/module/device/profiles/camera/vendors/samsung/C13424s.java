package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung;

import android.hardware.Camera;
import android.util.Range;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.samsung.s, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13424s extends com.scandit.datacapture.core.internal.module.device.profiles.camera.e {

    /* renamed from: c, reason: collision with root package name */
    public static final C13424s f125470c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f125471d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f125472e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f125473f;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.j(camParams, "camParams");
        com.scandit.datacapture.core.internal.module.device.profiles.camera.e.a(camParams, Math.max(f125472e.f125181d, -1.0f));
    }

    static {
        C13424s c13424s = new C13424s();
        f125470c = c13424s;
        f125471d = "(sm-j3109|sm-j320).*";
        f125472e = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(c13424s.f125176a, false, 0.0f, false, false, 0, 121);
        f125473f = true;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125471d;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final boolean i() {
        return f125473f;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f125472e;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final Range a(Range[] frameRateRanges, float f10) {
        Intrinsics.j(frameRateRanges, "frameRateRanges");
        return com.scandit.datacapture.core.internal.module.source.N.c(frameRateRanges, f10);
    }
}
