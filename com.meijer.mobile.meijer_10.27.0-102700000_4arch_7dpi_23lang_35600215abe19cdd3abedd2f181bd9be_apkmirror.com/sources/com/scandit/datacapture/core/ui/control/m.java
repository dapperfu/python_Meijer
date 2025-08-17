package com.scandit.datacapture.core.ui.control;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ZoomSwitchControl f126082a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ZoomSwitchControl zoomSwitchControl) {
        super(0);
        this.f126082a = zoomSwitchControl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ZoomSwitchControl.access$toggleZoom(this.f126082a);
        return Unit.f142422a;
    }
}
