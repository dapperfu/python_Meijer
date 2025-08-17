package com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview;

import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.ui.DataCaptureView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class i extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f122505a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar) {
        super(0);
        this.f122505a = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        j jVar = this.f122505a;
        g gVar = jVar.f122506a;
        BarcodePickViewSettings settings = jVar.f122507b;
        h hVar = (h) gVar;
        hVar.getClass();
        Intrinsics.j(settings, "settings");
        DataCaptureView dataCaptureViewNewInstance = DataCaptureView.INSTANCE.newInstance(hVar.f122504a, null);
        dataCaptureViewNewInstance.setZoomGesture(null);
        return dataCaptureViewNewInstance;
    }
}
