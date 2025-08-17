package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.barcode.internal.module.spark.ui.c0;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.TorchState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.spark.data.u, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13207u extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f122917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f122918b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13207u(O o10, c0 c0Var) {
        super(0);
        this.f122917a = o10;
        this.f122918b = c0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit;
        O o10 = this.f122917a;
        TorchState torchState = TorchState.OFF;
        C13206t c13206t = new C13206t(o10, (c0) this.f122918b);
        Camera camera = o10.f122858e;
        if (camera != null) {
            camera._switchToDesiredTorchState(torchState, c13206t);
            unit = Unit.f142422a;
        } else {
            unit = null;
        }
        if (unit == null) {
            c13206t.invoke();
        }
        return Unit.f142422a;
    }
}
