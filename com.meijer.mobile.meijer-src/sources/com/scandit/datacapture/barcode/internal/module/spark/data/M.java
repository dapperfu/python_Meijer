package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.extensions.LambdaExtensionsKt;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.FrameSourceState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class M extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f123802a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callback f123803b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(O o10, Callback callback) {
        super(0);
        this.f123802a = o10;
        this.f123803b = callback;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit;
        InterfaceC13328h interfaceC13328h;
        O o10 = this.f123802a;
        Camera camera = o10.f123810e;
        if (camera != null) {
            Callback callback = this.f123803b;
            FrameSourceState currentState = camera.getCurrentState();
            FrameSourceState frameSourceState = FrameSourceState.ON;
            if (currentState != frameSourceState && (interfaceC13328h = o10.f123813h) != null) {
                interfaceC13328h.onCameraOnStart();
            }
            camera.addListener(new r(new J(o10)));
            camera.switchToDesiredState(frameSourceState, LambdaExtensionsKt.Callback(new w(o10, new K(callback))));
            unit = Unit.f143329a;
        } else {
            unit = null;
        }
        if (unit == null) {
            O.a(this.f123802a, new L(this.f123803b));
        }
        return Unit.f143329a;
    }
}
