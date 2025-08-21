package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.TorchState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class I extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f123797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callback f123798b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(O o10, Callback callback) {
        super(0);
        this.f123797a = o10;
        this.f123798b = callback;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit;
        O o10 = this.f123797a;
        TorchState torchState = TorchState.OFF;
        H h10 = new H(o10, this.f123798b);
        Camera camera = o10.f123810e;
        if (camera != null) {
            camera._switchToDesiredTorchState(torchState, h10);
            unit = Unit.f143329a;
        } else {
            unit = null;
        }
        if (unit == null) {
            h10.invoke();
        }
        return Unit.f143329a;
    }
}
