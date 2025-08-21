package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.integra;

import android.hardware.Camera;
import android.util.Range;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.e;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.f;
import com.scandit.datacapture.core.internal.module.source.N;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a extends e {

    /* renamed from: c, reason: collision with root package name */
    public static final a f125301c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f125302d;

    /* renamed from: e, reason: collision with root package name */
    public static final f f125303e;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.j(camParams, "camParams");
        e.a(camParams, Math.max(f125303e.f125181d, -1.0f));
    }

    static {
        a aVar = new a();
        f125301c = aVar;
        f125302d = "scanpal eda50";
        f125303e = f.a(aVar.f125176a, false, 0.0f, false, false, 0, 121);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125302d;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final f a() {
        return f125303e;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final Range a(Range[] frameRateRanges, float f10) {
        Intrinsics.j(frameRateRanges, "frameRateRanges");
        return N.c(frameRateRanges, f10);
    }
}
