package com.scandit.datacapture.barcode.internal.module.ar.ui;

import android.content.Context;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.core.ui.control.TorchSwitchControl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f122134a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar) {
        super(0);
        this.f122134a = dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Context context = this.f122134a.f122137b.getContext();
        Intrinsics.i(context, "getContext(...)");
        TorchSwitchControl torchSwitchControl = new TorchSwitchControl(context);
        torchSwitchControl.setTorchOnImage(R.drawable.sc_barcode_ar_torch_control_on);
        torchSwitchControl.setTorchOnPressedImage(R.drawable.sc_barcode_ar_torch_control_on_pressed);
        torchSwitchControl.setTorchOffImage(R.drawable.sc_barcode_ar_torch_control_off);
        torchSwitchControl.setTorchOffPressedImage(R.drawable.sc_barcode_ar_torch_control_off_pressed);
        return torchSwitchControl;
    }
}
