package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.google;

import android.hardware.Camera;
import android.util.Range;
import com.scandit.datacapture.core.internal.module.source.N;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class e extends com.scandit.datacapture.core.internal.module.device.profiles.camera.e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f125248c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f125249d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.scandit.datacapture.core.internal.module.device.profiles.camera.f f125250e;

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final void a(Camera.Parameters camParams) {
        Intrinsics.j(camParams, "camParams");
        com.scandit.datacapture.core.internal.module.device.profiles.camera.e.a(camParams, Math.max(f125250e.f125181d, -1.0f));
    }

    static {
        e eVar = new e();
        f125248c = eVar;
        f125249d = "nexus 5|nexus 6p";
        f125250e = com.scandit.datacapture.core.internal.module.device.profiles.camera.f.a(eVar.f125176a, false, 0.0f, false, false, 0, 123);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f125249d;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final com.scandit.datacapture.core.internal.module.device.profiles.camera.f a() {
        return f125250e;
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final Range a(Range[] frameRateRanges, float f10) {
        Integer num;
        Integer num2;
        Intrinsics.j(frameRateRanges, "frameRateRanges");
        for (Range range : frameRateRanges) {
            Integer num3 = (Integer) range.getLower();
            if (num3 != null && num3.intValue() == 7000 && (num2 = (Integer) range.getUpper()) != null && num2.intValue() == 30000) {
                return new Range(7000, 30000);
            }
        }
        Range range2 = null;
        int iIntValue = 30000;
        for (Range range3 : frameRateRanges) {
            Object lower = range3.getLower();
            Intrinsics.i(lower, "getLower(...)");
            if (((Number) lower).intValue() < iIntValue && (num = (Integer) range3.getUpper()) != null && num.intValue() == 30000) {
                Object lower2 = range3.getLower();
                Intrinsics.i(lower2, "getLower(...)");
                iIntValue = ((Number) lower2).intValue();
                range2 = range3;
            }
        }
        if (range2 != null) {
            return new Range(range2.getLower(), range2.getUpper());
        }
        return N.b(frameRateRanges, f10);
    }
}
