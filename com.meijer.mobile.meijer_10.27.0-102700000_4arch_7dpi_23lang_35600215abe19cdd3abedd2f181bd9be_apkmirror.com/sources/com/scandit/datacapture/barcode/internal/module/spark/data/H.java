package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.extensions.LambdaExtensionsKt;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.FrameSourceState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class H extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f122843a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callback f122844b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(O o10, Callback callback) {
        super(0);
        this.f122843a = o10;
        this.f122844b = callback;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit;
        O o10 = this.f122843a;
        Camera camera = o10.f122858e;
        if (camera != null) {
            camera.switchToDesiredState(FrameSourceState.OFF, LambdaExtensionsKt.Callback(new w(o10, new F(this.f122844b))));
            unit = Unit.f142422a;
        } else {
            unit = null;
        }
        if (unit == null) {
            O.a(this.f122843a, new G(this.f122844b));
        }
        return Unit.f142422a;
    }
}
