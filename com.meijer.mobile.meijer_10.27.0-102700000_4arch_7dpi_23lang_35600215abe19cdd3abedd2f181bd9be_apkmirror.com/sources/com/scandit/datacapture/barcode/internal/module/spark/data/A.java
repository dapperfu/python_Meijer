package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.TorchState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class A extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f122831a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TorchState f122832b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f122833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A(O o10, TorchState torchState, Function0 function0) {
        super(0);
        this.f122831a = o10;
        this.f122832b = torchState;
        this.f122833c = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit;
        O o10 = this.f122831a;
        TorchState torchState = this.f122832b;
        z zVar = new z(o10, this.f122833c);
        Camera camera = o10.f122858e;
        if (camera != null) {
            camera._switchToDesiredTorchState(torchState, zVar);
            unit = Unit.f142422a;
        } else {
            unit = null;
        }
        if (unit == null) {
            zVar.invoke();
        }
        return Unit.f142422a;
    }
}
