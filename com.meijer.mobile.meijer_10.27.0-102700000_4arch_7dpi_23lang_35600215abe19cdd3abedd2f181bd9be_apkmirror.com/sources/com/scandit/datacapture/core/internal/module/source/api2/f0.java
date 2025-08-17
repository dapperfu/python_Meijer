package com.scandit.datacapture.core.internal.module.source.api2;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.ColorSpaceTransform;
import android.hardware.camera2.params.RggbChannelVector;
import com.fullstory.FS;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class f0 {

    /* renamed from: c, reason: collision with root package name */
    public static final ColorSpaceTransform f124897c = new ColorSpaceTransform(new int[]{1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 1});

    /* renamed from: a, reason: collision with root package name */
    public RggbChannelVector f124898a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f124899b;

    public final void a(m0 requestSettings, boolean z10) {
        Intrinsics.j(requestSettings, "requestSettings");
        if (z10 || this.f124899b) {
            if (z10 && this.f124899b) {
                Intrinsics.j("CAMCTRL CONTROL_AWB_MODE_AUTO", "message");
                FS.log_i("sdc-core", "CAMCTRL CONTROL_AWB_MODE_AUTO");
                Intrinsics.j(requestSettings, "requestSettings");
                CaptureRequest.Key key = CaptureRequest.CONTROL_AWB_MODE;
                e0.a(key, "CONTROL_AWB_MODE", 1, requestSettings, key);
                this.f124899b = false;
                return;
            }
            return;
        }
        this.f124899b = true;
        Intrinsics.j("CAMCTRL CONTROL_AWB_MODE_OFF", "message");
        FS.log_i("sdc-core", "CAMCTRL CONTROL_AWB_MODE_OFF");
        RggbChannelVector rggbChannelVector = this.f124898a;
        if (rggbChannelVector == null) {
            rggbChannelVector = new RggbChannelVector(1.0f, 1.0f, 1.0f, 1.0f);
        }
        Intrinsics.j(requestSettings, "requestSettings");
        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AWB_MODE;
        e0.a(key2, "CONTROL_AWB_MODE", 0, requestSettings, key2);
        CaptureRequest.Key key3 = CaptureRequest.COLOR_CORRECTION_MODE;
        e0.a(key3, "COLOR_CORRECTION_MODE", 0, requestSettings, key3);
        CaptureRequest.Key COLOR_CORRECTION_GAINS = CaptureRequest.COLOR_CORRECTION_GAINS;
        Intrinsics.i(COLOR_CORRECTION_GAINS, "COLOR_CORRECTION_GAINS");
        requestSettings.a(COLOR_CORRECTION_GAINS, rggbChannelVector);
        CaptureRequest.Key COLOR_CORRECTION_TRANSFORM = CaptureRequest.COLOR_CORRECTION_TRANSFORM;
        Intrinsics.i(COLOR_CORRECTION_TRANSFORM, "COLOR_CORRECTION_TRANSFORM");
        requestSettings.a(COLOR_CORRECTION_TRANSFORM, f124897c);
    }
}
