package com.scandit.datacapture.core.ui.control;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class j extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TorchSwitchControl f127032a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(TorchSwitchControl torchSwitchControl) {
        super(0);
        this.f127032a = torchSwitchControl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        TorchSwitchControl.access$showImageForCurrentTorchState(this.f127032a);
        return Unit.f143329a;
    }
}
