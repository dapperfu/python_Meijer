package com.scandit.datacapture.core.ui.control;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class l extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TorchSwitchControl f126081a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TorchSwitchControl torchSwitchControl) {
        super(0);
        this.f126081a = torchSwitchControl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TorchSwitchControl.access$showImageForCurrentTorchState(this.f126081a);
        return Unit.f142422a;
    }
}
