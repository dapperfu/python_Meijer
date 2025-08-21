package com.scandit.datacapture.barcode.internal.module.pick.ui.datacaptureview;

import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.ui.DataCaptureView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class i extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f123457a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar) {
        super(0);
        this.f123457a = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        j jVar = this.f123457a;
        g gVar = jVar.f123458a;
        BarcodePickViewSettings settings = jVar.f123459b;
        h hVar = (h) gVar;
        hVar.getClass();
        Intrinsics.j(settings, "settings");
        DataCaptureView dataCaptureViewNewInstance = DataCaptureView.INSTANCE.newInstance(hVar.f123456a, null);
        dataCaptureViewNewInstance.setZoomGesture(null);
        return dataCaptureViewNewInstance;
    }
}
