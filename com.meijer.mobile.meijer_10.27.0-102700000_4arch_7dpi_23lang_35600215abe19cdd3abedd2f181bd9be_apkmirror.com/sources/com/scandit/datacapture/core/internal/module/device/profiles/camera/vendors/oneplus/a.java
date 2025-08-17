package com.scandit.datacapture.core.internal.module.device.profiles.camera.vendors.oneplus;

import android.util.Range;
import com.scandit.datacapture.core.internal.module.source.N;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a extends com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f124383d = new a();

    /* renamed from: e, reason: collision with root package name */
    public static final String f124384e = "CPH2415|CPH2413|CPH2417";

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final Range b(Range[] frameRateRanges, float f10) {
        Intrinsics.j(frameRateRanges, "frameRateRanges");
        ArrayList arrayList = new ArrayList();
        for (Range range : frameRateRanges) {
            Integer num = (Integer) range.getUpper();
            if (num == null || num.intValue() != 24) {
                arrayList.add(range);
            }
        }
        return N.b((Range[]) arrayList.toArray(new Range[0]), f10);
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.standard.a, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public final String g() {
        return f124384e;
    }
}
