package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.barcode.internal.module.spark.ui.c0;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.TorchState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.data.u, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13340u extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f123869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f123870b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13340u(O o10, c0 c0Var) {
        super(0);
        this.f123869a = o10;
        this.f123870b = c0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit;
        O o10 = this.f123869a;
        TorchState torchState = TorchState.OFF;
        C13339t c13339t = new C13339t(o10, (c0) this.f123870b);
        Camera camera = o10.f123810e;
        if (camera != null) {
            camera._switchToDesiredTorchState(torchState, c13339t);
            unit = Unit.f143329a;
        } else {
            unit = null;
        }
        if (unit == null) {
            c13339t.invoke();
        }
        return Unit.f143329a;
    }
}
