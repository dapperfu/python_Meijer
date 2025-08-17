package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.barcode.internal.module.spark.ui.c0;
import com.scandit.datacapture.core.extensions.LambdaExtensionsKt;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.FrameSourceState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.data.t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13206t extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f122915a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f122916b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13206t(O o10, c0 c0Var) {
        super(0);
        this.f122915a = o10;
        this.f122916b = c0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit;
        O o10 = this.f122915a;
        Camera camera = o10.f122858e;
        if (camera != null) {
            camera.switchToDesiredState(FrameSourceState.STANDBY, LambdaExtensionsKt.Callback(new w(o10, new C13205s((c0) this.f122916b))));
            unit = Unit.f142422a;
        } else {
            unit = null;
        }
        if (unit == null) {
            O.a(this.f122915a, this.f122916b);
        }
        return Unit.f142422a;
    }
}
