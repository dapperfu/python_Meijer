package com.scandit.datacapture.barcode.internal.module.ar.ui;

import android.content.Context;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.core.ui.control.CameraSwitchControl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f121078a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f121079b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.scandit.datacapture.barcode.ar.ui.a aVar, d dVar) {
        super(0);
        this.f121078a = aVar;
        this.f121079b = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Function1 function1 = this.f121078a;
        Context context = this.f121079b.f121185b.getContext();
        Intrinsics.i(context, "getContext(...)");
        CameraSwitchControl cameraSwitchControl = (CameraSwitchControl) function1.invoke(context);
        if (cameraSwitchControl == null) {
            return null;
        }
        cameraSwitchControl.setPrimaryCameraImage(R.drawable.sc_barcode_ar_camera_switch_control_primary_camera);
        cameraSwitchControl.setPrimaryCameraPressedImage(R.drawable.sc_barcode_ar_camera_switch_control_primary_camera_pressed);
        cameraSwitchControl.setSecondaryCameraImage(R.drawable.sc_barcode_ar_camera_switch_control_secondary_camera);
        cameraSwitchControl.setSecondaryCameraPressedImage(R.drawable.sc_barcode_ar_camera_switch_control_secondary_camera_pressed);
        return cameraSwitchControl;
    }
}
