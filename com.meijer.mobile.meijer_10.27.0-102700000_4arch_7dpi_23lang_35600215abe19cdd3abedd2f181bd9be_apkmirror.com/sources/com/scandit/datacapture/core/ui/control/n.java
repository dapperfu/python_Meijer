package com.scandit.datacapture.core.ui.control;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class n extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ZoomSwitchControl f126083a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ZoomSwitchControl zoomSwitchControl) {
        super(0);
        this.f126083a = zoomSwitchControl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f126083a.a();
        return Unit.f142422a;
    }
}
