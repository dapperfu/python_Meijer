package com.scandit.datacapture.barcode.internal.module.ar.ui;

import android.content.Context;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.core.ui.control.ZoomSwitchControl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f122135a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(0);
        this.f122135a = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context = this.f122135a.f122137b.getContext();
        Intrinsics.i(context, "getContext(...)");
        ZoomSwitchControl zoomSwitchControl = new ZoomSwitchControl(context);
        zoomSwitchControl.setZoomedOutImage(R.drawable.sc_barcode_ar_zoom_control_zoomed_out);
        zoomSwitchControl.setZoomedOutPressedImage(R.drawable.sc_barcode_ar_zoom_control_zoomed_out_pressed);
        zoomSwitchControl.setZoomedInImage(R.drawable.sc_barcode_ar_zoom_control_zoomed_in);
        zoomSwitchControl.setZoomedInPressedImage(R.drawable.sc_barcode_ar_zoom_control_zoomed_in_pressed);
        return zoomSwitchControl;
    }
}
