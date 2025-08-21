package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.alcatel;

import android.util.Range;
import com.scandit.datacapture.core.internal.module.source.N;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f125188d = new a();

    /* renamed from: e, reason: collision with root package name */
    public static final String f125189e = "5033[a-z](_eea)?";

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final Range a(Range[] frameRateRanges, float f10) {
        Intrinsics.j(frameRateRanges, "frameRateRanges");
        return N.c(frameRateRanges, f10);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125189e;
    }
}
