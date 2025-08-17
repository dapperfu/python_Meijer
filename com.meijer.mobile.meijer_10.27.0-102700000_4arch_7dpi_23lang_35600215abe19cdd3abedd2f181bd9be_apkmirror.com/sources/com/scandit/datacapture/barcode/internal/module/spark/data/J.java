package com.scandit.datacapture.barcode.internal.module.spark.data;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class J extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f122847a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(O o10) {
        super(0);
        this.f122847a = o10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC13195h interfaceC13195h = this.f122847a.f122861h;
        if (interfaceC13195h != null) {
            interfaceC13195h.onCameraOnEnd();
        }
        return Unit.f142422a;
    }
}
