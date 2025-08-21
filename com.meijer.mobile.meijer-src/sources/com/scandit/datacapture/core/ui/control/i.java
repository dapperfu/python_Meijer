package com.scandit.datacapture.core.ui.control;

import com.scandit.datacapture.core.source.Camera;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class i extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TorchSwitchControl f127031a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(TorchSwitchControl torchSwitchControl) {
        super(0);
        this.f127031a = torchSwitchControl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Camera camera = this.f127031a.f127001f;
        if (camera != null) {
            TorchSwitchControl.access$toggleTorchOnOff(this.f127031a, camera);
        }
        return Unit.f143329a;
    }
}
