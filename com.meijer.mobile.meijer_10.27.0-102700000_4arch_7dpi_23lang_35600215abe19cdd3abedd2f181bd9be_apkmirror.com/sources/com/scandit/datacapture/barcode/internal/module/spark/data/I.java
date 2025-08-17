package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.TorchState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class I extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f122845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callback f122846b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(O o10, Callback callback) {
        super(0);
        this.f122845a = o10;
        this.f122846b = callback;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit;
        O o10 = this.f122845a;
        TorchState torchState = TorchState.OFF;
        H h10 = new H(o10, this.f122846b);
        Camera camera = o10.f122858e;
        if (camera != null) {
            camera._switchToDesiredTorchState(torchState, h10);
            unit = Unit.f142422a;
        } else {
            unit = null;
        }
        if (unit == null) {
            h10.invoke();
        }
        return Unit.f142422a;
    }
}
