package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.nokia;

import android.util.Range;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.e;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.f;
import com.scandit.datacapture.core.internal.module.source.N;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class b extends e {

    /* renamed from: c, reason: collision with root package name */
    public static final b f124375c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f124376d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f124377e;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final f a() {
        return f124377e;
    }

    static {
        b bVar = new b();
        f124375c = bVar;
        f124376d = "nokia 7\\.2";
        f124377e = f.a(bVar.f124224a, false, 0.0f, false, false, 0, 125);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final Range a(Range[] frameRateRanges, float f10) {
        Intrinsics.j(frameRateRanges, "frameRateRanges");
        return N.c(frameRateRanges, f10);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f124376d;
    }
}
