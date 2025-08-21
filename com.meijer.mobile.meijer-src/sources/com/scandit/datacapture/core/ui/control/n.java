package com.scandit.datacapture.core.ui.control;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class n extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ZoomSwitchControl f127035a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ZoomSwitchControl zoomSwitchControl) {
        super(0);
        this.f127035a = zoomSwitchControl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f127035a.a();
        return Unit.f143329a;
    }
}
