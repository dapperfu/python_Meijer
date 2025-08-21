package com.scandit.datacapture.core.internal.module.device.profiles.camera.standard;

import android.hardware.Camera;
import com.scandit.datacapture.core.internal.module.device.profiles.camera.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes12.dex */
public class a extends e {

    /* renamed from: c, reason: collision with root package name */
    public final String f125185c = ".*";

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.e, com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public void a(Camera.Parameters camParams) {
        Intrinsics.j(camParams, "camParams");
        e.a(camParams, Math.max(a().f125181d, -1.0f));
        String str = camParams.get("min-sharpness");
        Integer numV = str != null ? StringsKt.v(str) : null;
        String str2 = camParams.get("max-sharpness");
        Integer numV2 = str2 != null ? StringsKt.v(str2) : null;
        if (numV == null || numV2 == null) {
            camParams.set("sharpness", "0");
        } else {
            if (numV.intValue() > 0 || numV2.intValue() < 0) {
                return;
            }
            camParams.set("sharpness", "0");
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.device.profiles.camera.CameraProfile
    public String g() {
        return this.f125185c;
    }
}
