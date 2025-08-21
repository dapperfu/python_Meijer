package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.extensions.LambdaExtensionsKt;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.FrameSourceState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class H extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f123795a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callback f123796b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(O o10, Callback callback) {
        super(0);
        this.f123795a = o10;
        this.f123796b = callback;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit;
        O o10 = this.f123795a;
        Camera camera = o10.f123810e;
        if (camera != null) {
            camera.switchToDesiredState(FrameSourceState.OFF, LambdaExtensionsKt.Callback(new w(o10, new F(this.f123796b))));
            unit = Unit.f143329a;
        } else {
            unit = null;
        }
        if (unit == null) {
            O.a(this.f123795a, new G(this.f123796b));
        }
        return Unit.f143329a;
    }
}
