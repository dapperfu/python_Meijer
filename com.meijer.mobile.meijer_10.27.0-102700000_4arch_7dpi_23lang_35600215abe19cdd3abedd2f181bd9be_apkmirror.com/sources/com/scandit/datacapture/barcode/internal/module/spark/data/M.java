package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.extensions.LambdaExtensionsKt;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.FrameSourceState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class M extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f122850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callback f122851b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(O o10, Callback callback) {
        super(0);
        this.f122850a = o10;
        this.f122851b = callback;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit;
        InterfaceC13195h interfaceC13195h;
        O o10 = this.f122850a;
        Camera camera = o10.f122858e;
        if (camera != null) {
            Callback callback = this.f122851b;
            FrameSourceState currentState = camera.getCurrentState();
            FrameSourceState frameSourceState = FrameSourceState.ON;
            if (currentState != frameSourceState && (interfaceC13195h = o10.f122861h) != null) {
                interfaceC13195h.onCameraOnStart();
            }
            camera.addListener(new r(new J(o10)));
            camera.switchToDesiredState(frameSourceState, LambdaExtensionsKt.Callback(new w(o10, new K(callback))));
            unit = Unit.f142422a;
        } else {
            unit = null;
        }
        if (unit == null) {
            O.a(this.f122850a, new L(this.f122851b));
        }
        return Unit.f142422a;
    }
}
