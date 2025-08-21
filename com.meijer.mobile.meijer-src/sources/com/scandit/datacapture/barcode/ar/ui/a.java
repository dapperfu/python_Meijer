package com.scandit.datacapture.barcode.ar.ui;

import android.content.Context;
import com.scandit.datacapture.barcode.ar.capture.BarcodeAr;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.ui.control.CameraSwitchControl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BarcodeArView f121147a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(BarcodeArView barcodeArView) {
        super(1);
        this.f121147a = barcodeArView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context it = (Context) obj;
        Intrinsics.j(it, "it");
        Camera camera = this.f121147a.f121087c;
        Camera camera2 = Camera.INSTANCE.getCamera(BarcodeArView$controlsHandler$1$WhenMappings.$EnumSwitchMapping$0[this.f121147a.f121086b.getDefaultCameraPosition().ordinal()] == 1 ? CameraPosition.WORLD_FACING : CameraPosition.USER_FACING, BarcodeAr.INSTANCE.createRecommendedCameraSettings());
        if (camera == null || camera2 == null) {
            return null;
        }
        return new CameraSwitchControl(it, camera, camera2);
    }
}
